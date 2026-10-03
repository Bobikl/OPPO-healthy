package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.s8d, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/s8d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "autoDownload", "b", "getNeedSchedulerAuto", "needSchedulerAuto", "c", "forceRefresh", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "language", "<init>", "(ZZZLjava/lang/String;)V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OTAVersionParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean autoDownload;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean needSchedulerAuto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean forceRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String language;

    public OTAVersionParam() {
        this(false, false, false, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutoDownload() {
        return this.autoDownload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getForceRefresh() {
        return this.forceRefresh;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTAVersionParam)) {
            return false;
        }
        OTAVersionParam oTAVersionParam = (OTAVersionParam) other;
        return this.autoDownload == oTAVersionParam.autoDownload && this.needSchedulerAuto == oTAVersionParam.needSchedulerAuto && this.forceRefresh == oTAVersionParam.forceRefresh && Intrinsics.areEqual(this.language, oTAVersionParam.language);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.autoDownload;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.needSchedulerAuto;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.forceRefresh;
        return ((i2 + (z3 ? 1 : z3)) * 31) + this.language.hashCode();
    }

    @NotNull
    public String toString() {
        return "OTAVersionParam(autoDownload=" + this.autoDownload + ", needSchedulerAuto=" + this.needSchedulerAuto + ", forceRefresh=" + this.forceRefresh + ", language=" + this.language + ")";
    }

    public OTAVersionParam(boolean z, boolean z2, boolean z3, @NotNull String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        this.autoDownload = z;
        this.needSchedulerAuto = z2;
        this.forceRefresh = z3;
        this.language = language;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OTAVersionParam(boolean z, boolean z2, boolean z3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        if ((i & 8) != 0) {
            str = kta.b();
            Intrinsics.checkNotNullExpressionValue(str, "getLangAndCountryUseHyphen()");
        }
        this(z, z2, z3, str);
    }
}
