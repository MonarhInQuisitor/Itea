package Lessons2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Dog implements Serializable, Externalizable{
String name;
int age;
Owner owner;
public Dog() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return"dog "+name+"age "+age;
}
public Dog(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override 
public void writeExternal(ObjectOutput dog ) throws IOException{
	dog.writeUTF(getName());
	dog.writeObject(owner);;
	dog.writeByte(getAge());
}
@Override 
public void readExternal(ObjectInput dog) throws IOException,ClassNotFoundException{
	setName((String) dog.readObject());
	setAge(dog.readInt());
	owner=(Owner) dog.readObject();
}
}
