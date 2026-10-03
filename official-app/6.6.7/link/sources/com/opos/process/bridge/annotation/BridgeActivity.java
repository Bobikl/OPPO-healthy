package com.opos.process.bridge.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface BridgeActivity {
    String[] activityActions() default {""};

    boolean makeInterface() default false;

    String[] packages() default {""};
}
