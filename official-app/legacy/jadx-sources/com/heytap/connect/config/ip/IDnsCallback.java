package com.heytap.connect.config.ip;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/connect/config/ip/IDnsCallback;", "", "Lkotlin/Function0;", "", "action", "registerOnIpReady", "(Lkotlin/jvm/functions/Function0;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IDnsCallback {
    void registerOnIpReady(@NotNull Function0<Unit> action);
}
