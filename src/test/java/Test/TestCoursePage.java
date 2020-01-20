package Test;

import Base.BasePage;
import Pages.StudentsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCoursePage extends BasePage {

	public Pages.CoursePage CoursePage;

	public TestCoursePage() {
		super(); // will call BasePage();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		CoursePage = new Pages.CoursePage();
	}
	// RUN THIS TEST TO CHECK IF PAGE OBJECT MODEL IS WORKING ?
	@Test
	public void PagetitleAndHeader() throws InterruptedException {
		// 1.Verify title of Page CoursesTitle and Heading of Page
		System.out.println(CoursePage.TitlePage());
		System.out.println(CoursePage.Heading());
		Thread.sleep(3000);
	}
	@Test
	public void navigateCoursesmenu() throws InterruptedException {
		// 2.Verify link is navigating user to /Courses/Create link
		CoursePage.navigateCoursesmenu();
		CoursePage.ClickCreateNewLnk();
		Thread.sleep(3000);
	}
	@Test
	public void TableHeaderTitles() throws InterruptedException {
		// 3.Verify Heading of the Table Number, Title, Credits and Department
	
		CoursePage.coursebutton();
		CoursePage.NumberField();
		CoursePage.TitleField();
		CoursePage.CreditField();
		CoursePage.DepartmentField();
		CoursePage.Tablerecords();
		Thread.sleep(3000);
	}
	@Test
	public void Tablelinks() throws InterruptedException {
		// Verify the Edit,Details and Delete feature on courses,
		CoursePage.coursebutton();
		CoursePage.EditLnk();
		CoursePage.EditTitle();
		Thread.sleep(3000);
		CoursePage.CreditsTitle();
		CoursePage.DepartmentID();
		Thread.sleep(3000);
		CoursePage.SaveButton();
		Thread.sleep(3000);
		CoursePage.DetailsLnk();
		Thread.sleep(3000);
		CoursePage.Editdetails();
		Thread.sleep(3000);
		CoursePage.BackfromEdit();
		Thread.sleep(3000);
		CoursePage.DeleteLink();
		Thread.sleep(3000);
		CoursePage.Deletebutton();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void tearDown() {
		wd.quit();
	}
}
