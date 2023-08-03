package com.javatechie.spring.soap.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class NumberConversionConfig {

	
    @Bean
    public WebServiceTemplate numberWebServiceTemplate() {
        WebServiceTemplate template = new WebServiceTemplate();
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.javatechie.spring.soap.api.NumberToWords");
        template.setMarshaller(marshaller);
        template.setUnmarshaller(marshaller);
        template.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        return template;
    }
}
