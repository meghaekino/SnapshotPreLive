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

not_run: WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login/Input_Username'), 'superadmin')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password'), 'QAI2/+beLlI=')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Users/a_Snapshot'))

WebUI.scrollToElement(findTestObject('Page_Users/a_Articles'), 0)

WebUI.click(findTestObject('Page_Users/a_Articles'))

WebUI.click(findTestObject('Page_Users/span_Create Article'))

WebUI.click(findTestObject('Page_Create Articles/span_Happenings'))

WebUI.click(findTestObject('Page_Create Articles/Select_Tips_and_Tutorials'))

WebUI.setText(findTestObject('Page_Create Articles/provide_articlename'), 'Automation Testing Excel')

WebUI.click(findTestObject('Page_Create Articles/input_Slug_Articlesslug'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'rr')

WebUI.setText(findTestObject('null'), 'rr')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'rrrrr')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

