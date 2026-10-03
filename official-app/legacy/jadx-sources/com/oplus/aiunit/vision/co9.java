package com.oplus.aiunit.vision;

import com.heytap.speech.engine.protocol.event.Message;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H&R\u0014\u0010\u0010\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/co9;", "", "Lcom/oplus/aiunit/vision/ix3;", "connectConfig", "", "d", "b", "", "forceStart", MapSchema.FIELD_NAME_ENTRY, "close", "Lcom/heytap/speech/engine/protocol/event/Message;", "message", "c", "checkConnected", "a", "isConnected", "()Z", "isConnecting", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public interface co9 {
    void a(@NotNull Message message, boolean checkConnected);

    void b(@Nullable ix3 connectConfig);

    void c(@NotNull Message message);

    void close();

    void d(@Nullable ix3 connectConfig);

    void e(boolean forceStart);

    boolean isConnected();

    boolean isConnecting();
}
