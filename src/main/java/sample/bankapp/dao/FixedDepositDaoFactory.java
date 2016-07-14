package sample.bankapp.dao;

public class FixedDepositDaoFactory {
	/*
	private FixedDepositDaoFactory() {}
	
	public static FixedDepositDao getFixedDepositDao(String daoType){
		FixedDepositDao fixedDao = null;
		
		if("impl".equalsIgnoreCase(daoType)){
			fixedDao = new FixedDepositDaoImpl();
		}
		else if("dbcp".equalsIgnoreCase(daoType)){
			fixedDao = new FixedDepositDaoDbcp();
		}
		else if("mybatis".equalsIgnoreCase(daoType)){
			fixedDao = new FixedDepositDaoMybatis();
		}
		
		return fixedDao;
	}
	*/
	
	public FixedDepositDaoFactory() {}
	
	public FixedDepositDao getFixedDepositDao(String daoType){
		FixedDepositDao fixedDao = null;
		
		if("impl".equalsIgnoreCase(daoType)){
			fixedDao = new FixedDepositDaoImpl();
		}
		else if("dbcp".equalsIgnoreCase(daoType)){
			fixedDao = new FixedDepositDaoDbcp();
		}
		else if("mybatis".equalsIgnoreCase(daoType)){
			fixedDao = new FixedDepositDaoMybatis();
		}
		
		return fixedDao;
	}
}
