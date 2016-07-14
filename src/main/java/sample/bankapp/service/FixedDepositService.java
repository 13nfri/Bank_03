package sample.bankapp.service;

import sample.bankapp.FixedDepositDetails;

public interface FixedDepositService {

	boolean createFixedDeposit(FixedDepositDetails fdd);

	FixedDepositDetails getFixedDepositDetails(long id);

}