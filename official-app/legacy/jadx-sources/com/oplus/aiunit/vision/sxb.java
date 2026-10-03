package com.oplus.aiunit.vision;

import com.heytap.health.connect.rawapi.call.CallException;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/sxb;", "", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "Lcom/heytap/health/connect/rawapi/call/CallException;", "throwable", "b", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public interface sxb {
    void a(@NotNull String mac, @NotNull MessageEvent response);

    void b(@NotNull CallException throwable);
}
