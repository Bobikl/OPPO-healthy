package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.u6c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0011\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/u6c;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "getSid", "()I", SpeechConstant.KEY_EVENT_SID, "b", "getCid", "cid", "c", "d", "(I)V", "msgSize", "dataLength", "<init>", "(IIII)V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MsgStatic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int sid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int cid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int msgSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int dataLength;

    public MsgStatic(int i, int i2, int i3, int i4) {
        this.sid = i;
        this.cid = i2;
        this.msgSize = i3;
        this.dataLength = i4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDataLength() {
        return this.dataLength;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMsgSize() {
        return this.msgSize;
    }

    public final void c(int i) {
        this.dataLength = i;
    }

    public final void d(int i) {
        this.msgSize = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MsgStatic.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.wearable.linkservice.sdk.util.MsgStatic");
        MsgStatic msgStatic = (MsgStatic) other;
        return this.sid == msgStatic.sid && this.cid == msgStatic.cid;
    }

    public int hashCode() {
        return (this.sid * 31) + this.cid;
    }

    @NotNull
    public String toString() {
        return "MsgStatic(sid=" + this.sid + ", cid=" + this.cid + ", msgSize=" + this.msgSize + ", dataLength=" + this.dataLength + ")";
    }

    public /* synthetic */ MsgStatic(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
