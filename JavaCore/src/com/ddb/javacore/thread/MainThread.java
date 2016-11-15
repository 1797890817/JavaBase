package com.ddb.javacore.thread;

import java.io.PrintStream;

public class MainThread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		PrintStream out = System.out;
		Thread thread = Thread.currentThread();
		out.println("thread.getName() : " + thread.getName());
		out.println("thread.getId() : " + thread.getId());
		out.println("thread.getPriority() : " + thread.getPriority());
		out.println("thread.isAlive() : " + thread.isAlive());
		out.println("thread.isDaemon() : " + thread.isDaemon());
		out.println("thread.isInterrupted() : " + thread.isInterrupted());
		out.println("thread.getThreadGroup() : " + thread.getThreadGroup());
		out.println("Thread.MAX_PRIORITY : " + Thread.MAX_PRIORITY);
		out.println("Thread.MIN_PRIORITY : " + Thread.MIN_PRIORITY);
		out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY);
		out.println("将休眠5秒");
		out.println("当前时间的毫秒是：" + System.currentTimeMillis());
		Thread.sleep(5000);
		// long end = ;
		out.println("休眠时间结束的毫秒是：" + System.currentTimeMillis());
		out.println("休眠5秒结束");

		out.println("即将调用：Thread.yield()");
		thread.yield();
		out.println("调用：Thread.yield()结束！");

	}

}
