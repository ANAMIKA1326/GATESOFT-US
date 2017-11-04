package SerializationExamples;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Student implements Serializable{
	int id;
	String name;
	transient String add;
	 Student(int id,String name,String add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
}

public class SerializeObject{
	public static void main(String args[]) throws Exception{
		
		Student s = new Student(1,"ad","vadodara");
		Student s2 = new Student(2,"da","gngr");
		FileOutputStream fout = new FileOutputStream("E:\\bfile.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s);
		out.writeObject(s2);
		out.flush();
		out.close();
		System.out.println("completed..!");
		
		FileInputStream fin  = new FileInputStream("E:\\bfile.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student s1 = (Student)oin.readObject();
		System.out.println(s1.id+" "+s1.name+" "+s1.add);
		 s1 = (Student)oin.readObject();
		
		 System.out.println(s1.id+" "+s1.name+" "+s1.add);
	}
	}
