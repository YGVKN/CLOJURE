(ns app.views.page
  (:use hiccup.page hiccup.element))

(defn yet-another-page
  []
  (html5
    [:html
     [:head]
     [:body
      [:h1 "Yet another page"
       [:a {:href "/"} " index"]]]]))
