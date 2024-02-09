package com.example.CurrencyConvertorQA;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Service
public class RateTableService {

    private final RateTableRepository rateTableRepository;

    @Autowired
    public RateTableService(RateTableRepository rateTableRepository) {
        this.rateTableRepository = rateTableRepository;
    }

    public void saveRateTable(String fromString,
                              String StringRates) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
Map<String,Double> FromRate=objectMapper.readValue(StringRates, new TypeReference<Map<String, Double>>() {
});
        FromRate.forEach((toString,rate) ->{


            RateTable rateTable = new RateTable();
            rateTable.setFromString(fromString);
            rateTable.setToString(toString);
            rateTable.setRate(rate);
            rateTableRepository.save(rateTable);
        });

    }
    public RateTable FindByRateTable(String From ,String to){
        RateTable R=  rateTableRepository.findByFromStringAndToString(From,to);
        if( R !=null)
            return  R;
        else
            return new RateTable(0L,"","",1.0);
    }


}

