package com.tmattila.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "dates")
public class DateStorageModel {

	@Id
	private String id;

	@Field(value = "TITLE")
	private String title;

	@Field(value = "DATE")
	private String date;

	public DateStorageModel(final String title, final String date) {
		this.title = title;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(final String date) {
		this.date = date;
	}
	
	public String toString() {
		return "ID: " + this.id + " TITLE: " + this.title + " DATE: " + this.date;
	}

}
