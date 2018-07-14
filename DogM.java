package Lessons2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DogM {

	public static void main(String[] args) {
		Dog dog=new Dog("Susleg",4);
		System.out.println(dog);
		Owner owner=new Owner("Alex");
		System.out.println(dog);
		Dog cloneDog=null;
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos=new ObjectOutputStream(baos);
			oos.writeObject(dog);			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		try {
			ObjectInputStream ois=new ObjectInputStream(bais);
			cloneDog=(Dog) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(cloneDog);
		
		owner.setName("Merry");
		System.out.println(dog);
		System.out.println(cloneDog);
	}
}
