package com.hardik.spring.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Test
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Test {

	private List<String> list = new ArrayList<>();
	private Set<String> set = new HashSet<>();
	private Map<Integer, String> map = new HashMap<>();

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

}
