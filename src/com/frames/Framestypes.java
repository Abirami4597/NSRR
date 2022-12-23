package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestypes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome107\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.manage().window().maximize();

		d.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement SFrame = d.findElement(By.xpath("//a[@href='#Single']"));
		SFrame.click();

		WebElement outerfr = d.findElement(By.xpath("//iframe[@id='singleframe']"));
	d.switchTo().frame(outerfr);
	
		
	//single frame automation
	
	WebElement frametextbx = d.findElement(By.xpath("(//input[@type='text'])[1]"));
	frametextbx.sendKeys("Testing");
	Thread.sleep(15000);
         
	
	//main frame  /iframe 
	//multiple frame automation
	
	
	d.switchTo().defaultContent();
	Thread.sleep(6000);
	//iframe with an iframe
	d.findElement(By.xpath("//a[@href='#Multiple']")).click();
	
	//outside frame
	WebElement IN_Frame = d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	d.switchTo().frame(IN_Frame);
	Thread.sleep(15000);
    
	//innermost frame
	WebElement in_most =  d.findElement(By.xpath("//iframe[@src='SingleFrame.html'])[1]"));
	d.switchTo().frame(in_most);
	
	//inner text box frame
	WebElement frame_text2 =  d.findElement(By.xpath("//input[@ type='text']"));
    frame_text2.sendKeys("selenium");
    
   /* frame_text2.sendKeys("s");
    Thread.sleep(6000);
    frame_text2.sendKeys("e");
    Thread.sleep(6000);
    frame_text2.sendKeys("l");
    Thread.sleep(6000);
    frame_text2.sendKeys("e");
    Thread.sleep(6000);
    frame_text2.sendKeys("n");
    Thread.sleep(6000);
    frame_text2.sendKeys("i");
    Thread.sleep(6000);
    frame_text2.sendKeys("u");
    Thread.sleep(6000);
    frame_text2.sendKeys("m");
    */
    
    Thread.sleep(15000);
    d.switchTo().defaultContent();

	
	}

}
