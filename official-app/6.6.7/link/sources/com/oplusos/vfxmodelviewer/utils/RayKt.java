package com.oplusos.vfxmodelviewer.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"pointAt", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "r", "Lcom/oplusos/vfxmodelviewer/utils/Ray;", "t", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class RayKt {
    @NotNull
    public static final Float3 pointAt(@NotNull Ray ray, float f) {
        Intrinsics.checkNotNullParameter(ray, "r");
        Float3 origin = ray.getOrigin();
        Float3 direction = ray.getDirection();
        Float3 float3 = new Float3(direction.getX() * f, direction.getY() * f, direction.getZ() * f);
        return new Float3(origin.getX() + float3.getX(), origin.getY() + float3.getY(), origin.getZ() + float3.getZ());
    }
}
