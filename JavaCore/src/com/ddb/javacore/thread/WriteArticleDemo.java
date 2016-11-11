package com.ddb.javacore.thread;

public class WriteArticleDemo {

	public static void main(String[] args) {
		Paper paper = new Paper();
		Pen pen = new Pen();
		WriteArticleRunable war = new WriteArticleRunable(paper, pen);
		WriteArticleRunable war2 = new WriteArticleRunable(paper, pen);
		Thread zhangsan = new Thread(war, "zhangsan");
		Thread wanglaowu = new Thread(war2, "wanglaowu");
		zhangsan.start();
		wanglaowu.start();

	}

}
