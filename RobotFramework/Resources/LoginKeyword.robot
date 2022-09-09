*** Settings ***
Library     SeleniumLibrary
Variables  ../PageObjects/LoginPage.py

*** Keywords ***
Open My Browser
    [Arguments]  ${SiteURL}     ${Browser}
    open browser  ${SiteURL}     ${Browser}
    Maximize Browser Window

Enter UserName
    [Arguments]  ${userName}
    input text  ${login_UserName}       ${userName}

Enter Password
    [arguments]     ${password}
    input text      ${login_Password}    ${password}

Click Login
    click button    ${login_Button}

Verify Successful Login
    title should be : "nopCommerce demo store"

Close Browser
    close browser

Click Login Link
    click element       ${login_Link}