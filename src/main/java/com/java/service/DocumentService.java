package com.java.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.gridfs.GridFSDBFile;

/**
 * @author mesut.saritas
 *
 */
@Service
public class DocumentService {

	protected static final Logger logger = LoggerFactory.getLogger(DocumentService.class);

	public static final String MONGO_ID = "_id";

	@Autowired
	private GridFsTemplate gridFsTemplate;

	public List<GridFSDBFile> getAll() {
		return gridFsTemplate.find(new Query());
	}

}
