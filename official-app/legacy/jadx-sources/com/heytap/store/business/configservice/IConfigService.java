package com.heytap.store.business.configservice;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0007H&J\"\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u000fH&J,\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0007H&J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H&J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/business/configservice/IConfigService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "getCacheConfig", "", "", "configName", "getColorConfig", "", "context", "Landroid/content/Context;", "key", "resId", "getColorConfigWithDefaultColor", "defaultColor", "getConfigViewModel", "Lcom/heytap/store/business/configservice/IConfigViewModel;", "getStringConfig", "defaultString", "getSwitchConfig", "", "default", "registerLocalDbService", "", "localConfigDbService", "Lcom/heytap/store/business/configservice/LocalConfigDbService;", "config-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IConfigService extends IProvider {
    @NotNull
    Map<String, String> getCacheConfig(@NotNull String configName);

    int getColorConfig(@NotNull String configName, @Nullable Context context, @NotNull String key, @ColorRes int resId);

    int getColorConfigWithDefaultColor(@NotNull String configName, @NotNull String key, @ColorInt int defaultColor);

    @NotNull
    IConfigViewModel getConfigViewModel();

    @NotNull
    String getStringConfig(@NotNull String configName, @Nullable Context context, @NotNull String key, @StringRes int resId);

    @NotNull
    String getStringConfig(@NotNull String configName, @NotNull String key, @NotNull String defaultString);

    boolean getSwitchConfig(@NotNull String configName, @NotNull String key, boolean z);

    void registerLocalDbService(@Nullable LocalConfigDbService localConfigDbService);
}
