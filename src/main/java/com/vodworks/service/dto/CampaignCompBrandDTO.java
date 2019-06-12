package com.vodworks.service.dto;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.vodworks.domain.CampaignCompBrand} entity.
 */
public class CampaignCompBrandDTO implements Serializable {

    private Long id;

    @NotNull
    private String compBrandName;

    @NotNull
    private String imageFileUrl;


    private Long campaignId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompBrandName() {
        return compBrandName;
    }

    public void setCompBrandName(String compBrandName) {
        this.compBrandName = compBrandName;
    }

    public String getImageFileUrl() {
        return imageFileUrl;
    }

    public void setImageFileUrl(String imageFileUrl) {
        this.imageFileUrl = imageFileUrl;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CampaignCompBrandDTO campaignCompBrandDTO = (CampaignCompBrandDTO) o;
        if (campaignCompBrandDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), campaignCompBrandDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CampaignCompBrandDTO{" +
            "id=" + getId() +
            ", compBrandName='" + getCompBrandName() + "'" +
            ", imageFileUrl='" + getImageFileUrl() + "'" +
            ", campaign=" + getCampaignId() +
            "}";
    }
}
