package org.gavin.springboot1.swagger.repo;

import org.gavin.springboot1.swagger.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: huangjr
 * @DateTime: 2019/6/13 17:02
 * @Des:
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
