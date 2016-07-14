package sample.bankapp.dao;

import sample.bankapp.FixedDepositDetails;

public interface FixedDepositDao {

	boolean createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDepositDetails(long id);

}