package org.sakaiproject.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "eid")
    private WebElement eidTextBox;

    @FindBy(id = "pw")
    private WebElement pwTextBox;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(className = "qtipClose")
    private WebElement qtipCloseButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static LoginPage visitPage(WebDriver driver) {
        LoginPage page = new LoginPage(driver);
        page.visitPage();
        return page;
    }

    public void submitLogin(String eid, String pw) {
        this.eidTextBox.sendKeys(eid);
        this.pwTextBox.sendKeys(pw);
        this.submitButton.click();
    }

    public void closeTutorial() {
        this.qtipCloseButton.click();
    }

}
