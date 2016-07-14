package sample.bankapp.service;

import javax.validation.Validator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;

import sample.bankapp.FixedDepositDetails;
import sample.bankapp.FixedDepositValidator;
import sample.bankapp.dao.FixedDepositDao;

@Service(value="service")
public class FixedDepositServiceImpl implements FixedDepositService {
	private static Logger logger = Logger.getLogger(FixedDepositServiceImpl.class);
	private FixedDepositDao fixedDepositDao;
	
	@Autowired
	private Validator validator;

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositService#createFixedDeposit(sample.bankapp.FixedDepositDetails)
	 */
	public boolean createFixedDeposit(FixedDepositDetails fdd){
		BeanPropertyBindingResult bindingResult =
					new BeanPropertyBindingResult(fdd, "Errors");
		
		FixedDepositValidator validator = new FixedDepositValidator();
		
		validator.validate(fdd, bindingResult);
		
		if(bindingResult.getErrorCount() > 0){
			logger.info("계좌생성 에러");
			return false;
		}
		else{
			logger.info("계좌생성 성공");
			fixedDepositDao.createFixedDeposit(fdd);
			return true;
		}
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositService#getFixedDepositDetails(long)
	 */
	public FixedDepositDetails getFixedDepositDetails(long id){
		return fixedDepositDao.getFixedDepositDetails(id);
	}
}
