package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.OuterClass;

class OuterClassTest {
	
	OuterClass outer = new OuterClass();
	OuterClass.Inner inner;
	char[] chars = {'H', 'e', 'l', 'l', 'o'};
	String string = "Hello";
	
	@BeforeEach
	void setUp() {
		inner = outer.new Inner();
	}
	
	@DisplayName("String Decontruct")
	@Test
	void testStringDecontruct() {
		assertArrayEquals(inner.stringDeconstruct(string), chars, string);
		
	}
	
	@DisplayName("char[] -> new char[]")
	@Test
	void testNewCharArray() {
		assertArrayEquals(chars, inner.newCharArray(chars));
	}

}
