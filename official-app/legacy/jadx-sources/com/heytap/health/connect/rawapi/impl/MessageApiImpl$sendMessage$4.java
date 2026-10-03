package com.heytap.health.connect.rawapi.impl;

import com.heytap.health.connect.rawapi.IHeytap;
import com.heytap.health.connect.rawapi.util.IResultExtKt;
import com.oplus.aiunit.vision.nxb;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "iHeytap", "Lcom/heytap/health/connect/rawapi/IHeytap;", "invoke", "(Lcom/heytap/health/connect/rawapi/IHeytap;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class MessageApiImpl$sendMessage$4 extends Lambda implements Function1<IHeytap, Boolean> {
    final /* synthetic */ MessageEvent $message;
    final /* synthetic */ nxb.c $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageApiImpl$sendMessage$4(MessageEvent messageEvent, nxb.c cVar) {
        super(1);
        this.$message = messageEvent;
        this.$result = cVar;
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull IHeytap iHeytap) {
        Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
        return Boolean.valueOf(iHeytap.sendMessageActiveDevice(this.$message, IResultExtKt.a(this.$result)));
    }
}
