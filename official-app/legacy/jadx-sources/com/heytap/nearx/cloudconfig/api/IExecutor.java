package com.heytap.nearx.cloudconfig.api;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\bH&J\r\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/IExecutor;", "In", "Out", "", "cancel", "", "enqueue", "callback", "Lcom/heytap/nearx/cloudconfig/api/Callback;", "execute", "()Ljava/lang/Object;", "isExecuted", "", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface IExecutor<In, Out> {
    void cancel();

    void enqueue(@NotNull Callback<Out> callback);

    Out execute();

    boolean isExecuted();
}
