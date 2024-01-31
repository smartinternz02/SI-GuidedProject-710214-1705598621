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

WebUI.selectOptionByValue(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_VALIDATESEARCHFIELDITEM_OR/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=electronics-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_VALIDATESEARCHFIELDITEM_OR/input_field-keywords'), 'laptop')

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_VALIDATESEARCHFIELDITEM_OR/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_VALIDATESEARCHFIELDITEM_OR/span_Results'))

WebUI.click(findTestObject('Object Repository/AMAZON_PAGES/AMAZON_VALIDATESEARCHFIELDITEM_OR/span_Check each product page for other buyi_fdd351'))

WebUI.closeBrowser()

