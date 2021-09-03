package com.khotrizwan.angular8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Angular8Application {

	String s;
	public static void main(String[] args) {
		SpringApplication.run(Angular8Application.class, args);

		/*
		Angular8Application x = new Angular8Application();
		x.s = "1";
		Angular8Application y = x;
		y.s = "2";
		System.out.println(x.s + ":" + y.s);

		Map<Integer, String> m = new HashMap<>();
		m.put(1, x.s);
		m.put(2, x.s);
		
		m.remove(1);

		List<String> l = new ArrayList<>();
		l.add("1");
		l.add("2");
		l.add("3");

		Iterator<String> i = l.iterator();
		//l.remove("2");

		while(i.hasNext()) {
		System.out.println(i.next());
	}

	A a1 = new A();
	A a2 = new A();
	List<A> list = new ArrayList<A>();
	list.add(a1);
	list.add(a2);
	Set<A> hs = new HashSet<A>();
	hs.add(a1);
	hs.add(a2);

	Set<A> hs1 = new HashSet<A>();
	hs1.add(a1);
	hs1.add(a1);

	System.out.println("-------------------------" + list.size());
	System.out.println("-------------------------" + hs.size());
	System.out.println("-------------------------" + hs1.size());

	for(A a : hs) {
		System.out.println(a);
	}
		System.out.println(m.get(null));
		*/
	}

}

class A {
	int i = 1;
	A() {
		i = 2;
	}

	@Override
	public String toString() {
		return "i:" + i;
	}
}
