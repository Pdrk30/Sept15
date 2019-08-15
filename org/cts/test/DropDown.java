package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balajigsm\\eclipse-workspace\\DpDown\\Drive\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement sel = d.findElement(By.id("dcdrLocation"));
		Select s = new Select(sel);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> op = s.getOptions();
		int sz = op.size();
		System.out.println(sz);
		for (int i=0; i<op.size();i++) {
				WebElement g = op.get(i);
						String text = g.getText();
				System.out.println(text);
				
}}}
