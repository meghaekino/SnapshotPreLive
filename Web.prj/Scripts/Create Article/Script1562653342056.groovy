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

WebUI.click(findTestObject('Object Repository/create article repo/Page_Login/button_Login'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('create article repo/Page_Users/snapshot'))

WebUI.waitForElementClickable(findTestObject('create article repo/Page_Users/snapshot'), 1)

WebUI.click(findTestObject('create article repo/Page_Users/Articles'))

WebUI.delay(1)

WebUI.click(findTestObject('create article repo/Page_Users/Create Article'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('create article repo/Page_Create Articles/span_Happenings'))

WebUI.mouseOver(findTestObject('create article repo/Page_Create Articles/Select Category'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Select Category'), 'Tips & Tutorials')

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/Create Article/1.png')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Select Category'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('create article repo/Page_Create Articles/Select Category'), 1)

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Name'), 'Create katalon')

WebUI.click(findTestObject('create article repo/Page_Create Articles/Slug'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Slug'), '@2')

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Author'), 'author')

WebUI.waitForElementPresent(findTestObject('create article repo/Page_Create Articles/Author'), 1)

WebUI.click(findTestObject('create article repo/Page_Create Articles/Related Authors'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Related Authors_'), 'Edwin Martinez')

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/Create Article/2.png')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Related Authors_'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('create article repo/Page_Create Articles/Products'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Products_'), 'EOS 6D (Body)', FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/Create Article/3.png')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Products_'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('create article repo/Page_Create Articles/Contenttype_Image'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/span_Image'), 'Image')

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/Create Article/4.png')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/span_Image'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Thumbnail'), 'https://d25tv1xepz39hi.cloudfront.net/2019-06-10/files/mount-rinjani.jpg\t')

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Levels'), 'Beginner')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Levels'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Sort Order'), '2')

WebUI.click(findTestObject('create article repo/Page_Create Articles/Parent Topics'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Parent Topics_'), 'Events')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Parent Topics_'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('create article repo/Page_Create Articles/Child Topics'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Child Topics_'), 'PowerShot N2')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Child Topics_'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('create article repo/Page_Create Articles/Select Country'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Select Country_'), 'India', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Select Country_'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('create article repo/Page_Create Articles/Related Articles'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Related Articles_'), 'In Focus: Night Photography')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Related Articles_'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('create article repo/Page_Create Articles/Status'))

WebUI.setText(findTestObject('create article repo/Page_Create Articles/Status_'), 'Draft')

WebUI.sendKeys(findTestObject('create article repo/Page_Create Articles/Status_'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/create article repo/Page_Create Articles/button_Create'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('create article repo/Page_Create test/div_Article successfully created'), 3)

WebUI.takeScreenshot('C:/Users/Adapa.Devi/Katalon Studio/screenshots/Create Article/5.png')

WebUI.closeBrowser()

