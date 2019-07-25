import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://snapshotstagingadmin.havasstaging.com/user/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('create article repo/Page_Login/Username'), 'superadmin')

WebUI.setEncryptedText(findTestObject('null'), 'QAI2/+beLlI=')

WebUI.click(findTestObject('null'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('create language repo/Page_Create Languages/Languages'))

WebUI.delay(2)

WebUI.click(findTestObject('create language repo/Page_Create Languages/Create Language'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('create language repo/Page_Create Languages/Languagetitle'), 'punjabi')

WebUI.setText(findTestObject('create language repo/Page_Create Languages/Abbreviation'), 'punjab')

WebUI.click(findTestObject('Object Repository/create language repo/Page_Create Languages/span_Active'))

WebUI.setText(findTestObject('create language repo/Page_Create Languages/Status'), 'Inactive')

WebUI.sendKeys(findTestObject('create language repo/Page_Create Languages/Status'), Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('create language repo/Page_Create Languages/Create btn'))

WebUI.delay(2)

WebUI.click(findTestObject('create language repo/Page_Create Languages/Create btn'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('create language repo/Page_Create Languages/created page'), 1)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create language/0.png')

WebUI.click(findTestObject('create language repo/Page_Create Languages/Languages'))

WebUI.delay(2)

WebUI.click(findTestObject('create language repo/Page_Language list/Languages List'))

WebUI.setText(findTestObject('create language repo/Page_Language list/Filter with Title'), 'punjabi')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('create language repo/Page_Language list/Filter with Title'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create language/1.png')

WebUI.clearText(findTestObject('create language repo/Page_Language list/Filter with Title'))

WebUI.setText(findTestObject('create language repo/Page_Language list/Filter with abbreviation'), 'punjab')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('create language repo/Page_Language list/Filter with abbreviation'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create language/2.png')

WebUI.clearText(findTestObject('create language repo/Page_Language list/Filter with abbreviation'))

WebUI.selectOptionByValue(findTestObject('create language repo/Page_Language list/filter with status'), 'Inactive', false)

WebUI.sendKeys(findTestObject('create language repo/Page_Language list/filter with status'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('create language repo/Page_Language list/Filter with Title'), 'punjabi')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('create language repo/Page_Language list/Filter with Title'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create language/3.png')

WebUI.delay(1)

WebUI.closeBrowser()

