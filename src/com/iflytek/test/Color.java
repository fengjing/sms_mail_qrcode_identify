package com.iflytek.test;

/**
 * @author kwliu
 * @date 2016年5月12日 下午3:11:53
 * @version 1.0
 */
public enum Color {
	RED("红色", 0), GREEN("绿色", 1);
	String name;
	Integer value;

	private Color(String name, Integer val) {
		this.value = val;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getValue() {
		return this.value;
	}
}