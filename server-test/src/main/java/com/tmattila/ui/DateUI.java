package com.tmattila.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SpringUI(path = "/dateui")
@Theme("valo")
@Title("This is a test")
public class DateUI extends UI {

	
	// // WORKS
	
	private Label dateLabel;
	private Label headerLabel;
	private Date date;
	private VerticalLayout rootLayout;
	private Button dateButton;
	private DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	@Override
	protected void init(VaadinRequest request) {

		rootLayout = new VerticalLayout();
		rootLayout.setMargin(true);
		
		headerLabel = new Label("Welcome to push button date storage");
		dateButton = new Button("Click to see the date and time of the button press");
		dateButton.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				date = new Date();
				String formattedDate = dateF.format(date);
				dateLabel = new Label(formattedDate);
				rootLayout.addComponent(dateLabel);
				System.out.println(formattedDate);
				
			}
		});
		
		rootLayout.addComponent(headerLabel);
		rootLayout.addComponent(dateButton);
		setContent(rootLayout);
		
	}

}




