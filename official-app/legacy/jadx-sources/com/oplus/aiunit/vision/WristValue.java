package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.m4m, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0012\u001a\u00020\f\u0012\b\b\u0003\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/m4m;", "", "", "toString", "", "a", UserInfo.SEX_FEMALE, "c", "()F", "setValue", "(F)V", "value", "", "b", "J", "()J", "setStartTimestamp", "(J)V", "startTimestamp", "setEndTimestamp", "endTimestamp", "<init>", "(FJJ)V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class WristValue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public float value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long startTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public long endTimestamp;

    public WristValue() {
        this(0.0f, 0L, 0L, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "WristValue(value=" + this.value + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ")";
    }

    public WristValue(float f, @NonNull long j2, @NonNull long j3) {
        this.value = f;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
    }

    public /* synthetic */ WristValue(float f, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -10000.0f : f, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }
}
