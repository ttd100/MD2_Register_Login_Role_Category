package rikkei.academy.service.role;

import rikkei.academy.model.Role;
import rikkei.academy.model.RoleName;
import rikkei.academy.model.User;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();
    Role findByName(RoleName name);
}
