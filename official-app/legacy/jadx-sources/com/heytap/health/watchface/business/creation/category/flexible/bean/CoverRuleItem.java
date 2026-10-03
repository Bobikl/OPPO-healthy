package com.heytap.health.watchface.business.creation.category.flexible.bean;

import android.graphics.Rect;
import androidx.annotation.Keep;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;", "", "regions", "", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/Region;", ParserTag.TYPE_CONSTRAINT, "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/Constraint;", "(Ljava/util/List;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/Constraint;)V", "getConstraint", "()Lcom/heytap/health/watchface/business/creation/category/flexible/bean/Constraint;", "getRegions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toRects", "Landroid/graphics/Rect;", "toString", "", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlbumPhotoBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumPhotoBean.kt\ncom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,427:1\n1549#2:428\n1620#2,3:429\n*S KotlinDebug\n*F\n+ 1 AlbumPhotoBean.kt\ncom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem\n*L\n238#1:428\n238#1:429,3\n*E\n"})
public final /* data */ class CoverRuleItem {

    @NotNull
    private final Constraint constraint;

    @NotNull
    private final List<Region> regions;

    public CoverRuleItem(@NotNull List<Region> regions, @NotNull Constraint constraint) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(constraint, "constraint");
        this.regions = regions;
        this.constraint = constraint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoverRuleItem copy$default(CoverRuleItem coverRuleItem, List list, Constraint constraint, int i, Object obj) {
        if ((i & 1) != 0) {
            list = coverRuleItem.regions;
        }
        if ((i & 2) != 0) {
            constraint = coverRuleItem.constraint;
        }
        return coverRuleItem.copy(list, constraint);
    }

    @NotNull
    public final List<Region> component1() {
        return this.regions;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Constraint getConstraint() {
        return this.constraint;
    }

    @NotNull
    public final CoverRuleItem copy(@NotNull List<Region> regions, @NotNull Constraint constraint) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(constraint, "constraint");
        return new CoverRuleItem(regions, constraint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoverRuleItem)) {
            return false;
        }
        CoverRuleItem coverRuleItem = (CoverRuleItem) other;
        return Intrinsics.areEqual(this.regions, coverRuleItem.regions) && Intrinsics.areEqual(this.constraint, coverRuleItem.constraint);
    }

    @NotNull
    public final Constraint getConstraint() {
        return this.constraint;
    }

    @NotNull
    public final List<Region> getRegions() {
        return this.regions;
    }

    public int hashCode() {
        return (this.regions.hashCode() * 31) + this.constraint.hashCode();
    }

    @NotNull
    public final List<Rect> toRects() {
        List<Region> list = this.regions;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Region) it.next()).toRect());
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "CoverRuleItem(regions=" + this.regions + ", constraint=" + this.constraint + ")";
    }
}
