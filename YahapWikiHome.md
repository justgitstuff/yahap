# Introduction #

A project attempting to control web cams and x-10 devices through a web gui.

## Why Yet Another Home Automation Project? ##
I've failed to find a project that fulfils the following requirements.
  * Is open source
  * Is written in Java
  * Is simple to use (homeseer like)
  * Uses current Java technologies:
    * JSF for web pages
    * Web services for exposing functionality
    * Maven for builds
    * Hibernate for database access, etc etc
  * and this is rather specific but I want it to work with my media center too!! so i need a media center plugin


# About the architecture #
##  ##

The app is split into 3 projects:
  * yahap-services: Controls devices and receives events from X-10 devices. The API is exposed as web services
  * yahap-webapp: written in MyFaces/Tobago, it utilizes the exposed web services. This could be located on the same or a separate machine.
  * yahap-core: shared classes between the two (this could dissapear)

## yahap-services ##
  * needs Java EE (6.0)
  * exposes services using jax-ws


## yahap-webapp ##
  * needs Java EE (6.0)
  * uses JSF (Apache MyFaces implementation with Tobago)


HaInvestigations