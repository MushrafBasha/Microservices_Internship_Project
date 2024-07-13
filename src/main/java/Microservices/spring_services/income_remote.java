package Microservices.spring_services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface income_remote extends JpaRepository<Income,String>  {

    }

