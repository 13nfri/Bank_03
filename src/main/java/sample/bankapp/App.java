package sample.bankapp;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.bankapp.controller.FixedDepositController;
import sample.bankapp.service.FixedDepositService;
import sample.bankapp.service.FixedDepositServiceImpl;

/**
 * Hello world!
 *
 */

public class App {
	private static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/aplicationContext.xml");
		
		/*
		FixedDepositController controller = (FixedDepositController)ctx.getBean("controller");
		logger.info("정기예금 개설 여부 : " + controller.submit());
		logger.info(controller.get(1));
		*/
		
		FixedDepositService service = (FixedDepositService)ctx.getBean("fixedDepositServiceImpl");
		service.createFixedDeposit(new FixedDepositDetails(1, 0, 12, "aaa@aaa.com"));
		service.createFixedDeposit(new FixedDepositDetails(2, 1000, 6, "bbb@bbb.com"));
		service.createFixedDeposit(new FixedDepositDetails(3, 500, 6, "ccc@ccc.net"));
	}
}
