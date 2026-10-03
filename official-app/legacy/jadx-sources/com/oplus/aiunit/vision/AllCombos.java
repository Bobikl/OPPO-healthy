package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.UserCombo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.q00, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/q00;", "", "", "Lcom/heytap/health/esim/nsc/dto/UserCombo;", "userCombos", "Lcom/oplus/aiunit/vision/oqc;", "nextCombo", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lcom/oplus/aiunit/vision/oqc;", "c", "()Lcom/oplus/aiunit/vision/oqc;", "<init>", "(Ljava/util/List;Lcom/oplus/aiunit/vision/oqc;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AllCombos {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<UserCombo> userCombos;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final NextCombo nextCombo;

    public AllCombos(@NotNull List<UserCombo> userCombos, @Nullable NextCombo nextCombo) {
        Intrinsics.checkNotNullParameter(userCombos, "userCombos");
        this.userCombos = userCombos;
        this.nextCombo = nextCombo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllCombos b(AllCombos allCombos, List list, NextCombo nextCombo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = allCombos.userCombos;
        }
        if ((i & 2) != 0) {
            nextCombo = allCombos.nextCombo;
        }
        return allCombos.a(list, nextCombo);
    }

    @NotNull
    public final AllCombos a(@NotNull List<UserCombo> userCombos, @Nullable NextCombo nextCombo) {
        Intrinsics.checkNotNullParameter(userCombos, "userCombos");
        return new AllCombos(userCombos, nextCombo);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final NextCombo getNextCombo() {
        return this.nextCombo;
    }

    @NotNull
    public final List<UserCombo> d() {
        return this.userCombos;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllCombos)) {
            return false;
        }
        AllCombos allCombos = (AllCombos) other;
        return Intrinsics.areEqual(this.userCombos, allCombos.userCombos) && Intrinsics.areEqual(this.nextCombo, allCombos.nextCombo);
    }

    public int hashCode() {
        int iHashCode = this.userCombos.hashCode() * 31;
        NextCombo nextCombo = this.nextCombo;
        return iHashCode + (nextCombo == null ? 0 : nextCombo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AllCombos(userCombos=" + this.userCombos + ", nextCombo=" + this.nextCombo + ")";
    }
}
