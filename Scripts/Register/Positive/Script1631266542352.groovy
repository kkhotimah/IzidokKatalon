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

WebUI.navigateToUrl('https://beta.izidok.id/')

WebUI.click(findTestObject('Object Repository/Registrasi/positive/Page_izidok/a_disini'))

WebUI.click(findTestObject('Object Repository/Registrasi/positive/Page_izidok/p_Tempat praktik dimiliki oleh korporasiindividu'))

WebUI.setText(findTestObject('Object Repository/Registrasi/positive/Page_izidok/input____BVID__39'), 'kksehat')

WebUI.setText(findTestObject('Object Repository/Registrasi/positive/Page_izidok/input____BVID__41'), 'kksehat@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Registrasi/positive/Page_izidok/input____BVID__43'), '08111111121')

WebUI.setEncryptedText(findTestObject('Object Repository/Registrasi/positive/Page_izidok/input____BVID__45'), 'tVll4mnTqB35ffScK4KXVQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Registrasi/positive/Page_izidok/input____BVID__47'), 'tVll4mnTqB35ffScK4KXVQ==')

WebUI.closeBrowser()

