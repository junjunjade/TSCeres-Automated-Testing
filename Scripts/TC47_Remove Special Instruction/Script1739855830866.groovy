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

Mobile.startApplication('C:\\Users\\Ritch\\Desktop\\Echo Test\\APKs\\TSCeres 2025\\16.0.0.0.40.91.apk', true)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Usercode (1)'), '000000', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 'tzH6RvlfSTg=', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - POS'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - BLACK COFFEE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Black Coffee'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ADD SPECIAL INSTRUCTION'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (10)'), 'less sugar', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SUBMIT'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - REMOVE SPECIAL INSTRUCTION'), 0)

Mobile.closeApplication()

