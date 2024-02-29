package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SelectPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase {

  @BeforeMethod
  public void precondition() {
    new HomePage(driver).confirmCookies().getWidgets();
    new SidePanel(driver).getSelect();
  }

  @Test
  public void enterPracticeFormTest() {
    new PracticeFormPage(driver).hideIframes();
    new PracticeFormPage(driver)
        .enterPersonalData("Jack", "Sparrow", "jack@gm.com", "1234567890")
        .selectGender("Male")
        .typeOfDate("12 April 1987");
        .addSubject(new String[]{"Math", "English", "Chemystri"});
        .selectHobby(new String[]{"Sports", "Reading", "Music"});
        .uploadFile("C://Users//remom//Tools//th.jpg");
        .selectState("NCR")
        .selectCity("Dehly")
        .submit();
        .verifyStudentFormTitle("Thanks for submitting the form");

  }

}

