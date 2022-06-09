package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio");
        ///////////////////////Chome
        System.out.println("Abro en Chrome");
        System.setProperty("webdriver.chrome.driver", "C:/DiverNavegadorSelenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        /////////////////////////////////////////////FireFox
        System.out.println("Abro en FireFox");
        System.setProperty("webdriver.gecko.driver","C:/Program Files/DiverNavegadorSelenium/FierFoxdriver.exe");
        WebDriver driver2 = new FirefoxDriver(); driver2.get("http://google.com");
       System.out.println(driver2.getTitle());

        System.out.println("Fin");
    }
}