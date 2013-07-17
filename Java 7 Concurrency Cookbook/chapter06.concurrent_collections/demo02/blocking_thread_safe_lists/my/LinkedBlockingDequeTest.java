package demo02.blocking_thread_safe_lists.my;

import java.util.concurrent.LinkedBlockingDeque;

import org.junit.Test;

public class LinkedBlockingDequeTest {

	@Test
	public void testAdd() {
		// ��������Ϊ3
		LinkedBlockingDeque<String> list = new LinkedBlockingDeque<String>(3);
		list.add("hello");
		list.add("world");
		list.add("haha");
		
		// ��ӵ�4��Ԫ���쳣
		list.add("fourth");	// java.lang.IllegalStateException: Deque full
	}
}
