package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/Strength;", "", EventType.EventAssociationExtra.THRESHOLD, "", "type", "", "(ILjava/lang/String;)V", "getThreshold", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Strength {
    private final int threshold;

    @NotNull
    private final String type;

    public Strength(int i, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.threshold = i;
        this.type = type;
    }

    public static /* synthetic */ Strength copy$default(Strength strength, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = strength.threshold;
        }
        if ((i2 & 2) != 0) {
            str = strength.type;
        }
        return strength.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Strength copy(int threshold, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Strength(threshold, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Strength)) {
            return false;
        }
        Strength strength = (Strength) other;
        return this.threshold == strength.threshold && Intrinsics.areEqual(this.type, strength.type);
    }

    public final int getThreshold() {
        return this.threshold;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.threshold) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "Strength(threshold=" + this.threshold + ", type=" + this.type + ")";
    }
}
