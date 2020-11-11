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
	@Column(length= 1500)
	private String content;
	@Column
	private String contentTags;

	@Override
	public String toString() {
		return "content [contentId=" + contentId + ", contentTitle=" + contentTitle + ", content=" + content
				+ ", contentTags=" + contentTags + "]";
	}
	
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
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
