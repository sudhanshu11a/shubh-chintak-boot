/**
 * 
 */
package org.shubhchintak.api.service;

import org.shubhchintak.common.dto.UploadFileDTO;
import org.shubhchintak.common.exception.ApiException;
import org.shubhchintak.common.exception.ServiceException;

/**
 * @author sudhanshusharma
 *
 */
public interface UploadFileService {

	UploadFileDTO addUploadFile(UploadFileDTO uploadFileDTO, long organizationId) throws ServiceException;
	
	UploadFileDTO getUploadFile(long uploadFileId, long organizationId) throws ServiceException;
	
	UploadFileDTO updateUploadFile(UploadFileDTO uploadFileDTO, long organizationId) throws ServiceException;
	
	void deleteUploadFile(long uploadFileId, long organizationId) throws ServiceException;
}
