package sample.bankapp;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.bankapp.controller.FixedDepositController;
import sample.bankapp.dao.FixedDepositDao;

public class SingletonTest {
	private static ApplicationContext ctx;
	
	@BeforeClass
	public static void init(){
		ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/aplicationContext.xml");
	}
	
	@Test
	public void testInstance() throws Exception{
		FixedDepositController controller1 = 
				(FixedDepositController)ctx.getBean("controller");
		FixedDepositController controller2 = 
				(FixedDepositController)ctx.getBean("controller");
		
		assertSame("FixedDepositController의 인스턴스 비교 ", controller1, controller2);
	}
	
	@Ignore @Test
	public void testReference() throws Exception{
		FixedDepositController controller = 
				(FixedDepositController)ctx.getBean("controller");
	}
	
	@Ignore @Test
	public void testSingletonScope() throws Exception{
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath:META-INF/spring/aplicationContext.xml");
		FixedDepositController controller1 = 
				(FixedDepositController)ctx1.getBean("controller");
		FixedDepositController controller2 = 
				(FixedDepositController)ctx.getBean("controller");
		
		assertNotSame("FixedDepositController의 인스턴스 비교 ", controller1, controller2);
	}
	
	@Ignore @Test
	public void testSingletonBean() throws Exception{
		FixedDepositDao d1 = 
				(FixedDepositDao)ctx.getBean("dao");
		FixedDepositDao d2 = 
				(FixedDepositDao)ctx.getBean("dao1");
		
		assertNotSame("FixedDepositDao의 인스턴스 비교 ", d1, d2);
	}
	
}
