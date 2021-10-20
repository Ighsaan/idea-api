package io.nifa.user.repository;

import io.nifa.user.repository.data.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
    public List<User> getAllUsers() {
        return listAll();
    }
}
