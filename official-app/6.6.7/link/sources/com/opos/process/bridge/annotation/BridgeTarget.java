package com.opos.process.bridge.annotation;

import com.opos.process.bridge.enums.BridgeType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface BridgeTarget {
    BridgeType bridgeType();

    boolean makeInterface() default false;

    String[] providerAuthorities() default {};

    String[] serviceActions() default {};

    Class<? extends IBridgeTargetIdentify> targetIdentify() default NullBridgeTargetIdentify.class;

    Class<?> targetProvider() default Object.class;
}
