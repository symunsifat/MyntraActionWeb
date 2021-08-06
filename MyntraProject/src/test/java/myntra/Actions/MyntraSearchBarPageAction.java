package myntra.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import Elements.MyntraSearchBar;
import myntra.Utilities.DriverSetup;

public class MyntraSearchBarPageAction {
	
	MyntraSearchBar myntraSearchBar;
public MyntraSearchBarPageAction() {
		
		this.myntraSearchBar= new MyntraSearchBar();
		PageFactory .initElements(DriverSetup.chromeDriver, myntraSearchBar);
		
		
	}
	
	public void myntraSearchBar() {
		DriverSetup.chromeDriver.get("https://www.myntra.com/");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
	}

	public void clickSearchBar( ) {
		
		myntraSearchBar.searchBar.click();
	}
	
public void inputKidsShoes(String kidsShoe) {
		
	myntraSearchBar.kidsShoe.sendKeys("kidsShoe");

}

public void inputBabyShoe(String babyShoe) {
	
	myntraSearchBar.babyShoe.sendKeys("babyShoe");
 }


}
