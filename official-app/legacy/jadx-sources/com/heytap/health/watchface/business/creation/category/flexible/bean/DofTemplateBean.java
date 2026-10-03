package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateBean;", "", "id", "", "supportType", "", "", "imageResDesc", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateImageResDesc;", "timeStyleDesc", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateTimeStyleDesc;", "complicationDesc", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateComplicationDesc;", "(ILjava/util/List;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateImageResDesc;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateTimeStyleDesc;Ljava/util/List;)V", "getComplicationDesc", "()Ljava/util/List;", "getId", "()I", "getImageResDesc", "()Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateImageResDesc;", "getSupportType", "getTimeStyleDesc", "()Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateTimeStyleDesc;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DofTemplateBean {

    @NotNull
    private final List<DofTemplateComplicationDesc> complicationDesc;
    private final int id;

    @NotNull
    private final DofTemplateImageResDesc imageResDesc;

    @NotNull
    private final List<String> supportType;

    @NotNull
    private final DofTemplateTimeStyleDesc timeStyleDesc;

    public DofTemplateBean() {
        this(0, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DofTemplateBean copy$default(DofTemplateBean dofTemplateBean, int i, List list, DofTemplateImageResDesc dofTemplateImageResDesc, DofTemplateTimeStyleDesc dofTemplateTimeStyleDesc, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dofTemplateBean.id;
        }
        if ((i2 & 2) != 0) {
            list = dofTemplateBean.supportType;
        }
        List list3 = list;
        if ((i2 & 4) != 0) {
            dofTemplateImageResDesc = dofTemplateBean.imageResDesc;
        }
        DofTemplateImageResDesc dofTemplateImageResDesc2 = dofTemplateImageResDesc;
        if ((i2 & 8) != 0) {
            dofTemplateTimeStyleDesc = dofTemplateBean.timeStyleDesc;
        }
        DofTemplateTimeStyleDesc dofTemplateTimeStyleDesc2 = dofTemplateTimeStyleDesc;
        if ((i2 & 16) != 0) {
            list2 = dofTemplateBean.complicationDesc;
        }
        return dofTemplateBean.copy(i, list3, dofTemplateImageResDesc2, dofTemplateTimeStyleDesc2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<String> component2() {
        return this.supportType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DofTemplateImageResDesc getImageResDesc() {
        return this.imageResDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DofTemplateTimeStyleDesc getTimeStyleDesc() {
        return this.timeStyleDesc;
    }

    @NotNull
    public final List<DofTemplateComplicationDesc> component5() {
        return this.complicationDesc;
    }

    @NotNull
    public final DofTemplateBean copy(int id, @NotNull List<String> supportType, @NotNull DofTemplateImageResDesc imageResDesc, @NotNull DofTemplateTimeStyleDesc timeStyleDesc, @NotNull List<DofTemplateComplicationDesc> complicationDesc) {
        Intrinsics.checkNotNullParameter(supportType, "supportType");
        Intrinsics.checkNotNullParameter(imageResDesc, "imageResDesc");
        Intrinsics.checkNotNullParameter(timeStyleDesc, "timeStyleDesc");
        Intrinsics.checkNotNullParameter(complicationDesc, "complicationDesc");
        return new DofTemplateBean(id, supportType, imageResDesc, timeStyleDesc, complicationDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DofTemplateBean)) {
            return false;
        }
        DofTemplateBean dofTemplateBean = (DofTemplateBean) other;
        return this.id == dofTemplateBean.id && Intrinsics.areEqual(this.supportType, dofTemplateBean.supportType) && Intrinsics.areEqual(this.imageResDesc, dofTemplateBean.imageResDesc) && Intrinsics.areEqual(this.timeStyleDesc, dofTemplateBean.timeStyleDesc) && Intrinsics.areEqual(this.complicationDesc, dofTemplateBean.complicationDesc);
    }

    @NotNull
    public final List<DofTemplateComplicationDesc> getComplicationDesc() {
        return this.complicationDesc;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final DofTemplateImageResDesc getImageResDesc() {
        return this.imageResDesc;
    }

    @NotNull
    public final List<String> getSupportType() {
        return this.supportType;
    }

    @NotNull
    public final DofTemplateTimeStyleDesc getTimeStyleDesc() {
        return this.timeStyleDesc;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.supportType.hashCode()) * 31) + this.imageResDesc.hashCode()) * 31) + this.timeStyleDesc.hashCode()) * 31) + this.complicationDesc.hashCode();
    }

    @NotNull
    public String toString() {
        return "DofTemplateBean(id=" + this.id + ", supportType=" + this.supportType + ", imageResDesc=" + this.imageResDesc + ", timeStyleDesc=" + this.timeStyleDesc + ", complicationDesc=" + this.complicationDesc + ")";
    }

    public DofTemplateBean(int i, @NotNull List<String> supportType, @NotNull DofTemplateImageResDesc imageResDesc, @NotNull DofTemplateTimeStyleDesc timeStyleDesc, @NotNull List<DofTemplateComplicationDesc> complicationDesc) {
        Intrinsics.checkNotNullParameter(supportType, "supportType");
        Intrinsics.checkNotNullParameter(imageResDesc, "imageResDesc");
        Intrinsics.checkNotNullParameter(timeStyleDesc, "timeStyleDesc");
        Intrinsics.checkNotNullParameter(complicationDesc, "complicationDesc");
        this.id = i;
        this.supportType = supportType;
        this.imageResDesc = imageResDesc;
        this.timeStyleDesc = timeStyleDesc;
        this.complicationDesc = complicationDesc;
    }

    public /* synthetic */ DofTemplateBean(int i, List list, DofTemplateImageResDesc dofTemplateImageResDesc, DofTemplateTimeStyleDesc dofTemplateTimeStyleDesc, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? new DofTemplateImageResDesc(null, null, null, null, 15, null) : dofTemplateImageResDesc, (i2 & 8) != 0 ? new DofTemplateTimeStyleDesc(null, null, 0, 0, 0, 31, null) : dofTemplateTimeStyleDesc, (i2 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
