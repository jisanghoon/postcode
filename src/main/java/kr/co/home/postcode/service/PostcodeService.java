package kr.co.home.postcode.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.co.home.postcode.dao.PostcodeDao;
import kr.co.home.postcode.dto.Postcode;
import kr.co.home.postcode.util.MybatisSessionFactory;

public class PostcodeService {
	private static final Logger logger = Logger.getLogger(PostcodeService.class);

	private static final PostcodeService instance = new PostcodeService();
	
	public static PostcodeService getInstance() {
		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - start");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - end");
		}
		return instance;
	}

	private PostcodeService() {
	}
	
	
	public List<Postcode> selectAll() {
		if (logger.isDebugEnabled()) {
			logger.debug("selectAll() - start");
		}
	
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		PostcodeDao postcodeDao = sqlSession.getMapper(PostcodeDao.class);
		try {
			List<Postcode> returnList = postcodeDao.selectAll();
			if (logger.isDebugEnabled()) {
				logger.debug("selectAll() - end");
			}
			return returnList;
		} finally {
			sqlSession.close();
		}
	}

	public List<Postcode> selectCodeWithAddressBySidoAndDoro(Postcode temp) {
		if (logger.isDebugEnabled()) {
			logger.debug("selectCodeWithAddressBySidoAndDoro(temp) - start");
		}
	
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		PostcodeDao postcodeDao = sqlSession.getMapper(PostcodeDao.class);
		try {
			List<Postcode> returnList = postcodeDao.selectCodeWithAddressBySidoAndDoro(temp);
			if (logger.isDebugEnabled()) {
				logger.debug("selectCodeWithAddressBySidoAndDoro(temp) - end");
			}
			return returnList;
		} finally {
			sqlSession.close();
		}
		
	}
	public List<String> selectSido(){
		if (logger.isDebugEnabled()) {
			logger.debug("selectSido() - start");
		}
	
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		PostcodeDao postcodeDao = sqlSession.getMapper(PostcodeDao.class);
		try {
			List<String> returnList = postcodeDao.selectSido();
			if (logger.isDebugEnabled()) {
				logger.debug("selectSido() - end");
			}
			return returnList;
		} finally {
			sqlSession.close();
		}
	}
	
	
}
