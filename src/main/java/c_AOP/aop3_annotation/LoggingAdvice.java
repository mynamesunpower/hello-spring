package c_AOP.aop3_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {

    // @Around("execution(접근자 반환형 패키지.클래스.메소드 정규 표현식)")
    @Around("execution(public * c_AOP.aop3_annotation.*.*Hello(..))")
    public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Around 사전작업] : " + methodName);
        Object object = joinPoint.proceed();
        System.out.println("[Around 사후작업] : " + methodName);
        return object;
    }
    public void before(JoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[**************** 사전작업] : " + methodName);
    }
}

