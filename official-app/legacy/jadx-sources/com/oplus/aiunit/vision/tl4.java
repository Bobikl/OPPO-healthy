package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J(\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J(\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J \u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H&J$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&J,\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/tl4;", "", "Lcom/oplus/aiunit/vision/ra5;", "role", "Lcom/oplus/aiunit/vision/tl4$a;", "listener", "", "r", "", SpeechConstant.KEY_EVENT_SID, "cid", "", "arouterPath", LogFieldKey.PROCESS_NAME_KEY, "i", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "s", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "message", "", MapSchema.FIELD_NAME_KEY, "mac", "o", "Lcom/oplus/aiunit/vision/rl4$c;", "result", "j", b2n.f, "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface tl4 {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/tl4$a;", "", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void onMessageReceived(@NotNull ra5.c role, @NotNull String mac, @NotNull MessageEvent event);
    }

    boolean g(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent message, @Nullable rl4.c result);

    void i(@NotNull ra5 role, int sid, @NotNull String arouterPath);

    boolean j(@NotNull ra5 role, @NotNull MessageEvent message, @Nullable rl4.c result);

    boolean k(@NotNull ra5 role, @NotNull MessageEvent message);

    void l(@NotNull ra5 role, int sid, int cid, @NotNull a listener);

    void m(@NotNull ra5 role, int sid, @NotNull String arouterPath);

    boolean o(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent message);

    void p(@NotNull ra5 role, int sid, int cid, @NotNull String arouterPath);

    @Deprecated(message = "please addMessageListener method")
    void r(@NotNull ra5 role, @NotNull a listener);

    void s(@NotNull ra5 role, int sid, int cid, @NotNull a listener);
}
