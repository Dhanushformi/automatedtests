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
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

currentWindow = WebUI.getWindowIndex()

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://temp-mail.io/en')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Disposable temporary email - Temp Mail/mail_id (1)'))

username = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor);

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/button_Register (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email (3)'), 
  username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password (3)'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next (1)'))

//otp1 = WebUI.getText(findTestObject('Object Repository/Page_Verify your account - Temp Mail/otp1'))
//
//otp2 = WebUI.getText(findTestObject('Object Repository/Page_Verify your account - Temp Mail/otp2'))
//
//otp3 = WebUI.getText(findTestObject('Object Repository/Page_Verify your account - Temp Mail/otp3'))
//
//otp4 = WebUI.getText(findTestObject('Object Repository/Page_Verify your account - Temp Mail/otp4'))

String otp = '00/0'

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/otp enter'), otp)



WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Verify (1)'))

//unable to catch the error message in time

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/error message'))

error1 = WebUI.getText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/error message'))

error_compare = 'Invalid token'

if (error1 != error_compare) {
	KeywordUtil.markFailed(((error1 + ' and ') + error_compare) + ' do not match')
}

//
//WebUI.setText(findTestObject( 'Object Repository/Page_Sign-up to get the Formi dashboard/otp enter'), '/')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Verify (1)'))
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/error message'))



