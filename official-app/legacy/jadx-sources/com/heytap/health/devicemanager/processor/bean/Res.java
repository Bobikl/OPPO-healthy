package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/Res;", "", "res", "", "resType", "", "type", "repeat", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)V", "getRepeat", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRes", "()Ljava/lang/String;", "getResType", "()I", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)Lcom/heytap/health/devicemanager/processor/bean/Res;", "equals", "other", "hashCode", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Res {

    @Nullable
    private final Boolean repeat;

    @NotNull
    private final String res;
    private final int resType;

    @NotNull
    private final String type;

    public Res(@NotNull String res, int i, @NotNull String type, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(type, "type");
        this.res = res;
        this.resType = i;
        this.type = type;
        this.repeat = bool;
    }

    public static /* synthetic */ Res copy$default(Res res, String str, int i, String str2, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = res.res;
        }
        if ((i2 & 2) != 0) {
            i = res.resType;
        }
        if ((i2 & 4) != 0) {
            str2 = res.type;
        }
        if ((i2 & 8) != 0) {
            bool = res.repeat;
        }
        return res.copy(str, i, str2, bool);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRes() {
        return this.res;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResType() {
        return this.resType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getRepeat() {
        return this.repeat;
    }

    @NotNull
    public final Res copy(@NotNull String res, int resType, @NotNull String type, @Nullable Boolean repeat) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Res(res, resType, type, repeat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Res)) {
            return false;
        }
        Res res = (Res) other;
        return Intrinsics.areEqual(this.res, res.res) && this.resType == res.resType && Intrinsics.areEqual(this.type, res.type) && Intrinsics.areEqual(this.repeat, res.repeat);
    }

    @Nullable
    public final Boolean getRepeat() {
        return this.repeat;
    }

    @NotNull
    public final String getRes() {
        return this.res;
    }

    public final int getResType() {
        return this.resType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.res.hashCode() * 31) + Integer.hashCode(this.resType)) * 31) + this.type.hashCode()) * 31;
        Boolean bool = this.repeat;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "Res(res=" + this.res + ", resType=" + this.resType + ", type=" + this.type + ", repeat=" + this.repeat + ")";
    }
}
