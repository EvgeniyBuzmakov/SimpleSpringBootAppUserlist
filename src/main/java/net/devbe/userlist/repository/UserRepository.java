package net.devbe.userlist.repository;

import net.devbe.userlist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
