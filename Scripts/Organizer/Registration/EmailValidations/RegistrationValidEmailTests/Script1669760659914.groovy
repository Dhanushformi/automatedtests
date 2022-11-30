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

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))


// ------------------------------Valid email tests-------------------------------------

//--1) email with dot -> valid

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a.a@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//--2) email with subdomain -> valid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a.a@a.gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//--3) email with plus -> valid
//
//WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')
//
//WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a+a@gmail.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
//	'cvW8qx4B2o3F4VwP/kNsqA==')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//--4) email with quotes -> valid

//WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')
//
//WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), '"a"@gmail.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
//	'cvW8qx4B2o3F4VwP/kNsqA==')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//--5) email with numbers -> valid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), '123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//-6) email domain with hiphen -> valid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), '123@a-gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//-7) email with underscore -> valid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), '___@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//-8) email name with hiphen -> valid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a-a@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//-9) email name unusual-> valid

//WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')
//
//WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'much.”moreunusual”@example.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
//	'cvW8qx4B2o3F4VwP/kNsqA==')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

//-10) email name unusual-> valid

//WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')
//
//WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'much.”moreunusual”@example.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
//	'cvW8qx4B2o3F4VwP/kNsqA==')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))
//
//WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Cancel'))

WebUI.closeBrowser()



