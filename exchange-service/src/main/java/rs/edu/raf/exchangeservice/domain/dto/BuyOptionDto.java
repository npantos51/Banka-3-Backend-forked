package rs.edu.raf.exchangeservice.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BuyOptionDto {

    private Long employeeId;    //mora da stigne
    private String contractSymbol;  //mora da stigne
    private Integer amount; //mora da stigne
    private boolean aon;
    private boolean margine;
    private Double limitValue;
    private Double stopValue;

    private String stockListing; //povezujemo ga sa Stock
    private String optionType; //calls ili puts

}
