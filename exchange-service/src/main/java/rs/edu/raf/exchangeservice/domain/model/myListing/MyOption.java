package rs.edu.raf.exchangeservice.domain.model.myListing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyOption implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long myOptionId;
    private String contractSymbol;
    private Integer amount;
    @Version
    private Integer version;
}
