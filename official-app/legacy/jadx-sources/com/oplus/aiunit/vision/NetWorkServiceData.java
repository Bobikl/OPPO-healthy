package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.UserCombo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wnc, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/wnc;", "", "", "Lcom/oplus/aiunit/vision/zl3;", "combos", "Lcom/heytap/health/esim/nsc/dto/UserCombo;", "userCombos", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class NetWorkServiceData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Combo> combos;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<UserCombo> userCombos;

    public NetWorkServiceData(@NotNull List<Combo> combos, @NotNull List<UserCombo> userCombos) {
        Intrinsics.checkNotNullParameter(combos, "combos");
        Intrinsics.checkNotNullParameter(userCombos, "userCombos");
        this.combos = combos;
        this.userCombos = userCombos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetWorkServiceData b(NetWorkServiceData netWorkServiceData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = netWorkServiceData.combos;
        }
        if ((i & 2) != 0) {
            list2 = netWorkServiceData.userCombos;
        }
        return netWorkServiceData.a(list, list2);
    }

    @NotNull
    public final NetWorkServiceData a(@NotNull List<Combo> combos, @NotNull List<UserCombo> userCombos) {
        Intrinsics.checkNotNullParameter(combos, "combos");
        Intrinsics.checkNotNullParameter(userCombos, "userCombos");
        return new NetWorkServiceData(combos, userCombos);
    }

    @NotNull
    public final List<Combo> c() {
        return this.combos;
    }

    @NotNull
    public final List<UserCombo> d() {
        return this.userCombos;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetWorkServiceData)) {
            return false;
        }
        NetWorkServiceData netWorkServiceData = (NetWorkServiceData) other;
        return Intrinsics.areEqual(this.combos, netWorkServiceData.combos) && Intrinsics.areEqual(this.userCombos, netWorkServiceData.userCombos);
    }

    public int hashCode() {
        return (this.combos.hashCode() * 31) + this.userCombos.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetWorkServiceData(combos=" + this.combos + ", userCombos=" + this.userCombos + ")";
    }
}
