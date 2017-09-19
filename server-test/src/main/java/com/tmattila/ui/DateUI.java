package com.tmattila.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/dateui")
@Theme("valo")
@Title("This is a test")
public class DateUI extends UI {

	
	// WORKS 
	
	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout root = new VerticalLayout();
		root.addComponents(new Label("This is a test 2"));
		setContent(root);
	}

}
