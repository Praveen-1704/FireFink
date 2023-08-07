package common_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {

	
	// Constructor
	
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	public WebElement Malebutton;
	
	@FindBy(id = "gender-female")
	public WebElement Femalebutton;
	
	@FindBy(id = "FirstName")
	public WebElement FirstNameTextField;
	
	@FindBy(id = "LastName")
	public WebElement LastNameTextField;
	
	@FindBy(id = "Email")
	public WebElement EmailTextField;
	
	@FindBy(id = "Password")
	public WebElement PasswordTextField;
	
	@FindBy(id = "ConfirmPassword")
	public WebElement ConfirmPasswordTextField;
	
	@FindBy(xpath = "//input[@value='Register']")
	public WebElement RegisterButton;
	
	@FindBy(linkText = "Register")
	public WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	public WebElement LoginLink;
	
	@FindBy(linkText = "Shopping cart")
	public WebElement shoppingCartLink;
	
	@FindBy(linkText = "Wishlist")
	public WebElement WishListLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	public WebElement BooksLink;
	
	@FindBy(xpath  = "(//a[contains(text(),'Computers')])[1]")
	public WebElement ComputerLink;
	
	@FindBy(xpath  = "(//a[contains(text(),'Electronics')])[1]")
	public WebElement ElectronicLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	public WebElement ApparelShoesLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	public WebElement digitaldownloadsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
	public WebElement JewelryLink;
	
	@FindBy(xpath  = "(//a[contains(text(),'Gift Cards')])[1]")
	public WebElement GiftCardsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[3]")
	public WebElement BooksLink2;
	
	@FindBy(xpath  = "(//a[contains(text(),'Computers')])[3]")
	public WebElement ComputerLink2;
	
	@FindBy(xpath  = "(//a[contains(text(),'Electronics')])[3]")
	public WebElement ElectronicLink2;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[3]")
	public WebElement ApparelShoesLink2;
	
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[3]")
	public WebElement digitaldownloadsLink2;
	
	@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[3]")
	public WebElement JewelryLink2;
	
	@FindBy(xpath  = "(//a[contains(text(),'Gift Cards')])[3]")
	public WebElement GiftCardsLink2;
	
	@FindBy(linkText = "Tricentis")
	public WebElement TricentisLink;
	
	@FindBy(id = "newsletter-email")
	public WebElement newsletteremailTextBox;
	
	@FindBy(xpath = "//input[@value='Subscribe']")
	public WebElement Subscribebutton;
	
	@FindBy(xpath = "//input[@value='Search store']")
	public WebElement SearchBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement SearchButton;
	
	@FindBy(className = "header-logo")
	public WebElement Logo;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
