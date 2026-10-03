package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.connect.api.IConnection;
import com.heytap.speech.engine.constant.EngineConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/wx3;", "Lcom/oplus/aiunit/vision/do9;", "Landroid/os/Bundle;", "bundle", "", "f", "", "state", "", "message", "b", MapSchema.FIELD_NAME_ENTRY, "errorCode", EngineConstant.REASON, "ipAddress", "j", b2n.g, "a", MapSchema.FIELD_NAME_KEY, "networkTyp", "onQUICConnectChange", b2n.f, "i", "d", "c", "connectType", "Lcom/heytap/connect/api/IConnection;", "connection", "", "result", "onHeartBeatResult", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public class wx3 implements do9 {
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
    }

    @Override // com.oplus.aiunit.vision.do9
    public void f(@Nullable Bundle bundle) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void g() {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void h(@Nullable String reason, @Nullable String ipAddress) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void i(int errorCode, @Nullable String reason, @Nullable String ipAddress) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void j(int errorCode, @Nullable String reason, @Nullable String ipAddress) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void k(int state, @Nullable String message) {
    }

    @Override // com.oplus.aiunit.vision.do9
    public void onHeartBeatResult(int connectType, @NotNull IConnection connection, boolean result) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    @Override // com.oplus.aiunit.vision.do9
    public void onQUICConnectChange(@NotNull String networkTyp) {
        Intrinsics.checkNotNullParameter(networkTyp, "networkTyp");
    }
}
