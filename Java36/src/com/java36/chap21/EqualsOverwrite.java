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
		
		//�����ڼ̳�ʱ
		System.out.println();
		Son s1 = new Son(1,"person",10);
		Son s2 = new Son(1,"person",20);
		System.out.println( s1.equals(s2) );
		System.out.println( s2.equals(s1) );
		//������ıȽϵĶԳ���
		System.out.println( s1.equals(p1) );
		System.out.println( p1.equals(s1) );
		
		
		//����û����дhashCode()����ɵ�����
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
		 * ���ڵ���һ���ף�����equals��������д����Ƚ�����
		 */
		@Override
		public boolean equals(Object obj) {
			if(this==obj) {
				return true; //�Է���
			}
			if(obj instanceof Person) {	//�ſ���
				Person person = (Person)obj;
				return this.id==person.id && ( this.name.equals(person.name) || this.name==null||person.name==null );	//StringӦ����equals(). //Ҫ����nullʱ�����	//�Գ��ԣ�������
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
		 * �����˸�����������бȽ�ʱ
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
