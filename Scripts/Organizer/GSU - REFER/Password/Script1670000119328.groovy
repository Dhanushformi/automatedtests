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

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (6)'))

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Sign in with Google (2)'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_Create account (6)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_For my personal use (5)'))

'GSU-011'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead_Passwd'), 
    0)

'GSU-011'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead_Passwd'))

'GSU-012\r\n'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead_Passwd'))

'GSU-012\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead_Passwd'), 
    'BWgEo7IagHzWhi9YvsMrEQ==')



