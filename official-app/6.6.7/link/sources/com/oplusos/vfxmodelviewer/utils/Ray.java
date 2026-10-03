package com.oplusos.vfxmodelviewer.utils;

import com.oplus.aiunit.vision.vr3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Ray;", "", "origin", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "direction", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "getDirection", "()Lcom/oplusos/vfxmodelviewer/utils/Float3;", "setDirection", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "getOrigin", "setOrigin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Ray {

    @NotNull
    private Float3 direction;

    @NotNull
    private Float3 origin;

    public Ray(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "origin");
        Intrinsics.checkNotNullParameter(float4, "direction");
        this.origin = float3;
        this.direction = float4;
    }

    public static /* synthetic */ Ray copy$default(Ray ray, Float3 float3, Float3 float4, int i, Object obj) {
        if ((i & 1) != 0) {
            float3 = ray.origin;
        }
        if ((i & 2) != 0) {
            float4 = ray.direction;
        }
        return ray.copy(float3, float4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float3 getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float3 getDirection() {
        return this.direction;
    }

    @NotNull
    public final Ray copy(@NotNull Float3 origin, @NotNull Float3 direction) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new Ray(origin, direction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ray)) {
            return false;
        }
        Ray ray = (Ray) other;
        return Intrinsics.areEqual(this.origin, ray.origin) && Intrinsics.areEqual(this.direction, ray.direction);
    }

    @NotNull
    public final Float3 getDirection() {
        return this.direction;
    }

    @NotNull
    public final Float3 getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return (this.origin.hashCode() * 31) + this.direction.hashCode();
    }

    public final void setDirection(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.direction = float3;
    }

    public final void setOrigin(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.origin = float3;
    }

    @NotNull
    public String toString() {
        return "Ray(origin=" + this.origin + ", direction=" + this.direction + ')';
    }

    public /* synthetic */ Ray(Float3 float3, Float3 float4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null) : float3, float4);
    }
}
