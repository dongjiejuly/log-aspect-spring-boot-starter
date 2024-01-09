package com.yanzige.starter.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 在参数上或者方法上都生效
@Target({ElementType.PARAMETER, ElementType.METHOD})
// 在代码运行期间生效
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {

    // 日志标题
    String title() default "";

    OperationType type() default OperationType.OTHER;
}
