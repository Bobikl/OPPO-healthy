package com.google.errorprone.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
public @interface InlineMe {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
