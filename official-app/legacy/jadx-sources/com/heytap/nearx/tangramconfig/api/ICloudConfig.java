package com.heytap.nearx.tangramconfig.api;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H&J!\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\tH&J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\u0019"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/ICloudConfig;", "", "checkUpdate", "", "conditions", "", "", "configCodeVersion", "Lkotlin/Pair;", "", Fields.CONFIG_CODE, "create", ExifInterface.GPS_DIRECTION_TRUE, "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "destroy", "", "fileService", "Lcom/heytap/nearx/tangramconfig/api/FileService;", "notifyConditionDimenChanged", ResourcesUtil.ResourceType.DIMEN, "notifyProductUpdated", "version", "productVersion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ICloudConfig {
    boolean checkUpdate();

    @NotNull
    Map<String, String> conditions();

    @NotNull
    Pair<String, Integer> configCodeVersion(@NotNull String configCode);

    <T> T create(@NotNull Class<T> service);

    void destroy();

    @NotNull
    FileService fileService();

    void notifyConditionDimenChanged(int dimen);

    void notifyProductUpdated(int version);

    @NotNull
    Pair<String, Integer> productVersion();
}
