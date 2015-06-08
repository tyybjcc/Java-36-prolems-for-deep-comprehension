package com.java36.chap21;

import java.util.HashMap;
import java.util.Map;

public class HashCodeOverride {
	
	public static void main(String[] args) {
		
		//没有重写hashCode所造成的问题请查看EqualsOverride类
		
		Person p1 = new Person(1,"p1");
		Person p2 = new Person(1,"p1");
		Map<Person,Integer> personMap = new HashMap<Person,Integer>();
		personMap.put(p1, 1);
		System.out.println( personMap.get(p1) );
		System.out.println( personMap.get(p2) );	//重写了hashCode还要重写equals,否则get结果任然是null
		
		
	}
	
	private static class Person {
		int id;
		String name;
		private Person(int _id, String _name) {
			this.id = _id;
			this.name = _name;
		}
		@Override
		public int hashCode() {
			return Integer.valueOf(this.id).hashCode() ^ this.name.hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj==null)	return false;
			if(obj instanceof Person) {
				return this.id==((Person)obj).id && ( this.name.equals(((Person)obj).name) || this.name==null&&((Person)obj).name==null );
			}
			return false;
		}
	}

}
