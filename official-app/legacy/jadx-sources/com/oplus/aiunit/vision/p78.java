package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010(\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b'\u0010\"R\"\u0010*\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b\u000b\u0010 \"\u0004\b)\u0010\"R\"\u0010-\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b\u0012\u0010 \"\u0004\b,\u0010\"R\"\u0010/\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b+\u0010 \"\u0004\b.\u0010\"¨\u00062"}, d2 = {"Lcom/oplus/aiunit/vision/p78;", "", "", "a", "Z", "j", "()Z", "r", "(Z)V", "isNoData", "", "b", "D", "()D", MapSchema.FIELD_NAME_KEY, "(D)V", "averageValue", "", "c", UserInfo.SEX_FEMALE, b2n.f, "()F", "q", "(F)V", "minValue", "d", "f", LogFieldKey.PROCESS_NAME_KEY, "maxValue", "", MapSchema.FIELD_NAME_ENTRY, "I", "()I", "n", "(I)V", "heightScale", b2n.g, "s", "normalScale", "o", "lowScale", LogFieldKey.LEVEL_KEY, "beforeStandardDay", "i", LogFieldKey.MESSAGE_KEY, "curStandardDay", "t", "warningCounts", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class p78 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isNoData = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public double averageValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float minValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float maxValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int heightScale;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int normalScale;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int lowScale;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int beforeStandardDay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int curStandardDay;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int warningCounts;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAverageValue() {
        return this.averageValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBeforeStandardDay() {
        return this.beforeStandardDay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurStandardDay() {
        return this.curStandardDay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHeightScale() {
        return this.heightScale;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLowScale() {
        return this.lowScale;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getNormalScale() {
        return this.normalScale;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getWarningCounts() {
        return this.warningCounts;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void k(double d) {
        this.averageValue = d;
    }

    public final void l(int i) {
        this.beforeStandardDay = i;
    }

    public final void m(int i) {
        this.curStandardDay = i;
    }

    public final void n(int i) {
        this.heightScale = i;
    }

    public final void o(int i) {
        this.lowScale = i;
    }

    public final void p(float f) {
        this.maxValue = f;
    }

    public final void q(float f) {
        this.minValue = f;
    }

    public final void r(boolean z) {
        this.isNoData = z;
    }

    public final void s(int i) {
        this.normalScale = i;
    }

    public final void t(int i) {
        this.warningCounts = i;
    }
}
