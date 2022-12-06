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

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (23)'))

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/div_Email Address'))

WebUI.setText(findTestObject('Object Repository/Page_Weve got your back/input_Email Address_email (16)'), 'zcctrsobh@karenkey.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (16)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (16)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/a_Create Event (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/div_'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/div_'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/div_'))

WebUI.setText(findTestObject('Object Repository/Page_Formi - List Event/input_Add Artist_oldartists'), 'aa')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/div_DJ Shaan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/div_DJ Shaan'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/div_DJ Shaan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/svg'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/svg'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/a_Click here to add'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/a_Click here to add'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/a_Click here to add'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/input_Artist Name_name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_Artist Name_name'))

WebUI.setText(findTestObject('Object Repository/Page_Formi - List Event/input_Artist Name_name'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/dError Message Name is re'))

WebUI.setText(findTestObject('Object Repository/Page_Formi - List Event/input_Artist Name_name'), 'GMN')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/span_Click or drag file to this area to upl_e3d338'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/span_Click or drag file to this area to upl_e3d338'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/span_Click or drag file to this area to upl_e3d338'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/img_Edit image_reactEasyCrop_Image reactEas_f956bd'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/section_'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/section_'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/button_Click to Change'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/div_DJ Shaan_1'))

WebUI.setText(findTestObject('Object Repository/Page_Formi - List Event/input_Add Artist_oldartists'), '')

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/div_Basic InfoPoster, name, artist, date an_6fbc4a'))

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/div_GMN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/svg_GMN_list-event_close__NTx9X'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/svg_GMN_list-event_close__NTx9X'))

WebUI.closeBrowser()

