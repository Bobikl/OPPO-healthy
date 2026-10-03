package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.a6j, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/a6j;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", fkj.PARAM_SWITCH_STATUS, "Ljava/lang/String;", "()Ljava/lang/String;", "config", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Switch {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(fkj.PARAM_SWITCH_STATUS)
    private final int switchStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("config")
    @NotNull
    private final String config;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Switch)) {
            return false;
        }
        Switch r5 = (Switch) other;
        return this.switchStatus == r5.switchStatus && Intrinsics.areEqual(this.config, r5.config);
    }

    public int hashCode() {
        return (Integer.hashCode(this.switchStatus) * 31) + this.config.hashCode();
    }

    @NotNull
    public String toString() {
        return "Switch(switchStatus=" + this.switchStatus + ", config=" + this.config + ")";
    }
}
