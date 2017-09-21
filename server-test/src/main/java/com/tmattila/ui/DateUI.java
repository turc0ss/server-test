package com.tmattila.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

		VerticalLayout verLayout = new VerticalLayout();

		headerLabel = new Label("<h2><b>Welcome to push button date storage</b></h2><br>", ContentMode.HTML);
		verLayout.addComponent(headerLabel);
		
		VerticalLayout ver2Layout = new VerticalLayout();
		ver2Layout.setSpacing(true);

		dateButton = new Button("Click to see the date and time of the button press");
		ver2Layout.addComponent(dateButton);
		
		dateButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {

				date = new Date();
				String formattedDate = dateF.format(date);
				dateLabel = new Label(formattedDate);
				ver2Layout.addComponent(dateLabel);
				System.out.println(formattedDate);

			}
		});

		rootLayout.addComponent(verLayout);
		rootLayout.addComponent(ver2Layout);

		setContent(rootLayout);

	}

}
