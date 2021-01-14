package com.app6_Operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;


/*
   라. Operator
	 파라미터 있고 리턴값 있는 경우
     ==>  전달하는 파라미터를 연산(*)해서  임의의 값으로 리턴하는 용도
     ==> 내부적으로  Function 상속받음
	
   * 종류
    BinaryOperator<T> : BiFunction<T,U,R>  상속
                      : 두개의 파라미터 전달하고 반환 ( 모두 데이터타입 동일 )		
	UnaryOperator<T> : Function<T,R> 상속
	                  : 하나의 파라미터 전달하고 반환 ( 모두 데이터타입 동일 )	
	                  
    DoubleBinaryOperator : 두개의 파라미터 double 전달하고  double 반환 ( 모두 데이터타입 동일 )
    DoubleUnaryOperator	  :	: 하나의 파라미터 double 전달하고 double반환  
    IntBinaryOperator : 두개의 파라미터 int 전달하고  int 반환 ( 모두 데이터타입 동일 )
    IntUnaryOperator	  :	: 하나의 파라미터 int 전달하고 int반환  
    LongBinaryOperator : 두개의 파라미터 long 전달하고  long 반환 ( 모두 데이터타입 동일 )
    LongUnaryOperator	  :	: 하나의 파라미터 long 전달하고 long반환                 

 
 */
public class OperatorTest2 {
	public static void main(String[] args) {
		
	
		Person p1 = new Person("홍길동1", 34);
		Person p2 = new Person("홍길동2", 13);
		
		//익명클래스
		Comparator<Person> comp = new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
//				return Integer.compare(p2.getAge(), p1.getAge());  //내림차순
				return Integer.compare(p1.getAge(), p2.getAge());  //오름차순
			}
		};
		// 두 개의 Person에서 나이가 많은 Person 반환
		BinaryOperator<Person> op = BinaryOperator.maxBy(comp);
		Person maxAgePerson  = op.apply(p1, p2);
		System.out.println(maxAgePerson);
		
		////////////////////////////////////////
		BinaryOperator<Person> x = BinaryOperator.maxBy((f,f2)->Integer.compare(f.getAge(), f2.getAge()));
		Person maxAgePerson2  = x.apply(p1, p2);
		System.out.println("lambda.maxBy>>"+ maxAgePerson2);
		
		////////////////////////////////////////
		
		// 두 개의 Person에서 나이가 적은 Person 반환
		BinaryOperator<Person> op2 = BinaryOperator.minBy(comp);
		Person minAgePerson  = op2.apply(p1, p2);
		System.out.println(minAgePerson);
////////////////////////////////////////
BinaryOperator<Person> x2 = BinaryOperator.minBy((f,f2)->Integer.compare(f.getAge(), f2.getAge()));
Person minAgePerson2  = x2.apply(p1, p2);
System.out.println("lambda.minBy>>"+ minAgePerson2);

////////////////////////////////////////
		
	}//end main
}//end class
class Person{
	String name;
	int age;
	
	public Person() {
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
}//end class







