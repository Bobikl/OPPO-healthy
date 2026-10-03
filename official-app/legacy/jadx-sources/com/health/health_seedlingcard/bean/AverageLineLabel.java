package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/health/health_seedlingcard/bean/AverageLineLabel;", "", "value", "", "fontSize", "color", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getFontSize", "setFontSize", "getValue", "setValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AverageLineLabel {

    @NotNull
    private String color;

    @NotNull
    private String fontSize;

    @NotNull
    private String value;

    public AverageLineLabel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AverageLineLabel copy$default(AverageLineLabel averageLineLabel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = averageLineLabel.value;
        }
        if ((i & 2) != 0) {
            str2 = averageLineLabel.fontSize;
        }
        if ((i & 4) != 0) {
            str3 = averageLineLabel.color;
        }
        return averageLineLabel.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFontSize() {
        return this.fontSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final AverageLineLabel copy(@NotNull String value, @NotNull String fontSize, @NotNull String color) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(color, "color");
        return new AverageLineLabel(value, fontSize, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AverageLineLabel)) {
            return false;
        }
        AverageLineLabel averageLineLabel = (AverageLineLabel) other;
        return Intrinsics.areEqual(this.value, averageLineLabel.value) && Intrinsics.areEqual(this.fontSize, averageLineLabel.fontSize) && Intrinsics.areEqual(this.color, averageLineLabel.color);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getFontSize() {
        return this.fontSize;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.value.hashCode() * 31) + this.fontSize.hashCode()) * 31) + this.color.hashCode();
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final void setFontSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fontSize = str;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "AverageLineLabel(value=" + this.value + ", fontSize=" + this.fontSize + ", color=" + this.color + ")";
    }

    public AverageLineLabel(@NotNull String value, @NotNull String fontSize, @NotNull String color) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(color, "color");
        this.value = value;
        this.fontSize = fontSize;
        this.color = color;
    }

    public /* synthetic */ AverageLineLabel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "10px" : str2, (i & 4) != 0 ? "black" : str3);
    }
}
