package rs.edu.raf.exchangeservice.repository.myListingRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.edu.raf.exchangeservice.domain.model.myListing.MyOption;


public interface MyOptionRepository extends JpaRepository<MyOption, Long> {

    MyOption findByContractSymbol(String contractSymbol);
}