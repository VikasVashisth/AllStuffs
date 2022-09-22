# Pre-set Up Documentation

There are Total 14 Tests which are based on SDK to create the Folders in the team content directory(root directory) and providing then with the permission and 16 other tests which are written in Selenium Scripts.

Description about the 14 tests individually.

**Create the following folders in the Root Directory:**

* **Secured By Master Company: Set permissions on this folder to FULL access for the master company Merrill's Calendar Company located within the UltiProSecurity namespace**

* **Secured By UltiPro Role: Set permissions on this folder to FULL access using the USG role of Merrill's Calendar Company > Cognos Core Role located within the UltiProSecurity namespace**

* **Secured By Cognos Role: Set permissions on this folder to FULL access using the Cognos role of Consumers located within the Cognos namespace**

* **Secured By Individual User: Set permissions on this folder to FULL access using the USG user of Merrill's Calendar Company > Cognos Core Role > CognosCalenda, Robert (CognosCalendaR) located within the UltiProSecurity namespace**

These are the Four directory Folder creation tests. 
### Name of the Tests

1. CreateDirectorySecuredByUltiProRoleTest
2. CreateDirectorySecuredByCognosRoleTest
3. CreateDirectorySecuredByIndividualUserTest
4. CreateDirectorySecuredByMasterCompanyTest

**Add the following members to the following UltiPro delivered roles:**

* **Add UltiProSecurity > Merrill's Calendar Company ** > Users > Brooks, Jeffrey S (BrooksJ) as a member to the following delivered roles:**
    * *Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Onboarding Roles > ARCALEN BI Onboarding Analytics Users* *
    * Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Recruiting Roles > ARCALEN BI Recruiting Analytics Users ** **
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Recruitment Roles > ARCALEN UltiPro Recruitment Analytics Users**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Succession Management Roles > ARCALEN UltiPro Succession Management Analytics Users**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Talent Management Roles > ARCALEN Talent Management - PM Analytics Users**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Time Management Roles > ARCALEN UltiPro Time Management Analytics Users**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Time Roles > ARCALEN UltiPro Time Analytics Users ** **
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro TOA Roles > ARCALEN UltiPro TOA Analytics Users ** **
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > ARCALEN UltiPro Analytics Users**
* **Add UltiProSecurity > Merrill's Calendar Company ** > Users > Brooks, Tyler S (BrooksT) as a member to the following delivered roles:**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > ARCALEN UltiPro Authors**
* **Add UltiProSecurity > Merrill's Calendar Company ** > Users > Brown, Andrew S (BrownA) as a member to the following delivered roles:**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Recruitment Roles > ARCALEN UltiPro Recruitment Consumers**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Time Management Roles > ARCALEN UltiPro Time Management Consumers**
* **Add UltiProSecurity > Merrill's Calendar Company ** > Users > Bryant, Andrew MMP PR-Shawn (BryantA) as a member to the following delivered roles:**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > UltiPro Recruiting Roles > ARCALEN BI Recruiting Reporting Administators**
* **Add UltiProSecurity > Merrill's Calendar Company ** > Users > Bryant, Michael S (BryantM) as a member to the following delivered roles:**
    * **Cognos > Ultimate Software Delivered Roles > ARCALEN Security > ARCALEN UltiPro Security Administrators**
* **Add UltiProSecurity > Administrators > Cloud, Ultipro (rcloud) as a member to the following Cognos role:**
    * **Cognos > System Administrators**

These are the Seven tests to give the required permissions

5. AddBrooksJToRolesTest
6. AddBrooksTInUltiProAuthorsTest
7. AddBrownAInUltiProRecruitmentConsumersTest 
8. AddBrownAInUltiProTimeManagementConsumersTest 
9. AddBryantAInBIRecruitingReportingAdministratorsTest
10. AddBryantMInUltiProSecurityAdministratorsTest
11. AddRcloudToSecurityAdministratorsTest

Apart from these SDK tests , there are three more tests that have been used to provide certain permission so that report and alert for the CognosCalendar(CC) and CognosSACalendar(SA) users must be work properly.

12. AddCognosCalAsConsumerTest
13. AddCognosCalendarAsReportingAdministratorTest
14. AddCognosSACalendarAsReportingAdministratorTest


Rest 16 tests information,

**Create the following scheduled alerts using CognosCalendar (Employee Type):**

* **Employee Headcount (CognosCalendar - NEW and Ongoing By Day)**
* **Employee Headcount (CognosCalendar - NEW and Ongoing By Minute)**
* **Employee Headcount (CognosCalendar - NEW ONLY By Day)**
* **Employee Headcount (CognosCalendar - NEW ONLY By Minute)**

**NOTE: Task Rule and Time Schedules to use for each alert are mention in the alert title itself above (e.g. New and Ongoing By Minute)**

**Create the following scheduled alerts using CognosSACalendar (Site Administrator Type):**

* **Employee Headcount (CognosSACalendar - NEW and Ongoing By Day)**
* **Employee Headcount (CognosSACalendar - NEW and Ongoing By Minute)**
* **Employee Headcount (CognosSACalendar - NEW ONLY By Day)**
* **Employee Headcount (CognosSACalendar - NEW ONLY By Minute)**


15. ValidateAlertNewAndOngoingByDayTest
16. ValidateAlertNewOnlyByDayTest
17. ValidateSAAlertNewAndOngoingByDayTest
18. ValidateSAAlertNewOnlyByDayTest
19. ValidateAlertOnEmailNewAndOngoingByMinuteTest
20. ValidateAlertOnEmailNewOnlyByMinuteTest
21.  ValidateSAAlertOnEmailNewAndOngoingByMinuteTest
22. ValidateSAAlertOnEmailNewOnlyByMinuteTest

Test Number 15,16 are used for CognosCalendar(CC) user and 17,18 used for CognosSACalendar(SA) user.
TestNumber 19 to 22 are validating on Email whether the email is coming to the provided email id via an alert or not.

**Create the following scheduled reports using CognosCalendar (Employee Type):**

* **Employee Birthdays (CognosCalendar - By Day of Week)**
* **Employee Birthdays (CognosCalendar - By Minute)**
* **Employee Birthdays (CognosCalendar - By Day of Month)**
* **Employee Birthdays (CognosCalendar - By Day of the Year)**

**NOTE: Time Schedules to use for each report are mention in the report title itself above (e.g. By Day of Week, By Minute, By Day of Month, etc.)**
**Create the following scheduled reports using CognosSACalendar (Site Administrator Type):**

* **Employee Birthdays (CognosSACalendar - By Day of Week)**
* **Employee Birthdays (CognosSACalendar - By Minute)**
* **Employee Birthdays (CognosSACalendar - By Day of Month)**
* **Employee Birthdays (CognosSACalendar - By Day of the Year)**

23. ValidateReportByDayOfMonthTest
24. ValidateReportByDayOfWeekTest
25. ValidateReportByDayOfYearTest
26. ValidateSAReportByDayOfMonthTest
27. ValidateSAReportByDayOfWeekTest
28. ValidateSAReportByDayOfYearTest
29. ValidateReportOnEmailByMinuteTest
30. ValidateSAReportOnEmailByMinuteTest

Test Number 23,24,25 are used for CognosCalendar(CC) user and 26,27,28 used for CognosSACalendar(SA) user.
TestNumber 29 and 30 are validating on Email whether the email is coming to the provided email id via a report or not.


# END

To LogIn into the IBM Cognos Analytics there are three different types of user like System Administrator which is Rcloud user and two other users CognosCalendar and CognosSACalendar.

31. RcloudLoginTest
32. CognosCalendarLoginTest
33. CognosSACalendarLoginTest

There are Two more folder creation test to Create and Validate Alerts and Reports using CognosCalendar and CognosSACalendar users.

34. CreateDirectoryAlertsTest
35. CreateDirectoryReportsTest

There is one Test to make and check whether the permission is correct or not in the Alert Folder to create the alerts.

36. CreateDirectoryAlertsPermissionCheckTest
