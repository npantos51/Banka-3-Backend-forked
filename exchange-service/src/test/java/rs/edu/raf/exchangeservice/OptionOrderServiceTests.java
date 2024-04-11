package rs.edu.raf.exchangeservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import rs.edu.raf.exchangeservice.repository.listingRepository.OptionRepository;
import rs.edu.raf.exchangeservice.repository.myListingRepository.MyOptionRepository;
import rs.edu.raf.exchangeservice.repository.orderRepository.OptionOrderRepository;
import rs.edu.raf.exchangeservice.service.orderService.OptionOrderService;

@ExtendWith(MockitoExtension.class)
public class OptionOrderServiceTests {

    @Mock
    private OptionOrderRepository optionOrderRepository;
    @Mock
    private OptionRepository optionRepository;
    @Mock
    private MyOptionRepository myOptionRepository;

    @InjectMocks
    private OptionOrderService optionOrderService;

    @Test
    public void testBuyOption(){

    }
}
