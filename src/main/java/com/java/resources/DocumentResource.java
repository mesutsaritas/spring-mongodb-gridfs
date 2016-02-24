package com.java.resources;

import java.util.Map;
import org.joda.time.DateTime;
import org.springframework.hateoas.ResourceSupport;

/**
 * @author mesut.saritas
 *
 */
public class DocumentResource extends ResourceSupport {

	private String code;
	private String fileName;
	private String contentType;
	private long length;
	private String md5;
	private DateTime createdDate;
	private Map<String, String> metadata;

	public DocumentResource(String code, String fileName, String contentType, long length, String md5,
			DateTime createdDate, Map<String, String> metadata) {
		super();
		this.code = code;
		this.fileName = fileName;
		this.contentType = contentType;
		this.length = length;
		this.md5 = md5;
		this.createdDate = createdDate;
		this.metadata = metadata;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public DateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

}
