package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallNoBlockedRulesSimCardSettings;", "", "scheduleBlockSwitch", "Lcom/heytap/health/watch/netnumber/bean/CallOpenAndCloseSwitch;", "releaseRepeatCallSwitch", "Lcom/heytap/health/watch/netnumber/bean/CallRepeatCallSwitch;", "releaseSpecialNumbersSwitch", "Lcom/heytap/health/watch/netnumber/bean/CallNotInterceptCredibleStrangersSwitch;", "(Lcom/heytap/health/watch/netnumber/bean/CallOpenAndCloseSwitch;Lcom/heytap/health/watch/netnumber/bean/CallRepeatCallSwitch;Lcom/heytap/health/watch/netnumber/bean/CallNotInterceptCredibleStrangersSwitch;)V", "getReleaseRepeatCallSwitch", "()Lcom/heytap/health/watch/netnumber/bean/CallRepeatCallSwitch;", "getReleaseSpecialNumbersSwitch", "()Lcom/heytap/health/watch/netnumber/bean/CallNotInterceptCredibleStrangersSwitch;", "getScheduleBlockSwitch", "()Lcom/heytap/health/watch/netnumber/bean/CallOpenAndCloseSwitch;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallNoBlockedRulesSimCardSettings {

    @NotNull
    private final CallRepeatCallSwitch releaseRepeatCallSwitch;

    @NotNull
    private final CallNotInterceptCredibleStrangersSwitch releaseSpecialNumbersSwitch;

    @NotNull
    private final CallOpenAndCloseSwitch scheduleBlockSwitch;

    public CallNoBlockedRulesSimCardSettings(@NotNull CallOpenAndCloseSwitch scheduleBlockSwitch, @NotNull CallRepeatCallSwitch releaseRepeatCallSwitch, @NotNull CallNotInterceptCredibleStrangersSwitch releaseSpecialNumbersSwitch) {
        Intrinsics.checkNotNullParameter(scheduleBlockSwitch, "scheduleBlockSwitch");
        Intrinsics.checkNotNullParameter(releaseRepeatCallSwitch, "releaseRepeatCallSwitch");
        Intrinsics.checkNotNullParameter(releaseSpecialNumbersSwitch, "releaseSpecialNumbersSwitch");
        this.scheduleBlockSwitch = scheduleBlockSwitch;
        this.releaseRepeatCallSwitch = releaseRepeatCallSwitch;
        this.releaseSpecialNumbersSwitch = releaseSpecialNumbersSwitch;
    }

    public static /* synthetic */ CallNoBlockedRulesSimCardSettings copy$default(CallNoBlockedRulesSimCardSettings callNoBlockedRulesSimCardSettings, CallOpenAndCloseSwitch callOpenAndCloseSwitch, CallRepeatCallSwitch callRepeatCallSwitch, CallNotInterceptCredibleStrangersSwitch callNotInterceptCredibleStrangersSwitch, int i, Object obj) {
        if ((i & 1) != 0) {
            callOpenAndCloseSwitch = callNoBlockedRulesSimCardSettings.scheduleBlockSwitch;
        }
        if ((i & 2) != 0) {
            callRepeatCallSwitch = callNoBlockedRulesSimCardSettings.releaseRepeatCallSwitch;
        }
        if ((i & 4) != 0) {
            callNotInterceptCredibleStrangersSwitch = callNoBlockedRulesSimCardSettings.releaseSpecialNumbersSwitch;
        }
        return callNoBlockedRulesSimCardSettings.copy(callOpenAndCloseSwitch, callRepeatCallSwitch, callNotInterceptCredibleStrangersSwitch);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CallOpenAndCloseSwitch getScheduleBlockSwitch() {
        return this.scheduleBlockSwitch;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CallRepeatCallSwitch getReleaseRepeatCallSwitch() {
        return this.releaseRepeatCallSwitch;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CallNotInterceptCredibleStrangersSwitch getReleaseSpecialNumbersSwitch() {
        return this.releaseSpecialNumbersSwitch;
    }

    @NotNull
    public final CallNoBlockedRulesSimCardSettings copy(@NotNull CallOpenAndCloseSwitch scheduleBlockSwitch, @NotNull CallRepeatCallSwitch releaseRepeatCallSwitch, @NotNull CallNotInterceptCredibleStrangersSwitch releaseSpecialNumbersSwitch) {
        Intrinsics.checkNotNullParameter(scheduleBlockSwitch, "scheduleBlockSwitch");
        Intrinsics.checkNotNullParameter(releaseRepeatCallSwitch, "releaseRepeatCallSwitch");
        Intrinsics.checkNotNullParameter(releaseSpecialNumbersSwitch, "releaseSpecialNumbersSwitch");
        return new CallNoBlockedRulesSimCardSettings(scheduleBlockSwitch, releaseRepeatCallSwitch, releaseSpecialNumbersSwitch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallNoBlockedRulesSimCardSettings)) {
            return false;
        }
        CallNoBlockedRulesSimCardSettings callNoBlockedRulesSimCardSettings = (CallNoBlockedRulesSimCardSettings) other;
        return Intrinsics.areEqual(this.scheduleBlockSwitch, callNoBlockedRulesSimCardSettings.scheduleBlockSwitch) && Intrinsics.areEqual(this.releaseRepeatCallSwitch, callNoBlockedRulesSimCardSettings.releaseRepeatCallSwitch) && Intrinsics.areEqual(this.releaseSpecialNumbersSwitch, callNoBlockedRulesSimCardSettings.releaseSpecialNumbersSwitch);
    }

    @NotNull
    public final CallRepeatCallSwitch getReleaseRepeatCallSwitch() {
        return this.releaseRepeatCallSwitch;
    }

    @NotNull
    public final CallNotInterceptCredibleStrangersSwitch getReleaseSpecialNumbersSwitch() {
        return this.releaseSpecialNumbersSwitch;
    }

    @NotNull
    public final CallOpenAndCloseSwitch getScheduleBlockSwitch() {
        return this.scheduleBlockSwitch;
    }

    public int hashCode() {
        return (((this.scheduleBlockSwitch.hashCode() * 31) + this.releaseRepeatCallSwitch.hashCode()) * 31) + this.releaseSpecialNumbersSwitch.hashCode();
    }

    @NotNull
    public String toString() {
        return "CallNoBlockedRulesSimCardSettings(scheduleBlockSwitch=" + this.scheduleBlockSwitch + ", releaseRepeatCallSwitch=" + this.releaseRepeatCallSwitch + ", releaseSpecialNumbersSwitch=" + this.releaseSpecialNumbersSwitch + ")";
    }
}
