package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.fh9, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/fh9;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "c", "()J", "setTimeStamp", "(J)V", SpeechConstant.KEY_TTS_TIMESTAMP, "b", "I", "()I", "setAvgStress", "(I)V", "avgStress", "setStressState", "stressState", "<init>", "(JII)V", "health_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HrvStat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long timeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int avgStress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int stressState;

    public HrvStat() {
        this(0L, 0, 0, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStressState() {
        return this.stressState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrvStat)) {
            return false;
        }
        HrvStat hrvStat = (HrvStat) other;
        return this.timeStamp == hrvStat.timeStamp && this.avgStress == hrvStat.avgStress && this.stressState == hrvStat.stressState;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timeStamp) * 31) + Integer.hashCode(this.avgStress)) * 31) + Integer.hashCode(this.stressState);
    }

    @NotNull
    public String toString() {
        return "HrvStat(timeStamp=" + this.timeStamp + ", avgStress=" + this.avgStress + ", stressState=" + this.stressState + ")";
    }

    public HrvStat(long j2, int i, int i2) {
        this.timeStamp = j2;
        this.avgStress = i;
        this.stressState = i2;
    }

    public /* synthetic */ HrvStat(long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j2, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
