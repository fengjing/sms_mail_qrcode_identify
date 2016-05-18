package com.iflytek.test;

import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * @author kwliu
 * @date 2016年5月9日 下午2:05:02
 * @version 1.0
 */
public class UseApi {
	public static String do_post(String url, NameValuePair[] name_value_pair)
			throws IOException {
		String body = "";
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(url);
		try {
			post.addRequestHeader("Content-Type",
					"application/x-www-form-urlencoded;charset=utf8");// 在头文件中设置转码
			post.setRequestBody(name_value_pair);

			client.executeMethod(post);

			int statusCode = post.getStatusCode();
			System.out.println("statusCode:" + statusCode);

			/*
			 * for (Header h : headers) { System.out.println(h.toString());
			 * body.append(h.toString()); }
			 */
			body += new String(post.getResponseBodyAsString().getBytes("utf8"));
		} finally {
			post.releaseConnection();
		}
		return body;
	}

	public static String do_get(String url) throws IOException {
		String body = "";
		HttpClient client = new HttpClient();
		GetMethod get = new GetMethod(url);
		try {
			get.addRequestHeader("Content-Type",
					"application/x-www-form-urlencoded;charset=utf8");// 在头文件中设置转码
			client.executeMethod(get);

			int statusCode = get.getStatusCode();
			System.out.println("statusCode:" + statusCode);

			body = new String(get.getResponseBodyAsString().getBytes("utf8"));
		} finally {
			get.releaseConnection();
		}
		return body;
	}
}
