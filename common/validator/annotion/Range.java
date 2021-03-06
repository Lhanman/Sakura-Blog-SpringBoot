package com.Lhan.personal_blog.common.validator.annotion;

import com.Lhan.personal_blog.common.validator.Message;
import com.Lhan.personal_blog.common.validator.constraint.RangeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * 数字范围限制
 */

@Target({TYPE, ANNOTATION_TYPE,FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {RangeValidator.class})
public @interface Range {
    long min() default 0;

    long max() default Long.MAX_VALUE;

    String message() default Message.CK_RANGE_DEFAULT;

    String value() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
