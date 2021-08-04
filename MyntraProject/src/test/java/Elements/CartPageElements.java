package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElements {
	
	@FindBy(xpath="//span[contains(text(),\"Bag\")]")
	public WebElement clickbagicon ;

	@FindBy(className="//*[@class=\"addressStrip-base-highlight\"]")
	public WebElement checkdeliverytimeservices ;
	
}
