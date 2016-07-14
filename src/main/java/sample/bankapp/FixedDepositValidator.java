package sample.bankapp;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FixedDepositValidator implements Validator {
	public boolean supports(Class<?> arg0) {
		return FixedDepositDetails.class.isAssignableFrom(arg0);
	}

	public void validate(Object arg0, Errors arg1) {
		FixedDepositDetails fdd = (FixedDepositDetails)arg0;
		if(fdd.getDepositAmount() == 0){
			arg1.reject("zeroDepositAmount");
		}
	}

}
