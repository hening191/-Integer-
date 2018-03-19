package Inte;

import java.lang.reflect.Field;

public class TestInteger {

	public static void main(String[] args) {
		
		Class cache = Integer.class.getDeclaredClasses()[0];
		try {
			Field myCache = cache.getDeclaredField("cache");
			myCache.setAccessible(true);
			Integer[] newCache = (Integer[])myCache.get(cache);
			newCache[132] = newCache[133];
		} catch (Exception e) {
			e.printStackTrace();
		}
		int a = 2;
		int b = a + a;
		System.out.printf("%d+%d=%d",a,a,b);
		System.out.println();
		Integer c = 2;
		System.out.printf(b+"");
		System.out.println();
		System.out.println((Integer)(c+c));
	}

}
