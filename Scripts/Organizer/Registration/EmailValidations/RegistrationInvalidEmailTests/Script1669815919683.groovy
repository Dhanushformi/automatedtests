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

//--1) email id exceeding 320 chars -> invalid

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'hhhhhhnhjhjhjhjhjhjhsjdbjhsgdfjegrfjhddfjhgyersgjdshcbdhsvdhsfghjgfjhsgdhjsdfnhsgfdjhgdfhdsvjhfdhgdfjhsdgjdfgyjhgsjdmbvhsjgvyfdhjgbvndhjgfgvefhjvdbcjhdvghjefgeyrughdbfcnvfgehdsbvcsvhsjfgdjhfvhjfgdnhvbcbnnnnbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhhjghghghjhkgjhhhhnhvg@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

//--2) email with missing @ -> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a.a.gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

//--3) email without domain -> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), '@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

//--4) email starting with a dot -> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), '.aa@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

//--5) email with two @s -> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a@a@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

//-6) email with two dots -> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'aa..a@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

//-7) email with different language -> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'おえあいう@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Please enter a valid email'))

//-8) email name with extra chars after .com -> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a@gmail.comaa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Please enter a valid email'))

//-9) email name hiphen before addres-> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a@-gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Create Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Please enter a valid email'))

//-10) email name two dots after @-> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a@gmail..com')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

//-11) email name number after @-> invalid

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/a_Register Yourself'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/input_Email Address_email'), 'a@123.123')

WebUI.click(findTestObject('Object Repository/Page_Sign-up to get the Formi dashboard/div_Invalid email format'))

WebUI.closeBrowser()



