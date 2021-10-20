package io.nifa.organization.repository;

import io.nifa.organization.repository.data.Organization;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class OrganizationRepository implements PanacheRepository<Organization> {
    public List<Organization> getAllOrganizations() {
        return listAll();
    }
}
