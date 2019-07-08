package gss.model;

import java.sql.Date;

public class Client {
	
	private String datetime;
	private String client_id;
	private String event_message;
	private String event_code;
	
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getEvent_message() {
		return event_message;
	}
	public void setEvent_message(String event_message) {
		this.event_message = event_message;
	}
	public String getEvent_code() {
		return event_code;
	}
	public void setEvent_code(String event_code) {
		this.event_code = event_code;
	}
	
	/*
	private Date datetime;
	private int client_id;
	private String event_message;
	private int event_code;
	 */
	
	
	

}
