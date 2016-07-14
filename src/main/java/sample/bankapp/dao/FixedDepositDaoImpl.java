package sample.bankapp.dao;

import java.util.HashMap;
import java.util.Map;

import sample.bankapp.FixedDepositDetails;

public class FixedDepositDaoImpl implements FixedDepositDao {
	private String url;
	private String driver;
	private String username;
	private String pasword;
	
	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();
	
	private DatabaseInfo databaseInfo;
	
	public void setDatabaseInfo(DatabaseInfo databaseInfo) {
		this.databaseInfo = databaseInfo;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositDao#createFixedDeposit(sample.bankapp.FixedDepositDetails)
	 */
	public boolean createFixedDeposit(FixedDepositDetails fdd){
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositDao#getFixedDepositDetails(long)
	 */
	public FixedDepositDetails getFixedDepositDetails(long id){
		return fixedDeposits.get(id);
	}
}
