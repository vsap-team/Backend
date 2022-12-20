package com.excel.repo;

import org.springframework.data.jpa.repository.*;
import com.excel.entity.Students;

public interface StudentRepo extends JpaRepository<Students,Integer>{
}
