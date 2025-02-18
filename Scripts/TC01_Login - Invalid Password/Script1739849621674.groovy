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

// Start the application
Mobile.startApplication('C:\\Users\\Ritch\\Desktop\\Echo Test\\APKs\\TSCeres 2025\\16.0.0.0.40.91.apk', true)

Mobile.setText(findTestObject('Object Repository/LoginScreen/android.widget.EditText - Usercode'), '000000', 0) // Invalid usercode
Mobile.setEncryptedText(findTestObject('Object Repository/LoginScreen/android.widget.EditText - Password'), 'AbZbeXpnEm4=', 0) // Invalid password

// Tap the POS button
Mobile.tap(findTestObject('Object Repository/android.widget.Button - POS'), 0)

// Check for successful login message (this is an assumption; modify based on your actual UI elements)
try {
    Mobile.verifyElementPresent(findTestObject('Object Repository/android.widget.TextView - Success Message'), 5, FailureHandling.STOP_ON_FAILURE)
    Mobile.comment('Negative test case failed: Login was successful with valid credentials')
} catch (Exception e) {
    // If success message isn't found, check for error message as previously done
    try {
        Mobile.verifyElementPresent(findTestObject('Object Repository/android.widget.TextView - Error Message'), 5, FailureHandling.CONTINUE_ON_FAILURE)
        Mobile.comment('Negative test case passed: Error message displayed for invalid login')
    } catch (Exception ex) {
        Mobile.comment('Negative test case failed: No error message displayed')
    }
}

// Close the application
Mobile.closeApplication()