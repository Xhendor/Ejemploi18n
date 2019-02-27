package org.formacion.mvc;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Una clase @Configuration es un tipo especifico de @Component (y, por tanto se detacta por el component-scan)
 * Cuando Spring encuentra esta clase durante el component-scan, invocara todos sus métodos anotados
 * con @Bean y registrara su resultado en el application context
 */
@Configuration
public class ResoucesConfig  {

	/**
	 * El MessageSource que se crea en este metodo sera registrado en el application context y
	 * por tanto, estara disponible para el thymeleaf cuando necesite acceder a un mensaje externalizado
	 */
	@Bean
	public MessageSource messageSource() {
		
		/*
		 * Este messageSource recuperara los mensajes de:
		 *    /src/main/resources/i18n/principal_en.properties o
		 *    /src/main/resources/i18n/principal_es.properties 
		 * en funcion de si el cliente quiere el texto en ingles o castellano respectivamente
		 */
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("i18n/principal");
		messageSource.setDefaultEncoding("ISO-8859-1");
		return messageSource;
	}

}