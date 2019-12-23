import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.*;

//Now dont worry about xpath css etc now take images and automate using Selenium with Sikuli
/*
 
 classes
 Screen - focus on 
 pattern - find images
 
 Example google login
 Screen s = new Screen();
 Pattern img1 = new Pattern ("\image\gmaillogo.PNG")
  Pattern img2 = new Pattern ("\image\gmailuname.PNG")
 Pattern img3 = new Pattern ("\image\gmailpwd.PNG")
 Pattern img4 = new Pattern ("\image\gmailsubmit.PNG")
 
	WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.google.com");

s.click(img1);
s.type(img2,"test@gmail.com");
s.type(img3,"test123);
s.click(img4);
 
 */
public class SikuliSeleniumDemo {
	
	WebDriver driver = new FirefoxDriver();

     public static void main(String[] args) {
	                Screen s = new Screen();
	                try{
	                        s.click("imgs/spotlight.png", 0);
	                        s.wait("imgs/spotlight-input.png");
	                        s.type(null, "hello world\n", 0);
	                }
	                
	                catch(FindFailed e){
	                        e.printStackTrace();
	                }

	        }

}
