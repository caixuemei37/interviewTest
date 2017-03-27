
import java.util.ArrayList;
import java.util.Random;

import interview.test3.*;

class myThread_Runnable implements Runnable {

	public void run() {

		Random random = new Random();
		int id = random.nextInt(100);
		test3 test = new test3();
		LUN lun = new LUN();
		lun.setId(id);
		lun.setSize(10240);
		lun.setLabel("LUN" + id);
		test.create(lun);

		System.out.println(Thread.currentThread().getName());
		System.out.println(test.get(id).getSize() + " "
				+ test.get(id).getLabel());

	}

}

public class testRunableFortest3 {

	public static void main(String args[]) {
		myThread_Runnable mt = new myThread_Runnable();
		Thread t1 = new Thread(mt, "thread 1");
		Thread t2 = new Thread(mt, "thread 2");
		Thread t3 = new Thread(mt, "thread 3");
		t1.start();
		t2.start();
		t3.start();

	}
}
