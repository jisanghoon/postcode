package kr.co.home.postcode;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.home.postcode.dto.Postcode;
import kr.co.home.postcode.service.PostcodeService;

public class PostcodeTest {
	private static PostcodeService pcs;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pcs=PostcodeService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		pcs = null;
	}

	@Test
	public void testSelectAll() {
		List<Postcode> list = pcs.selectAll();
		Assert.assertNotNull(list);
		/*for (Postcode postcode : list) {
			System.out.println(postcode);
		}*/
	}
	@Test
	public void testSelectCodeWithAddressBySidoAndDoro() {
		Postcode post =new Postcode();
		post.setSido("세종특별자치시");
		post.setDoro("라온로");
		List<Postcode> list = pcs.selectCodeWithAddressBySidoAndDoro(post);
		Assert.assertNotNull(list);
		for (Postcode postcode : list) {
			System.out.println(postcode);
		}
		
	}
	
	@Test
	public void testSelectItemByDoro() {}
	
}
