package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0006\u0010.\u001a\u00020+J\u0006\u0010/\u001a\u00020+J\u0006\u00100\u001a\u00020+J\u0006\u00101\u001a\u00020+J\u0006\u00102\u001a\u00020\u0005J\t\u00103\u001a\u000204HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u00065"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CSData;", "", "date", "", "goodSeconds", "", "mildSeconds", "heavySeconds", "lowHeadSeconds", "wearSeconds", "lowHeadPercent", "validDays", "(JIIIIIII)V", "getDate", "()J", "setDate", "(J)V", "getGoodSeconds", "()I", "setGoodSeconds", "(I)V", "getHeavySeconds", "setHeavySeconds", "getLowHeadPercent", "setLowHeadPercent", "getLowHeadSeconds", "setLowHeadSeconds", "getMildSeconds", "setMildSeconds", "getValidDays", "setValidDays", "getWearSeconds", "setWearSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "isGood", "isHeavy", "isLight", "isNullData", "sumOfStateSeconds", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CSData {
    private long date;
    private int goodSeconds;
    private int heavySeconds;
    private int lowHeadPercent;
    private int lowHeadSeconds;
    private int mildSeconds;
    private int validDays;
    private int wearSeconds;

    public CSData() {
        this(0L, 0, 0, 0, 0, 0, 0, 0, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGoodSeconds() {
        return this.goodSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMildSeconds() {
        return this.mildSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeavySeconds() {
        return this.heavySeconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLowHeadSeconds() {
        return this.lowHeadSeconds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWearSeconds() {
        return this.wearSeconds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLowHeadPercent() {
        return this.lowHeadPercent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getValidDays() {
        return this.validDays;
    }

    @NotNull
    public final CSData copy(long date, int goodSeconds, int mildSeconds, int heavySeconds, int lowHeadSeconds, int wearSeconds, int lowHeadPercent, int validDays) {
        return new CSData(date, goodSeconds, mildSeconds, heavySeconds, lowHeadSeconds, wearSeconds, lowHeadPercent, validDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CSData)) {
            return false;
        }
        CSData cSData = (CSData) other;
        return this.date == cSData.date && this.goodSeconds == cSData.goodSeconds && this.mildSeconds == cSData.mildSeconds && this.heavySeconds == cSData.heavySeconds && this.lowHeadSeconds == cSData.lowHeadSeconds && this.wearSeconds == cSData.wearSeconds && this.lowHeadPercent == cSData.lowHeadPercent && this.validDays == cSData.validDays;
    }

    public final long getDate() {
        return this.date;
    }

    public final int getGoodSeconds() {
        return this.goodSeconds;
    }

    public final int getHeavySeconds() {
        return this.heavySeconds;
    }

    public final int getLowHeadPercent() {
        return this.lowHeadPercent;
    }

    public final int getLowHeadSeconds() {
        return this.lowHeadSeconds;
    }

    public final int getMildSeconds() {
        return this.mildSeconds;
    }

    public final int getValidDays() {
        return this.validDays;
    }

    public final int getWearSeconds() {
        return this.wearSeconds;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.date) * 31) + Integer.hashCode(this.goodSeconds)) * 31) + Integer.hashCode(this.mildSeconds)) * 31) + Integer.hashCode(this.heavySeconds)) * 31) + Integer.hashCode(this.lowHeadSeconds)) * 31) + Integer.hashCode(this.wearSeconds)) * 31) + Integer.hashCode(this.lowHeadPercent)) * 31) + Integer.hashCode(this.validDays);
    }

    public final boolean isGood() {
        return ((float) this.goodSeconds) / (((float) RangesKt___RangesKt.coerceAtLeast(sumOfStateSeconds(), 1)) * 1.0f) >= 0.8f;
    }

    public final boolean isHeavy() {
        return ((float) this.heavySeconds) / (((float) RangesKt___RangesKt.coerceAtLeast(sumOfStateSeconds(), 1)) * 1.0f) >= 0.5f;
    }

    public final boolean isLight() {
        return (isGood() || isHeavy()) ? false : true;
    }

    public final boolean isNullData() {
        return this.goodSeconds == 0 && this.mildSeconds == 0 && this.heavySeconds == 0 && this.lowHeadSeconds == 0 && this.wearSeconds == 0;
    }

    public final void setDate(long j2) {
        this.date = j2;
    }

    public final void setGoodSeconds(int i) {
        this.goodSeconds = i;
    }

    public final void setHeavySeconds(int i) {
        this.heavySeconds = i;
    }

    public final void setLowHeadPercent(int i) {
        this.lowHeadPercent = i;
    }

    public final void setLowHeadSeconds(int i) {
        this.lowHeadSeconds = i;
    }

    public final void setMildSeconds(int i) {
        this.mildSeconds = i;
    }

    public final void setValidDays(int i) {
        this.validDays = i;
    }

    public final void setWearSeconds(int i) {
        this.wearSeconds = i;
    }

    public final int sumOfStateSeconds() {
        return this.goodSeconds + this.mildSeconds + this.heavySeconds;
    }

    @NotNull
    public String toString() {
        return "CSData(date=" + this.date + ", goodSeconds=" + this.goodSeconds + ", mildSeconds=" + this.mildSeconds + ", heavySeconds=" + this.heavySeconds + ", lowHeadSeconds=" + this.lowHeadSeconds + ", wearSeconds=" + this.wearSeconds + ", lowHeadPercent=" + this.lowHeadPercent + ", validDays=" + this.validDays + ")";
    }

    public CSData(long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.date = j2;
        this.goodSeconds = i;
        this.mildSeconds = i2;
        this.heavySeconds = i3;
        this.lowHeadSeconds = i4;
        this.wearSeconds = i5;
        this.lowHeadPercent = i6;
        this.validDays = i7;
    }

    public /* synthetic */ CSData(long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j2, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) == 0 ? i7 : 0);
    }
}
