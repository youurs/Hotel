package hotel;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class ListHomeMockTest {
	
	 private Mockery context=new Mockery();
	 private ListHome lh=null;
	@Before
	public void setUp() throws Exception {
		lh=context.mock(ListHome.class);
	   	 //调用in_Out_Room方法一次
	   	 context.checking(new Expectations(){{
	   		allowing(lh).search();
	   		will(onConsecutiveCalls(returnValue("Marry成功入住901房间！"),returnValue("该房间已经有人入住")));
	   		 }});
	}

	@Test
	public void testListHomeInt() {
		fail("尚未实现");
	}


}
