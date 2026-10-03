package com.heytap.health.watchface.business.creation.category.flexible.service;

import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.business.store.bean.WfDownloadInfoBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.watchface.business.creation.category.flexible.service.FlexibleProcessingTask, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\b\u0010+\u001a\u00020\u0003H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006,"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleProcessingTask;", "Ljava/io/Serializable;", "uniqueId", "", "deviceMac", "downloadInfoBean", "Lcom/heytap/health/watchface/business/store/bean/WfDownloadInfoBean;", "flexibleRecordParams", "Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleRecordParams;", "currentFavorites", "", "Lcom/heytap/health/watchface/adaptation/base/BaseWatchFaceBean;", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/watchface/business/store/bean/WfDownloadInfoBean;Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleRecordParams;Ljava/util/List;)V", "getCurrentFavorites", "()Ljava/util/List;", "setCurrentFavorites", "(Ljava/util/List;)V", "getDeviceMac", "()Ljava/lang/String;", "setDeviceMac", "(Ljava/lang/String;)V", "getDownloadInfoBean", "()Lcom/heytap/health/watchface/business/store/bean/WfDownloadInfoBean;", "setDownloadInfoBean", "(Lcom/heytap/health/watchface/business/store/bean/WfDownloadInfoBean;)V", "getFlexibleRecordParams", "()Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleRecordParams;", "setFlexibleRecordParams", "(Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleRecordParams;)V", "getUniqueId", "setUniqueId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Task implements Serializable {

    @NotNull
    private List<? extends BaseWatchFaceBean> currentFavorites;

    @NotNull
    private String deviceMac;

    @NotNull
    private WfDownloadInfoBean downloadInfoBean;

    /* JADX INFO: renamed from: flexibleRecordParams, reason: from kotlin metadata and from toString */
    @NotNull
    private Params Params;

    @NotNull
    private String uniqueId;

    public Task(@NotNull String uniqueId, @NotNull String deviceMac, @NotNull WfDownloadInfoBean downloadInfoBean, @NotNull Params flexibleRecordParams, @NotNull List<? extends BaseWatchFaceBean> currentFavorites) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        Intrinsics.checkNotNullParameter(deviceMac, "deviceMac");
        Intrinsics.checkNotNullParameter(downloadInfoBean, "downloadInfoBean");
        Intrinsics.checkNotNullParameter(flexibleRecordParams, "flexibleRecordParams");
        Intrinsics.checkNotNullParameter(currentFavorites, "currentFavorites");
        this.uniqueId = uniqueId;
        this.deviceMac = deviceMac;
        this.downloadInfoBean = downloadInfoBean;
        this.Params = flexibleRecordParams;
        this.currentFavorites = currentFavorites;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task copy$default(Task task, String str, String str2, WfDownloadInfoBean wfDownloadInfoBean, Params params, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = task.uniqueId;
        }
        if ((i & 2) != 0) {
            str2 = task.deviceMac;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            wfDownloadInfoBean = task.downloadInfoBean;
        }
        WfDownloadInfoBean wfDownloadInfoBean2 = wfDownloadInfoBean;
        if ((i & 8) != 0) {
            params = task.Params;
        }
        Params params2 = params;
        if ((i & 16) != 0) {
            list = task.currentFavorites;
        }
        return task.copy(str, str3, wfDownloadInfoBean2, params2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WfDownloadInfoBean getDownloadInfoBean() {
        return this.downloadInfoBean;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Params getParams() {
        return this.Params;
    }

    @NotNull
    public final List<BaseWatchFaceBean> component5() {
        return this.currentFavorites;
    }

    @NotNull
    public final Task copy(@NotNull String uniqueId, @NotNull String deviceMac, @NotNull WfDownloadInfoBean downloadInfoBean, @NotNull Params flexibleRecordParams, @NotNull List<? extends BaseWatchFaceBean> currentFavorites) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        Intrinsics.checkNotNullParameter(deviceMac, "deviceMac");
        Intrinsics.checkNotNullParameter(downloadInfoBean, "downloadInfoBean");
        Intrinsics.checkNotNullParameter(flexibleRecordParams, "flexibleRecordParams");
        Intrinsics.checkNotNullParameter(currentFavorites, "currentFavorites");
        return new Task(uniqueId, deviceMac, downloadInfoBean, flexibleRecordParams, currentFavorites);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Task)) {
            return false;
        }
        Task task = (Task) other;
        return Intrinsics.areEqual(this.uniqueId, task.uniqueId) && Intrinsics.areEqual(this.deviceMac, task.deviceMac) && Intrinsics.areEqual(this.downloadInfoBean, task.downloadInfoBean) && Intrinsics.areEqual(this.Params, task.Params) && Intrinsics.areEqual(this.currentFavorites, task.currentFavorites);
    }

    @NotNull
    public final List<BaseWatchFaceBean> getCurrentFavorites() {
        return this.currentFavorites;
    }

    @NotNull
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final WfDownloadInfoBean getDownloadInfoBean() {
        return this.downloadInfoBean;
    }

    @NotNull
    public final Params getFlexibleRecordParams() {
        return this.Params;
    }

    @NotNull
    public final String getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        return (((((((this.uniqueId.hashCode() * 31) + this.deviceMac.hashCode()) * 31) + this.downloadInfoBean.hashCode()) * 31) + this.Params.hashCode()) * 31) + this.currentFavorites.hashCode();
    }

    public final void setCurrentFavorites(@NotNull List<? extends BaseWatchFaceBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.currentFavorites = list;
    }

    public final void setDeviceMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceMac = str;
    }

    public final void setDownloadInfoBean(@NotNull WfDownloadInfoBean wfDownloadInfoBean) {
        Intrinsics.checkNotNullParameter(wfDownloadInfoBean, "<set-?>");
        this.downloadInfoBean = wfDownloadInfoBean;
    }

    public final void setFlexibleRecordParams(@NotNull Params params) {
        Intrinsics.checkNotNullParameter(params, "<set-?>");
        this.Params = params;
    }

    public final void setUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uniqueId = str;
    }

    @NotNull
    public String toString() {
        return "Task(downloadInfoBean=" + this.downloadInfoBean + ", Params=" + this.Params + ", currentFavorites=" + this.currentFavorites + ")";
    }

    public /* synthetic */ Task(String str, String str2, WfDownloadInfoBean wfDownloadInfoBean, Params params, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, wfDownloadInfoBean, params, (i & 16) != 0 ? new ArrayList() : list);
    }
}
