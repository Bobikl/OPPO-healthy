package com.oplus.aiunit.vision;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface jla {
    public static final String DEFAULT_BUILD_METHOD = "build";
    public static final String DEFAULT_WITH_PREFIX = "with";

    public static class a {
        public final String a;
        public final String b;

        public a(jla jlaVar) {
            this(jlaVar.buildMethodName(), jlaVar.withPrefix());
        }

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
