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

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Register'))

WebUI.switchToWindowTitle('Sign-up to get the Formi dashboard!')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/span_Sign in with Google'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_Create account'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_For my personal use'))

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Create your Google Account_firstName'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Create your Google Account_lastName'), 
    'NAme')

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Create your Google Account_Username'), 
    'test.34243143')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead_Passwd'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead__f01a3e'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/div_Show password_VfPpkd-RLmnJb'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/div_Show password_VfPpkd-RLmnJb'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Create your Google Account/div_Show password_VfPpkd-RLmnJb'), 
    3)

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create your Google Account/div_91India (91)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/div_91India (91)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/input_Phone number_phoneNumberId'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/input_Phone number_phoneNumberId'))

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Phone number_phoneNumberId'), '9847451458')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/div_Standard rates apply_VfPpkd-RLmnJb'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/div_Standard rates apply_VfPpkd-RLmnJb'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/input_G-_code'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/input_G-_code'))

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_G-_code'), '020000')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create your Google Account/div_Standard rates apply_VfPpkd-RLmnJb'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/div_Standard rates apply_VfPpkd-RLmnJb'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/span_Back'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/span_Back'))

WebUI.rightClick(findTestObject('Object Repository/Page_Create your Google Account/span_Back'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Back'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Create your Google Account/span_Back'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Create your Google Account/span_Back'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Back'))



