package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.resources.DocumentResource;
import com.java.resources.DocumentResourceAssembler;
import com.java.service.DocumentService;
import com.mongodb.gridfs.GridFSDBFile;

/**
 * @author mesut.saritas
 *
 */
@RestController
@RequestMapping(value = "/document")
public class DocumentController {
	private final DocumentResourceAssembler documentResourceAssembler;
	private final DocumentService documentService;

	@Autowired
	public DocumentController(DocumentService documentService) {
		this.documentResourceAssembler = new DocumentResourceAssembler();
		this.documentService = documentService;
	}

	@RequestMapping
	public ResponseEntity<List<DocumentResource>> list() {
		List<GridFSDBFile> files = documentService.getAll();
		return ResponseEntity.ok().body(documentResourceAssembler.toResources(files));
	}

}
