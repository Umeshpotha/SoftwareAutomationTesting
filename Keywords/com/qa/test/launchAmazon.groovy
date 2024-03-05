package com.qa.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select  // Import the Select class

public class launchAmazon {
    @Keyword
    def LaunchAmazon() {
        WebUI.openBrowser(null)
        WebUI.navigateToUrl("https://www.amazon.com") // Make sure to use the correct URL format
    }
    
    @Keyword
    def Checkdropdownlist(TestObject object, String option) {
        boolean flag = false;
        WebElement element = WebUICommonHelper.findWebElement(object); // Corrected usage
        Select ddl = new Select(element);
        
        for (WebElement ele : ddl.getOptions()) { // Corrected loop indentation
            if (ele.getText().equals(option)) {
//                System.out.println("Element Exist");
                flag = true;
                break; // Exit the loop once the option is found
            } else {
//                System.out.println("Element not Exist");
            }
        }
        
        return flag;
    }
}
