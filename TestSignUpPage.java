package com.facebookTest;

import com.FacebookPages.SignUpPage;

import generic.BaseTest;

public class TestSignUpPage extends BaseTest{

	public static void main(String[] args) {
		
		SignUpPage objSignUpPage = new SignUpPage();
		objSignUpPage.initilizeWebDriver();
        objSignUpPage.setFirstNameOnFacebookPage();
	    objSignUpPage.setLastNameOnFacebookPage();
		objSignUpPage.setRegisterMailId();
        objSignUpPage.setRandomPasswordFace();
        objSignUpPage.setBirthDateOnFacebookPage();
        objSignUpPage.clickOnTermsLink();
        objSignUpPage.setBirthMonthOnFacebookPage();
        objSignUpPage.setBirthYearOnFacebookPage();
        objSignUpPage.verifyApplicationTittle();
        objSignUpPage.setGender();
        objSignUpPage.mouseOverLearnMore();
       
       
       
    }
}