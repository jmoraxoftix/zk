/* Columnlayout.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Wed Jun  4 10:42:53 TST 2008, Created by gracelin
}}IS_NOTE

Copyright (C) 2008 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
 */
package org.zkoss.zkmax.zul;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.HtmlBasedComponent;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zk.ui.sys.ComponentCtrl;

/**
 * A columnlayout lays out a container which can have multiple columns, and each
 * column may contain no more than one component.
 * 
 * @author gracelin
 * @since 3.1.0
 */
public class Columnlayout extends HtmlBasedComponent {

	public Columnlayout() {
		setSclass("z-column-layout");
	}

	public boolean insertBefore(Component child, Component insertBefore) {
		if (!(child instanceof Columnchildren))
			throw new UiException("Unsupported child for Columnlayout: "
					+ child);
		return super.insertBefore(child, insertBefore);
	}

	/**
	 * When add child, layout will be rerender
	 * 
	 * @see ComponentCtrl#onChildAdded
	 */
	public void onChildAdded(Component child) {
		super.onChildAdded(child);
		smartUpdate("z.childchg", true);
	}

	/**
	 * When remove child, layout will be rerender
	 * 
	 * @see ComponentCtrl#onChildRemoved
	 */
	public void onChildRemoved(Component child) {
		super.onChildRemoved(child);
		smartUpdate("z.childchg", true);
	}
}
