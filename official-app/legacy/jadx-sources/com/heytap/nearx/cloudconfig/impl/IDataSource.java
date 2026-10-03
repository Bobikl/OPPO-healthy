package com.heytap.nearx.cloudconfig.impl;

import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/nearx/cloudconfig/impl/IDataSource;", "ResultT", "", "fireResult", "ReturnT", "isAsync", "", "entityType", "Ljava/lang/reflect/Type;", "args", "", "adapter", "Lcom/heytap/nearx/cloudconfig/impl/IDataWrapper;", "(ZLjava/lang/reflect/Type;[Ljava/lang/Object;Lcom/heytap/nearx/cloudconfig/impl/IDataWrapper;)Ljava/lang/Object;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface IDataSource<ResultT> {
    @Nullable
    <ReturnT> ReturnT fireResult(boolean isAsync, @NotNull Type entityType, @NotNull Object[] args, @NotNull IDataWrapper adapter);
}
