package Microservices.spring_services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "Open-fieng" ,url = "http://localhost:2025/ItrReturns")
public interface Fieng {

        @GetMapping("/getItr/{id}")
        public List<enity_microservices> get_itr(@PathVariable("id") int id);
    }

