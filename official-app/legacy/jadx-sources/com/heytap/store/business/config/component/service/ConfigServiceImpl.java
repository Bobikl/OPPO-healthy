package com.heytap.store.business.config.component.service;

import android.content.Context;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import com.heytap.store.business.config.constant.Constants;
import com.heytap.store.business.config.viewmodel.ConfigViewModel;
import com.heytap.store.business.config.viewmodel.LocalConfigHandler;
import com.heytap.store.business.configservice.IConfigService;
import com.heytap.store.business.configservice.IConfigViewModel;
import com.heytap.store.business.configservice.LocalConfigDbService;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = Constants.SERVICE_PATH)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J*\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/business/config/component/service/ConfigServiceImpl;", "Lcom/heytap/store/business/configservice/IConfigService;", "()V", "getCacheConfig", "", "", "configName", "getColorConfig", "", "context", "Landroid/content/Context;", "key", "resId", "getColorConfigWithDefaultColor", "defaultColor", "getConfigViewModel", "Lcom/heytap/store/business/configservice/IConfigViewModel;", "getStringConfig", "defaultString", "getSwitchConfig", "", "default", "init", "", "registerLocalDbService", "localConfigDbService", "Lcom/heytap/store/business/configservice/LocalConfigDbService;", "config-impl_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ConfigServiceImpl implements IConfigService {
    @Override // com.heytap.store.business.configservice.IConfigService
    @NotNull
    public Map<String, String> getCacheConfig(@NotNull String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Map<String, String> map = LocalConfigHandler.INSTANCE.getMap().get(configName);
        return map == null ? new LinkedHashMap() : map;
    }

    @Override // com.heytap.store.business.configservice.IConfigService
    public int getColorConfig(@NotNull String configName, @Nullable Context context, @NotNull String key, int resId) {
        String strStringPlus;
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = LocalConfigHandler.INSTANCE.getMap().get(configName);
        if (map != null && (strStringPlus = map.get(key)) != null) {
            try {
                if (!StringsKt__StringsJVMKt.startsWith$default(strStringPlus, "#", false, 2, null)) {
                    strStringPlus = Intrinsics.stringPlus("#", strStringPlus);
                }
                return Color.parseColor(strStringPlus);
            } catch (Exception unused) {
            }
        }
        if (context == null) {
            return 0;
        }
        return ContextCompat.getColor(context, resId);
    }

    @Override // com.heytap.store.business.configservice.IConfigService
    public int getColorConfigWithDefaultColor(@NotNull String configName, @NotNull String key, int defaultColor) {
        String strStringPlus;
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = LocalConfigHandler.INSTANCE.getMap().get(configName);
        if (map != null && (strStringPlus = map.get(key)) != null) {
            try {
                if (!StringsKt__StringsJVMKt.startsWith$default(strStringPlus, "#", false, 2, null)) {
                    strStringPlus = Intrinsics.stringPlus("#", strStringPlus);
                }
                return Color.parseColor(strStringPlus);
            } catch (Exception unused) {
            }
        }
        return defaultColor;
    }

    @Override // com.heytap.store.business.configservice.IConfigService
    @NotNull
    public IConfigViewModel getConfigViewModel() {
        return new ConfigViewModel();
    }

    @Override // com.heytap.store.business.configservice.IConfigService
    @NotNull
    public String getStringConfig(@NotNull String configName, @Nullable Context context, @NotNull String key, int resId) {
        String string;
        String str;
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = LocalConfigHandler.INSTANCE.getMap().get(configName);
        if (map == null || (str = map.get(key)) == null) {
            return (context == null || (string = context.getString(resId)) == null) ? "" : string;
        }
        return str;
    }

    @Override // com.heytap.store.business.configservice.IConfigService
    public boolean getSwitchConfig(@NotNull String configName, @NotNull String key, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = LocalConfigHandler.INSTANCE.getMap().get(configName);
        if (map != null && (str = map.get(key)) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode != 3569038) {
                        if (iHashCode == 97196323 && str.equals(SpeechConstant.FALSE_STR)) {
                            return false;
                        }
                    } else if (str.equals(SpeechConstant.TRUE_STR)) {
                        return true;
                    }
                } else if (str.equals("1")) {
                    return true;
                }
            } else if (str.equals("0")) {
                return false;
            }
        }
        return z;
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.store.business.configservice.IConfigService
    public void registerLocalDbService(@Nullable LocalConfigDbService localConfigDbService) {
        LocalConfigHandler.INSTANCE.setLocalConfigService(localConfigDbService);
    }

    @Override // com.heytap.store.business.configservice.IConfigService
    @NotNull
    public String getStringConfig(@NotNull String configName, @NotNull String key, @NotNull String defaultString) {
        String str;
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultString, "defaultString");
        Map<String, String> map = LocalConfigHandler.INSTANCE.getMap().get(configName);
        return (map == null || (str = map.get(key)) == null) ? defaultString : str;
    }
}
