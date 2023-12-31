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

'Open the browser'
WebUI.openBrowser('')

'Maximizing the window browser'
WebUI.maximizeWindow()

'Navigate to sistemtoko.com'
WebUI.navigateToUrl(GlobalVariable.Url)

'Click button login page'
WebUI.click(findTestObject('login_repos/login_Page'))

'Input email : example12@gmail.com'
WebUI.sendKeys(findTestObject('login_repos/input_Email'), GlobalVariable.Wrong_email)

'Input password : abc123'
WebUI.sendKeys(findTestObject('login_repos/input_Password'), GlobalVariable.Wrong_password)

'Click login button'
WebUI.click(findTestObject('login_repos/button_Login'))

WebUI.verifyTextPresent('Username/Password did not match', false)

WebUI.closeBrowser()

