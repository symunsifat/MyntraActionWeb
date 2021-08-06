package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensPageElements {
	
	@FindBy(xpath="//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]\r\n")
	public WebElement mensLogo;

 @FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")
 public WebElement mensBtn ;
}