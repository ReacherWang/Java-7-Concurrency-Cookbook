package my.concurrency_collections;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class ConcurrentHashMapTest {

	/**
	 * putIfAbsent()һ��������ĳ�������ڵ�key,���key�Ͳ���ı�
	 * �൱�����µĲ�����
	 * if(!map.containsKey(key)) {
	 * 	   return map.put(key, value);
	 * } else {
	 *     return map.get(key);
	 * }
	 */
	@Test
	public void testPutIfAbsent() {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

		// ������name��key, ����null
		String r = map.putIfAbsent("name", "Tom");
		System.out.println(r);	// null

		// �ı�name��ֵ,û�иı�
		r = map.putIfAbsent("name", "John");
		System.out.println(r);	// Tom
		
		r = map.putIfAbsent("name", "Cat");
		System.out.println(r);	// Tom
		
		System.out.println(map);	// {name=Tom}
	}
}
