package com.heytap.connect.api.request;

import java.util.Arrays;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/connect/api/request/Method;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", "connect_release"}, k = 1, mv = {1, 5, 1})
public enum Method {
    GET,
    POST;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Method[] valuesCustom() {
        Method[] methodArrValuesCustom = values();
        return (Method[]) Arrays.copyOf(methodArrValuesCustom, methodArrValuesCustom.length);
    }
}
