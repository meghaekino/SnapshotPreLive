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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email  Username_LoginFormusername'), 'superadmin')

WebUI.setText(findTestObject('Page_Login/input_Password_LoginFormpassword'), 'neo')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Users/h1_Users'), 0)

    WebUI.comment('Login Successful')
}

WebUI.waitForElementClickable(findTestObject('Page_Users/span_superadmin(SuperAdmin)'), 3000)

WebUI.click(findTestObject('Object Repository/Page_Users/span_superadmin(SuperAdmin)'))

WebUI.click(findTestObject('Object Repository/Page_Users/a_Sign out'))

not_run: WebUI.waitForElementClickable(findTestObject('Page_Users/button_OK'), 30000)

WebUI.mouseOverOffset(findTestObject('Object Repository/Page_Users/button_OK'), 0, 0)

WebUI.click(findTestObject('Object Repository/Page_Users/button_OK'))

WebUI.verifyElementPresent(findTestObject('Page_Users/h1_Users'), 10000)

WebUI.navigateToUrl('https://snapshotstagingadmin.havasstaging.com/user/login')

WebUI.comment('Logout Successful')

