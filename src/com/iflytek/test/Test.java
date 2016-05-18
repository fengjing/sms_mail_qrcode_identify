package com.iflytek.test;

import java.io.IOException;

import org.apache.commons.httpclient.NameValuePair;

/**
 * @author kwliu
 * @date 2016年5月9日 下午2:17:48
 * @version 1.0
 */
public class Test {
	public static void main(String[] args) throws IOException {
		NameValuePair[] data = {
				new NameValuePair("appkey", "d10a8e06284cf889deaf93ffb5d9c60a"),
				new NameValuePair("name", "邓永望"),
				new NameValuePair("cardno", "610922197401232578") };

		String url = "http://api.id98.cn/api/idcard";
		String body = UseApi.do_post(url, data);
		System.out.println(body);
		String url2 = "http://api.id98.cn/api/idcard?appkey=d10a8e06284cf889deaf93ffb5d9c60a&name=%E9%82%93%E6%B0%B8%E6%9C%9B&cardno=610922197401232578";
		String body2 = UseApi.do_get(url2);
		System.out.println(body2);
	}
}
