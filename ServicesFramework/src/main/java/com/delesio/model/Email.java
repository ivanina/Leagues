package com.delesio.model;

import java.io.Serializable;

public class Email extends AbstractPersistantObject implements Serializable{

	private String to;
	private String from;	
	private String subject;	
	private String text;	
	private String bcc;	
	private String cc;	
	private String replyTo;	
	private String failureMessage;
	private Integer code;
	private int attemptsToSend;
	private int priority;
	private boolean html;
		
	// constructor
	public Email() { 
		html = true;
	}
	
	/**
	 * Increment the amount of attempted sends
	 * 
	 */
	public synchronized void addAttempToSend() {
		attemptsToSend++;
	}
		
	// getters and setters
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getBcc() {
		return bcc;
	}
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getReplyTo() {
		return replyTo;
	}
	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}
	public int getAttemptsToSend() {
		return attemptsToSend;
	}
	public void setAttemptsToSend(int attemptsToSend) {
		this.attemptsToSend = attemptsToSend;
	}
	public String getFailureMessage() {
		return failureMessage;
	}
	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}
	public boolean isHtml() {
		return html;
	}
	public void setHtml(boolean html) {
		this.html = html;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + attemptsToSend;
		result = prime * result + ((bcc == null) ? 0 : bcc.hashCode());
		result = prime * result + ((cc == null) ? 0 : cc.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result
				+ ((failureMessage == null) ? 0 : failureMessage.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + (html ? 1231 : 1237);
		result = prime * result + priority;
		result = prime * result + ((replyTo == null) ? 0 : replyTo.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Email other = (Email) obj;
		if (attemptsToSend != other.attemptsToSend)
			return false;
		if (bcc == null) {
			if (other.bcc != null)
				return false;
		} else if (!bcc.equals(other.bcc))
			return false;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (failureMessage == null) {
			if (other.failureMessage != null)
				return false;
		} else if (!failureMessage.equals(other.failureMessage))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (html != other.html)
			return false;
		if (priority != other.priority)
			return false;
		if (replyTo == null) {
			if (other.replyTo != null)
				return false;
		} else if (!replyTo.equals(other.replyTo))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

	@Override
	public String toString() {
	    return (new StringBuilder())
		.append("Email [")
	    .append(super.toString())
	    .append("to=").append(this.to+", ")
	    .append("from=").append(this.from+", ")
	    .append("subject=").append(this.subject+", ")
	    .append("text=").append(this.text+", ")
	    .append("bcc=").append(this.bcc+", ")
	    .append("cc=").append(this.cc+", ")
	    .append("replyTo=").append(this.replyTo+", ")
	    .append("html=").append(this.html+", ")
	    .append("code=").append(this.code+", ")
	    .append("priority=").append(this.priority+", ")
	    .append("attemptsToSend=").append(this.attemptsToSend+", ")
	    .append("failureMessage=").append(this.failureMessage+", ")
	    .append("]").toString();
	}
		

	
	@Deprecated
	public void setLostPasswordBody(String username, String password)
	{
		StringBuffer lostbody = new StringBuffer();
		lostbody.append("Your username is: ");
		lostbody.append(username);
		lostbody.append("\nYour password is: ");
		lostbody.append(password);
		text = lostbody.toString();
	}
	@Deprecated
	public void setInviteBody(String leagueName, String name, String body)
	{
		StringBuffer link = new StringBuffer(body);
		link.append("\n<a href=\"http://www.makeyourpicks.info/leagues/league/RegisterPage?leagueName="+leagueName+"\">Join Pool</a>");
		link.append("\n\n\n"+"..."+name);
		
		body = link.toString();
	}

	@Override
	public IPersistable createTestObject()
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
