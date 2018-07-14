package Lessons2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GogMain {

	public static void main(String[] args) {
	Dog dog=new Dog("Susleg",13);
	try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("dog.bin"))){
		dos.writeUTF(dog.getName());
		dos.writeInt(dog.getAge());
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	}

}
