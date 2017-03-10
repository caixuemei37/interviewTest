import interviewTest.test3.*;//need to import test3

public class testForTest3 {

	public static void main(String[] args) {
		// create a LUN
		test3 testing = new test3();
		LUN lun0 = new LUN();
		lun0.setId(0);
		lun0.setSize(10240);
		lun0.setLabel("LUN0");
		testing.create(lun0);

		// retrieve information
		if (testing.get(0).getSize() == 10240
				&& testing.get(0).getLabel().equals("LUN0")) {
			System.out.println("create and retrieve info LUN passed");
		} else {
			System.out.println("failed");
		}

		// Update size
		LUN update = new LUN();
		update.setSize(204800);
		update.setLabel("LUNupdate");
		testing.update(0, update);
		if (testing.get(0).getSize() == 204800
				&& (testing.get(0).getLabel().equals("LUNupdate"))) {
			System.out.println("Update LUN passed");
		} else {
			System.out.println("failed");
		}

		// Delete LUN
		testing.delete(0);
		// Make sure no such LUN
		try {
			testing.get(0);
		} catch (Exception E) {
			System.out.println("no this LUN - delete passed");
		}

	}
}
