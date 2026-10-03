package com.heytap.msp.sdk.base.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes19.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface Env {
    public static final int ENV_DEV = 3;
    public static final int ENV_PRE = 4;
    public static final int ENV_RELEASE = 0;
    public static final int ENV_TEST_1 = 1;
    public static final int ENV_TEST_3 = 2;
}
