package rs.edu.raf.exchangeservice.service.myListingService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.edu.raf.exchangeservice.domain.model.listing.Option;
import rs.edu.raf.exchangeservice.domain.model.myListing.MyOption;
import rs.edu.raf.exchangeservice.domain.model.myListing.MyStock;
import rs.edu.raf.exchangeservice.repository.listingRepository.OptionRepository;
import rs.edu.raf.exchangeservice.repository.myListingRepository.MyOptionRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyOptionService {

    private final MyOptionRepository myOptionRepository;

    private final OptionRepository optionRepository;

    @Transactional
    public void addAmountToMyOptions(String contractSymbol, Integer amount, String ticker) {
        Option option = null;
        Optional<Option> optionalOption = optionRepository.findByContractSymbol(contractSymbol);
        if(!optionalOption.isEmpty()){
            option = optionalOption.get();
        }else{
            return;
        }
        MyOption myOption = new MyOption();
        myOption.setBoughtPrice(option.getPrice());
        myOption.setContractSymbol(option.getContractSymbol());
        myOption.setAmount(1);
        myOption.setTicker(ticker);
        this.myOptionRepository.save(myOption);
    }
}
