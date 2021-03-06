(ns braid.core.client.group-admin.views.group-settings-page-styles
  (:require
   [braid.core.client.ui.styles.mixins :as mixins]
   [braid.core.client.ui.styles.vars :as vars]
   [garden.units :refer [rem em]]))

(def group-settings-page
  [:>.page.group-settings
   [:>.content
    [:>.setting
     [:&.avatar
      [:>.upload
       [:>.uploading-indicator
        {:display "inline-block"}]]]]]])
