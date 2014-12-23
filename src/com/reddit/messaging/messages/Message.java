package com.reddit.messaging.messages;

import java.util.Date;

public class Message {
	private String 			id;
	private final Message 	parent;
	private final boolean 	inbox;	//Whether the message is incoming or outgoing
	private String 			user;	//The username of the sender/recipient
	private Date 			date;
	private String 			text;

	/**
	 * @param id
	 * @param inbox Whether the message is incoming or outgoing
	 * @param user The username of the sender/recipient
	 * @param date
	 */
	public Message(String id, boolean inbox, String user, Date date) {
		this(id, null, inbox, user, date, null);
	}
	
	/**
	 * @param id
	 * @param parent
	 * @param inbox Whether the message is incoming or outgoing
	 * @param user The username of the sender/recipient
	 * @param date
	 */
	public Message(String id, Message parent, boolean inbox, String user, Date date) {
		this(id, parent, inbox, user, date, null);
	}
	
	/**
	 * @param id
	 * @param parent
	 * @param inbox Whether the message is incoming or outgoing
	 * @param user The username of the sender/recipient
	 * @param date
	 * @param text
	 */
	public Message(String id, Message parent, boolean inbox, String user, Date date, String text) {
		this.id = id;
		this.parent = parent;
		this.inbox = inbox;
		this.user = user;
		this.date = date;
		this.text = text;
	}

	/**
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return The username of the sender/recipient
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user The username of the sender/recipient
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return The date the message was sent
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return The message text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return The parent message
	 */
	public Message getParent() {
		return parent;
	}

	/**
	 * @return Whether the message is incoming or outgoing
	 */
	public boolean isInbox() {
		return inbox;
	}
}
