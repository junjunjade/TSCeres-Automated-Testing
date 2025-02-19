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

Mobile.setEncryptedText(findTestObject('Object Repository/android.widget.EditText - Password'), 'tzH6RvlfSTg=', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.Button - POS MAINTENANCE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Personnel'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Shift'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ADD (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Shift Code'), '4', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Shift Description'), 'Half-morning shift', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Start Time'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 07'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 00'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 19'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 18'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 17'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 16'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 15'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SET TIME'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - End Time'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 09'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 10'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 21'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 20'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 17 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 16 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 15 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SET TIME'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SAVE (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.closeApplication()

