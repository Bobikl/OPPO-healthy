package com.heytap.nearx.cloudconfig.api;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/QueryConverter;", "In", "Out", "", "convertQuery", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface QueryConverter<In, Out> {
    Out convertQuery(In value);
}
