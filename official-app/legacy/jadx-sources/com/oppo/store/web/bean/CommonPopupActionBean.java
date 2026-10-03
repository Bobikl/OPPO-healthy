package com.oppo.store.web.bean;

import androidx.annotation.Keep;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/oppo/store/web/bean/CommonPopupActionBean;", "", SAPropertyFilter.PROPERTIES, "Lcom/oppo/store/web/bean/Property;", "bizData", "(Lcom/oppo/store/web/bean/Property;Ljava/lang/Object;)V", "getBizData", "()Ljava/lang/Object;", "getProperties", "()Lcom/oppo/store/web/bean/Property;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CommonPopupActionBean {

    @Nullable
    private final Object bizData;

    @Nullable
    private final Property properties;

    public CommonPopupActionBean(@Nullable Property property, @Nullable Object obj) {
        this.properties = property;
        this.bizData = obj;
    }

    public static /* synthetic */ CommonPopupActionBean copy$default(CommonPopupActionBean commonPopupActionBean, Property property, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            property = commonPopupActionBean.properties;
        }
        if ((i & 2) != 0) {
            obj = commonPopupActionBean.bizData;
        }
        return commonPopupActionBean.copy(property, obj);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Property getProperties() {
        return this.properties;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getBizData() {
        return this.bizData;
    }

    @NotNull
    public final CommonPopupActionBean copy(@Nullable Property properties, @Nullable Object bizData) {
        return new CommonPopupActionBean(properties, bizData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonPopupActionBean)) {
            return false;
        }
        CommonPopupActionBean commonPopupActionBean = (CommonPopupActionBean) other;
        return Intrinsics.areEqual(this.properties, commonPopupActionBean.properties) && Intrinsics.areEqual(this.bizData, commonPopupActionBean.bizData);
    }

    @Nullable
    public final Object getBizData() {
        return this.bizData;
    }

    @Nullable
    public final Property getProperties() {
        return this.properties;
    }

    public int hashCode() {
        Property property = this.properties;
        int iHashCode = (property == null ? 0 : property.hashCode()) * 31;
        Object obj = this.bizData;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonPopupActionBean(properties=" + this.properties + ", bizData=" + this.bizData + ')';
    }
}
