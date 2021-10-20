package io.nifa.organization.dto;

import io.nifa.organization.repository.data.Organization;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class OrganizationDTO {
    private Long id;
    private String name;
    private String summary;
    private String description;
    private String imageUrl;
    private String countryCode;
    private LocalDate createdAt;
    private List<OrganizationUserDTO> users;

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

    public List<OrganizationUserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<OrganizationUserDTO> organizations) {
        this.users = organizations;
    }

    public static List<OrganizationDTO> fromOrganization(List<Organization> organization) {
        return organization.stream().map(OrganizationDTO::fromOrganization).collect(Collectors.toList());
    }

    public static OrganizationDTO fromOrganization(Organization organization) {
        OrganizationDTO dto = new OrganizationDTO();
        dto.setId(organization.getId());
        dto.setName(organization.getName());
        dto.setSummary(organization.getSummary());
        dto.setDescription(organization.getDescription());
        dto.setImageUrl(organization.getImageUrl());
        dto.setCountryCode(organization.getCountryCode());
        dto.setCreatedAt(organization.getCreatedAt());
        dto.setUsers(OrganizationUserDTO.fromUser(organization.getUsers()));
        return dto;
    }
}
