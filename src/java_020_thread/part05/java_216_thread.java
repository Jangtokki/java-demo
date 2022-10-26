package java_020_thread.part05;

public class java_216_thread {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread brother = new FamilyThread(wr, "brother");
		
		father.start();
		mother.start();
		sister.start();
		brother.start();

	}

}
