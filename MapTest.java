package CollectionTesting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



class Student{ 
		int id;  
		String name; 
		Student(int id,String name){
			this.id=id;
			this.name=name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	  
	}  
public class MapTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, Student> stdMap=new <String, Student> HashMap();
		stdMap.put("aa", new Student(1,"Aung Aung"));
		stdMap.put("mm", new Student(2,"Mya Mya"));
		stdMap.put("kk", new Student(3,"Ko Ko"));
		
		Set set = stdMap.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Student> pair = (Map.Entry<String, Student>) it.next();
			Student stu=(Student)pair.getValue();
			System.out.println(pair.getKey() + " = " + stu.getId()+", "+stu.getName());
			
		}

		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter a Key Value :");
		String keyValue=sc.nextLine();
		if(stdMap.containsKey(keyValue)) {
			Student stu = stdMap.get(keyValue);
			System.out.println(stu.getId()+", "+stu.getName());
		}
	}

}
