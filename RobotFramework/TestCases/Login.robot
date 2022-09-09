*** settings ***
Library     SeleniumLibrary
Resource    ../Resources/LoginKeyword.robot

*** variables ***
${Browser}      Chrome
${SiteURL}      https://demo.nopcommerce.com/
${userName}     patilvilas97@gmail.com
${Password}     Vil@s123

*** Test Cases ***
Login Test
    Open My Browser     ${SiteURL}      ${Browser}
    Click Login Link
    Enter UserName      ${userName}
    Enter Password      ${Password}
    Click Login
    sleep       3 seconds
    Verify Successful Login
    Close Browser