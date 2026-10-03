package com.oplus.mydevices.sdk.devResource.bean.request;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003JC\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006*"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/request/OafAgs;", "", "aids", "", "Lcom/oplus/mydevices/sdk/devResource/bean/request/Aids;", "condition", "Lcom/oplus/mydevices/sdk/devResource/bean/request/Condition;", "mode", "", "devId", "", "bizVersion", "(Ljava/util/List;Lcom/oplus/mydevices/sdk/devResource/bean/request/Condition;ILjava/lang/String;I)V", "getAids", "()Ljava/util/List;", "setAids", "(Ljava/util/List;)V", "getBizVersion", "()I", "setBizVersion", "(I)V", "getCondition", "()Lcom/oplus/mydevices/sdk/devResource/bean/request/Condition;", "setCondition", "(Lcom/oplus/mydevices/sdk/devResource/bean/request/Condition;)V", "getDevId", "()Ljava/lang/String;", "setDevId", "(Ljava/lang/String;)V", "getMode", "setMode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class OafAgs {

    @NotNull
    private List<Aids> aids;
    private int bizVersion;

    @NotNull
    private Condition condition;

    @Nullable
    private String devId;
    private int mode;

    public OafAgs(@NotNull List<Aids> aids, @NotNull Condition condition, int i, @Nullable String str, int i2) {
        Intrinsics.checkNotNullParameter(aids, "aids");
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.aids = aids;
        this.condition = condition;
        this.mode = i;
        this.devId = str;
        this.bizVersion = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OafAgs copy$default(OafAgs oafAgs, List list, Condition condition, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = oafAgs.aids;
        }
        if ((i3 & 2) != 0) {
            condition = oafAgs.condition;
        }
        Condition condition2 = condition;
        if ((i3 & 4) != 0) {
            i = oafAgs.mode;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str = oafAgs.devId;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            i2 = oafAgs.bizVersion;
        }
        return oafAgs.copy(list, condition2, i4, str2, i2);
    }

    @NotNull
    public final List<Aids> component1() {
        return this.aids;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDevId() {
        return this.devId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBizVersion() {
        return this.bizVersion;
    }

    @NotNull
    public final OafAgs copy(@NotNull List<Aids> aids, @NotNull Condition condition, int mode, @Nullable String devId, int bizVersion) {
        Intrinsics.checkNotNullParameter(aids, "aids");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return new OafAgs(aids, condition, mode, devId, bizVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OafAgs)) {
            return false;
        }
        OafAgs oafAgs = (OafAgs) other;
        return Intrinsics.areEqual(this.aids, oafAgs.aids) && Intrinsics.areEqual(this.condition, oafAgs.condition) && this.mode == oafAgs.mode && Intrinsics.areEqual(this.devId, oafAgs.devId) && this.bizVersion == oafAgs.bizVersion;
    }

    @NotNull
    public final List<Aids> getAids() {
        return this.aids;
    }

    public final int getBizVersion() {
        return this.bizVersion;
    }

    @NotNull
    public final Condition getCondition() {
        return this.condition;
    }

    @Nullable
    public final String getDevId() {
        return this.devId;
    }

    public final int getMode() {
        return this.mode;
    }

    public int hashCode() {
        List<Aids> list = this.aids;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        Condition condition = this.condition;
        int iHashCode2 = (((iHashCode + (condition != null ? condition.hashCode() : 0)) * 31) + this.mode) * 31;
        String str = this.devId;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.bizVersion;
    }

    public final void setAids(@NotNull List<Aids> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.aids = list;
    }

    public final void setBizVersion(int i) {
        this.bizVersion = i;
    }

    public final void setCondition(@NotNull Condition condition) {
        Intrinsics.checkNotNullParameter(condition, "<set-?>");
        this.condition = condition;
    }

    public final void setDevId(@Nullable String str) {
        this.devId = str;
    }

    public final void setMode(int i) {
        this.mode = i;
    }

    @NotNull
    public String toString() {
        return "OafAgs(aids=" + this.aids + ", condition=" + this.condition + ", mode=" + this.mode + ", devId=" + this.devId + ", bizVersion=" + this.bizVersion + ")";
    }

    public /* synthetic */ OafAgs(List list, Condition condition, int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, condition, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? 1 : i2);
    }
}
