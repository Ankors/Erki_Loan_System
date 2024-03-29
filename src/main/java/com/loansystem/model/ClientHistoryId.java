package com.loansystem.model;

// default package
// Generated Nov 13, 2011 9:49:21 PM by Hibernate Tools 3.4.0.CR1

/**
 * ClientHistoryId generated by hbm2java
 */
public class ClientHistoryId implements java.io.Serializable {

	private String date;
	private String comment;
	private String statusId;
	private int clientId;

	public ClientHistoryId() {
	}

	public ClientHistoryId(String date, String comment, String statusId, int clientId) {
		this.date = date;
		this.comment = comment;
		this.statusId = statusId;
		this.clientId = clientId;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClientHistoryId))
			return false;
		ClientHistoryId castOther = (ClientHistoryId) other;

		return ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null && this
				.getDate().equals(castOther.getDate())))
				&& ((this.getComment() == castOther.getComment()) || (this.getComment() != null
						&& castOther.getComment() != null && this.getComment().equals(castOther.getComment())))
				&& ((this.getStatusId() == castOther.getStatusId()) || (this.getStatusId() != null
						&& castOther.getStatusId() != null && this.getStatusId().equals(castOther.getStatusId())))
				&& (this.getClientId() == castOther.getClientId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getComment() == null ? 0 : this.getComment().hashCode());
		result = 37 * result + (getStatusId() == null ? 0 : this.getStatusId().hashCode());
		result = 37 * result + this.getClientId();
		return result;
	}

}
