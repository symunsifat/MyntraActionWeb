package myntra.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import Driver.DriverSetup;
import Elements.CartPageElements;

public class MyntraCartPageActions {
	
	CartPageElements cartPageElements;
	
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
		
		cartPageElements.clickbagicon.click();
	}
	
public void checkdeliverytimeservices( ) {
		
		cartPageElements.checkdeliverytimeservices.sendKeys();
}

}