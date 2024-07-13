package Microservices.spring_services;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class enity_microservices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itrId;
    private int itrNumber;
    private int itrYear;
    private String itrFormType;
    private int  itrIncome;
    private int itrExpenses;
    private int itrTaxPayable;

}
