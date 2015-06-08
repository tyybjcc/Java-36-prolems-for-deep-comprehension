package com.java36.chap21;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class EqualsOverwrite {
	
	public static void main(String[] args) {
		Person p1 = new Person(1,"person");
		Person p2 = new Person(1,"person");
		
		//test
		System.out.println(p1==p2);	//address comparison
		System.out.println(p1.equals(p2));	//value comparison
		
		
		//application
		System.out.println();
		Vector<Person> persons = new Vector<Person>();
		persons.add(p1);
		System.out.println(persons.contains(p2));
		System.out.println(persons.indexOf(p2));
		System.out.println(persons.indexOf(p1));
		
		//当存在继承时
		System.out.println();
		Son s1 = new Son(1,"person",10);
		Son s2 = new Son(1,"person",20);
		System.out.println( s1.equals(s2) );
		System.out.println( s2.equals(s1) );
		//父子类的比较的对称性
		System.out.println( s1.equals(p1) );
		System.out.println( p1.equals(s1) );
		
		
		//附：没有重写hashCode()所造成的问题
		System.out.println();
		Map<Person,Integer> personMap = new HashMap<Person,Integer>();
		personMap.put(p1, 1);
		System.out.println( personMap.get(p1) );
		System.out.println( personMap.get(p2) );
		
	}
	
	static class Person {
		int id;
		String name;
		Person(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		/**
		 * 对于单独一个雷，满足equals方法的重写规则比较容易
		 */
		@Override
		public boolean equals(Object obj) {
			if(this==obj) {
				return true; //自反性
			}
			if(obj instanceof Person) {	//排空性
				Person person = (Person)obj;
				return this.id==person.id && ( this.name.equals(person.name) || this.name==null||person.name==null );	//String应该用equals(). //要考虑null时的情况	//对称性，传递性
			}
			return false;
		}
	}
	
	static class Son extends Person{
		int age;

		private Son(int id, String name) {
			super(id, name);
		}
		private Son(int id, String name, int age) {
			super(id,name);
			this.age = age;
		}
		/**
		 * 消除了父类与子类进行比较时
		 */
		@Override
		public boolean equals(Object obj) {
			if(obj==null)	return false;
			if(obj instanceof Person) {
				if( super.equals(obj) ) {
					if(obj instanceof Son) {
						return ((Son)obj).age == this.age;
					} else {
						return true;
					}
					
				}else {
					return false;
				}
			}
			return false;
		}
		
		
	}

}
