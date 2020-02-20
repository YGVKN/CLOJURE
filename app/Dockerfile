FROM clojure:alpine as Build
MAINTAINER ZHUZHA
LABEL zhuzha/clojure-web-app zhuzha
ENV CLOJURE_APP https://github.com/YGVKN/CLOJURE/archive/master.zip
WORKDIR /app
RUN wget -q $CLOJURE_APP && \
    unzip master.zip && \
    cd CLOJURE-master/ygvkn && \
    ls -al && lein deps && lein uberjar

FROM openjdk:8-jre-alpine as Pro
WORKDIR /app
COPY --from=Build /app/CLOJURE-master/ygvkn/target/ygvkn-0.0.1-standalone.jar /app
HEALTHCHECK --interval=8m --timeout=4s CMD wget -qO- 0.0.0.0:8888 || exit 1
EXPOSE 8888
CMD ["java","-jar","/app/ygvkn-0.0.1-standalone.jar"]
