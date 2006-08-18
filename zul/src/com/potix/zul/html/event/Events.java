/* Events.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Fri Aug 18 09:20:23     2006, Created by tomyeh@potix.com
}}IS_NOTE

Copyright (C) 2006 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package com.potix.zul.html.event;

/**
 * Utilities to access events for ZK and ZUL.
 *
 * @author <a href="mailto:tomyeh@potix.com">tomyeh@potix.com</a>
 */
public class Events extends com.potix.zk.ui.event.Events {
	protected Events() {} //prevent from creation

	/** The onPaging event used with {@link PagingEvent}.
	 */
	public static final String ON_PAGING = "onPaging";
}
