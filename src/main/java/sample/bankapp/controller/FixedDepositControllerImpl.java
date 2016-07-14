package sample.bankapp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import sample.bankapp.FixedDepositDetails;
import sample.bankapp.service.FixedDepositService;

@Controller(value="controller")
public class FixedDepositControllerImpl implements FixedDepositController {
	private FixedDepositService fixedDepositService;
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositController#setFixedDepositService(sample.bankapp.FixedDepositServiceImpl)
	 */
	@Resource(name="fixedDepositServiceImpl") //이름이 없다면 형식으로 찾는다
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		this.fixedDepositService = fixedDepositService;
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositController#submit()
	 */
	public boolean submit(){
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 10000, 365, "aaa@aaa.net"));
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositController#get(long)
	 */
	public FixedDepositDetails get(long id){
		return fixedDepositService.getFixedDepositDetails(id);
	}
}
