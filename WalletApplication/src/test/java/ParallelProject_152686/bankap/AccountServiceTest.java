package ParallelProject_152686.bankap;

import com.capg.project.bean.AccountDetails;
import com.capg.project.service.AccountService;

import junit.framework.TestCase;

public class AccountServiceTest extends TestCase {
	AccountService as = new AccountService();
	AccountDetails ad = new AccountDetails();
	public void testShowBalance() {
	//	assertEquals(0.0, as.showBalance());
		assertNotNull(as);
		
		}

		public void testDeposite() {
			assertEquals(true,as.depositBalance(110, ad));
			
		}

		public void testTransactions() {
			
			assertNotNull(ad);
		}

		public void testTransfer() {
		assertEquals(false, as.FundTransfer());
		
		}

		public void testWithdraw() {
		assertEquals(true, as.withdrawBalance(2000, ad));
		}

}
