/**
 * 
 */
package org.shubhchintak.service.converter;

import org.shubhchintak.common.dto.OrganizationDTO;
import org.shubhchintak.common.dto.UploadFileDTO;
import org.shubhchintak.persistence.entity.UploadFile;
import org.shubhchintak.service.converter.base.BaseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sudhanshusharma
 *
 */
@Component
public class UploadFileConverter implements BaseConverter<UploadFileDTO, UploadFile> {

	@Autowired
	private OrganizationConverter organizationConverter;

	@Override
	public UploadFileDTO convertToDTO(UploadFile entity) {
		UploadFileDTO uploadFileDTO = null;
		if (entity != null) {
			OrganizationDTO organizationDTO = organizationConverter.convertToDTO(entity.getOrganization());
			uploadFileDTO = new UploadFileDTO(entity.getId(), entity.getCreatedDate(), entity.getCreatedBy(),
					entity.getModifiedDate(), entity.getModifiedBy(), entity.getActive(), organizationDTO,
					entity.getFileName(), entity.getPath(), entity.getType());
		}
		return uploadFileDTO;
	}

	@Override
	public UploadFile convertToEntity(UploadFileDTO dto, Long organizationId) {
		UploadFile uploadFile = null;
		if (dto != null) {
			uploadFile = new UploadFile(dto.getId(), dto.getCreatedDate(), dto.getCreatedBy(), dto.getModifiedDate(),
					dto.getModifiedBy(), dto.getActive(), organizationId, dto.getFileName(), dto.getPath(),
					dto.getType());
		}
		return uploadFile;
	}

}
