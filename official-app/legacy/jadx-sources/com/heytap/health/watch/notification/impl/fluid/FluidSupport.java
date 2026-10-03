package com.heytap.health.watch.notification.impl.fluid;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.constants.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/watch/notification/impl/fluid/FluidSupport;", "", "brandCodes", "", "", Constants.KEY_SERVICE_IDS, "(Ljava/util/List;Ljava/util/List;)V", "getBrandCodes", "()Ljava/util/List;", "getServiceIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FluidSupport {

    @NotNull
    private final List<String> brandCodes;

    @NotNull
    private final List<String> serviceIds;

    public FluidSupport(@NotNull List<String> brandCodes, @NotNull List<String> serviceIds) {
        Intrinsics.checkNotNullParameter(brandCodes, "brandCodes");
        Intrinsics.checkNotNullParameter(serviceIds, "serviceIds");
        this.brandCodes = brandCodes;
        this.serviceIds = serviceIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FluidSupport copy$default(FluidSupport fluidSupport, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fluidSupport.brandCodes;
        }
        if ((i & 2) != 0) {
            list2 = fluidSupport.serviceIds;
        }
        return fluidSupport.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.brandCodes;
    }

    @NotNull
    public final List<String> component2() {
        return this.serviceIds;
    }

    @NotNull
    public final FluidSupport copy(@NotNull List<String> brandCodes, @NotNull List<String> serviceIds) {
        Intrinsics.checkNotNullParameter(brandCodes, "brandCodes");
        Intrinsics.checkNotNullParameter(serviceIds, "serviceIds");
        return new FluidSupport(brandCodes, serviceIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FluidSupport)) {
            return false;
        }
        FluidSupport fluidSupport = (FluidSupport) other;
        return Intrinsics.areEqual(this.brandCodes, fluidSupport.brandCodes) && Intrinsics.areEqual(this.serviceIds, fluidSupport.serviceIds);
    }

    @NotNull
    public final List<String> getBrandCodes() {
        return this.brandCodes;
    }

    @NotNull
    public final List<String> getServiceIds() {
        return this.serviceIds;
    }

    public int hashCode() {
        return (this.brandCodes.hashCode() * 31) + this.serviceIds.hashCode();
    }

    @NotNull
    public String toString() {
        return "FluidSupport(brandCodes=" + this.brandCodes + ", serviceIds=" + this.serviceIds + ")";
    }
}
