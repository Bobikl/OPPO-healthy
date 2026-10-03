package com.oplus.mydevices.sdk.devResource.bean.request;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/request/Aids;", "", "aid", "", "versionCode", "", "(Ljava/lang/String;I)V", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "getVersionCode", "()I", "setVersionCode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Aids {

    @NotNull
    private String aid;
    private int versionCode;

    public Aids(@NotNull String aid, int i) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        this.aid = aid;
        this.versionCode = i;
    }

    public static /* synthetic */ Aids copy$default(Aids aids, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aids.aid;
        }
        if ((i2 & 2) != 0) {
            i = aids.versionCode;
        }
        return aids.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final Aids copy(@NotNull String aid, int versionCode) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        return new Aids(aid, versionCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Aids)) {
            return false;
        }
        Aids aids = (Aids) other;
        return Intrinsics.areEqual(this.aid, aids.aid) && this.versionCode == aids.versionCode;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        String str = this.aid;
        return ((str != null ? str.hashCode() : 0) * 31) + this.versionCode;
    }

    public final void setAid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aid = str;
    }

    public final void setVersionCode(int i) {
        this.versionCode = i;
    }

    @NotNull
    public String toString() {
        return "Aids(aid=" + this.aid + ", versionCode=" + this.versionCode + ")";
    }

    public /* synthetic */ Aids(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }
}
