package com.oplus.aiunit.vision;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.toe, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\n\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\n\u0012\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR+\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/toe;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "c", "()Ljava/util/ArrayList;", "srcArray", "b", "firstFrameSrcArray", "fgSrcArray", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PrePackSourceBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final ArrayList<String> srcArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final ArrayList<String> firstFrameSrcArray;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final ArrayList<String> fgSrcArray;

    public PrePackSourceBean(@NotNull ArrayList<String> srcArray, @NotNull ArrayList<String> firstFrameSrcArray, @Nullable ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(srcArray, "srcArray");
        Intrinsics.checkNotNullParameter(firstFrameSrcArray, "firstFrameSrcArray");
        this.srcArray = srcArray;
        this.firstFrameSrcArray = firstFrameSrcArray;
        this.fgSrcArray = arrayList;
    }

    @Nullable
    public final ArrayList<String> a() {
        return this.fgSrcArray;
    }

    @NotNull
    public final ArrayList<String> b() {
        return this.firstFrameSrcArray;
    }

    @NotNull
    public final ArrayList<String> c() {
        return this.srcArray;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrePackSourceBean)) {
            return false;
        }
        PrePackSourceBean prePackSourceBean = (PrePackSourceBean) other;
        return Intrinsics.areEqual(this.srcArray, prePackSourceBean.srcArray) && Intrinsics.areEqual(this.firstFrameSrcArray, prePackSourceBean.firstFrameSrcArray) && Intrinsics.areEqual(this.fgSrcArray, prePackSourceBean.fgSrcArray);
    }

    public int hashCode() {
        int iHashCode = ((this.srcArray.hashCode() * 31) + this.firstFrameSrcArray.hashCode()) * 31;
        ArrayList<String> arrayList = this.fgSrcArray;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @NotNull
    public String toString() {
        return "PrePackSourceBean(srcArray=" + this.srcArray + ", firstFrameSrcArray=" + this.firstFrameSrcArray + ", fgSrcArray=" + this.fgSrcArray + ")";
    }

    public /* synthetic */ PrePackSourceBean(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, arrayList2, (i & 4) != 0 ? null : arrayList3);
    }
}
