package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/f69;", "", "", "toString", "", "a", "D", "b", "()D", "f", "(D)V", "x", "c", b2n.f, "y", "d", b2n.g, "z", "", "J", "()J", MapSchema.FIELD_NAME_ENTRY, "(J)V", SpeechConstant.KEY_TTS_TIMESTAMP, "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class f69 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public double x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public double y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public double z;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long timeStamp;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    public final void e(long j2) {
        this.timeStamp = j2;
    }

    public final void f(double d) {
        this.x = d;
    }

    public final void g(double d) {
        this.y = d;
    }

    public final void h(double d) {
        this.z = d;
    }

    @NotNull
    public String toString() {
        return "x is " + this.x + ", y is " + this.y + ", z is " + this.z + ", timeStamp is " + this.timeStamp;
    }
}
