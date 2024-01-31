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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('login_page_OR/Page_OrangeHRM/input_username'), 'Admin')

WebUI.setText(findTestObject('login_page_OR/Page_OrangeHRM/input_password'), 'admin123')

WebUI.click(findTestObject('login_page_OR/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('recruitment_panal_OR/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('recruitment_panal_OR/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('recruitment_panal_OR/Page_OrangeHRM/input_Full Name_firstName'), 'kumar')

WebUI.setText(findTestObject('recruitment_panal_OR/Page_OrangeHRM/input_Full Name_middleName'), 'pranav')

WebUI.setText(findTestObject('recruitment_panal_OR/Page_OrangeHRM/input_Full Name_lastName'), 'chavan')

WebUI.click(findTestObject('recruitment_panal_OR/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('recruitment_panal_OR/Page_OrangeHRM/span_Associate IT Manager'))

WebUI.setText(findTestObject('recruitment_panal_OR/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus oxd-input--error'), 
    'k@gmail.com')

WebUI.setText(findTestObject('recruitment_panal_OR/Page_OrangeHRM/input_Contact Number_oxd-input oxd-input--active'), '8956235785')

WebUI.click(findTestObject('recruitment_panal_OR/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

