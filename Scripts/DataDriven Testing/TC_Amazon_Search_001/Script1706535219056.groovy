import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.qa.test.launchAmazon.LaunchAmazon'()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Amazon_Search__001_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    categories, true)

WebUI.setText(findTestObject('Object Repository/Amazon_Search__001_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    item)

WebUI.click(findTestObject('Object Repository/Amazon_Search__001_OR/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Search__001_OR/Page_Amazon.com  Da vinci code/span_Results'), 
    0)

WebUI.closeBrowser()

