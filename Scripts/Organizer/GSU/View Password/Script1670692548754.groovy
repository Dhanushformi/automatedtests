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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://organizer.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (9)'))

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Sign in with Google (3)'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_Create account'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_For my personal use'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead_Passwd'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead__f01a3e'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Create your Google Account/input_Use 8 or more characters with a mix o_b60f5c'), 
    3)

WebUI.delay(3)

//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/input_Use 8 or more characters with a mix o_b60f5c'))
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/input_Use 8 or more characters with a mix o_b60f5c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/div_Show password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/div_Show password'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/input_Use 8 or more characters with a mix o_b60f5c'))

