package com.heytap.health.operation.praiseguide;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/operation/praiseguide/PraiseGlobalConfig;", "", "androidIntSusWin", "", "androidIntIuckPopWin", "androidShareSport", "androidShareCourse", "iosShareCourse", "(ZZZZZ)V", "getAndroidIntIuckPopWin", "()Z", "getAndroidIntSusWin", "getAndroidShareCourse", "getAndroidShareSport", "getIosShareCourse", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "operation_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PraiseGlobalConfig {
    public static final int $stable = 0;
    private final boolean androidIntIuckPopWin;
    private final boolean androidIntSusWin;
    private final boolean androidShareCourse;
    private final boolean androidShareSport;
    private final boolean iosShareCourse;

    public PraiseGlobalConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.androidIntSusWin = z;
        this.androidIntIuckPopWin = z2;
        this.androidShareSport = z3;
        this.androidShareCourse = z4;
        this.iosShareCourse = z5;
    }

    public static /* synthetic */ PraiseGlobalConfig copy$default(PraiseGlobalConfig praiseGlobalConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = praiseGlobalConfig.androidIntSusWin;
        }
        if ((i & 2) != 0) {
            z2 = praiseGlobalConfig.androidIntIuckPopWin;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = praiseGlobalConfig.androidShareSport;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = praiseGlobalConfig.androidShareCourse;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = praiseGlobalConfig.iosShareCourse;
        }
        return praiseGlobalConfig.copy(z, z6, z7, z8, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAndroidIntSusWin() {
        return this.androidIntSusWin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAndroidIntIuckPopWin() {
        return this.androidIntIuckPopWin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAndroidShareSport() {
        return this.androidShareSport;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAndroidShareCourse() {
        return this.androidShareCourse;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIosShareCourse() {
        return this.iosShareCourse;
    }

    @NotNull
    public final PraiseGlobalConfig copy(boolean androidIntSusWin, boolean androidIntIuckPopWin, boolean androidShareSport, boolean androidShareCourse, boolean iosShareCourse) {
        return new PraiseGlobalConfig(androidIntSusWin, androidIntIuckPopWin, androidShareSport, androidShareCourse, iosShareCourse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PraiseGlobalConfig)) {
            return false;
        }
        PraiseGlobalConfig praiseGlobalConfig = (PraiseGlobalConfig) other;
        return this.androidIntSusWin == praiseGlobalConfig.androidIntSusWin && this.androidIntIuckPopWin == praiseGlobalConfig.androidIntIuckPopWin && this.androidShareSport == praiseGlobalConfig.androidShareSport && this.androidShareCourse == praiseGlobalConfig.androidShareCourse && this.iosShareCourse == praiseGlobalConfig.iosShareCourse;
    }

    public final boolean getAndroidIntIuckPopWin() {
        return this.androidIntIuckPopWin;
    }

    public final boolean getAndroidIntSusWin() {
        return this.androidIntSusWin;
    }

    public final boolean getAndroidShareCourse() {
        return this.androidShareCourse;
    }

    public final boolean getAndroidShareSport() {
        return this.androidShareSport;
    }

    public final boolean getIosShareCourse() {
        return this.iosShareCourse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.androidIntSusWin;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.androidIntIuckPopWin;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.androidShareSport;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.androidShareCourse;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.iosShareCourse;
        return i4 + (z5 ? 1 : z5);
    }

    @NotNull
    public String toString() {
        return "PraiseGlobalConfig(androidIntSusWin=" + this.androidIntSusWin + ", androidIntIuckPopWin=" + this.androidIntIuckPopWin + ", androidShareSport=" + this.androidShareSport + ", androidShareCourse=" + this.androidShareCourse + ", iosShareCourse=" + this.iosShareCourse + ")";
    }
}
