/**
 * 
 */
package org.shubhchintak.service.converter.base;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sudhanshusharma
 *
 */
public interface BaseConverter<DTO, E> {

	DTO convertToDTO(E entity);

	E convertToEntity(DTO dto, Long oganizationId);

	default List<DTO> convertToDTOList(List<E> entities) {
		return entities.stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	default List<E> convertToEntityList(List<DTO> dtos, Long organizationId) {
		//dtos.stream().map(this::convertToEntity).collect(Collectors.toList());
		return dtos.stream().map(x->convertToEntity(x,organizationId)).collect(Collectors.toList());
	}
}
