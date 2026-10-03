package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallNoBlockedRulesSettings;", "", "isSupport", "", "simCardSettings", "", "Lcom/heytap/health/watch/netnumber/bean/CallNoBlockedRulesSimCardSettings;", "specialNumbers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "(ZLjava/util/List;Ljava/util/HashSet;)V", "()Z", "getSimCardSettings", "()Ljava/util/List;", "getSpecialNumbers", "()Ljava/util/HashSet;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallNoBlockedRulesSettings {
    private final boolean isSupport;

    @NotNull
    private final List<CallNoBlockedRulesSimCardSettings> simCardSettings;

    @Nullable
    private final HashSet<String> specialNumbers;

    public CallNoBlockedRulesSettings(boolean z, @NotNull List<CallNoBlockedRulesSimCardSettings> simCardSettings, @Nullable HashSet<String> hashSet) {
        Intrinsics.checkNotNullParameter(simCardSettings, "simCardSettings");
        this.isSupport = z;
        this.simCardSettings = simCardSettings;
        this.specialNumbers = hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallNoBlockedRulesSettings copy$default(CallNoBlockedRulesSettings callNoBlockedRulesSettings, boolean z, List list, HashSet hashSet, int i, Object obj) {
        if ((i & 1) != 0) {
            z = callNoBlockedRulesSettings.isSupport;
        }
        if ((i & 2) != 0) {
            list = callNoBlockedRulesSettings.simCardSettings;
        }
        if ((i & 4) != 0) {
            hashSet = callNoBlockedRulesSettings.specialNumbers;
        }
        return callNoBlockedRulesSettings.copy(z, list, hashSet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    public final List<CallNoBlockedRulesSimCardSettings> component2() {
        return this.simCardSettings;
    }

    @Nullable
    public final HashSet<String> component3() {
        return this.specialNumbers;
    }

    @NotNull
    public final CallNoBlockedRulesSettings copy(boolean isSupport, @NotNull List<CallNoBlockedRulesSimCardSettings> simCardSettings, @Nullable HashSet<String> specialNumbers) {
        Intrinsics.checkNotNullParameter(simCardSettings, "simCardSettings");
        return new CallNoBlockedRulesSettings(isSupport, simCardSettings, specialNumbers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallNoBlockedRulesSettings)) {
            return false;
        }
        CallNoBlockedRulesSettings callNoBlockedRulesSettings = (CallNoBlockedRulesSettings) other;
        return this.isSupport == callNoBlockedRulesSettings.isSupport && Intrinsics.areEqual(this.simCardSettings, callNoBlockedRulesSettings.simCardSettings) && Intrinsics.areEqual(this.specialNumbers, callNoBlockedRulesSettings.specialNumbers);
    }

    @NotNull
    public final List<CallNoBlockedRulesSimCardSettings> getSimCardSettings() {
        return this.simCardSettings;
    }

    @Nullable
    public final HashSet<String> getSpecialNumbers() {
        return this.specialNumbers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + this.simCardSettings.hashCode()) * 31;
        HashSet<String> hashSet = this.specialNumbers;
        return iHashCode + (hashSet == null ? 0 : hashSet.hashCode());
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "CallNoBlockedRulesSettings(isSupport=" + this.isSupport + ", simCardSettings=" + this.simCardSettings + ", specialNumbers=" + this.specialNumbers + ")";
    }

    public /* synthetic */ CallNoBlockedRulesSettings(boolean z, List list, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new ArrayList() : list, hashSet);
    }
}
