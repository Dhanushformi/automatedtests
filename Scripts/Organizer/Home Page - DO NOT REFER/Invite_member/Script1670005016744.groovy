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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (19)'))

WebUI.setText(findTestObject('Object Repository/Page_Weve got your back/input_Email Address_email (12)'), 'zcctrsobh@karenkey.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (12)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (12)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/button_Invite Member (2)'))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/input_When promoters join, you will able to_de0ed8 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/div_Copy Link (3)'))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/span_Go To Dashboard_ant-modal-close-x (1)'))

String if_undefined = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor);

WebUI.setText(findTestObject('Object Repository/Page_Events  Formi/input_Partnered Events_ant-input'), 'https://organizer-testing.formi.co.in/register?teamID=63664d91e80cb2e946d99c26')

int n = 9
String str = ''

int initial = if_undefined.length()-n
for(int i=initial; i<if_undefined.length(); i++) {
   str = str + if_undefined.charAt(i)
}

if (str!='undefined') {
	KeywordUtil.markFailed((str + 'This link is undefined'))
	
}

