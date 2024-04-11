package rs.edu.raf.exchangeservice.domain.model.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rs.edu.raf.exchangeservice.domain.model.enums.StockOrderType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optionOrderId;
    private Long employeeId;
    private String contractSymbol;
    private String status;  //PROCESSING, WAITING, FAILED, FINISHED
    private String stockListing; //povezujemo ga sa Stock
    private String optionType; //calls ili puts

    private Double limitValue;
    private Double stopValue;
    private int amount;
    private int amountLeft;
    private boolean aon;
    private boolean margine;
}
