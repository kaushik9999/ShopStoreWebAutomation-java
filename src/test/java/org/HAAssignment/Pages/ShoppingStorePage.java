package org.HAAssignment.Pages;

import java.util.List;
import java.util.Map;

import org.HAAssignment.CommonUtils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingStorePage extends CommonMethods {

	// Element Locators START
	final String seachBox_css = "input[name='search_query']";
	final String seachButton_css = "button[name='submit_search']";
	final String imgElement_css = "img[title='Faded Short Sleeve T-shirts']";// This can be dynamically managed
	final String addToKart_xpath = "//span[contains(text(),'Add to cart')]";
	final String proceedToChkOut_xpath = "//span[contains(text(),'Proceed to checkout')]";
	final String firstName_css = "input[id='customer_firstname']";
	final String lastName_css = "input[id='customer_lastname']";
	final String email_css = "input[id='email']";
	final String password_css = "input[id='passwd']";
	final String days_css = "select[id='days'] option";
	final String months_css = "select[id='months'] option";
	final String years_css = "select[id='years'] option";
	final String firstNameAdd_css = "input[id='firstname']";
	final String lastNameAdd_css = "input[id='lastname']";
	final String com_css = "input[id='company']";
	final String add1_css = "input[id='address1']";
	final String city_css = "input[id='city']";
	final String state_css = "select[id='id_state'] option";
	final String country_css = "select[id='id_country'] option";
	final String other_css = "textarea[id='other']";
	final String phone_css = "input[id='phone']";
	final String mobilePhone_css = "input[id='phone_mobile']";
	final String alias_css = "input[id='alias']";
	final String regBtn_xpath = "//span[contains(text(),'Register')]";
	final String postCode_css = "input[id='postcode']";
	final String emailCreate_css = "input[id='email_create']";
	final String createSubmit_css = "button[id='SubmitCreate']";
	final String address2_xpath = "//p//span[contains(text(),'Proceed to checkout')]";
	final String maleGender_css = "input[id='id_gender1']";
	final String processAdd_css = "button[name='processAddress'] span";
	final String cvg_css = "input[name='cgv']";
	final String processCarrier_css = "button[name='processCarrier']";
	final String cartNavigation_css = "p[id='cart_navigation'] button[type='submit']";
	final String payByCO_xpath = "//a[contains(text(),'Pay by check')]";
	final String alertMes_css = "p[class='alert alert-success']";
	final String signIn_css= "a[class='login']";
	final String loginBtn_css  = "button[id='SubmitLogin']";
	// Element Locators END

	public ShoppingStorePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		super.driver = driver;

	}

	@FindBy(css = seachBox_css)
	private WebElement seachBox;

	public WebElement getSeachBox() {
		return seachBox;
	}

	@FindBy(css = seachButton_css)
	private WebElement seachButton;

	public WebElement getSeachButton() {
		return seachButton;
	}

	@FindBy(css = imgElement_css)
	private WebElement imgElement;

	public WebElement getImgElement() {
		return imgElement;
	}

	@FindBy(xpath = addToKart_xpath)
	private WebElement addToKart;

	public WebElement getaddToKart() {
		return addToKart;
	}

	@FindBy(xpath = proceedToChkOut_xpath)
	private WebElement proceedToChkOut;

	public WebElement getProceedToChkOut() {
		return proceedToChkOut;
	}

	@FindBy(css = firstName_css)
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(css = lastName_css)
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(css = email_css)
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(css = password_css)
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(css = days_css)
	private List<WebElement> days;

	public List<WebElement> getDays() {
		return days;
	}

	@FindBy(css = months_css)
	private List<WebElement> months;

	public List<WebElement> getMonths() {
		return months;
	}

	@FindBy(css = years_css)
	private List<WebElement> years;

	public List<WebElement> getYears() {
		return years;
	}

	@FindBy(css = firstNameAdd_css)
	private WebElement firstNameAdd;

	public WebElement getfirstNameAdd() {
		return firstNameAdd;
	}

	@FindBy(css = lastNameAdd_css)
	private WebElement lastNameAdd;

	public WebElement getlastNameAdd() {
		return lastNameAdd;
	}

	@FindBy(css = com_css)
	private WebElement com;

	public WebElement getCom() {
		return com;
	}

	@FindBy(css = add1_css)
	private WebElement add1;

	public WebElement getAdd1() {
		return add1;
	}

	@FindBy(css = city_css)
	private WebElement city;

	public WebElement getCity() {
		return city;
	}

	@FindBy(css = state_css)
	private List<WebElement> state;

	public List<WebElement> getState() {
		return state;
	}

	@FindBy(css = country_css)
	private List<WebElement> country;

	public List<WebElement> getCountry() {
		return country;
	}

	@FindBy(css = other_css)
	private WebElement other;

	public WebElement getOther() {
		return other;
	}

	@FindBy(css = phone_css)
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}

	@FindBy(css = mobilePhone_css)
	private WebElement mobilePhone;

	public WebElement getMobilePhone() {
		return mobilePhone;
	}

	@FindBy(css = alias_css)
	private WebElement alias;

	public WebElement getAlias() {
		return alias;
	}

	@FindBy(xpath = regBtn_xpath)
	private WebElement regBtn;

	public WebElement getRegBtn() {
		return regBtn;
	}

	@FindBy(css = postCode_css)
	private WebElement postCode;

	public WebElement getPostCode() {
		return postCode;
	}

	@FindBy(css = emailCreate_css)
	private WebElement emailCreate;

	public WebElement getEmailCreate() {
		return emailCreate;
	}

	@FindBy(css = createSubmit_css)
	private WebElement createSubmit;

	public WebElement getCreateSubmit() {
		return createSubmit;
	}

	@FindBy(xpath = address2_xpath)
	private WebElement address2;

	public WebElement getAddress2() {
		return address2;
	}

	@FindBy(css = maleGender_css)
	private WebElement maleGender;

	public WebElement getMaleGender() {
		return maleGender;
	}

	@FindBy(css = processAdd_css)
	private WebElement processAdd;

	public WebElement getProcessAdd() {
		return processAdd;
	}

	@FindBy(css = cvg_css)
	private WebElement cvg;

	public WebElement getCvg() {
		return cvg;
	}

	@FindBy(xpath = payByCO_xpath)
	private WebElement payByCO;

	public WebElement getPayByCO() {
		return payByCO;
	}

	@FindBy(css = processCarrier_css)
	private WebElement processCarrier;

	public WebElement getProcessCarrier() {
		return processCarrier;
	}

	@FindBy(css = cartNavigation_css)
	private WebElement cartNavigation;

	public WebElement getCartNavigation() {
		return cartNavigation;
	}

	@FindBy(css = alertMes_css)
	private WebElement alertMes;

	public WebElement getAlertMes() {
		return alertMes;
	}
	
	
	@FindBy(css = signIn_css)
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}
	

	@FindBy(css = loginBtn_css)
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

	public void searchForAnItem(String item) {
		getSeachBox().sendKeys(item);
		getSeachButton().click();
	}

	public void moveToAProduct() {
		moveToElement(getImgElement());
	}

	public void addToKart() {
		getaddToKart().click();

	}

	public void proceedToCheckOut() {
		getProceedToChkOut().click();
	}

	public void userReg(Map<String, String> data) {
		getFirstName().sendKeys(data.get("FirstName"));
		getLastName().sendKeys(data.get("LastName"));
		// getEmail().sendKeys(data.get("Email"));
		getPassword().sendKeys(data.get("Password"));
		driver.findElement(By.cssSelector("select[id='days']")).click();
		selectDropDown(getDays(), data.get("Day"));
		driver.findElement(By.cssSelector("select[id='months']")).click();
		selectDropDown(getMonths(), data.get("Month"));
		driver.findElement(By.cssSelector("select[id='years']")).click();
		selectDropDown(getYears(), data.get("Year"));
		getfirstNameAdd().sendKeys(data.get("FirstNameAdd"));
		getlastNameAdd().sendKeys(data.get("LastNameAdd"));
		getCom().sendKeys(data.get("Company"));
		getAdd1().sendKeys(data.get("Address"));
		getCity().sendKeys(data.get("City"));
		driver.findElement(By.cssSelector("select[id='id_state']")).click();
		selectDropDown(getState(), data.get("State"));
		getPostCode().sendKeys(data.get("PostalCode"));
		driver.findElement(By.cssSelector("select[id='id_country']")).click();
		selectDropDown(getCountry(), data.get("Country"));
		getOther().sendKeys(data.get("Additional"));
		getPhone().sendKeys(data.get("Phone"));
		getMobilePhone().sendKeys(data.get("Mobile"));
		getAlias().sendKeys(data.get("Alias"));
		getRegBtn().click();
		

	}
}