package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.vz6, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/vz6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "packageName", "", "b", "J", "()J", "setTimeStamp", "(J)V", SpeechConstant.KEY_TTS_TIMESTAMP, "c", "I", "getForeground", "()I", "setForeground", "(I)V", "foreground", "<init>", "(Ljava/lang/String;JI)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class ExtraAppUsage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long timeStamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int foreground;

    public ExtraAppUsage(@NotNull String packageName, long j2, int i) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.timeStamp = j2;
        this.foreground = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraAppUsage)) {
            return false;
        }
        ExtraAppUsage extraAppUsage = (ExtraAppUsage) other;
        return Intrinsics.areEqual(this.packageName, extraAppUsage.packageName) && this.timeStamp == extraAppUsage.timeStamp && this.foreground == extraAppUsage.foreground;
    }

    public int hashCode() {
        return (((this.packageName.hashCode() * 31) + Long.hashCode(this.timeStamp)) * 31) + Integer.hashCode(this.foreground);
    }

    @NotNull
    public String toString() {
        return "ExtraAppUsage(packageName=" + ((Object) e3e.f(this.packageName)) + ", timeStamp=" + this.timeStamp + ", foreground=" + this.foreground + ')';
    }
}
