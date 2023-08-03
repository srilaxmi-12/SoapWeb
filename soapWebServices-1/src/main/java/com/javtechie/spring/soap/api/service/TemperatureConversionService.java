package com.javtechie.spring.soap.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import com.javatechie.spring.soap.api.CelsuisToFahreinheit.CelsiusToFahrenheit;
import com.javatechie.spring.soap.api.CelsuisToFahreinheit.CelsiusToFahrenheitResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class TemperatureConversionService {
	
	
	 private static final Logger logger = LoggerFactory.getLogger(TemperatureConversionService.class);

    @Autowired
    private WebServiceTemplate temperatureWebServiceTemplate;

    public String convertCelsiusToFahrenheit(String celsius) {
    	
            CelsiusToFahrenheit request = new CelsiusToFahrenheit();
            request.setCelsius(celsius);

            CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) temperatureWebServiceTemplate
                    .marshalSendAndReceive("https://www.w3schools.com/xml/tempconvert.asmx",
                            request,
                            new SoapActionCallback("https://www.w3schools.com/xml/CelsuisToFahreinheit"));

            String result = response.getCelsiusToFahrenheitResult();
            logger.info("SOAP Response: {}", result);
            
            return result;
        }
     }
 
 



    
    
