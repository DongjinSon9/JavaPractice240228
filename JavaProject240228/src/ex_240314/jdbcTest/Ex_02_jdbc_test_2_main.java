package ex_240314.jdbcTest;

import java.sql.SQLException;

public class Ex_02_jdbc_test_2_main {

	public static void main(String[] args) {
		try {
			// 분리된 조회 기능 호출 해보기. 
			Ex_02_jdbc_test_2_dao.select();
			// 분리된 기능, 데이터 입력해보기. 
			Ex_02_jdbc_test_2_dao.insert("lsy4", "1234", "이상용4");
			Ex_02_jdbc_test_2_dao.select();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
