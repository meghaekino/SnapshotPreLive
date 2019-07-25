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

WebUI.setEncryptedText(findTestObject('create article repo/Page_Login/Password'), 'QAI2/+beLlI=')

WebUI.click(findTestObject('create article repo/Page_Login/button_Login'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('create user repo/Page_Create Admin Account/Create Admin Account'))

WebUI.waitForPageLoad(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('create user repo/Page_Create Admin Account/input_Email'))

WebUI.setText(findTestObject('create user repo/Page_Create Admin Account/input_Email'), 'anusha.107@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('create user repo/Page_Create Admin Account/input_Username'))

WebUI.setText(findTestObject('create user repo/Page_Create Admin Account/input_Username'), 'Test107')

WebUI.delay(1)

WebUI.click(findTestObject('create user repo/Page_Create Admin Account/input_First Name'))

WebUI.setText(findTestObject('create user repo/Page_Create Admin Account/input_First Name'), 'tester7')

WebUI.delay(1)

WebUI.click(findTestObject('create user repo/Page_Create Admin Account/input_Last Name'))

WebUI.setText(findTestObject('create user repo/Page_Create Admin Account/input_Last Name'), 'regional7')

WebUI.click(findTestObject('create user repo/Page_Create Admin Account/Select Role'))

WebUI.waitForElementClickable(findTestObject('create user repo/Page_Create Admin Account/Select Role'), 0)

WebUI.setText(findTestObject('create user repo/Page_Create Admin Account/role'), 'regionaladmin')

WebUI.sendKeys(findTestObject('create user repo/Page_Create Admin Account/role'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('create user repo/Page_Create Admin Account/button_Create'), 1)

WebUI.click(findTestObject('create user repo/Page_Create Admin Account/button_Create'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('create user repo/Page_Create Admin Account/Created page'), 1)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create user/0.png')

WebUI.click(findTestObject('create user repo/Page_Test321/Admin List'))

WebUI.setText(findTestObject('create user repo/Page_Test321/filter by email'), 'anusha.107@gmail.com')

WebUI.sendKeys(findTestObject('create user repo/Page_Test321/filter by email'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create user/1.png')

WebUI.clearText(findTestObject('create user repo/Page_Test321/filter by email'))

WebUI.delay(2)

WebUI.setText(findTestObject('create user repo/Page_Test321/filter with firstname'), 'tester7')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('create user repo/Page_Test321/filter with firstname'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create user/2.png')

WebUI.clearText(findTestObject('create user repo/Page_Test321/filter with firstname'))

WebUI.setText(findTestObject('create user repo/Page_Test321/filter with lastname'), 'regional7')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('create user repo/Page_Test321/filter with lastname'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create user/3.png')

WebUI.clearText(findTestObject('create user repo/Page_Test321/filter with lastname'))

WebUI.selectOptionByValue(findTestObject('create user repo/Page_Test321/td_Test321'), '11', false)

WebUI.sendKeys(findTestObject('create user repo/Page_Test321/filter by role'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('create user repo/Page_Test321/filter with firstname'), 'tester7')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('create user repo/Page_Test321/filter with firstname'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/create user/4.png')

WebUI.delay(1)

WebUI.closeBrowser()

