package com.yanzige.starter.aspectj;

import com.yanzige.starter.annotation.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {

    // 切面点 切面点是log这个注解
    @Pointcut("@annotation(log)")
    public void webLog(Log log) {
    }

    // 在执行方法之前执行
    @Before("webLog(log)")
    public void doBefore(JoinPoint joinPoint, Log log) {
        System.out.println("请求方法进入之前执行...before:" + log);
    }

    @AfterReturning(returning = "ret", pointcut = "webLog(log)")
    public void doAfterReturning(Object ret, Log log) {
        System.out.println("请求方法执行完成后执行...after:" + log);
    }
}
