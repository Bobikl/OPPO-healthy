package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.connect.api.IConnection;
import com.heytap.connect.api.message.IMsgDispatcher;
import com.heytap.connect.message.Message;
import com.heytap.speech.engine.constant.EngineConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\b\u0016\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040&\u0012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010)¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J.\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u001e\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J$\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010#\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010%\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u001c\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/w5i;", "Lcom/oplus/aiunit/vision/do9;", "Landroid/os/Bundle;", "bundle", "", "f", "", "connectType", "Lcom/heytap/connect/api/IConnection;", "connection", "Lcom/heytap/connect/api/message/IMsgDispatcher;", "", "Lcom/heytap/connect/message/Message;", "dispatcher", "onConnected", "", "result", "onHeartBeatResult", "", "networkTyp", "onQUICConnectChange", "c", "errorCode", EngineConstant.REASON, "ipAddress", "i", b2n.f, "state", "message", MapSchema.FIELD_NAME_KEY, "d", "a", "j", MapSchema.FIELD_NAME_ENTRY, "b", b2n.g, "Ljava/lang/String;", "tag", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onTCPConnectedCallback", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "onTcpResultCallback", "onTCPConnected", "onTcpResult", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class w5i implements do9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Function0<Unit> onTCPConnectedCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Boolean, Unit> onTcpResultCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public w5i(@NotNull Function0<Unit> onTCPConnected, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(onTCPConnected, "onTCPConnected");
        this.tag = "VAM_ConnectListener";
        this.onTCPConnectedCallback = onTCPConnected;
        this.onTcpResultCallback = function1;
    }

    @Override // com.oplus.aiunit.vision.do9
    public void a() {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void b(int state, @Nullable String message) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void c() {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void d(@Nullable String reason, @Nullable String ipAddress) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void e() {
        a7b.f(this.tag, "onTCPConnected");
        Function0<Unit> function0 = this.onTCPConnectedCallback;
        if (function0 != null) {
            function0.invoke();
        }
        Function1<Boolean, Unit> function1 = this.onTcpResultCallback;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    @Override // com.oplus.aiunit.vision.do9
    public void f(@Nullable Bundle bundle) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void g() {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void h(@Nullable String reason, @Nullable String ipAddress) {
        a7b.m(this.tag, "onTCPDisconnected " + reason + " " + ipAddress);
    }

    @Override // com.oplus.aiunit.vision.do9
    public void i(int errorCode, @Nullable String reason, @Nullable String ipAddress) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void j(int errorCode, @Nullable String reason, @Nullable String ipAddress) {
        a7b.b(this.tag, "ConnectListener onTCPConnectFailed " + errorCode + ", " + reason + " " + ipAddress);
        Function1<Boolean, Unit> function1 = this.onTcpResultCallback;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // com.oplus.aiunit.vision.do9
    public void k(int state, @Nullable String message) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void onConnected(int connectType, @NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        a7b.f(this.tag, "ConnectListener onConnected.");
    }

    @Override // com.oplus.aiunit.vision.do9
    public void onHeartBeatResult(int connectType, @NotNull IConnection connection, boolean result) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        a7b.f(this.tag, "ConnectListener onHeartBeatResult " + connectType + ", " + connection);
    }

    @Override // com.oplus.aiunit.vision.do9
    public void onQUICConnectChange(@NotNull String networkTyp) {
        Intrinsics.checkNotNullParameter(networkTyp, "networkTyp");
    }
}
