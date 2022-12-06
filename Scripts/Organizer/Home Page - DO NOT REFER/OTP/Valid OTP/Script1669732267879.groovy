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

currentWindow = WebUI.getWindowIndex()

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://mail.tm/en/')

WebUI.click(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/img__rounded-full w-6 h-6'))

WebUI.click(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/p_svsbdaupzkarenkey.com'))

username = WebUI.getText(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/p_svsbdaupzkarenkey.com'))

WebUI.click(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/div__fixed z-10 inset-0'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), username )

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.delay(15)

//WebUI.rightClick(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/svg (1)'))
//
//WebUI.rightClick(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/iframe_concat(id(, , goog_1033885711, , ))__c69477'))

//Boolean Adpresent1 = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/svg (1)'))
//
//if (Adpresent) {
//	
//	WebUI.click(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/button_Skip Ad'))
//	
//}


WebUI.click(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/div_adminformi.co.in                 Verify_afb2a6'))

Boolean Adpresent2 = WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/div_Close'))

if (Adpresent) {
	WebUI.click(findTestObject('Object Repository/Page_Temp Mail - Disposable Temporary and F_746997/div_Close'))
}


WebUI.rightClick(findTestObject('Object Repository/Page_View message - Mail.tm/iframe_concat(id(, , goog_1646606416, , ))__08fe6b_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_View message - Mail.tm/div_1'))

WebUI.click(findTestObject('Object Repository/Page_View message - Mail.tm/button_Skip Ad'))

WebUI.click(findTestObject('Object Repository/Page_View message - Mail.tm/h1_3 (1)'))

otp1 = WebUI.getText(findTestObject('Object Repository/Page_View message - Mail.tm/h1_3 (1)'))

WebUI.click(findTestObject('Object Repository/Page_View message - Mail.tm/h1_2 (2)'))

otp2 = WebUI.getText(findTestObject('Object Repository/Page_View message - Mail.tm/h1_2 (2)'))

WebUI.click(findTestObject('Object Repository/Page_View message - Mail.tm/h1_8 (1)'))

otp3 = WebUI.getText(findTestObject('Object Repository/Page_View message - Mail.tm/h1_8 (1)'))

WebUI.click(findTestObject('Object Repository/Page_View message - Mail.tm/h1_2 (2)'))

otp1 = WebUI.getText(findTestObject('Object Repository/Page_View message - Mail.tm/h1_2 (2)'))

WebUI.switchToWindowIndex(0)


String otp = ((otp1 + otp2) + otp3) + otp4

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_svsbdaupzkarenkey.com_register_input__0cd322'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_svsbdaupzkarenkey.com_register_input__0cd322'),
	otp) 

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Verify'))

//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/span_Click to resend'))
//
//WebUI.closeBrowser()

