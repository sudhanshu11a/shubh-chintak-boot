/**
 * 
 */
package org.shubhchintak.web;

import java.util.List;

import org.shubhchintak.api.service.UploadFileService;
import org.shubhchintak.common.dto.UploadFileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sudhanshusharma
 *
 */
@RestController
@RequestMapping("api/v1/upload-file")
public class UploadFileRestController {
	
	@Autowired
	private UploadFileService uploadFileService;
	
	private Long organizationId = 1l;
	
	@GetMapping("/{uploadFileId}")
	public UploadFileDTO getUploadFile(@PathVariable Long uploadFileId){
		UploadFileDTO uploadFileDTO = uploadFileService.getUploadFile(uploadFileId, organizationId);
		return uploadFileDTO;
		
	}
	
	@PostMapping("/add-upload-file")
	public UploadFileDTO addUploadFile(UploadFileDTO uploadFileDTO) {
		uploadFileDTO = uploadFileService.addUploadFile(uploadFileDTO, organizationId);
		return uploadFileDTO;
	}
	
}
