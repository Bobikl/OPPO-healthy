package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006&"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallInterceptMarkedNumberSimCardSettings;", "", "isEnable", "", "slotId", "", "simCardName", "", "useSim1Rules", "settingsAction", "strengths", "", "Lcom/heytap/health/watch/netnumber/bean/Strength;", "switches", "Lcom/heytap/health/watch/netnumber/bean/CallInterceptMarkedNumberSubSwitch;", "(ZILjava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "()Z", "getSettingsAction", "()Ljava/lang/String;", "getSimCardName", "getSlotId", "()I", "getStrengths", "()Ljava/util/List;", "getSwitches", "getUseSim1Rules", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallInterceptMarkedNumberSimCardSettings {
    private final boolean isEnable;

    @NotNull
    private final String settingsAction;

    @NotNull
    private final String simCardName;
    private final int slotId;

    @Nullable
    private final List<Strength> strengths;

    @Nullable
    private final List<CallInterceptMarkedNumberSubSwitch> switches;
    private final boolean useSim1Rules;

    public CallInterceptMarkedNumberSimCardSettings(boolean z, int i, @NotNull String simCardName, boolean z2, @NotNull String settingsAction, @Nullable List<Strength> list, @Nullable List<CallInterceptMarkedNumberSubSwitch> list2) {
        Intrinsics.checkNotNullParameter(simCardName, "simCardName");
        Intrinsics.checkNotNullParameter(settingsAction, "settingsAction");
        this.isEnable = z;
        this.slotId = i;
        this.simCardName = simCardName;
        this.useSim1Rules = z2;
        this.settingsAction = settingsAction;
        this.strengths = list;
        this.switches = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallInterceptMarkedNumberSimCardSettings copy$default(CallInterceptMarkedNumberSimCardSettings callInterceptMarkedNumberSimCardSettings, boolean z, int i, String str, boolean z2, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = callInterceptMarkedNumberSimCardSettings.isEnable;
        }
        if ((i2 & 2) != 0) {
            i = callInterceptMarkedNumberSimCardSettings.slotId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = callInterceptMarkedNumberSimCardSettings.simCardName;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            z2 = callInterceptMarkedNumberSimCardSettings.useSim1Rules;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            str2 = callInterceptMarkedNumberSimCardSettings.settingsAction;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            list = callInterceptMarkedNumberSimCardSettings.strengths;
        }
        List list3 = list;
        if ((i2 & 64) != 0) {
            list2 = callInterceptMarkedNumberSimCardSettings.switches;
        }
        return callInterceptMarkedNumberSimCardSettings.copy(z, i3, str3, z3, str4, list3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSlotId() {
        return this.slotId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSimCardName() {
        return this.simCardName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getUseSim1Rules() {
        return this.useSim1Rules;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSettingsAction() {
        return this.settingsAction;
    }

    @Nullable
    public final List<Strength> component6() {
        return this.strengths;
    }

    @Nullable
    public final List<CallInterceptMarkedNumberSubSwitch> component7() {
        return this.switches;
    }

    @NotNull
    public final CallInterceptMarkedNumberSimCardSettings copy(boolean isEnable, int slotId, @NotNull String simCardName, boolean useSim1Rules, @NotNull String settingsAction, @Nullable List<Strength> strengths, @Nullable List<CallInterceptMarkedNumberSubSwitch> switches) {
        Intrinsics.checkNotNullParameter(simCardName, "simCardName");
        Intrinsics.checkNotNullParameter(settingsAction, "settingsAction");
        return new CallInterceptMarkedNumberSimCardSettings(isEnable, slotId, simCardName, useSim1Rules, settingsAction, strengths, switches);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallInterceptMarkedNumberSimCardSettings)) {
            return false;
        }
        CallInterceptMarkedNumberSimCardSettings callInterceptMarkedNumberSimCardSettings = (CallInterceptMarkedNumberSimCardSettings) other;
        return this.isEnable == callInterceptMarkedNumberSimCardSettings.isEnable && this.slotId == callInterceptMarkedNumberSimCardSettings.slotId && Intrinsics.areEqual(this.simCardName, callInterceptMarkedNumberSimCardSettings.simCardName) && this.useSim1Rules == callInterceptMarkedNumberSimCardSettings.useSim1Rules && Intrinsics.areEqual(this.settingsAction, callInterceptMarkedNumberSimCardSettings.settingsAction) && Intrinsics.areEqual(this.strengths, callInterceptMarkedNumberSimCardSettings.strengths) && Intrinsics.areEqual(this.switches, callInterceptMarkedNumberSimCardSettings.switches);
    }

    @NotNull
    public final String getSettingsAction() {
        return this.settingsAction;
    }

    @NotNull
    public final String getSimCardName() {
        return this.simCardName;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    @Nullable
    public final List<Strength> getStrengths() {
        return this.strengths;
    }

    @Nullable
    public final List<CallInterceptMarkedNumberSubSwitch> getSwitches() {
        return this.switches;
    }

    public final boolean getUseSim1Rules() {
        return this.useSim1Rules;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        boolean z = this.isEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + Integer.hashCode(this.slotId)) * 31) + this.simCardName.hashCode()) * 31;
        boolean z2 = this.useSim1Rules;
        int iHashCode2 = (((iHashCode + (z2 ? 1 : z2)) * 31) + this.settingsAction.hashCode()) * 31;
        List<Strength> list = this.strengths;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<CallInterceptMarkedNumberSubSwitch> list2 = this.switches;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    @NotNull
    public String toString() {
        return "CallInterceptMarkedNumberSimCardSettings(isEnable=" + this.isEnable + ", slotId=" + this.slotId + ", simCardName=" + this.simCardName + ", useSim1Rules=" + this.useSim1Rules + ", settingsAction=" + this.settingsAction + ", strengths=" + this.strengths + ", switches=" + this.switches + ")";
    }
}
