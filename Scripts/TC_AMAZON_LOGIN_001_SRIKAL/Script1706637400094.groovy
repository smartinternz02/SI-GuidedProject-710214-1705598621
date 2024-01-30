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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://amazon.com')

WebUI.refresh()

WebUI.click(findTestObject('AMAZON_PAGES/AMAZON_LOGIN_OR/PAGE_AMAZON_SIGN_IN/span_Hello, sign in'))

WebUI.setText(findTestObject('AMAZON_PAGES/AMAZON_LOGIN_OR/PAGE_AMAZON_SIGN_IN/input_Email or mobile phone number_email'), 
    '9347163977')

WebUI.click(findTestObject('AMAZON_PAGES/AMAZON_LOGIN_OR/PAGE_AMAZON_SIGN_IN/input_Enter your email or mobile phone number_continue'))

WebUI.setText(findTestObject('AMAZON_PAGES/AMAZON_LOGIN_OR/PAGE_AMAZON_SIGN_IN/input_Forgot your password_password'), 'smartbridge@123')

WebUI.click(findTestObject('AMAZON_PAGES/AMAZON_LOGIN_OR/PAGE_AMAZON_SIGN_IN/input_Enter your password_signInSubmit'))

WebUI.verifyElementPresent(findTestObject('AMAZON_PAGES/AMAZON_LOGIN_OR/PAGE_AMAZON_SIGN_IN/span_Hello, sign in'), 0)

WebUI.closeBrowser()

