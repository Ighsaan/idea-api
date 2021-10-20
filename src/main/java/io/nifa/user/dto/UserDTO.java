package io.nifa.user.dto;

import io.nifa.user.repository.data.User;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class UserDTO {
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String imageUrl;
    private String countryCode;
    private LocalDate createdAt;
    private List<UserOrganizationDTO> organizations;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public List<UserOrganizationDTO> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<UserOrganizationDTO> organizations) {
        this.organizations = organizations;
    }

    public static List<UserDTO> fromUser(List<User> user) {
        return user.stream().map(UserDTO::fromUser).collect(Collectors.toList());
    }

    public static UserDTO fromUser(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setSurname(user.getSurname());
        dto.setCountryCode(user.getCountryCode());
        dto.setCreatedAt(user.getCreatedAt());
        dto.setDateOfBirth(user.getDateOfBirth());
        dto.setImageUrl(user.getImageUrl());
        user.getOrganizations().forEach(x -> x.setUsers(null));
        dto.setOrganizations(UserOrganizationDTO.fromOrganization(user.getOrganizations()));
        return dto;
    }
}
