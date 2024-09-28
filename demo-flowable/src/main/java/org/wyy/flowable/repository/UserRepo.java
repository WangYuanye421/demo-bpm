package org.wyy.flowable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wyy.flowable.User;

/**
 * @author yuanyewang515@gmail.com
 * @since v1.0
 **/
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findById(long id);

    User findByName(String name);


}
