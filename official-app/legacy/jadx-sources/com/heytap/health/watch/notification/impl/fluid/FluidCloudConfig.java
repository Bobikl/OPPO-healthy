package com.heytap.health.watch.notification.impl.fluid;

import androidx.annotation.Keep;
import com.heytap.store.base.core.http.HttpUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/watch/notification/impl/fluid/FluidCloudConfig;", "", "supportApps", "", "Lcom/heytap/health/watch/notification/impl/fluid/FluidAppInfo;", "serviceHostMapping", "Lcom/heytap/health/watch/notification/impl/fluid/FluidServiceKV;", "(Ljava/util/List;Ljava/util/List;)V", "getServiceHostMapping", "()Ljava/util/List;", "getSupportApps", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FluidCloudConfig {

    @NotNull
    private final List<FluidServiceKV> serviceHostMapping;

    @NotNull
    private final List<FluidAppInfo> supportApps;

    /* JADX WARN: Multi-variable type inference failed */
    public FluidCloudConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FluidCloudConfig copy$default(FluidCloudConfig fluidCloudConfig, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fluidCloudConfig.supportApps;
        }
        if ((i & 2) != 0) {
            list2 = fluidCloudConfig.serviceHostMapping;
        }
        return fluidCloudConfig.copy(list, list2);
    }

    @NotNull
    public final List<FluidAppInfo> component1() {
        return this.supportApps;
    }

    @NotNull
    public final List<FluidServiceKV> component2() {
        return this.serviceHostMapping;
    }

    @NotNull
    public final FluidCloudConfig copy(@NotNull List<FluidAppInfo> supportApps, @NotNull List<FluidServiceKV> serviceHostMapping) {
        Intrinsics.checkNotNullParameter(supportApps, "supportApps");
        Intrinsics.checkNotNullParameter(serviceHostMapping, "serviceHostMapping");
        return new FluidCloudConfig(supportApps, serviceHostMapping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FluidCloudConfig)) {
            return false;
        }
        FluidCloudConfig fluidCloudConfig = (FluidCloudConfig) other;
        return Intrinsics.areEqual(this.supportApps, fluidCloudConfig.supportApps) && Intrinsics.areEqual(this.serviceHostMapping, fluidCloudConfig.serviceHostMapping);
    }

    @NotNull
    public final List<FluidServiceKV> getServiceHostMapping() {
        return this.serviceHostMapping;
    }

    @NotNull
    public final List<FluidAppInfo> getSupportApps() {
        return this.supportApps;
    }

    public int hashCode() {
        return (this.supportApps.hashCode() * 31) + this.serviceHostMapping.hashCode();
    }

    @NotNull
    public String toString() {
        return "FluidCloudConfig : apps=[" + CollectionsKt___CollectionsKt.joinToString$default(this.supportApps, ",", null, null, 0, null, new Function1<FluidAppInfo, CharSequence>() { // from class: com.heytap.health.watch.notification.impl.fluid.FluidCloudConfig$toString$appPkgLog$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull FluidAppInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getHostPkgName() + HttpUtils.EQUAL_SIGN + it.getBrandCode();
            }
        }, 30, null) + "], mappings=[" + CollectionsKt___CollectionsKt.joinToString$default(this.serviceHostMapping, ",", null, null, 0, null, new Function1<FluidServiceKV, CharSequence>() { // from class: com.heytap.health.watch.notification.impl.fluid.FluidCloudConfig$toString$mappingLog$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull FluidServiceKV it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getHostPkgName() + HttpUtils.EQUAL_SIGN + it.getServiceId();
            }
        }, 30, null) + "]";
    }

    public FluidCloudConfig(@NotNull List<FluidAppInfo> supportApps, @NotNull List<FluidServiceKV> serviceHostMapping) {
        Intrinsics.checkNotNullParameter(supportApps, "supportApps");
        Intrinsics.checkNotNullParameter(serviceHostMapping, "serviceHostMapping");
        this.supportApps = supportApps;
        this.serviceHostMapping = serviceHostMapping;
    }

    public /* synthetic */ FluidCloudConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
