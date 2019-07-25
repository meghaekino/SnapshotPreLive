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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('SnapshotBackend-Login/input_Email  Username_LoginFormusername'), 'superadmin')

WebUI.setEncryptedText(findTestObject('SnapshotBackend-Login/input_Password_LoginFormpassword'), 'QAI2/+beLlI=')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/0.png')

WebUI.waitForPageLoad(3)

WebUI.comment('Given input is correct, successfully logged in.')

WebUI.click(findTestObject('SnapshotBackend-Login/Page_Users/img_Toggle navigation_user-image'))

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/1.png')

WebUI.click(findTestObject('SnapshotBackend-Login/Page_Users/a_Sign out'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SnapshotBackend-Login/Page_Users/button_OK'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('SnapshotBackend-Login/input_Email  Username_LoginFormusername'), 'superadmin')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBackend-Login/div_Required'), 0)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/2.png')

WebUI.comment('Un correct, Ps empty: message displayed as \'Required\'')

WebUI.refresh()

WebUI.setEncryptedText(findTestObject('SnapshotBackend-Login/input_Password_LoginFormpassword'), 'QAI2/+beLlI=')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBackend-Login/div_Required'), 0)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/3.png')

WebUI.comment('Un empty, Ps correct: message displayed as \'Required\'')

WebUI.refresh()

WebUI.setText(findTestObject('SnapshotBackend-Login/input_Email  Username_LoginFormusername'), 'supera')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBackend-Login/div_Required'), 0)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/4.png')

WebUI.comment('Un incorrect, Ps empty: message displayed as \'Required\' at Ps field')

WebUI.refresh()

WebUI.setEncryptedText(findTestObject('SnapshotBackend-Login/input_Password_LoginFormpassword'), 'afYN15eX3Ac=')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBackend-Login/div_Required'), 0)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/5.png')

WebUI.comment('Un empty, Ps incorrect: message displayed as \'Required\' at Un field')

WebUI.refresh()

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBackend-Login/div_Required'), 0)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/6.png')

WebUI.comment('Un, Ps both empty: message displayed as \'Required\' at both fields')

WebUI.refresh()

WebUI.setText(findTestObject('SnapshotBackend-Login/input_Email  Username_LoginFormusername'), 'superamin')

WebUI.setEncryptedText(findTestObject('SnapshotBackend-Login/input_Password_LoginFormpassword'), 'afYN15eX3Ac=')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Username or password is invalid'), 0)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/7.png')

WebUI.comment('Un, ps both incorrect: Message displayed as \'Username/password is invalid\'')

WebUI.refresh()

WebUI.setText(findTestObject('SnapshotBackend-Login/input_Email  Username_LoginFormusername'), 'superadmin')

WebUI.setEncryptedText(findTestObject('SnapshotBackend-Login/input_Password_LoginFormpassword'), 'afYN15eX3Ac=')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Username or password is invalid'), 0)

WebUI.waitForAlert(3)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/8.png')

WebUI.comment('Un correct, ps incorrect: message displayed as "Username/password is invalid"')

WebUI.refresh()

WebUI.setText(findTestObject('SnapshotBackend-Login/input_Email  Username_LoginFormusername'), 'superamin')

WebUI.setEncryptedText(findTestObject('SnapshotBackend-Login/input_Password_LoginFormpassword'), 'QAI2/+beLlI=')

WebUI.click(findTestObject('SnapshotBackend-Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('SnapshotBcknd-Login Ex/Page_Login/div_Username or password is invalid'), 0)

WebUI.waitForAlert(3)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/login testcases/9.png')

WebUI.comment('Un incorrect, Ps correct: message displayed as \'Username/password is invalid\'')

WebUI.closeBrowser()

