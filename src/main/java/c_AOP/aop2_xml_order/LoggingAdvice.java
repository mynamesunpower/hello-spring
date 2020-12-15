package c_AOP.aop2_xml_order;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {

    public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Around 사전작업] : " + methodName);
        Object object = joinPoint.proceed();
        System.out.println("[Around 사후작업] : " + methodName);
        return object;
    }

}

