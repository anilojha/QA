package Test;

import Base.BasePage;
import Pages.StudentsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestStudentsPage extends BasePage {

	public StudentsPage studentsPage;

	public TestStudentsPage() {
		super(); // will call BasePage();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		studentsPage = new StudentsPage();
	}

	// RUN THIS TEST TO CHECK IF PAGE OBJECT MODEL IS WORKING ?

	@Test
	public void A_verifyAddStudents() throws InterruptedException {
		studentsPage.navigateStudentsmenu();
		Thread.sleep(5000);
		studentsPage.clickCreateNew();
		Thread.sleep(2000);
		// verify Create Heading studentsPage.verifyHeadingCreate();
		studentsPage.enterLastName();
		Thread.sleep(1000);
		studentsPage.enterFirstName();
		Thread.sleep(1000);
		studentsPage.enterEnrollmentDate();
		Thread.sleep(1000);

		// verify the students create...... create another @Test method to verify.
	}

	@Test
	public void B_verifStudentPage() throws InterruptedException {
		studentsPage.navigateStudentsmenu();
		System.out.println(studentsPage.createNewLnk());
		studentsPage.clickCreateNew();
		studentsPage.enterLastName1();
		studentsPage.enterFirstName1();
		studentsPage.enterEnrollmentDate();
		Thread.sleep(2000);
		studentsPage.clickCreateButton();
	}

	@Test
	public void C_VerifySearchFunctionality() throws InterruptedException {
		studentsPage.navigateStudentsmenu();
		studentsPage.SearchField();
		Thread.sleep(2000);
		studentsPage.Searchbutton();
		Thread.sleep(2000);
		studentsPage.BackToListLnk();
		Thread.sleep(2000);
		studentsPage.NextButton();
		Thread.sleep(2000);
		studentsPage.PreviousButton();
		Thread.sleep(2000);
	}

	@Test
	public void D_Verify_Edit_Details_DeleteFeature() throws InterruptedException {
		studentsPage.navigateStudentsmenu();
		Thread.sleep(2000);
		studentsPage.EditButton();
		Thread.sleep(2000);
		studentsPage.BackeButton();
		Thread.sleep(2000);
		studentsPage.DetailsButton();
		Thread.sleep(2000);
		studentsPage.BackeButton();
		Thread.sleep(2000);
		studentsPage.DeleteButton();
		Thread.sleep(2000);
		studentsPage.BackeButton();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void tearDown() {
		wd.quit();
	}

}
