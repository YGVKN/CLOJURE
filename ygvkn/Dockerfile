# Dockerfile for clojure web app
FROM java:openjdk-8-jre
MAINTAINER ygvkn <zhuzuhasuchzhuzha@gmail.com>
ENV REFRESHED_AT 2018-04-24

COPY target/ygvkn-0.1.0-standalone.jar ygvkn-0.1.0-standalone.jar

ENV PORT 3000

EXPOSE 3000

CMD ["java", "-jar", "ygvkn-0.1.0-standalone.jar"]
