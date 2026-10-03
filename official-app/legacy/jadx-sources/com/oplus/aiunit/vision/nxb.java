package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00142\u00020\u0001:\u0003\t\u000e\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&J$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/nxb;", "", "Lcom/oplus/aiunit/vision/nxb$b;", "listener", "", MapSchema.FIELD_NAME_ENTRY, "", SpeechConstant.KEY_EVENT_SID, "cid", "a", "d", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "message", "", "b", "", "mac", "Lcom/oplus/aiunit/vision/nxb$c;", "result", "c", "Companion", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public interface nxb {
    public static final int CID_ANY = -1;

    @NotNull
    public static final String CURRENT_DEVCIE_ID = "CDI";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int SID_ANY = -1;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.nxb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/nxb$a;", "", "", "CURRENT_DEVCIE_ID", "Ljava/lang/String;", "", "SID_ANY", "I", "CID_ANY", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int CID_ANY = -1;

        @NotNull
        public static final String CURRENT_DEVCIE_ID = "CDI";
        public static final int SID_ANY = -1;
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/nxb$b;", "", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/nxb$c;", "", "", "success", "", "code", "", "a", "Companion", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public interface c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.nxb$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/nxb$c$a;", "", "", "b", "I", "a", "()I", "setERROR_DISCONNECTED", "(I)V", "ERROR_DISCONNECTED", "c", "setERROR_PEER_DISCONNECTED", "ERROR_PEER_DISCONNECTED", "d", "setSUCCESS", "SUCCESS", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public static int ERROR_DISCONNECTED = -2;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public static int ERROR_PEER_DISCONNECTED = -1;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public static int SUCCESS;

            public final int a() {
                return ERROR_DISCONNECTED;
            }

            public final int b() {
                return ERROR_PEER_DISCONNECTED;
            }

            public final int c() {
                return SUCCESS;
            }
        }

        void a(boolean success, int code);
    }

    void a(int sid, int cid, @NotNull b listener);

    boolean b(@NotNull MessageEvent message);

    boolean c(@NotNull String mac, @NotNull MessageEvent message, @Nullable c result);

    void d(int sid, int cid, @NotNull b listener);

    @Deprecated(message = "please addMessageListener method")
    void e(@NotNull b listener);
}
