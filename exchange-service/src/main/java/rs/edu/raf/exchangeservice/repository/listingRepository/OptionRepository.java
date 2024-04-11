package rs.edu.raf.exchangeservice.repository.listingRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.edu.raf.exchangeservice.domain.model.listing.Option;

import java.util.List;
import java.util.Optional;

public interface OptionRepository extends JpaRepository<Option, Long> {

    Optional<Option> findByContractSymbol(String contractSymbol);
    List<Option> findByStockListingAndOptionType(String stockListing, String optionType);
}
