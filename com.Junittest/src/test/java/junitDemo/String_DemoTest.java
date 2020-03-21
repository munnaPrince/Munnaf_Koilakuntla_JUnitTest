package junitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String_DemoTest {
	String_Demo obj=new String_Demo();
	@Test
	void testReplaceString() {
		assertEquals("BCD",obj.ReplaceString("ABCD"));
	}
	@Test
	void testReplaceString1() {
		assertEquals("CD",obj.ReplaceString("AACD"));
	}
	@Test
	void testReplaceString2() {
		assertEquals("BCD",obj.ReplaceString("BACD"));
	}
	@Test
	void testReplaceString3() {
		assertEquals("BBAA",obj.ReplaceString("BBAA"));
	}
	@Test
	void testReplaceString4() {
		assertEquals("BAA",obj.ReplaceString("AABAA"));
	}

}
