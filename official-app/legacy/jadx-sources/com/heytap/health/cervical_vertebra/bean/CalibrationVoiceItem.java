package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CalibrationVoiceItem;", "Ljava/io/Serializable;", "url", "", "size", "", "(Ljava/lang/String;J)V", "getSize", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CalibrationVoiceItem implements Serializable {
    private final long size;

    @Nullable
    private final String url;

    public CalibrationVoiceItem(@Nullable String str, long j2) {
        this.url = str;
        this.size = j2;
    }

    public static /* synthetic */ CalibrationVoiceItem copy$default(CalibrationVoiceItem calibrationVoiceItem, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calibrationVoiceItem.url;
        }
        if ((i & 2) != 0) {
            j2 = calibrationVoiceItem.size;
        }
        return calibrationVoiceItem.copy(str, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final CalibrationVoiceItem copy(@Nullable String url, long size) {
        return new CalibrationVoiceItem(url, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalibrationVoiceItem)) {
            return false;
        }
        CalibrationVoiceItem calibrationVoiceItem = (CalibrationVoiceItem) other;
        return Intrinsics.areEqual(this.url, calibrationVoiceItem.url) && this.size == calibrationVoiceItem.size;
    }

    public final long getSize() {
        return this.size;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return ((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        return "CalibrationVoiceItem(url=" + this.url + ", size=" + this.size + ")";
    }

    public /* synthetic */ CalibrationVoiceItem(String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, j2);
    }
}
