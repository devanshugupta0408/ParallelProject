package ParallelProject_152686.bankap;

import com.capg.project.bean.AccountDetails;
import com.capg.project.dao.AccountDAO;

import junit.framework.TestCase;

public class AccountDAOTest extends TestCase {

	AccountDAO dao = new AccountDAO();
	AccountDetails ad = new AccountDetails();
	public void testCreateAccount() {
		
		assertEquals(true, dao.createAccount(ad));
		
	}
	public void testShowBalance() {
	//assertEquals(0.0, dao.showBalance());
	assertNotNull(dao);
	
	}

	public void testDeposite() {
		assertEquals(true,dao.deposit(110, ad));
		
	}

	public void testTransactions() {
		
		assertNotNull(ad);
	}

	public void testTransfer() {
	assertEquals(false, dao.FundTransfer());
	
	}

	public void testWithdraw() {
	assertEquals(true, dao.withdrawBalance(2000, ad));
	}

	
}
