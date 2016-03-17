# Iterations and Stories #

Current Iteration is **0**, yes baby steps first

The purpose of this page is to put together a big wish list and assign priorites. Then get focus by concentrating on one iteration at a time. As I think up stuff I place it in the feature bucket. As an iteration ends I move stories from the bucket into the next iteration.

For definitions on this page see the YahapArchitecture page

# Iterations #
## Iteration 1 ##
**Story:** Turn on and off a light from the web interface using x-10
  * User clicks on Add device button
  * Shown a form with the following fields
    * Device Name
    * Select Location - Add new location shows new field
    * Device Type
    * Housecode/unitcode
    * Options - only 1 option to not log commands
    * Save/Delete/Cancel
  * User clicks on Save button
  * Add Device web service called
  * Model adds device to db using hibernate

# Story Bucket #
**Story:** List devices web page
  * Show data table with sortable columns
  * Fields on table should be:
    * Status
    * Location
    * Name
    * Code
    * Type
    * Last Changed
    * Control (on/off) buttons

**Story:** Clicking on a device should show you the last 5 events
Location: Webapp: ListDevicesPage
  * Clicking anywhere in the table should show you another row in the table in a different colour a list of the last 5 events

**Story:** yahap-webapp: Able to navigate easily through pages
  * Implement tobago tabbing
  * implement tobago layout

**Story:** yahap-webapp: Implement themes
  * Using tobago themes

**Story:** yahap-webapp: Internationalisation using tobago

**Story:** yahap-webapp: Navigation structure using tobago

**Story:** MCE plugin

# Complete Iterations #
## Iteration 0 ##
**Story1:** setup the project environment (complete)
  * Set up maven and project layout

**Story2:** do some web page mockups
  * Use jsf/myfaces/tobago components to build skeleton pages
  * add device page