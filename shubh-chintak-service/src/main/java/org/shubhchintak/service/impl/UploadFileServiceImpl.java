/**
 * 
 */
package org.shubhchintak.service.impl;

import javax.transaction.Transactional;

import org.shubhchintak.api.service.UploadFileService;
import org.shubhchintak.common.dto.UploadFileDTO;
import org.shubhchintak.common.exception.ServiceException;
import org.shubhchintak.persistence.entity.UploadFile;
import org.shubhchintak.persistence.repository.UploadFileRepository;
import org.shubhchintak.service.converter.UploadFileConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sudhanshusharma
 *
 */
@Service
@Transactional
public class UploadFileServiceImpl implements UploadFileService {

	@Autowired
	private UploadFileConverter uploadFileConverter;
	
	@Autowired
	private UploadFileRepository uploadFileRepository;

	@Override
	public UploadFileDTO addUploadFile(UploadFileDTO uploadFileDTO, long organizationId) throws ServiceException {
		UploadFileDTO newUploadFileDTO = null;
		UploadFile uploadFile = null;
		try {
			uploadFile = uploadFileConverter.convertToEntity(uploadFileDTO, organizationId);
			uploadFile = uploadFileRepository.saveAndFlush(uploadFile);
			newUploadFileDTO = uploadFileConverter.convertToDTO(uploadFile);
		}catch(Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return newUploadFileDTO;
	}

	@Override
	public UploadFileDTO getUploadFile(long uploadFileId, long organizationId) throws ServiceException {
		UploadFileDTO uploadFileDTO = null;
		UploadFile uploadFile = null;
		try {
			uploadFile = uploadFileRepository.findByIdAndOrganizationId(uploadFileId, organizationId);
			uploadFileDTO = uploadFileConverter.convertToDTO(uploadFile);
		}catch(Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return uploadFileDTO;
	}

	@Override
	public UploadFileDTO updateUploadFile(UploadFileDTO uploadFileDTO, long organizationId) throws ServiceException {
		UploadFileDTO newUploadFileDTO = null;
		UploadFile uploadFile = null;
		try {
			uploadFile = uploadFileConverter.convertToEntity(uploadFileDTO, organizationId);
			uploadFile = uploadFileRepository.saveAndFlush(uploadFile);
			newUploadFileDTO = uploadFileConverter.convertToDTO(uploadFile);
		}catch(Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return newUploadFileDTO;
	}

	@Override
	public void deleteUploadFile(long uploadFileId, long organizationId) throws ServiceException {
		try {
			uploadFileRepository.deleteByIdAndOrganizationId(uploadFileId,organizationId);
		}catch(Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

}
