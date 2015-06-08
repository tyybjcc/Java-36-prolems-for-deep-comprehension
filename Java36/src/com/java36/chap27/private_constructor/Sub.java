package com.java36.chap27.private_constructor;

//去掉注释产生错误： 父类的构造器访问权限不足，子类无法调用，因此子类也无法继承父类
//error: Implicit super constructor Super() is not visible for default constructor. Must define an explicit constructor
public class Sub /*extends Super*/{

}
