package com.iocean.handler;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateFormater extends SimpleTagSupport {
	
	private String date;
	private String format;
	
	public DateFormater() {
		super();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public void doTag()throws JspException, IOException{
		SimpleDateFormat formater = new SimpleDateFormat(format);
		try {
			Date d = formater.parse(date);
			DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
					DateFormat.SHORT,
					DateFormat.SHORT);
			JspWriter out = getJspContext().getOut();
			out.print(shortDateFormat.format(d));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
