package com.heytap.nearx.cloudconfig.api;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&J!\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH&¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H&J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0016H&¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/ICloudConfig;", "", "checkUpdate", "", "conditions", "", "", "create", ExifInterface.GPS_DIRECTION_TRUE, "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "destroy", "", "fileService", "Lcom/heytap/nearx/cloudconfig/api/FileService;", "notifyConditionDimenChanged", ResourcesUtil.ResourceType.DIMEN, "", "notifyProductUpdated", "version", "productVersion", "Lkotlin/Pair;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface ICloudConfig {
    boolean checkUpdate();

    @NotNull
    Map<String, String> conditions();

    <T> T create(@NotNull Class<T> service);

    void destroy();

    @NotNull
    FileService fileService();

    void notifyConditionDimenChanged(int dimen);

    void notifyProductUpdated(int version);

    @NotNull
    Pair<String, Integer> productVersion();
}
