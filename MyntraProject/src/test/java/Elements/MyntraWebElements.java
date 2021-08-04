package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraWebElements {
	

@FindBy(xpath="//*[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
public WebElement mainLogo;

@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[6]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/a/picture/img']")
public WebElement gapImage;

@FindBy(xpath="//*[@class=\"myntraweb-sprite desktop-iconBag sprites-headerBag\']")
public WebElement addBag;

@FindBy(xpath="//*[@class=\'desktop-searchBar']")
public WebElement searchBar;


 








}
