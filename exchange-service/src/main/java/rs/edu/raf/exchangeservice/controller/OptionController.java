package rs.edu.raf.exchangeservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.edu.raf.exchangeservice.domain.dto.BuyOptionDto;
import rs.edu.raf.exchangeservice.domain.dto.BuyStockDto;
import rs.edu.raf.exchangeservice.domain.dto.OptionOrderDto;
import rs.edu.raf.exchangeservice.domain.dto.StockOrderDto;
import rs.edu.raf.exchangeservice.domain.model.listing.Option;
import rs.edu.raf.exchangeservice.service.listingService.OptionService;
import rs.edu.raf.exchangeservice.service.orderService.OptionOrderService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/option")
public class OptionController {
    private final OptionService optionService;

    private final OptionOrderService optionOrderService;

    @GetMapping("/calls/{ticker}")
    @Operation(description = "vracamo sve calls vrednosti za odredjeni ticker")
    public ResponseEntity<List<Option>> getAllCalls(@PathVariable String ticker){
        return ResponseEntity.ok(optionService.findCalls(ticker));
    }

    @GetMapping("/puts/{ticker}")
    @Operation(description = "vracamo sve puts vrednosti za odredjeni ticker")
    public ResponseEntity<List<Option>> getAllPutss(@PathVariable String ticker){
        return ResponseEntity.ok(optionService.findPuts(ticker));
    }

    @GetMapping("/refresh")
    @Operation(description = "kada korisnik zatrazi refresh podataka")
    public ResponseEntity<List<Option>> getAllRefreshed() throws JsonProcessingException {
        return ResponseEntity.ok(this.optionService.findAllRefreshed());
    }

    @PostMapping("/buyOption")
    @Operation(description = "ruta koja se gadja prilikom kupovine Stocks")
    public ResponseEntity<OptionOrderDto> buyStock(@RequestBody BuyOptionDto buyOptionDto){
        return ResponseEntity.ok(optionOrderService.buyOption(buyOptionDto));
    }
}
