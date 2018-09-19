/**
 * 
 */
package org.shubhchintak.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.shubhchintak.api.service.ProjectService;
import org.shubhchintak.common.dto.ProjectDTO;
import org.shubhchintak.common.exception.ApiException;
import org.shubhchintak.persistence.entity.Project;
import org.shubhchintak.persistence.repository.ProjectRepository;
import org.shubhchintak.service.converter.ProjectConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sudhanshusharma
 *
 */
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

	/** The Constant LOGGER. */
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private ProjectConverter projectConverter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shubhchintak.api.service.ProjectService#getAllProjects(long,
	 * long)
	 */
	@Override
	public List<ProjectDTO> getAllProjects(long organizationId) throws ApiException {
		List<ProjectDTO> projectDTOs = null;
		try {
			// get All projects from Repository
			 List<Project> projects = projectRepository.getAllProjects(organizationId);
			// Convert to PojectDTOs
			 projectDTOs = projectConverter.convertToDTOList(projects);
		} catch (Exception e) {
			logger.error("getAllProjects : ",e);
			throw new ApiException(e.getMessage(), e);
		}

		return projectDTOs;
	}

	@Override
	public void saveProject(ProjectDTO projectDTO) throws ApiException {
		Project project = null;
		try {
			//project entity converter 
			project = projectConverter.convertToEntity(projectDTO,0l);
			//save entity
			project = projectRepository.saveAndFlush(project);
		} catch (Exception e) {
			throw new ApiException(e.getMessage(), e);
		}
	}

}
