package com.iflytek.mail;

/**
 * @author kwliu
 * @date 2016年4月26日 下午2:06:09
 * @version 1.0
 */
public class SendMail {
	public static void main(String[] args) {
		String smtp = "mail.iflytek.com";// smtp服务器
		String from = "kwliu@iflytek.com";// 邮件显示名称
		String to = "465804675@qq.com";// 收件人的邮件地址，必须是真实地址
		String copyto = "";// 抄送人邮件地址
		String subject = "测试邮件";// 邮件标题
		String content = "你好！";// 邮件内容
		String username = "kwliu";// 发件人真实的账户名
		String password = "Louislau007";// 发件人密码
		Mail.sendAndCc(smtp, from, to, copyto, subject, content, username,
				password);

	}

}
