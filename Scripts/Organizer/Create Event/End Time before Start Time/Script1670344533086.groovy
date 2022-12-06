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
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://organizer-testing.formi.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Weve got your back/span_Login (20)'))

WebUI.setText(findTestObject('Object Repository/Page_Weve got your back/input_Email Address_email (13)'), 'zcctrsobh@karenkey.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (13)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Weve got your back/input_Enter Password_password (13)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Events  Formi/a_Create Event (2)'))








WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/input_Date_dateAndTime'))

String cMonth = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/Month'))

String cYear = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/Year'))

System.out.println(cMonth + cYear)

String eDate = "19"

String eMonth = 'Dec'

String eYear = '2022'

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
eTime = '1:30 AM'
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









WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/End_Time CheckBox'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formi - List Event/endDate'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formi - List Event/endDate'))

//WebUI.scrollToElement(findTestObject('Object Repository/Page_Formi - List Event/input_Date_dateAndTime'), 3)

WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/endDate'))



String cMonth2 = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/button_Dec'))

String cYear2 = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/button_2022'))

cMonth2 = 'Dec'

cYear2 = '2022'

System.out.println(cMonth2 + cYear2)

String eDate2 = "19"

String eMonth2 = 'Dec'

String eYear2 = '2022'

while (cMonth2!= eMonth2 || cYear2!=eYear2) {
//	WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/button_Dec_ant-picker-header-next-btn'))
//	
	cMonth2 = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/button_Dec'))
	
	cYear2 = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/button_2022'))
	
	cMonth2 = 'Dec'
	
	cYear2 = '2022'
	
}

WebDriver driver23 = DriverFactory.getWebDriver();
List <WebElement> e2l = driver23.findElements(By.xpath("//div[@class='ant-picker-cell-inner']"))
for (WebElement e: e2l ) {
	if (e.getText() == eDate2) {
		cDate2 = e.getText()
		e.click()
		System.out.println(cDate2 +' '+ cMonth2+' ' + cYear2)
		break
		
	}
}



WebUI.click(findTestObject('Object Repository/Page_Formi - List Event/End Time_endTime'))
eTime2 = '1:15 AM'
WebDriver driver22 = DriverFactory.getWebDriver();
WebUI.scrollToElement(findTestObject('Object Repository/Page_Formi - List Event/div_345 AM'), 3)
List <WebElement> el22 = driver22.findElements(By.xpath("//div[@class='ant-select-item ant-select-item-option']"))

for (WebElement e: el22 ) {
	if (e.getText() == eTime2) {
		cTime2 = e.getText()
		e.click()
		break 
		
	
	System.out.println(e.getText())
		
		
	}
}


error_message = WebUI.getText(findTestObject('Object Repository/Page_Formi - List Event/div_Start date should be less than end date-ETT'))
error_compare = 'Start time should be less than end time'

if (error_message!=error_compare) {
	KeywordUtil.markFailed(((error_message + ' and ') + error_compare) + ' do not match')
}
//


