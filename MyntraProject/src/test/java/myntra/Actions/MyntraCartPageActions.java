package myntra.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Elements.CartPageElements;
import myntra.Utilities.DriverSetup;

public class MyntraCartPageActions {
	
	CartPageElements cartPageElements;
	
	Actions action = new Actions(DriverSetup.chromeDriver);
	public MyntraCartPageActions() {
		
		this.cartPageElements= new CartPageElements();
		PageFactory .initElements(DriverSetup.chromeDriver, cartPageElements);
		
		
	}
	
	public void getCartPage() {
		DriverSetup.chromeDriver.get("https://www.myntra.com/checkout/cart");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
	}

	public void clickBagIcon( ) {
	action.moveToElement(cartPageElements.clickbagicon).build().perform();
	
		cartPageElements.clickbagicon.click();
		
	}
	
public void checkdeliverytimeservices( ) {
	//action.moveToElement("cartPageElements.Mensbtn").build().perform();	
		cartPageElements.checkdeliverytimeservices.sendKeys();
}

}