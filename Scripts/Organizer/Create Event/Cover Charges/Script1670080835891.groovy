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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (20)'))

WebUI.setText(findTestObject('Object Repository/Page_Weve got your back/input_Email Address_email (13)'), 'zcctrsobh@karenkey.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (13)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (13)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/a_Create Event (2)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/ChargeAmount'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/ChargeAmount'))

WebUI.setText(findTestObject('Object Repository/Page_Formi - List Event/ChargeAmount'),'////')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/Error Message'))

error1  = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/Error Message'))



error_compare = 'Please enter a valid number'

if (error1 != error_compare) {
	KeywordUtil.markFailed(((error1 + ' and ') + error_compare) + ' do not match')
}

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/CoverTime'))

eTime = '1:00 AM'

// need to add another section for scrolling and selecting

WebDriver driver2 = DriverFactory.getWebDriver();
List <WebElement> el2 = driver2.findElements(By.xpath("//div[@class='ant-select-item-option-content']"))
for (WebElement e: el2 ) {
	if (e.getText() == eTime) {
		
		cTime = e.getText()
		e.click()
	System.out.println(cTime)
		break
		
	}
}

String cTime = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/CoverTime'))


