package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraSearchBar {
	
	@FindBy(xpath="//*[@class=\'desktop-searchBar']")
	public WebElement searchBar;
	
	@FindBy(id="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a\r\n")
	public WebElement kidsShoe;
	
	@FindBy(className="//*[@class=\"title-title\"]")
	public WebElement babyShoe;
	


}
			