*** Settings ***
Library     SeleniumLibrary
Variables  ../PageObjects/LoginPage.py

*** Keywords ***
Open My Browser
    [Arguments]  ${SiteURL}     ${Browser}
    open browser  ${SiteURL}     ${Browser}
    Maximise Browser Window

Enter UserName
    [Arguments]  ${userName}
    input text  ${login_UserName}       ${userName}

Enter Password
    [arguments]  ${password}
    input text ${login_Password}    ${password}

Click Login
    click button    ${login_Button}