package com.oplus.aiunit.vision;

import com.oplus.web.container.safe.model.HostSecurityLevel;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ttg {
    HostSecurityLevel level() default HostSecurityLevel.NONE;
}
