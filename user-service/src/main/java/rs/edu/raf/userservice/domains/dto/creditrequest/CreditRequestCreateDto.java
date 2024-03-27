package rs.edu.raf.userservice.domains.dto.creditrequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rs.edu.raf.userservice.domains.model.enums.CreditRequestStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditRequestCreateDto {

    private Long id;
    private Long userId;
    private String name;
    private Long accountNumber;
    private Double amount;
    private String applianceReason;
    private Double monthlyPaycheck;
    private Boolean employed;
    private Long dateOfEmployment;
    private int paymentPeriod;
    private String currencyMark;
}