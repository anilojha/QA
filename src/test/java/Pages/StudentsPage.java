package Pages;

import Base.BasePage;
import Common.CommonPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentsPage extends BasePage {

    CommonPage cp=new CommonPage();
    @FindBy(xpath="//a[text()='Students']")
    WebElement studentsMenu;
    @FindBy(xpath = "/html/body/div/p/a")
    WebElement lnkCreateNew;
    //Create Heading
    @FindBy(xpath = "//h2[text()='Create']")
    WebElement headingCreate;
    //Students Info
    @FindBy(id="LastName")
    WebElement lastName;
    @FindBy(id="FirstMidName")
    WebElement firstName;
    @FindBy(id="EnrollmentDate")
    WebElement enrollmentDate;
    @FindBy(xpath ="//input[@class='btn btn-default']")
    WebElement createButton;
    @FindBy(xpath ="//a[contains(text(),'Create New')]")
    WebElement createNewLnk;
    @FindBy(xpath="//input[@name='SearchString']")
    WebElement SearchField;
    @FindBy(xpath="//input[@class='btn btn-default']")
    WebElement SearchButton;
    @FindBy(xpath="//a[contains(text(),'Back to Full List')]")
    WebElement BackToListLnk;
    @FindBy(xpath="//a[contains(text(),'Next')]")
    WebElement NextButton;
    @FindBy(xpath="//a[contains(text(),'Previous')]")
    WebElement PreviousButton;
    @FindBy(xpath="//tr[1]//td[4]//a[1]")
    WebElement EditButton;
    @FindBy(xpath="//tr[1]//td[4]//a[2]")
    WebElement DetailsButton;
    @FindBy(xpath="//tr[1]//td[4]//a[3]")
    WebElement DeleteButton;
    @FindBy(xpath="//a[contains(text(),'Back to List')]")
    WebElement BackButton;


    public StudentsPage() {
        PageFactory.initElements(wd,this);
    }

    public void navigateStudentsmenu(){
        studentsMenu.click();
    }

    public void clickCreateNew(){
        lnkCreateNew.click();
    }

    public void verifyHeadingCreate(){
        cp.isElementDisplayed(headingCreate);
    }

    public void enterFirstName(){
        cp.enterData(firstName,prop.getProperty("FIRST_NAME"));
    }

    public void enterLastName(){
        cp.enterData(lastName,prop.getProperty("LAST_NAME"));
    }

    public void enterEnrollmentDate(){
        String pattern = "MM/DD/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        cp.enterData(enrollmentDate, date);
        
    }

    public void clickCreateButton(){
        createButton.click();
    }

    public String getHomePageTitle(){
        return wd.getTitle();
    }
    public boolean createNewLnk(){
        return createNewLnk.isDisplayed();
    }
    public void enterFirstName1(){
        cp.enterData(firstName,prop.getProperty("FIRST_NAME1"));
    }

    public void enterLastName1(){
        cp.enterData(lastName,prop.getProperty("LAST_NAME1"));
    }
    public void SearchField(){
        SearchField.sendKeys("Pankaj");
    }

    public void Searchbutton(){
        SearchButton.click();
    }
    public void BackToListLnk(){
    	BackToListLnk.click();
    }

    public void NextButton(){
    	NextButton.click();
    }
    public void PreviousButton(){
    	PreviousButton.click();
    }
    public void EditButton(){
    	EditButton.click();
    }

    public void DetailsButton(){
    	DetailsButton.click();
    }
    public void DeleteButton(){
    	DeleteButton.click();
    }
    public void BackeButton(){
    	BackButton.click();
    }
   

}



