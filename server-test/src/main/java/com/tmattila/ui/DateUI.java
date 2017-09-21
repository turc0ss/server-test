package com.tmattila.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmattila.model.DateStorageModel;
import com.tmattila.repository.DateRepository;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;

@SpringUI(path = "/dateui")
@Theme("valo")
@Title("This is a test")
public class DateUI extends UI {
	
	@Autowired
	DateRepository repo;

	private Label headerLabel;
	private Label dateLabel;
	private Date date;
	private VerticalLayout rootLayout;
	private Button dateButton;
	private DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Override
	protected void init(VaadinRequest request) {
		
		rootLayout = new VerticalLayout();
		rootLayout.setMargin(true);
		
		VerticalLayout headerLayout = new VerticalLayout();
		
		headerLabel = new Label("<h2><b>Welcome to date storage application</b></h2><br>", ContentMode.HTML);
		headerLayout.addComponent(headerLabel);
		
		VerticalLayout buttonLayout = new VerticalLayout();
		buttonLayout.setSpacing(true);
		
		dateButton = new Button("Click to save the time of button press to database");
		dateButton.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				date = new Date();
				String formattedDate = dateF.format(date);
				
				Label timeLabel = new Label("<b>Date and time of button press: </b>", ContentMode.HTML);
				dateLabel = new Label(timeLabel + formattedDate, ContentMode.HTML);
				
				buttonLayout.addComponent(dateLabel);
				repo.save(new DateStorageModel("DATE", formattedDate));
				System.out.println(formattedDate);
				
			}
		});
		
		buttonLayout.addComponent(dateButton);
		
		rootLayout.addComponent(headerLayout);
		rootLayout.addComponent(buttonLayout);
		
		setContent(rootLayout);
	}

}
