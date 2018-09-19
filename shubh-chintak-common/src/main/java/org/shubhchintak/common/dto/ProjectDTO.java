/**
 * 
 */
package org.shubhchintak.common.dto;

import java.util.Date;

/**
 * @author sudhanshusharma
 *
 */
public class ProjectDTO extends BaseDTO {

	private String name;

	private String description;

	private String heading;

	private String displayDetails;

	private Date startDate;

	private Date endDate;

	private UploadFileDTO logoImage;

	private UploadFileDTO bannerImage;

	/**
	 * 
	 * @param id
	 * @param createdDate
	 * @param createdBy
	 * @param modifiedDate
	 * @param modifiedBy
	 * @param active
	 * @param name
	 * @param description
	 * @param heading
	 * @param displayDetails
	 * @param startDate
	 * @param endDate
	 * @param logoImage
	 * @param bannerImage
	 */
	public ProjectDTO(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, Boolean active,
			String name, String description, String heading, String displayDetails, Date startDate, Date endDate,
			UploadFileDTO logoImage, UploadFileDTO bannerImage) {
		super(id, createdDate, createdBy, modifiedDate, modifiedBy, active);
		this.name = name;
		this.description = description;
		this.heading = heading;
		this.displayDetails = displayDetails;
		this.startDate = startDate;
		this.endDate = endDate;
		this.logoImage = logoImage;
		this.bannerImage = bannerImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDisplayDetails() {
		return displayDetails;
	}

	public void setDisplayDetails(String displayDetails) {
		this.displayDetails = displayDetails;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public UploadFileDTO getLogoImage() {
		return logoImage;
	}

	public void setLogoImage(UploadFileDTO logoImage) {
		this.logoImage = logoImage;
	}

	public UploadFileDTO getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(UploadFileDTO bannerImage) {
		this.bannerImage = bannerImage;
	}

}
