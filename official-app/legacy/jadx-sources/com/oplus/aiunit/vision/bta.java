package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u001a\u0010\u000fR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/bta;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "text", "", UserInfo.SEX_FEMALE, MapSchema.FIELD_NAME_ENTRY, "()F", LogFieldKey.MESSAGE_KEY, "(F)V", "x", "c", "f", "n", "y", "d", LogFieldKey.LEVEL_KEY, "textRectTop", MapSchema.FIELD_NAME_KEY, "textRectBottom", "i", "centerY", "", b2n.f, "Z", "()Z", b2n.g, "(Z)V", "isCalibration", "<init>", "()V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class bta {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String text = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float x;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float y;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float textRectTop;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float textRectBottom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float centerY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isCalibration;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCenterY() {
        return this.centerY;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getTextRectBottom() {
        return this.textRectBottom;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTextRectTop() {
        return this.textRectTop;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsCalibration() {
        return this.isCalibration;
    }

    public final void h(boolean z) {
        this.isCalibration = z;
    }

    public final void i(float f) {
        this.centerY = f;
    }

    public final void j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final void k(float f) {
        this.textRectBottom = f;
    }

    public final void l(float f) {
        this.textRectTop = f;
    }

    public final void m(float f) {
        this.x = f;
    }

    public final void n(float f) {
        this.y = f;
    }
}
