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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/input_email'), '9347163977')

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/input_password'), 'MbZHKJaDqoktgDwH6xdmAQ==')

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/inputsignInSubmit'))

WebUI.click(findTestObject('AMAZON_PAGES/AMAZON_WISHLIST_OR/a_0                                                Cart'))

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/a_Wish List'))

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/img_a-dynamic-image p13n-sc-dynamic-image p_302d0a'))

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/input_submit.add-to-registry.wishlist'))

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/a_View Your List'))

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_WISHLIST_OR/spandelete-button-I3VYV9IR48FE2Y'))

WebUI.closeBrowser()

