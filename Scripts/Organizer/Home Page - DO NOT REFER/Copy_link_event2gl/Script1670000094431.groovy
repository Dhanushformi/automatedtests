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

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (15)'))

WebUI.setText(findTestObject('Object Repository/Page_Weve got your back/input_Email Address_email (5)'), 'zcctrsobh@karenkey.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (5)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (5)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/span_Copy Link (2)'))

if_undefined = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor);

link = 'https://testing.formi.co.in/events/dhanush-s?promotor=b39042ae'

if (if_undefined.length() != link.length()) {
	
	KeywordUtil.markFailed(((if_undefined.length() + ' and ') + link.length()) + ' do not match')
	
}
WebUI.closeBrowser()
