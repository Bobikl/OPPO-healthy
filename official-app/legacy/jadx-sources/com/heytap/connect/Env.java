package com.heytap.connect;

import java.util.Arrays;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/connect/Env;", "", "<init>", "(Ljava/lang/String;I)V", "RELEASE", "TEST", "DEV", "connect_release"}, k = 1, mv = {1, 5, 1})
public enum Env {
    RELEASE,
    TEST,
    DEV;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Env[] valuesCustom() {
        Env[] envArrValuesCustom = values();
        return (Env[]) Arrays.copyOf(envArrValuesCustom, envArrValuesCustom.length);
    }
}
