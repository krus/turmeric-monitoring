/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.monitoring.client.view.policy;

import java.util.List;
import java.util.Set;

import com.google.gwt.cell.client.AbstractInputCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

/**
 * Custom cell implementation that allows to show a list of Strings as an html
 * tag or a simple HTML-scaped string list based on the minListSize attribute
 * 
 * 
 */
public class CustomListCell extends AbstractInputCell<List<String>, String> {
	private int minListSize = 3;

	interface Template extends SafeHtmlTemplates {
		@Template("<option value=\"{0}\">{0}</option>")
		SafeHtml deselected(String option);

		@Template("<option value=\"{0}\" selected=\"selected\">{0}</option>")
		SafeHtml selected(String option);
	}

	private static Template template;

	public CustomListCell() {
		super("change");
		if (template == null) {
			template = GWT.create(Template.class);
		}
	}

	public CustomListCell(int minSize) {
		this();
		if (minSize < 0) {
			throw new IllegalArgumentException("Invalid minSize parameter = "
					+ minSize);
		}
		this.minListSize = minSize;
	}

	@Override
	public void render(List<String> value, Object key, SafeHtmlBuilder sb) {
		if (value != null) {
			if (value.size() >= 3) {
				renderSelectList(value, sb);
			} else {
				renderSimpleList(value, sb);
			}
		}

	}

	private void renderSimpleList(List<String> value, SafeHtmlBuilder sb) {
		if (value != null && !value.isEmpty()) {
			for (String option : value) {
				sb.appendEscaped(option).appendHtmlConstant("<br>");
			}
		}
	}

	private void renderSelectList(List<String> value, SafeHtmlBuilder sb) {
		
		sb.appendHtmlConstant("<select size=\""+this.minListSize+"\" tabindex=\"-1\">");
		if (value != null && !value.isEmpty()) {
			for (String option : value) {
				sb.append(template.deselected(option));
			}
		}
		sb.appendHtmlConstant("</select>");
	}

}