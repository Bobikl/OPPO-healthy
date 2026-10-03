package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.qcb, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/qcb;", "", "", "stepSyncSupport", "stepSyncOpen", "", "setpSyncSummary", "", "Lcom/oplus/aiunit/vision/xg5;", "guidList", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "bindList", "a", "toString", "", "hashCode", "other", "equals", "Z", b2n.f, "()Z", "b", "f", "c", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MMStepSync {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean stepSyncSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean stepSyncOpen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String setpSyncSummary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<xg5> guidList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<JViewBean> bindList;

    /* JADX WARN: Multi-variable type inference failed */
    public MMStepSync(boolean z, boolean z2, @NotNull String setpSyncSummary, @NotNull List<xg5> guidList, @NotNull List<? extends JViewBean> bindList) {
        Intrinsics.checkNotNullParameter(setpSyncSummary, "setpSyncSummary");
        Intrinsics.checkNotNullParameter(guidList, "guidList");
        Intrinsics.checkNotNullParameter(bindList, "bindList");
        this.stepSyncSupport = z;
        this.stepSyncOpen = z2;
        this.setpSyncSummary = setpSyncSummary;
        this.guidList = guidList;
        this.bindList = bindList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MMStepSync b(MMStepSync mMStepSync, boolean z, boolean z2, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mMStepSync.stepSyncSupport;
        }
        if ((i & 2) != 0) {
            z2 = mMStepSync.stepSyncOpen;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = mMStepSync.setpSyncSummary;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = mMStepSync.guidList;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = mMStepSync.bindList;
        }
        return mMStepSync.a(z, z3, str2, list3, list2);
    }

    @NotNull
    public final MMStepSync a(boolean stepSyncSupport, boolean stepSyncOpen, @NotNull String setpSyncSummary, @NotNull List<xg5> guidList, @NotNull List<? extends JViewBean> bindList) {
        Intrinsics.checkNotNullParameter(setpSyncSummary, "setpSyncSummary");
        Intrinsics.checkNotNullParameter(guidList, "guidList");
        Intrinsics.checkNotNullParameter(bindList, "bindList");
        return new MMStepSync(stepSyncSupport, stepSyncOpen, setpSyncSummary, guidList, bindList);
    }

    @NotNull
    public final List<JViewBean> c() {
        return this.bindList;
    }

    @NotNull
    public final List<xg5> d() {
        return this.guidList;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSetpSyncSummary() {
        return this.setpSyncSummary;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MMStepSync)) {
            return false;
        }
        MMStepSync mMStepSync = (MMStepSync) other;
        return this.stepSyncSupport == mMStepSync.stepSyncSupport && this.stepSyncOpen == mMStepSync.stepSyncOpen && Intrinsics.areEqual(this.setpSyncSummary, mMStepSync.setpSyncSummary) && Intrinsics.areEqual(this.guidList, mMStepSync.guidList) && Intrinsics.areEqual(this.bindList, mMStepSync.bindList);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getStepSyncOpen() {
        return this.stepSyncOpen;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getStepSyncSupport() {
        return this.stepSyncSupport;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        boolean z = this.stepSyncSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.stepSyncOpen;
        return ((((((i + (z2 ? 1 : z2)) * 31) + this.setpSyncSummary.hashCode()) * 31) + this.guidList.hashCode()) * 31) + this.bindList.hashCode();
    }

    @NotNull
    public String toString() {
        return "MMStepSync(stepSyncSupport=" + this.stepSyncSupport + ", stepSyncOpen=" + this.stepSyncOpen + ", setpSyncSummary=" + this.setpSyncSummary + ", guidList=" + this.guidList + ", bindList=" + this.bindList + ")";
    }
}
