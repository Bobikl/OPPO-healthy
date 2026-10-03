package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/cyb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMac", "()Ljava/lang/String;", "mac", "b", "I", "getSid", "()I", SpeechConstant.KEY_EVENT_SID, "c", "getCid", "cid", "<init>", "(Ljava/lang/String;II)V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class cyb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String mac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int sid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int cid;

    public cyb(@NotNull String mac, int i, int i2) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.sid = i;
        this.cid = i2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof cyb)) {
            return false;
        }
        cyb cybVar = (cyb) other;
        return Intrinsics.areEqual(this.mac, cybVar.mac) && this.sid == cybVar.sid && this.cid == cybVar.cid;
    }

    public int hashCode() {
        return (((this.mac.hashCode() * 31) + Integer.hashCode(this.sid)) * 31) + Integer.hashCode(this.cid);
    }

    @NotNull
    public String toString() {
        return "msgId[" + gdb.a(this.mac) + "@" + this.sid + "#" + this.cid;
    }
}
