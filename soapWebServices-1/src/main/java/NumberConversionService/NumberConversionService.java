package NumberConversionService;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.javatechie.spring.soap.api.NumberToWords.NumberToWords;
import com.javatechie.spring.soap.api.NumberToWords.NumberToWordsResponse;

@Service
public class NumberConversionService {

    
    private WebServiceTemplate numberWebServiceTemplate;
    
    
    @Autowired
    public NumberConversionService(WebServiceTemplate numberConversionService ) {
    	this.numberWebServiceTemplate = numberWebServiceTemplate;
    }

    public String convertNumberToWords(BigInteger number) {
        NumberToWords request = new NumberToWords();
        request.setUbiNum(number);
        NumberToWordsResponse response = (NumberToWordsResponse) numberWebServiceTemplate
        		.marshalSendAndReceive(request);
        return response.getNumberToWordsResult();
        
        
        
    }
}
