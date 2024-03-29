package com.vodworks.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vodworks.domain.Campaign;
import com.vodworks.domain.CampaignCompBrand;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link com.vodworks.domain.Campaign} entity.
 */
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class CampaignDTO implements Serializable {

    private Long id;

    private String uuid;

    @NotNull
    private String category;

    @NotNull
    private String activity;

    @NotNull
    private String projectName;

    @NotNull
    private String projectDetails;

    @NotNull
    private String brandFirstTrait;

    @NotNull
    private String brandSecondTrait;

    @NotNull
    private String brandThirdTrait;

    @NotNull
    private String brandGoals;

    @NotNull
    private String sample;

    @NotNull
    private String instagramAudienceDescription;

    private CampaignCompBrand brand;

    private List<CampaignCompBrandDTO> competitorLogos;
    private List<CampaignSocialComponentDTO> creativeImages;
    private List<CampaignSocialComponentDTO> instagramPhotos;

    public CampaignDTO() {
        this.creativeImages = new ArrayList<>();
        this.competitorLogos = new ArrayList<>();
        this.instagramPhotos = new ArrayList<>();
    }

    public CampaignDTO(Campaign campaign) {

        this.uuid = campaign.getUuid();
        this.sample = campaign.getSample();
        this.category = campaign.getCategory();
        this.activity = campaign.getActivity();
        this.brandGoals = campaign.getBrandGoals();
        this.projectName = campaign.getProjectName();
        this.projectDetails = campaign.getProjectDetails();
        this.brandThirdTrait = campaign.getBrandThirdTrait();
        this.brandFirstTrait = campaign.getBrandFirstTrait();
        this.brandSecondTrait = campaign.getBrandSecondTrait();
        this.instagramAudienceDescription = campaign.getInstagramAudienceDescription();

        this.creativeImages = new ArrayList<>();
        this.competitorLogos = new ArrayList<>();
        this.instagramPhotos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public String getBrandFirstTrait() {
        return brandFirstTrait;
    }

    public void setBrandFirstTrait(String brandFirstTrait) {
        this.brandFirstTrait = brandFirstTrait;
    }

    public String getBrandSecondTrait() {
        return brandSecondTrait;
    }

    public void setBrandSecondTrait(String brandSecondTrait) {
        this.brandSecondTrait = brandSecondTrait;
    }

    public String getBrandThirdTrait() {
        return brandThirdTrait;
    }

    public void setBrandThirdTrait(String brandThirdTrait) {
        this.brandThirdTrait = brandThirdTrait;
    }

    public String getBrandGoals() {
        return brandGoals;
    }

    public void setBrandGoals(String brandGoals) {
        this.brandGoals = brandGoals;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getInstagramAudienceDescription() {
        return instagramAudienceDescription;
    }

    public void setInstagramAudienceDescription(String instagramAudienceDescription) {
        this.instagramAudienceDescription = instagramAudienceDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CampaignDTO campaignDTO = (CampaignDTO) o;
        if (campaignDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), campaignDTO.getId());
    }

    public CampaignCompBrand getBrand() {
        return brand;
    }

    public void setBrand(CampaignCompBrand brand) {
        this.brand = brand;
    }

    public List<CampaignCompBrandDTO> getCompetitorLogos() {
        return competitorLogos;
    }

    public void setCompetitorLogos(List<CampaignCompBrandDTO> competitorLogos) {
        this.competitorLogos = competitorLogos;
    }

    public List<CampaignSocialComponentDTO> getCreativeImages() {
        return creativeImages;
    }

    public void setCreativeImages(List<CampaignSocialComponentDTO> creativeImages) {
        this.creativeImages = creativeImages;
    }

    public List<CampaignSocialComponentDTO> getInstagramPhotos() {
        return instagramPhotos;
    }

    public void setInstagramPhotos(List<CampaignSocialComponentDTO> instagramPhotos) {
        this.instagramPhotos = instagramPhotos;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CampaignDTO{" +
            "id=" + getId() +
            ", uuid='" + getUuid() + "'" +
            ", category='" + getCategory() + "'" +
            ", activity='" + getActivity() + "'" +
            ", projectName='" + getProjectName() + "'" +
            ", projectDetails='" + getProjectDetails() + "'" +
            ", brandFirstTrait='" + getBrandFirstTrait() + "'" +
            ", brandSecondTrait='" + getBrandSecondTrait() + "'" +
            ", brandThirdTrait='" + getBrandThirdTrait() + "'" +
            ", brandGoals='" + getBrandGoals() + "'" +
            ", sample='" + getSample() + "'" +
            ", instagramAudienceDescription='" + getInstagramAudienceDescription() + "'" +
            "}";
    }
}
