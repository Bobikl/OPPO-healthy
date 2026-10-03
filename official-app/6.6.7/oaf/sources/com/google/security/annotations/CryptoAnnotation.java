package com.google.security.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface CryptoAnnotation {

    public enum LeakSeverity {
        S0,
        S1,
        S2,
        S3,
        S4,
        NoRisk
    }

    public enum Purpose {
        ENCRYPTION,
        AUTHENTICATION,
        OBFUSCATION,
        INTEGRITY_CHECK,
        PASSWORD,
        OTHER
    }

    public enum RemovalPriority {
        P0,
        P1,
        P2,
        P3,
        P4,
        WillNotFix
    }

    int bugId() default 0;

    String description() default "";

    LeakSeverity leakSeverity();

    String owner();

    Purpose purpose();

    String removalDate() default "";

    RemovalPriority removalPriority();
}
