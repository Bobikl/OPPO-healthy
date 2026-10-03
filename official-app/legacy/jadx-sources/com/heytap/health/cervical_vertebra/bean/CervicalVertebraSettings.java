package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CervicalVertebraSettings;", "", "resultCode", "", "realtime", "", "fatigueRemind", "cervicalSpineRemind", "(IZZZ)V", "getCervicalSpineRemind", "()Z", "getFatigueRemind", "getRealtime", "getResultCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CervicalVertebraSettings {
    private final boolean cervicalSpineRemind;
    private final boolean fatigueRemind;
    private final boolean realtime;
    private final int resultCode;

    public CervicalVertebraSettings(int i, boolean z, boolean z2, boolean z3) {
        this.resultCode = i;
        this.realtime = z;
        this.fatigueRemind = z2;
        this.cervicalSpineRemind = z3;
    }

    public static /* synthetic */ CervicalVertebraSettings copy$default(CervicalVertebraSettings cervicalVertebraSettings, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cervicalVertebraSettings.resultCode;
        }
        if ((i2 & 2) != 0) {
            z = cervicalVertebraSettings.realtime;
        }
        if ((i2 & 4) != 0) {
            z2 = cervicalVertebraSettings.fatigueRemind;
        }
        if ((i2 & 8) != 0) {
            z3 = cervicalVertebraSettings.cervicalSpineRemind;
        }
        return cervicalVertebraSettings.copy(i, z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRealtime() {
        return this.realtime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFatigueRemind() {
        return this.fatigueRemind;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCervicalSpineRemind() {
        return this.cervicalSpineRemind;
    }

    @NotNull
    public final CervicalVertebraSettings copy(int resultCode, boolean realtime, boolean fatigueRemind, boolean cervicalSpineRemind) {
        return new CervicalVertebraSettings(resultCode, realtime, fatigueRemind, cervicalSpineRemind);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CervicalVertebraSettings)) {
            return false;
        }
        CervicalVertebraSettings cervicalVertebraSettings = (CervicalVertebraSettings) other;
        return this.resultCode == cervicalVertebraSettings.resultCode && this.realtime == cervicalVertebraSettings.realtime && this.fatigueRemind == cervicalVertebraSettings.fatigueRemind && this.cervicalSpineRemind == cervicalVertebraSettings.cervicalSpineRemind;
    }

    public final boolean getCervicalSpineRemind() {
        return this.cervicalSpineRemind;
    }

    public final boolean getFatigueRemind() {
        return this.fatigueRemind;
    }

    public final boolean getRealtime() {
        return this.realtime;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.resultCode) * 31;
        boolean z = this.realtime;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.fatigueRemind;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.cervicalSpineRemind;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        return "CervicalVertebraSettings(resultCode=" + this.resultCode + ", realtime=" + this.realtime + ", fatigueRemind=" + this.fatigueRemind + ", cervicalSpineRemind=" + this.cervicalSpineRemind + ")";
    }
}
