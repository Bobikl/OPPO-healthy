package com.heytap.health.community.service;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.JsonObject;
import com.heytap.health.community.photo.ChoosePhotosUseCase;
import com.heytap.health.community.photo.PickResizePhotoUseCase;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.na3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/community/service")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/community/service/CommunityServiceImpl;", "Lcom/heytap/health/community/service/CommunityService;", "Lcom/google/gson/JsonObject;", "jsonObject", "Lcom/oplus/aiunit/vision/na3;", "callback", "", "w8", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Context;", "context", "init", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CommunityServiceImpl implements CommunityService {
    @Override // com.heytap.health.community.service.CommunityService
    public void T(int width, int height, @NotNull na3 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        new PickResizePhotoUseCase().b(width, height, callback);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.community.service.CommunityService
    public void w8(@NotNull JsonObject jsonObject, @NotNull na3 callback) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new ChoosePhotosUseCase().h(jsonObject, callback);
    }
}
