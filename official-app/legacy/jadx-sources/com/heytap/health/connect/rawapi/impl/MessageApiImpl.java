package com.heytap.health.connect.rawapi.impl;

import com.heytap.health.connect.rawapi.IHeytap;
import com.heytap.health.connect.rawapi.util.IResultExtKt;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.nxb;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/MessageApiImpl;", "Lcom/oplus/aiunit/vision/nxb;", "Lcom/oplus/aiunit/vision/nxb$b;", "listener", "", MapSchema.FIELD_NAME_ENTRY, "", SpeechConstant.KEY_EVENT_SID, "cid", "a", "d", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "message", "", "b", "", "mac", "Lcom/oplus/aiunit/vision/nxb$c;", "result", "c", "Lcom/heytap/health/connect/rawapi/impl/b;", "Lcom/heytap/health/connect/rawapi/impl/b;", "getLCbManager", "()Lcom/heytap/health/connect/rawapi/impl/b;", "lCbManager", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class MessageApiImpl implements nxb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final b lCbManager = b.INSTANCE.a();

    @Override // com.oplus.aiunit.vision.nxb
    public void a(int sid, int cid, @NotNull nxb.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.e0(sid, cid, listener);
    }

    @Override // com.oplus.aiunit.vision.nxb
    public boolean b(@NotNull final MessageEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return ((Boolean) this.lCbManager.j("sendMessage2", Boolean.FALSE, new Function1<IHeytap, Boolean>() { // from class: com.heytap.health.connect.rawapi.impl.MessageApiImpl$sendMessage$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return Boolean.valueOf(iHeytap.sendMessageActiveDevice(message, null));
            }
        })).booleanValue();
    }

    @Override // com.oplus.aiunit.vision.nxb
    public boolean c(@NotNull final String mac, @NotNull final MessageEvent message, @Nullable final nxb.c result) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, "message");
        return ((Boolean) this.lCbManager.j("sendMessage3", Boolean.FALSE, new Function1<IHeytap, Boolean>() { // from class: com.heytap.health.connect.rawapi.impl.MessageApiImpl$sendMessage$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return Boolean.valueOf(iHeytap.sendMessage(mac, message, IResultExtKt.a(result)));
            }
        })).booleanValue();
    }

    @Override // com.oplus.aiunit.vision.nxb
    public void d(int sid, int cid, @NotNull nxb.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.g0(sid, cid, listener);
    }

    @Override // com.oplus.aiunit.vision.nxb
    public void e(@NotNull nxb.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.e0(-1, -1, listener);
    }
}
