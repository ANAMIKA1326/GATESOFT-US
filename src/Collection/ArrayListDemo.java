package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]){
	Student s1 = new Student("ad","baroda");
	Student s2 = new Student("da","vadodara");
	Student d3 = new Student("adm","brd");
	Student s3 = new Student("adm","brd");
	
	ArrayList<Student> li = new ArrayList<Student>();
	li.add(s1);
	li.add(s2);
	li.add(d3);
//	li.remove(s1);
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(s3);
	//li.retainAll(list);
	li.addAll(list);
	Iterator itr=li.iterator(); 
	 while(itr.hasNext()){  
		 Student st=(Student)itr.next();  
		   System.out.println(st.city);  
		  }  
}
}
