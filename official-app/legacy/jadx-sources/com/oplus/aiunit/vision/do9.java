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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\u000b\u001a\u00020\u0004H&J$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH&J\u001c\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0011\u001a\u00020\u0004H&J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bH&J\b\u0010\u0015\u001a\u00020\u0004H&J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH&J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0018\u001a\u00020\u0004H&J.\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cH&J \u0010#\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H&¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/do9;", "", "Landroid/os/Bundle;", "bundle", "", "f", "", "state", "", "message", "b", MapSchema.FIELD_NAME_ENTRY, "errorCode", EngineConstant.REASON, "ipAddress", "j", b2n.g, "a", MapSchema.FIELD_NAME_KEY, "networkTyp", "onQUICConnectChange", b2n.f, "i", "d", "c", "connectType", "Lcom/heytap/connect/api/IConnection;", "connection", "Lcom/heytap/connect/api/message/IMsgDispatcher;", "", "Lcom/heytap/connect/message/Message;", "dispatcher", "onConnected", "", "result", "onHeartBeatResult", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public interface do9 {
    void a();

    void b(int state, @Nullable String message);

    void c();

    void d(@Nullable String reason, @Nullable String ipAddress);

    void e();

    void f(@Nullable Bundle bundle);

    void g();

    void h(@Nullable String reason, @Nullable String ipAddress);

    void i(int errorCode, @Nullable String reason, @Nullable String ipAddress);

    void j(int errorCode, @Nullable String reason, @Nullable String ipAddress);

    void k(int state, @Nullable String message);

    void onConnected(int connectType, @NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher);

    void onHeartBeatResult(int connectType, @NotNull IConnection connection, boolean result);

    void onQUICConnectChange(@NotNull String networkTyp);
}
