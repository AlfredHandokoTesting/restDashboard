package com.alfredha.services.Entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Content {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contentId;
	@Column
	private String contentTitle;
	@Column
	private String content;
	@Column
	private String contentTags;

	@Override
	public String toString() {
		return "content [ontentId=" + contentId + ", contentTitle=" + contentTitle + ", content=" + content
				+ ", contentTags=" + contentTags + "]";
	}
	
	public int getOntentId() {
		return contentId;
	}
	public void setOntentId(int ontentId) {
		this.contentId = ontentId;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContentTags() {
		return contentTags;
	}
	public void setContentTags(String contentTags) {
		this.contentTags = contentTags;
	}
}
