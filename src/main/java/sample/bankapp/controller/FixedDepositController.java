package sample.bankapp.controller;

import sample.bankapp.FixedDepositDetails;
import sample.bankapp.service.FixedDepositService;

public interface FixedDepositController {

	void setFixedDepositService(FixedDepositService fixedDepositService);

	boolean submit();

	FixedDepositDetails get(long id);

}