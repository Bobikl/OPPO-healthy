package com.oplus.aiunit.vision;

import com.heytap.health.core.provider.HealthSwitchProvider;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ymi, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/ymi;", "", "", "userAgreement", HealthSwitchProvider.METHOD_PRIVACY, "experience", "autoUpdate", "a", "", "toString", "", "hashCode", "other", "equals", "Z", "f", "()Z", "b", MapSchema.FIELD_NAME_ENTRY, "c", "d", "<init>", "(ZZZZ)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class StatementAgree {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean userAgreement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean privacy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean experience;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean autoUpdate;

    public StatementAgree() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ StatementAgree b(StatementAgree statementAgree, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = statementAgree.userAgreement;
        }
        if ((i & 2) != 0) {
            z2 = statementAgree.privacy;
        }
        if ((i & 4) != 0) {
            z3 = statementAgree.experience;
        }
        if ((i & 8) != 0) {
            z4 = statementAgree.autoUpdate;
        }
        return statementAgree.a(z, z2, z3, z4);
    }

    @NotNull
    public final StatementAgree a(boolean userAgreement, boolean privacy, boolean experience, boolean autoUpdate) {
        return new StatementAgree(userAgreement, privacy, experience, autoUpdate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getExperience() {
        return this.experience;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPrivacy() {
        return this.privacy;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementAgree)) {
            return false;
        }
        StatementAgree statementAgree = (StatementAgree) other;
        return this.userAgreement == statementAgree.userAgreement && this.privacy == statementAgree.privacy && this.experience == statementAgree.experience && this.autoUpdate == statementAgree.autoUpdate;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getUserAgreement() {
        return this.userAgreement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public int hashCode() {
        boolean z = this.userAgreement;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.privacy;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.experience;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.autoUpdate;
        return i3 + (z4 ? 1 : z4);
    }

    @NotNull
    public String toString() {
        return "StatementAgree(userAgreement=" + this.userAgreement + ", privacy=" + this.privacy + ", experience=" + this.experience + ", autoUpdate=" + this.autoUpdate + ")";
    }

    public StatementAgree(boolean z, boolean z2, boolean z3, boolean z4) {
        this.userAgreement = z;
        this.privacy = z2;
        this.experience = z3;
        this.autoUpdate = z4;
    }

    public /* synthetic */ StatementAgree(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
