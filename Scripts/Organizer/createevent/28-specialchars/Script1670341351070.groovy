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

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Weve got your back/input_Email Address_email'), 'zcctrsobh@karenkey.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/a_Create Event'))

WebUI.setText(findTestObject('Object Repository/Page_Formi - List Event/input_Event Title_name'), '^123qweet')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formi - List Event/div_Name can only contain letters, numbers,_e56160'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/div_Upload BannerThis is the first image at_dd1140'))

