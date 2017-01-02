package kr.co.home.postcode.dao;

import java.util.List;

public interface PostcodeDao<T> {
	T selectByNo(int idx);
	List<T> selectAll();
	List<T> selectCodeWithAddressBySidoAndDoro(T t);
	List<String> selectSido();
	System.out.println("fetch확인");
}
