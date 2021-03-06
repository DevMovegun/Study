package main;

import practice.AccessModifierOfMember;
import practice.ArgumentOfMainMethod;
import practice.BreakEscapeNestedLoop;
import practice.DifferenceModificationStringArray;
import practice.EffectOfDataArgument;
import practice.FinalAndAbstract;
import practice.FlexibleSizeArgument;
import practice.Interface;
import practice.LogicalRightShift;
import practice.MethodOfString;
import practice.ObjectClass;
import practice.PrintArray;
import practice.RefDataType;
import practice.ShortCircuit;
import practice.StaticField;
import practice.SuperMethod;
import practice.UpDownCastingInheritance;

public class PrintAllStudy {
	public static void main(String[] args) {
		
		// 참조 자료형 등가 비교
		System.out.println("# References Data Type");
		RefDataType.refDataType();
		System.out.println();

		// 쇼트 서킷 (short circuit)
		System.out.println("# Short Circuit");
		ShortCircuit.shortCircuit();
		System.out.println();

		// 논리 시프트 연산
		System.out.println("# Logical Right Shift");
		LogicalRightShift.logRightShift();
		System.out.println();

		// break를 이용한 다중 반복문 탈출 방법 2가지
		System.out.println("# Escape Nested Loops by break");
		BreakEscapeNestedLoop.breakEscape();
		System.out.println();

		// 배열 출력하는 방법 2가지
		System.out.println("# Print Array");
		PrintArray.printArr();
		System.out.println();

		// 메인 메소드의 매개변수 입출력
		System.out.println("# Print argument of main method");
		ArgumentOfMainMethod.argumentOfMainMethod(args);
		System.out.println();

		// 배열과 String 객체를 수정했을 때 차이점
		System.out.println("# Differnce Modification Of String and Array");
		DifferenceModificationStringArray.diffModifyOfStringArray();
		System.out.println();

		// String 객체의 다양한 메소드
		System.out.println("# Methods of String");
		MethodOfString.methodOfString();
		System.out.println();

		// 가변길이 매개변수
		System.out.println("# Flexible Size Argument");
		FlexibleSizeArgument.flexSizeArgs();
		System.out.println();

		// 기본 자료형 입력매개변수와 참조 자료형 입력매개변수의 차이
		System.out.println("# Effect of Data Argument");
		EffectOfDataArgument.effectOfDataArg();
		System.out.println();

		// 접근지정자에 따른 사용 가능 범위
		System.out.println("# Access Modifer Of Member");
		AccessModifierOfMember.accessModifierOfMember();
		System.out.println();

		// 정적 필드와 인스턴스 필드의 차이점
		System.out.println("# Difference Static Field and Instance Field");
		StaticField.staticField01();

		/*
		 * error syntax StaticField.staticField02();
		 */

		StaticField sF = new StaticField();
		sF.staticField02();
		System.out.println();

		// 상속 관계의 클래스 간의 Up Casting & Down Casting
		System.out.println("# Up Casting & Down Casting between Inheritance Class");
		UpDownCastingInheritance.upDownCastingInheritance();
		System.out.println();

		// super, super() 사용
		System.out.println("# Use super keyword and super()");
		SuperMethod.superMethod();
		System.out.println();

		// object class의 method
		System.out.println("# Object Class Methods");
		ObjectClass.objectClass();
		System.out.println();

		// final과 abstract 키워드
		System.out.println("# final and abstract keyword");
		FinalAndAbstract.finalAndAbstract();
		System.out.println();

		// Interface 문법 연습
		System.out.println("# Study Interface");
		Interface.practiceInterface();
		System.out.println();

	}
}
