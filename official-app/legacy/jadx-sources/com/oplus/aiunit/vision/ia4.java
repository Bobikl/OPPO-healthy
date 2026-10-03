package com.oplus.aiunit.vision;

import com.pantanal.server.content.upkmanage.entity.UpkEntity;
import com.pantanal.server.content.upkmanage.entity.UpkInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/ia4;", "", "Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "upkInfo", "Lcom/pantanal/server/content/upkmanage/entity/UpkEntity;", "a", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class ia4 {

    @NotNull
    public static final ia4 INSTANCE = new ia4();

    @JvmStatic
    @NotNull
    public static final UpkEntity a(@NotNull UpkInfo upkInfo) {
        Intrinsics.checkNotNullParameter(upkInfo, "upkInfo");
        f7b.h("ConvertUtils", "toUpkEntity, serviceId: " + ((Object) upkInfo.getServiceId()) + ", packageName: " + ((Object) upkInfo.getPackageName()));
        UpkEntity upkEntity = new UpkEntity();
        upkEntity.setServiceId(upkInfo.getServiceId());
        String serviceId = upkEntity.getServiceId();
        upkEntity.setHashServiceId(serviceId == null ? null : ts5.c(serviceId));
        upkEntity.setPackageName(upkInfo.getPackageName());
        upkEntity.setLabel(upkInfo.getLabel());
        upkEntity.setIcons(upkInfo.getIcons());
        upkEntity.setVersionCode(upkInfo.getVersionCode());
        upkEntity.setVersionName(upkInfo.getVersionName());
        return upkEntity;
    }
}
