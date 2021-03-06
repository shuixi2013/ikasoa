package com.ikasoa.core.utils;

import org.junit.Test;

import com.ikasoa.core.TestBase;

/**
 * 字符串工具单元测试
 */
public class StringUtilTest extends TestBase {

	@Test
	public void testIsEmpty() {
		assertTrue(StringUtil.isEmpty(null));
		assertTrue(StringUtil.isEmpty(""));
		assertFalse(StringUtil.isEmpty(" "));
	}

	@Test
	public void testIsNotEmpty() {
		assertFalse(StringUtil.isNotEmpty(null));
		assertFalse(StringUtil.isNotEmpty(""));
		assertTrue(StringUtil.isNotEmpty(" "));
	}

	@Test
	public void testIsBlank() {
		assertTrue(StringUtil.isBlank(null));
		assertTrue(StringUtil.isBlank(""));
		assertTrue(StringUtil.isBlank(" "));
	}

	@Test
	public void testIsNotBlank() {
		assertFalse(StringUtil.isNotBlank(null));
		assertFalse(StringUtil.isNotBlank(""));
		assertFalse(StringUtil.isNotBlank(" "));
	}

	@Test
	public void testEquals() {
		assertTrue(StringUtil.equals("abc", "abc"));
		assertFalse(StringUtil.equals("abc", "abcd"));
	}

	@Test
	public void testStrTohexStrAndHexStrToStr() {
		String str = "abc123xyz";
		assertEquals(StringUtil.hexStrToStr(StringUtil.strToHexStr(str)), str);
	}

	@Test
	public void testHexStrToBytesAndBytesToHexStr() {
		String hexStr = "123456ABCDEF";
		assertEquals(StringUtil.bytesToHexStr(StringUtil.hexStrToBytes(hexStr)), hexStr);
	}

	@Test
	public void testStrToBytesAndBytesToStr() {
		String str = TEST_STRING;
		assertEquals(
				StringUtil.hexStrToStr(StringUtil.bytesToHexStr(StringUtil.hexStrToBytes(StringUtil.strToHexStr(str)))),
				str);
	}

	@Test
	public void testToInt() {
		assertEquals(StringUtil.toInt("123 "), 123);
	}

}
