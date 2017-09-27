package com.tmattila.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author tapsa
 *
 */
@Document(collection = "dates")
public class DateStorageModel {

	/**
	 * String id
	 */
	@Id
	private String id;

	/**
	 * String title
	 */
	@Field(value = "TITLE")
	private String title;

	/**
	 * String date
	 */
	@Field(value = "DATE")
	private String date;

	/**
	 *
	 * @param title
	 * @param date
	 */
	public DateStorageModel(final String title, final String date) {
		this.title = title;
		this.date = date;
	}

	/**
	 *
	 * @return id
	 */
	public final String getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	public final void setId(final String id) {
		this.id = id;
	}

	/**
	 *
	 * @return title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 *
	 * @param title
	 */
	public final void setTitle(final String title) {
		this.title = title;
	}

	/**
	 *
	 * @return date
	 */
	public final String getDate() {
		return date;
	}

	/**
	 *
	 * @param date
	 */
	public final void setDate(final String date) {
		this.date = date;
	}

	/**
	 * toString shows id, title and date in string format.
	 */
	@Override
	public final String toString() {
		return "ID: " + this.id + " TITLE: " + this.title + " DATE: " + this.date;
	}

}
