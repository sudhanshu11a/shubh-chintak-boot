/**
 * 
 */
package org.shubhchintak.persistence.repository;

import org.shubhchintak.persistence.entity.UploadFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sudhanshusharma
 *
 */
@Repository
public interface UploadFileRepository extends JpaRepository<UploadFile, Long> {

	UploadFile findByFileNameAndOrganizationId(String name, Long organizationId);
	
	UploadFile findByIdAndOrganizationId(Long id, Long organizationId);
	
	void deleteByIdAndOrganizationId(Long id, Long organizationId);
}
