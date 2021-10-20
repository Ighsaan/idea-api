package io.nifa.user.dto;

import io.nifa.organization.repository.data.Organization;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserOrganizationDTO {
    private Long id;
    private String name;
    private String summary;
    private String description;
    private String imageUrl;
    private String countryCode;
    private LocalDate createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public static List<UserOrganizationDTO> fromOrganization(Set<Organization> organization) {
        return organization.stream().map(UserOrganizationDTO::fromOrganization).collect(Collectors.toList());
    }

    public static UserOrganizationDTO fromOrganization(Organization organization) {
        UserOrganizationDTO dto = new UserOrganizationDTO();
        dto.setId(organization.getId());
        dto.setName(organization.getName());
        dto.setSummary(organization.getSummary());
        dto.setDescription(organization.getDescription());
        dto.setImageUrl(organization.getImageUrl());
        dto.setCountryCode(organization.getCountryCode());
        dto.setCreatedAt(organization.getCreatedAt());
        return dto;
    }
}
