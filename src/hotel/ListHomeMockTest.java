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
	   	 //����in_Out_Room����һ��
	   	 context.checking(new Expectations(){{
	   		allowing(lh).search();
	   		will(onConsecutiveCalls(returnValue("Marry�ɹ���ס901���䣡"),returnValue("�÷����Ѿ�������ס")));
	   		 }});
	}

	@Test
	public void testListHomeInt() {
		fail("��δʵ��");
	}


}
