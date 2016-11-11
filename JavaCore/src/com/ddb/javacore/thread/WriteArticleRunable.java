package com.ddb.javacore.thread;

public class WriteArticleRunable implements Runnable {
	private Paper paper;
	private Pen pen;
	private boolean isRunning = true;
	private int count = 20;//循环次数

	public WriteArticleRunable(Paper paper, Pen pen) {
		super();
		this.paper = paper;
		this.pen = pen;
	}

	@Override
	public void run() {
		while (isRunning) {
			//synchronized (paper) {
			if (!paper.getIsPrivated()) {
				paper.setIsPrivated(true);
				paper.setOwner(Thread.currentThread().getName());
			}
			//}
			//synchronized (paper) {
			/*try {
					if (Thread.currentThread().getName().equals("zhangsan")) {
						Thread.sleep(1);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			// 判断Pen资源是否可以得到
			if (!pen.getIsPrivated()) {
				pen.setIsPrivated(true);
				pen.setOwner(Thread.currentThread().getName());
			}
			//}
			Boolean getPaper = paper.getOwner().equals(Thread.currentThread().getName());
			Boolean getPen = pen.getOwner().equals(Thread.currentThread().getName());
			synchronized (getPen) {
				// 判断Paper资源是否可以得到
				// 写文章
				if (getPaper && getPen) {
					System.out.println(Thread.currentThread().getName() + "得到了纸与笔，我可以正常写作！");
					System.out.println("系统正常退出！");
					paper.setIsPrivated(false);
					pen.setIsPrivated(false);
					this.isRunning = false;

				} else if (getPaper && !getPen) {
					System.out.println(Thread.currentThread().getName() + "得到了纸，我缺少笔！");
					System.out.println(Thread.currentThread().getName() + "我要等待钢笔资源！");
					--count;
					if (count <=0) {
						System.out.println(Thread.currentThread().getName() + " :我检测到形成死锁 ，算了 我先礼让 一下 ");
						paper.setIsPrivated(false);
						try {
							System.out.println(Thread.currentThread().getName() + ": 我睡了，你们写吧！");
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} 

				} else if (!getPaper && getPen) {
					System.out.println(Thread.currentThread().getName() + "得到了钢笔，我缺少纸张！");
					System.out.println(Thread.currentThread().getName() + "我要等待纸张资源！");
					// Thread.sleep(1000);
				} else {
					System.out.println(Thread.currentThread().getName() + "我好悲剧,我什么都没有得到！");
					System.out.println(Thread.currentThread().getName() + "我要继续等待机会....");
				}
			}
		}

	}

	public void stop() {
		this.isRunning= false;
	}
	
	
}
