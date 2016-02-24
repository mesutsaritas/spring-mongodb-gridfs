package com.java.resources;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.java.controller.DocumentController;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSFile;

/**
 * @author mesut.saritas
 *
 */
public class DocumentResourceAssembler extends ResourceAssemblerSupport<GridFSFile, DocumentResource> {

	public DocumentResourceAssembler() {
		super(DocumentController.class, DocumentResource.class);
	}

	@Override
	public DocumentResource toResource(GridFSFile gridFSFile) {
		Map<String, String> metadata = new HashMap<>();
		if (gridFSFile.getMetaData() != null) {
			DBObject object = gridFSFile.getMetaData();
			for (String key : object.keySet()) {
				metadata.put(key, object.get(key).toString());
			}
		}
		return new DocumentResource(gridFSFile.getId().toString(), gridFSFile.getFilename(),
				gridFSFile.getContentType(), gridFSFile.getLength(), gridFSFile.getMD5(),
				new DateTime(gridFSFile.getUploadDate()), metadata);
	}
}
