package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \r2\u00020\u0001:\u0001\u0003B!\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/n6c;", "", "", "a", "I", "()I", "appId", "b", "c", SpeechConstant.KEY_EVENT_SID, "cid", "<init>", "(III)V", "Companion", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class n6c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int NONE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int appId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int sid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int cid;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.n6c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/n6c$a;", "", "", "appId", SpeechConstant.KEY_EVENT_SID, "Lcom/oplus/aiunit/vision/n6c;", "a", "cid", "b", "NONE", "I", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n6c a(int appId, int sid) {
            if (appId > 0) {
                return new n6c(appId, sid, -1, null);
            }
            throw new IllegalArgumentException("appId must > 0");
        }

        @NotNull
        public final n6c b(int appId, int sid, int cid) {
            if (appId > 0) {
                return new n6c(appId, sid, cid, null);
            }
            throw new IllegalArgumentException("appId must > 0");
        }
    }

    public /* synthetic */ n6c(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSid() {
        return this.sid;
    }

    public n6c(int i, int i2, int i3) {
        this.appId = i;
        this.sid = i2;
        this.cid = i3;
    }
}
