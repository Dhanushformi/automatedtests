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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (20)'))

WebUI.setText(findTestObject('Object Repository/Page_Weve got your back/input_Email Address_email (13)'), 'zcctrsobh@karenkey.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (13)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (13)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/a_Create Event (2)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/input_Date_dateAndTime'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_Date_dateAndTime'))

//WebUI.scrollToElement(findTestObject('Object Repository/Page_Formi - List Event/input_Date_dateAndTime'), 3)

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/input_Date_dateAndTime'))

String cMonth = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/Month'))

String cYear = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/Year'))

System.out.println(cMonth + cYear)

String eDate = "24"

String eMonth = 'Jan'

String eYear = '2023'

while (cMonth!= eMonth || cYear!=eYear) {
	WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/Next Month'))
	
	cMonth = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/Month'))
	
	cYear = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/Year'))
	
}

WebDriver driver = DriverFactory.getWebDriver();
List <WebElement> el = driver.findElements(By.xpath("//div[@class='ant-picker-cell-inner']"))
for (WebElement e: el ) {
	if (e.getText() == eDate) {
		cDate = e.getText()
		e.click()
		break
		
	}
}

System.out.println(cDate +' '+ cMonth+' ' + cYear)

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/InputTime'))
eTime = '1:00 AM'
WebDriver driver2 = DriverFactory.getWebDriver();
List <WebElement> el2 = driver2.findElements(By.xpath("//div[@class='ant-select-item ant-select-item-option']"))
for (WebElement e: el2 ) {
	if (e.getText() == eTime) {
		
		cTime = e.getText()
		e.click()
	System.out.println(cTime)
		break
		
	}
}

String cTime = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/InputTime'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/input_Select time_ant-checkbox-input'))
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_Select time_ant-checkbox-input'))
//
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/span_Time_ant-select-selection-search'))
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_Time_startTime'))
//
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/input_Cover Charges_coverCharge'))
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_Cover Charges_coverCharge'))
//
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/input_Cover Charge Amount_coverChargeAmount'))
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_Cover Charge Amount_coverChargeAmount'))
//
//WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/input_Select time_ant-checkbox-input'))
//
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/input_Event Ends_endDate'))
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_Event Ends_endDate'))
//
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/input_End Time_endTime'))
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/input_End Time_endTime'))

