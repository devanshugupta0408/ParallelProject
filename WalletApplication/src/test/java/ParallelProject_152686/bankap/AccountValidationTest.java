package ParallelProject_152686.bankap;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capg.project.service.AccountValidation;

public class AccountValidationTest {

	AccountValidation av = new AccountValidation();
	@Test
	public void testValidatephoneNumber() {
		assertEquals(true,av.validatephoneNumber("903252st52"));
		assertEquals(true,av.validatephoneNumber("90325831252"));
		assertNotEquals(false,av.validatephoneNumber("9032252st52"));
		assertNotEquals(false,av.validatephoneNumber("9032831706"));
	}

	@Test
	public void testValidateBalance() {
		assertEquals(1000, 2000);
		assertEquals(1000,1000);
		assertNotNull(null);
		assertEquals(true,av.validateBalance(3000));
		
		
	}

	@Test
	public void testValidatecustomerName() {
		assertEquals(true,av.validatecustomerName("Devanshu123"));
		assertEquals(false,av.validatecustomerName("devanshu@112"));
		assertNotNull("Dev", null);
		assertNotEquals(false,av.validatecustomerName("devanshu Gupta"));
		assertEquals(true,av.validatecustomerName("Devanshu Gupta"));
	}

	@Test
	public void testValidatecustomerEmail() {
		assertEquals(false,av.validatecustomerEmail("devanshu@gmail.com"));
		assertNotEquals(true, av.validatecustomerEmail("devanshu"));
		assertEquals(true,av.validatecustomerEmail("deva@#su@gmail.com"));
		assertNotEquals(true, av.validatecustomerEmail("devanshu@gmail"));
		
	}

	@Test
	public void testValidateusername() {
		assertEquals(true,av.validateusername("Deva#nshu@12"));
		assertEquals(false,av.validateusername("Dev_123"));
		assertNotEquals(false,av.validateusername("devan123#"));
		assertNotEquals(true, av.validateusername("deva@123$"));
	}

	@Test
	public void testValidatepassword() {
		assertEquals(true,av.validatepassword("Devanshu!23"));
		assertEquals(true, av.validatepassword("@qweAsd152121"));
		assertNotEquals(true,av.validatepassword("bean123"));
		assertNotEquals(false,av.validatepassword("Alder@123"));
	}

	@Test
	public void testValidategender() {
		assertEquals(true,av.validategender("Female"));;
		assertNotEquals(false,av.validategender("M"));
		assertEquals(true,av.validategender("dvfv"));
		assertNotEquals(false, av.validategender("F"));
		
	}

}
