package com.heytap.health.community.service;

import androidx.exifinterface.media.ExifInterface;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.google.gson.JsonObject;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.na3;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lcom/heytap/health/community/service/CommunityService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/google/gson/JsonObject;", "jsonObject", "Lcom/oplus/aiunit/vision/na3;", "callback", "", "w8", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, ExifInterface.GPS_DIRECTION_TRUE, "community_release"}, k = 1, mv = {1, 8, 0})
public interface CommunityService extends IProvider {
    void T(int width, int height, @NotNull na3 callback);

    void w8(@NotNull JsonObject jsonObject, @NotNull na3 callback);
}
