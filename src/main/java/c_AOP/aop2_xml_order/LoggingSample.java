package c_AOP.aop2_xml_order;

import org.aspectj.lang.JoinPoint;

public class LoggingSample {
    public void before(JoinPoint joinpoint) throws Throwable{
        String methodName = joinpoint.getSignature().getName();
        System.out.println("[Before 사전작업] : " + methodName);
    }

    public void after(JoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[After 사후작업] : " + methodName);
    }
}
