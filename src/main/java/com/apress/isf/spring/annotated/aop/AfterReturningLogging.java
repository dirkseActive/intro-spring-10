package com.apress.isf.spring.annotated.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @since 3/31/2017
 *
 */
//@Component
@Aspect
public class AfterReturningLogging {
	private static final Logger log = LoggerFactory.getLogger(AfterReturningLogging.class);
			
	@AfterReturning(pointcut="execution(* com.apress.isf.java.service.SearchEngine.*(..))",
			returning="returnValue")
	public void log(JoinPoint joinPoint, Object returnValue){
		if(log.isDebugEnabled()){
			log.debug("@@@@(AFTER) Method called: " + joinPoint.getSignature());
			if(joinPoint.getArgs().length ==0 )
				log.debug("@@@@(AFTER) No arguments passed.");
			for(Object arg:joinPoint.getArgs())
				log.debug("@@@@(AFTER) Argument passed:" + arg);
			log.debug("@@@(AFTER) Result: " + returnValue);
		}
	}
}
