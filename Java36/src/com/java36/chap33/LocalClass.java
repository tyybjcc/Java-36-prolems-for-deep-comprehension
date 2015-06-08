package com.java36.chap33;

public class LocalClass {
	String s1="abc";
	
	{
		class Local1 {
			private String l1 = "l1";
			Local1(String _l1){
				if(_l1!=null){
					this.l1 = _l1;
				} else {
					this.l1 = s1;
				}
			}
		}
	}
	
	{
		//Local1 loc1 = new Local1("local1");	//Local1相当于局部变量，此处不可访问
	}
	
	static {
		class Local1 {
			private String l1 = "l1";
			Local1(String _l1){
				if(_l1!=null){
					this.l1 = _l1;
				}
			}
		}
		System.out.println(Local1.class.getCanonicalName());	//无规范化名称——null
		System.out.println(Local1.class.getName());		//com.java36.chap33.LocalClass$2Local1
	}
	public static void main(String...args) {
		final int var1 = 3;
		
		class Local2 {
			private String l1 = "l1";
			Local2(String _l1){
				if(_l1!=null){
					this.l1 = _l1;
				} else {
					//_l1 = s1;	//因为此类声明在static代码块中，所以要求s1是static修饰的
				}
				int i = var1;		//本地类不能访问非final局部变量
			}
		}
		Local2 loc1 = new Local2("local1");
		System.out.println(loc1.l1);
	}

}
