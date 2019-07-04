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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://snapshotstagingadmin.havasstaging.com/user/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email  Username_LoginFormusername'), 'incorrectusername')

WebUI.setText(findTestObject('Page_Login/input_Password_LoginFormpassword'), 'neo')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Login/Verify_Invalid_Credentials'), 30000)

//WebUI.clearText(findTestObject('Page_Login/input_Email  Username_LoginFormusername'))
//WebUI.clearText(findTestObject('Page_Login/input_Password_LoginFormpassword'))
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email  Username_LoginFormusername'), 'superadmin')

//WebUI.waitForElementClickable(findTestObject('Page_Login/input_Password_LoginFormpassword'), 10000)
WebUI.setText(findTestObject('Page_Login/input_Password_LoginFormpassword'), 'incorrectpassword')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Login/Verify_Invalid_Credentials'), 30000)

//WebUI.clearText(findTestObject('Page_Login/input_Email  Username_LoginFormusername'))
//WebUI.clearText(findTestObject('Page_Login/input_Password_LoginFormpassword'))
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email  Username_LoginFormusername'), 'incorrectusername')

WebUI.setText(findTestObject('Page_Login/input_Password_LoginFormpassword'), 'incorrectpassword')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Login/Verify_Invalid_Credentials'), 30000)

//WebUI.clearText(findTestObject('Page_Login/input_Email  Username_LoginFormusername'))
//WebUI.clearText(findTestObject('Page_Login/input_Password_LoginFormpassword'))
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email  Username_LoginFormusername'), '')

WebUI.setText(findTestObject('Page_Login/input_Password_LoginFormpassword'), 'neo')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

not_run: WebUI.verifyElementPresent(findTestObject('Page_Login/Verify_Username_Not_Provided'), 30000)

//WebUI.clearText(findTestObject('Page_Login/input_Email  Username_LoginFormusername'))
//WebUI.clearText(findTestObject('Page_Login/input_Password_LoginFormpassword'))
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email  Username_LoginFormusername'), 'superadmin')

WebUI.setText(findTestObject('Page_Login/input_Password_LoginFormpassword'), '')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

//WebUI.verifyElementPresent(findTestObject('Page_Login/Verify_Password_Not_Provided'), 30000)
//WebUI.clearText(findTestObject('Page_Login/input_Email  Username_LoginFormusername'))
//WebUI.clearText(findTestObject('Page_Login/input_Password_LoginFormpassword'))
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email  Username_LoginFormusername'), 'superadmin')

WebUI.setText(findTestObject('Page_Login/input_Password_LoginFormpassword'), 'neo')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

