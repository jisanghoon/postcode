package kr.co.home.postcode;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.home.postcode.util.MybatisSessionFactory;

public class MyBatisSqlSessionTest {
	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sqlSessionFactory = MybatisSessionFactory.getSqlSessionFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		sqlSessionFactory = null;
	}

	@Test
	public void testSqlSession() {
		SqlSession session = sqlSessionFactory.openSession();
		Assert.assertNotNull(session);
	}

}
