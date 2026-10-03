package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.di3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/di3;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/oplus/aiunit/vision/hke;", "a", "Ljava/util/List;", "()Ljava/util/List;", "materielList", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CloudImgs {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("materielList")
    @NotNull
    private final List<hke> materielList;

    @NotNull
    public final List<hke> a() {
        return this.materielList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloudImgs) && Intrinsics.areEqual(this.materielList, ((CloudImgs) other).materielList);
    }

    public int hashCode() {
        return this.materielList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CloudImgs(materielList=" + this.materielList + ")";
    }
}
