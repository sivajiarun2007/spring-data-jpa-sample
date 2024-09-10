package com.spring_data_jpa.sample.spring_data_jpa_sample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* com.spring_data_jpa.sample.spring_data_jpa_sample.repo.StudentRepository.*(..))")
	public void doLogging(JoinPoint jp) {

		log.info("Method called: {}", jp.getSignature().getName());

	}

}
