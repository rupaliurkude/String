package com.qa.Strings;

import java.util.HashSet;

public class HashCodeAndEquals {
	public void hashSet(){
		Student s1 = new Student(1,"Rupali");
		Student s2 = new Student(1,"Rupali");
		Student s3 = new Student(1,"Rupali");
		Student s4 = new Student(1,"Rupali1");
	HashSet <Student> hash = new HashSet<Student>();
	hash.add(s1);
	hash.add(s2);
	hash.add(s3);
	hash.add(s4);
	if(s1.equals(s2)){
		System.out.println("Both are Equal");
	}
	else{
		System.out.println("Both not equal");
	}
	for(Student std :hash){
		System.out.println(std+"id::"+std.name+std.hashCode());
	}
}
	public static void main(String[]arg){
		HashCodeAndEquals hc= new HashCodeAndEquals();
		hc.hashSet();
	}

}


class Student{
	public int id;
	public String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
