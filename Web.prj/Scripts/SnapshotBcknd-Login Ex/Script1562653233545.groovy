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

WebUI.navigateToUrl('https://snapshotstagingadmin.havasstaging.com/user/login')

WebUI.setText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Email  Username_LoginFormusername'), 'superamin')

WebUI.setEncryptedText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Password_LoginFormpassword'), 'afYN15eX3Ac=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Username or password is invalid'))

WebUI.setText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Email  Username_LoginFormusername'), 'superadmin')

WebUI.setEncryptedText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Password_LoginFormpassword'), 'afYN15eX3Ac=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Username or password is invalid'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Email  Username_col-lg-3'))

WebUI.setText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Email  Username_LoginFormusername'), 'superamin')

WebUI.setEncryptedText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Password_LoginFormpassword'), 'QAI2/+beLlI=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Username or password is invalid'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Email  Username_col-lg-3'))

WebUI.setText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Email  Username_LoginFormusername'), '')

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Password_col-lg-3'))

WebUI.setEncryptedText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Password_LoginFormpassword'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Required'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Required'))

WebUI.setText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Email  Username_LoginFormusername'), 'superamin')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Required'))

WebUI.setText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Email  Username_LoginFormusername'), '')

WebUI.setEncryptedText(findTestObject('SnapshotBcknd-Login Ex/Page_Login/input_Password_LoginFormpassword'), 'afYN15eX3Ac=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Required'))

WebUI.closeBrowser()

