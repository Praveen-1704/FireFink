package common_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	
	// Page Object
	
	
	// Constructor
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
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
	
	@FindBy(linkText = "apparel")
	public WebElement apparelLink;
	
	@FindBy(linkText = "awesome")
	public WebElement awesomeLink;
	
	@FindBy(linkText = "book")
	public WebElement booklink;
	
	@FindBy(linkText = "camera")
	public WebElement cameraLink;
	
	@FindBy(linkText = "cell")
	public WebElement cellLink;
	
	@FindBy(linkText = "compact")
	public WebElement compactLink;
	
	@FindBy(linkText = "cool")
	public WebElement coolLink;
	
	@FindBy(linkText = "digital")
	public WebElement digitalLink;
	
	@FindBy (linkText = "gift")
	public WebElement giftLink;
	
	@FindBy(linkText = "jewelry")
	public WebElement jewelryLInk;
	
	@FindBy(linkText = "nice")
	public WebElement niceLink;
	
	@FindBy(linkText = "shirt")
	public WebElement shirtLink;
	
	@FindBy(linkText = "shoes")
	public WebElement shoesLink;
	
	@FindBy(linkText = "TCP")
	public WebElement TCPLink;
	
	@FindBy(xpath = "//input[@value='Search store']")
	public WebElement SearchBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement SearchButton;
	
	@FindBy(id = "newsletter-email")
	public WebElement newsletteremailTextBox;
	
	@FindBy(xpath = "//input[@value='Subscribe']")
	public WebElement Subscribebutton;
	
	@FindBy(xpath = "(//a[text()='Build your own cheap computer'])[1]")
	public WebElement BuildyourowncheapcomputerLink;
	
	@FindBy(xpath = "(//a[text()='Build your own computer'])[1]")
	public WebElement BuildyourowncomputerLink;
	
	@FindBy(linkText = "Health Book")
	public WebElement HealthBookLink;
	
	@FindBy(linkText = "Women's Running Shoe")
	public WebElement WomenRunningShoeLink;
	
	@FindBy(xpath = "//input[@id='pollanswers-1']")
	public WebElement ExcellentButton;
	
	@FindBy(xpath = "//input[@id='pollanswers-2']")
	public WebElement GoodButton;
	
	@FindBy(xpath = "//input[@id='pollanswers-3']")
	public WebElement PoorButton;
	
	@FindBy(xpath = "//input[@id='pollanswers-4']")
	public WebElement VeryPoorButton;
	
	@FindBy(linkText = "$25 Virtual Gift Card")
	public WebElement $25VirtualGiftCardLink;
	
	@FindBy(linkText = "14.1-inch Laptop")
	public WebElement LaptopLink;
	
	@FindBy(xpath = "(//a[text()='Build your own cheap computer'])[2]")
	public WebElement BuildyourowncheapcomputerLink2;
	
	@FindBy(xpath = "(//a[text()='Build your own computer'])[2]")
	public WebElement BuildyourowncomputerLink2;
	
	@FindBy(linkText = "Build your own expensive computer")
	public WebElement BuildyourownexpensivecomputerLink;
	
	@FindBy(linkText = "Simple Computer")
	public WebElement SimpleComputerLink;
	
	@FindBy(xpath = "(//a[@class='nivo-imageLink'])[1]")
	public WebElement TricentisAcademyLink;
	
	@FindBy(xpath = "(//a[@class='nivo-imageLink'])[2]")
	public WebElement SpeedTricentisLink;
	
	@FindBy(className = "header-logo")
	public WebElement Logo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
