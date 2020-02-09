package mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {

    private WebDriver driver;

    @FindBy(xpath = ".//a[@data-url-1=\"https://www.tut.by/resource/?id=10&ua=top_menu_www.tut.by%7E10#ua:top_menu_www." +
            "tut.by~10\"]")
    private WebElement mail;
    @FindBy(name = "login")
    private WebElement login;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(xpath = ".//input[@type=\"submit\"]")
    private WebElement enterButton;
    @FindBy(xpath = ".//div[text()=\"com.epam.automation.mail-test1@tut.by\"]")
    private WebElement log;
    @FindBy(xpath = ".//div[@class=\"b-messages__placeholder-item\"]")
    private WebElement letters;

    public MailPage(WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
        this.driver = webdriver;
    }
    public void clickMail() {
        mail.click();
    }

    public void clearLoginLine() {
        login.clear();
    }

    public void fillingInLoginLine(String name) {
        login.sendKeys(name);
    }

    public void clearPasswordLine() {
        password.clear();
    }

    public void fillingInPasswordLine(String pass) {
        password.sendKeys(pass);
    }

    public void clickEnterButton() {
        enterButton.click();
    }

    public void getLettersInfo(){
        letters.getText();
    }

    public boolean isLettersInfoDisplayed(){
        return letters.isDisplayed();
    }


}