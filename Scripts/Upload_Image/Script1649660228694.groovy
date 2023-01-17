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

//import Sikuli library
import org.sikuli.script.Screen
import org.sikuli.script.Key
import org.sikuli.script.FindFailed
import org.sikuli.script.ImagePath

WebUI.openBrowser('')

WebUI.navigateToUrl('https://imgur.com/upload')

WebUI.click(findTestObject('Object Repository/Page_Imgur The magic of the Internet/label_Choose PhotoVideo'))


System.out.println("SikulixTest");
System.out.println("SikulixTest screen failing");
Screen screen = null;
try {
  screen = new Screen();
} catch (Exception e) {
}
System.out.println("SikulixTest screen okk");
screen = new Screen();
System.out.println("SikulixTest screen used");
screen.hover();


//Screen screen = new Screen()
//screen.wait((double)1.0)
//screen.hover();

//Click the image Filename.PNG
//screen.click("C:\\Users\\KATALON\\Downloads\\Upload_Sikuli\\Screenshots\\Filename.PNG") 
screen.click()
screen.type("/Users/annguyen/Downloads/Sikuli_Example/Upload_Sikuli/Screenshots/test.PNG")
screen.type(Key.ENTER)
screen.type(Key.ENTER)
//screen.click("/Users/annguyen/Downloads/Sikuli_Example/Upload_Sikuli/Screenshots/OPEN2.png")
//Click the image test.PNG
//screen.type("C:\\Users\\KATALON\\Downloads\\Upload_Sikuli\\Screenshots\\test.PNG")
//Click the image Open.PNG
//screen.click("C:\\Users\\KATALON\\Downloads\\Upload_Sikuli\\Screenshots\\Open.PNG")


