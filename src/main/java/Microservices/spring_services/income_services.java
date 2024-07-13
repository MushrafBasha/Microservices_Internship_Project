package Microservices.spring_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service

public class income_services {
        @Autowired
        income_remote jpa;
        @Autowired
        Fieng fieng;

        public List<Income> get(){
            return jpa.findAll();
        }

        public Income create(Income data){
            return jpa.save(data);
        }

        public Income getID(String id){
            Income new_data= jpa.findById(id).orElse(new Income());
            if(new_data!=null){
                new_data.setItrReturns(fieng.get_itr(new_data.getItrNumber()));
            }
            return new_data;
        }

        public void delete(String id){
            jpa.deleteById(id);
        }


    }

