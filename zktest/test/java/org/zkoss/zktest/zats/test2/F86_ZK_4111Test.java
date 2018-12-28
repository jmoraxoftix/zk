/* F86_ZK_4111Test.java

		Purpose:
		
		Description:
		
		History:
				Fri Dec 28 16:58:50 CST 2018, Created by leon

Copyright (C) 2018 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zktest.zats.test2;

import org.junit.Assert;
import org.junit.Test;
import org.zkoss.zktest.zats.WebDriverTestCase;

public class F86_ZK_4111Test extends WebDriverTestCase {
	@Test
	public void test() {
		connect();
		click(jq("$btn1"));
		waitResponse();
		checkAll("off", "autocorrect");
		click(jq("$btn2"));
		waitResponse();
		checkAll("off", "autocorrect");
		checkAll("true", "spellcheck");
		click(jq("$add2"));
		waitResponse();
		checkAll("aaa", "aaa");
		checkAll("bbb", "bbb");
		click(jq("$change"));
		waitResponse();
		checkAll("ccc", "ccc");
		checkAll("ddd", "ddd");
		checkAll("null", "aaa");
		checkAll("null", "bbb");
		click(jq("$clear"));
		waitResponse();
		checkAll("text", "type");
		checkAll("null", "autocorrect");
		checkAll("null", "ccc");
	}
	
	private void checkAll(String expected, String attrName) {
		Assert.assertEquals(expected, jq(".z-bandbox-input").attr(attrName));
		Assert.assertEquals(expected, jq(".z-combobox-input").attr(attrName));
		Assert.assertEquals(expected, jq(".z-textbox").attr(attrName));
		Assert.assertEquals(expected, jq(".z-datebox-input").attr(attrName));
		Assert.assertEquals(expected, jq(".z-timebox-input").attr(attrName));
		Assert.assertEquals(expected, jq(".z-timepicker-input").attr(attrName));
		Assert.assertEquals(expected, jq(".z-decimalbox").attr(attrName));
		Assert.assertEquals(expected, jq(".z-doublebox").attr(attrName));
		Assert.assertEquals(expected, jq(".z-doublespinner-input").attr(attrName));
		Assert.assertEquals(expected, jq(".z-bandbox-input").attr(attrName));
		Assert.assertEquals(expected, jq(".z-intbox").attr(attrName));
		Assert.assertEquals(expected, jq(".z-spinner-input").attr(attrName));
	}
}
