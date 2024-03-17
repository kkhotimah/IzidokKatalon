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

WebUI.callTestCase(findTestCase('Login/Positive - Login Pemilik'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/a_Setting Manajemen'))

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/a_Tambah Klinik  PIC'))

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/a_tambah data klinik'))

WebUI.setText(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/input____BVID__185'), 'kkcare tes 1')

WebUI.setText(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/input____BVID__186'), 'kt1')

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/path'))

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/svg_Loading_vs__open-indicator'))

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/svg_Klinik UmumBPJS_vs__open-indicator'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/input_Klinik UmumBPJS_vs__search'), 
    0)

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/path_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/div_Loading_invalid-feedback'), 
    0)

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/button_selesai'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/div_Data klinik berhasil disimpanOKCancel'), 
    0)

WebUI.click(findTestObject('Object Repository/Klinik/Tambah Klinik/Page_izidok/button_OK'))

WebUI.closeBrowser()

