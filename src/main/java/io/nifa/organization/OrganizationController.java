package io.nifa.organization;

import io.nifa.organization.dto.OrganizationDTO;
import io.nifa.organization.repository.OrganizationRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/organization")
public class OrganizationController {
    @Inject
    OrganizationRepository organizationRepository;

    @GET
    public List<OrganizationDTO> getUsers() {
        return OrganizationDTO.fromOrganization(organizationRepository.getAllOrganizations());
    }
}
