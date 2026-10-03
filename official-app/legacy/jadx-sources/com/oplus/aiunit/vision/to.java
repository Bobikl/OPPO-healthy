package com.oplus.aiunit.vision;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/to;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "packageName", "b", DeepLinkInterpreter.KEY_ACTIVITY_NAME, "", "J", "d", "()J", SpeechConstant.KEY_TTS_TIMESTAMP, "I", "()I", MapSchema.FIELD_NAME_ENTRY, "(I)V", "foreground", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class to {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String activityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int foreground;

    public to(@NotNull String packageName, @NotNull String activityName, long j2, int i) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.packageName = packageName;
        this.activityName = activityName;
        this.timeStamp = j2;
        this.foreground = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getForeground() {
        return this.foreground;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void e(int i) {
        this.foreground = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof to)) {
            return false;
        }
        to toVar = (to) other;
        return Intrinsics.areEqual(this.packageName, toVar.packageName) && Intrinsics.areEqual(this.activityName, toVar.activityName) && this.timeStamp == toVar.timeStamp && this.foreground == toVar.foreground;
    }

    public int hashCode() {
        return (((((this.packageName.hashCode() * 31) + this.activityName.hashCode()) * 31) + Long.hashCode(this.timeStamp)) * 31) + Integer.hashCode(this.foreground);
    }

    @NotNull
    public String toString() {
        return "ActivityEventInfo{packageName='" + ((Object) e3e.f(this.packageName)) + "', activityName='" + ((Object) e3e.f(this.activityName)) + "', timeStamp=" + this.timeStamp + ", foreground=" + this.foreground + '}';
    }
}
