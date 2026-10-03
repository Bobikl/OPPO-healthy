package com.oplus.aiunit.vision;

import android.text.format.DateFormat;
import com.heytap.databaseengine.model.UserInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bzj, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/bzj;", "", "", "toString", "", "a", "J", "d", "()J", "setTimestamp", "(J)V", "timestamp", "", "b", UserInfo.SEX_FEMALE, "c", "()F", b2n.f, "(F)V", "low", "f", "high", "Ljava/lang/String;", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "expandStr", "<init>", "(JFF)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class TimeStampedCandleData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public float low;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public float high;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String expandStr = "";

    public TimeStampedCandleData(long j2, float f, float f2) {
        this.timestamp = j2;
        this.low = f;
        this.high = f2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExpandStr() {
        return this.expandStr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expandStr = str;
    }

    public final void f(float f) {
        this.high = f;
    }

    public final void g(float f) {
        this.low = f;
    }

    @NotNull
    public String toString() {
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd HH:mm:ss", this.timestamp);
        return "TimeStampedCandleData(timestamp=" + ((Object) charSequence) + ", low=" + this.low + ", high=" + this.high + ")";
    }
}
