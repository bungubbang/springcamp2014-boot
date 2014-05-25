package com.springcamp.boot.repository;

import com.springcamp.boot.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 5/11/14
 */
@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {
}
