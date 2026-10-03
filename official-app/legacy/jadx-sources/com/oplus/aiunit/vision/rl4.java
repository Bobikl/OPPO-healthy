package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0014\u0015\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&J$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\u001c\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/rl4;", "", "Lcom/oplus/aiunit/vision/rl4$b;", "listener", "", "n", "", SpeechConstant.KEY_EVENT_SID, "cid", "", "arouterPath", "q", "c", "d", "f", "t", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "message", "", "a", "b", "Lcom/oplus/aiunit/vision/rl4$c;", "result", b2n.g, MapSchema.FIELD_NAME_ENTRY, "Companion", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface rl4 {
    public static final int CID_ANY = -1;

    @NotNull
    public static final String CURRENT_DEVCIE_ID = "CDI";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int SID_ANY = -1;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.rl4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/rl4$a;", "", "", "CURRENT_DEVCIE_ID", "Ljava/lang/String;", "", "SID_ANY", "I", "CID_ANY", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int CID_ANY = -1;

        @NotNull
        public static final String CURRENT_DEVCIE_ID = "CDI";
        public static final int SID_ANY = -1;
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/rl4$b;", "", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/rl4$c;", "", "", "success", "", "code", "", "a", "Companion", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.rl4$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/rl4$c$a;", "", "", "b", "I", "getERROR_DISCONNECTED", "()I", "setERROR_DISCONNECTED", "(I)V", "ERROR_DISCONNECTED", "c", "getERROR_PEER_DISCONNECTED", "setERROR_PEER_DISCONNECTED", "ERROR_PEER_DISCONNECTED", "d", "getSUCCESS", "setSUCCESS", "SUCCESS", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public static int ERROR_DISCONNECTED;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public static int ERROR_PEER_DISCONNECTED;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public static int SUCCESS;

            static {
                nxb.c.Companion companion = nxb.c.INSTANCE;
                ERROR_DISCONNECTED = companion.a();
                ERROR_PEER_DISCONNECTED = companion.b();
                SUCCESS = companion.c();
            }
        }

        void a(boolean success, int code);
    }

    boolean a(@NotNull String mac, @NotNull MessageEvent message);

    boolean b(@NotNull MessageEvent message);

    void c(int sid, @NotNull String arouterPath);

    void d(int sid, @NotNull String arouterPath);

    boolean e(@NotNull MessageEvent message, @Nullable c result);

    void f(int sid, int cid, @NotNull b listener);

    boolean h(@NotNull String mac, @NotNull MessageEvent message, @Nullable c result);

    @Deprecated(message = "please addMessageListener method")
    void n(@NotNull b listener);

    void q(int sid, int cid, @NotNull String arouterPath);

    void t(int sid, int cid, @NotNull b listener);
}
