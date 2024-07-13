package Microservices.spring_services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")

public class income_rest {
        @Autowired
        income_services services;

        @GetMapping("/get")
        public List<Income> read() {
            return services.get();
        }

        @GetMapping("/getCustomer/{id}")
        public Income readID(@PathVariable("id") String id){
            return services.getID(id);
        }

        @PostMapping("/post")
        public Income post(@RequestBody Income data){
            return services.create(data);
        }

        @PutMapping("/put")
        public Income update(@RequestBody Income data){
            return services.create(data);
        }

        @DeleteMapping("/delete/{id}")
        public String delete(@PathVariable("/delete") String id){
            services.delete(id);
            return "The ID " +id+" is deleted";
        }

    }








