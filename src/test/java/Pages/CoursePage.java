package Pages;

import Base.BasePage;
import Common.CommonPage;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CoursePage extends BasePage {
	CommonPage cp = new CommonPage();

	// verify Title page
	@FindBy(xpath = "//html//body//div//div[1]//h1")
	WebElement TitlePage;
	@FindBy(xpath = "//html//body//nav//div//div[2]//ul//li[4]//a")
	WebElement CourseMenu;
	@FindBy(xpath = "//a[contains(text(),'Courses')]")
	WebElement clickCourse;
	@FindBy(xpath = "//html//body//div//h2")
	WebElement Heading;
	@FindBy(css = "body > div > p > a")
	WebElement CreateNewLnk;
	@FindBy(xpath = "//th[contains(text(),'Number')]")
	WebElement NumberField;
	@FindBy(xpath = "//th[contains(text(),'Title')]")
	WebElement TitleField;
	@FindBy(xpath = "//th[contains(text(),'Credits')]")
	WebElement CreditField;
	@FindBy(xpath = "//th[contains(text(),'Department')]")
	WebElement DepartmentField;
	@FindBy(xpath = "//tr[1]//td[5]//a[1]")
	WebElement EditLnk;
	@FindBy(xpath = "//html//body//div//table//tbody//tr[1]//td[5]//a[2]")
	WebElement DetailsLnk;
	@FindBy(xpath = "//html//body//div//table//tbody//tr[2]//td[5]//a[3]")
	WebElement Deletelnk;
	@FindBy(xpath = "//table[@class='table']//thead")
	WebElement coursestitle;
	@FindBy(xpath = "//table[@class='table']")
	WebElement Tablerecords;
	@FindBy(id = "Title")
	WebElement EditTitle;
	@FindBy(id = "Credits")
	WebElement CreditsTitle;
	@FindBy(id = "DepartmentID")
	WebElement DepartmentID;
	@FindBy(xpath = "//input[@class='btn btn-default']")
	WebElement SaveButton;
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement EditDetails;
	@FindBy(xpath = "//a[contains(text(),'Back to List')]")
	WebElement BackfromEdit;
	@FindBy(xpath = "//tr[1]//td[5]//a[3]")
	WebElement Deletelink;
	@FindBy(xpath = "//input[@class='btn btn-default']")
	WebElement DeleteButton;
	public CoursePage() {
		PageFactory.initElements(wd, this);
	}
	public void navigateCoursesmenu() {
		CourseMenu.click();
	}
	public boolean Heading() {
		return Heading.isDisplayed();
	}
	public void ClickCreateNewLnk() {
		CreateNewLnk.click();
	}
	public boolean CreateNewLnk() {
		return CreateNewLnk.isDisplayed();
	}
	public void EditLnk() {
		EditLnk.click();
	}
	public void DetailsLnk() {
		DetailsLnk.click();
	}
	public void Deletelnk() {
		Deletelnk.click();
	}
	public void NumberField() {
		Assert.assertEquals("Number", NumberField.getText());
	}
	public void TitleField() {
		Assert.assertEquals("Title", TitleField.getText());
	}
	public boolean CreditField() {
		Assert.assertEquals("Credits", CreditField.getText());
		return true;
	}
	public void DepartmentField() {
		Assert.assertEquals("Department", DepartmentField.getText());
	}
	public boolean TitlePage() {
		return TitlePage.isDisplayed();
	}
	public String courses() {
		return coursestitle.getText();
	}
	public void coursebutton() {
		clickCourse.click();
	}
	public void Tablerecords() {
		Tablerecords.isDisplayed();
	}
	public void EditTitle() {
		EditTitle.clear();
		EditTitle.sendKeys("SoftwareAutomation");
	}
	public void CreditsTitle() {
		CreditsTitle.sendKeys(Keys.ARROW_UP);
	}
	public void DepartmentID() {
		DepartmentID.sendKeys(Keys.ARROW_UP);
				}
	public void SaveButton() {
		SaveButton.click();
	}
	public void Editdetails() {
		EditDetails.click();
	}
	public void BackfromEdit() {
		BackfromEdit.click();
	}
	public void DeleteLink() {
		Deletelink.click();
	}
	public void Deletebutton() {
		DeleteButton.click();

	}
	
}
