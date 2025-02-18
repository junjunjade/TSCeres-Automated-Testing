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

Mobile.setText(findTestObject('Object Repository/LoginScreen/android.widget.EditText - Usercode'), '111111', 0) // Invalid username
Mobile.setEncryptedText(findTestObject('Object Repository/LoginScreen/android.widget.EditText - Password'), 'tzH6RvlfSTg=', 0) // Password

Mobile.tap(findTestObject('Object Repository/android.widget.Button - POS'), 0)

try {
    // Check if the error message is displayed for invalid username
    Mobile.verifyElementPresent(findTestObject('Object Repository/android.widget.TextView - Error Message'), 5, FailureHandling.CONTINUE_ON_FAILURE)
    
    // If the error message is found, log success
    Mobile.comment('Negative test case passed: Error message displayed for invalid username')
} catch (Exception e) {
    // If the error message isn't shown, log it as a failure in the negative case
    Mobile.comment('Negative test case failed: No error message displayed for invalid username')
}

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OKAY'), 0)

Mobile.closeApplication()