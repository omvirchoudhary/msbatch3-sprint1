package com.sl.ms.sprint1.superleaguesprint1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.sl.ms.sprint1.superleaguesprint1.service.InventoryService;

@RestController
public class InventoryController {

	private final InventoryService inventoryService;
	public InventoryController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@PostMapping("/upload")
	public void upload(@RequestParam("file") MultipartFile file) throws Exception {
		inventoryService.upload(file);
	}
	
	@PostMapping("/import")
	public void mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws Exception {
		inventoryService.mapReapExcelDatatoDB(reapExcelDataFile);
	}
	
}
