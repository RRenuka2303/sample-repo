package com.virtusa.sample;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SampRec implements Processor {

	
	public void process(Exchange exchange) throws Exception {
		System.out.println("the message is " + exchange.getIn().getBody() + "!!!!!");

	}

}
