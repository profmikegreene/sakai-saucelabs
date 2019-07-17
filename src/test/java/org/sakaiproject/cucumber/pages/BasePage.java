package org.sakaiproject.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class BasePage {

    public WebDriver driver;
    public static String url = "https://trunk-mysql.nightly.sakaiproject.org/portal/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void visitPage() {
        this.driver.get(url);
        WebDriverWait wait = (new WebDriverWait(this.driver, 5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("skipNav")));
    }

    public boolean isOnPage(String title) {
        return this.driver.getTitle() == title;
    }

}
