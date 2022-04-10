package com.needle.repo;

import com.needle.model.Netflix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Netflix_Repo extends JpaRepository<Netflix,String>  {
}
