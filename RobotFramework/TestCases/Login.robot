*** settings ***
Library     SeleniumLibrary
Resource    ../Resources/LoginKeyword.robot

*** variables ***
${Browser}      Chrome
${SiteURL}      https://admin-demo.nopcommerce.com/login
${userName}     admin@yourstore.com
${Password}     admin

*** Test Cases ***
Login Test
    Open My Browser     ${SiteURL}      ${Browser}
    Enter UserName      ${userName}
    Enter Password      ${Password}
    Click Login
    sleep       3 seconds
    Verify Successful Login
    Close Browser