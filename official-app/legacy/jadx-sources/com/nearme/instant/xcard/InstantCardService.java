package com.nearme.instant.xcard;

import android.content.Context;
import android.os.Bundle;
import com.nearme.instant.xcard.provider.HostLocationAsyncProvider;
import com.nearme.instant.xcard.provider.HostLocationProvider;
import com.nearme.instant.xcard.statitics.StatConfig;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface InstantCardService {
    public static final int FORCE_UPDATE = 100;
    public static final int GET_LOCATION_ASYNC = 101;

    Collection<String> getPermissionDescriptions(String str);

    void init(Context context, String str, ICardEngineListener iCardEngineListener);

    void initOaps(String str, String str2);

    boolean isSetStatConfig();

    boolean isSupport(int i);

    void queryStatus(Context context, ICardStatusListener iCardStatusListener, String... strArr);

    void setCardInterceptor(IInterceptor iInterceptor);

    void setLaunchInterceptor(ILaunchInterceptor iLaunchInterceptor);

    void setLaunchInterceptorV1(ILaunchInterceptorV1 iLaunchInterceptorV1);

    @Deprecated
    void setLocationAsyncProvider(HostLocationAsyncProvider hostLocationAsyncProvider);

    @Deprecated
    void setLocationProvider(HostLocationProvider hostLocationProvider);

    void setMaxFontScale(float f);

    void setMinFontScale(float f);

    void setSdkInitTimeParams(Bundle bundle);

    void setStatConfig(StatConfig statConfig);

    void setSupportBlurBackground(boolean z, Map<String, Object> map);

    void suppressPermissionDialog(boolean z);
}
