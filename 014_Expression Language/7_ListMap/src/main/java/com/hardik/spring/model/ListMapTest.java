package com.hardik.spring.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * Map List Test
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("listMapTestBean")
public class ListMapTest {

	private List<String> list = new ArrayList<>();
	private Map<Integer, String> map = new HashMap<>();

	public ListMapTest() {
		list.add("One");
		list.add("Two");
		list.add("Three");

		map.put(1, "Hi");
		map.put(2, "Hello");
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

}
