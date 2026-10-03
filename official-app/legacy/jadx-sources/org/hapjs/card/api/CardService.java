package org.hapjs.card.api;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.nearme.instant.xcard.CardMessageManager;
import com.nearme.instant.xcard.ICardEngineCallback;
import com.nearme.instant.xcard.InstantCardService;
import org.hapjs.card.api.debug.CardDebugController;
import org.hapjs.card.api.debug.CardDebugService;

/* JADX INFO: loaded from: classes11.dex */
public interface CardService extends InstantCardService {
    void clearImageCache();

    Card createCard(Context context);

    Card createCard(Context context, String str);

    Inset createInset(Activity activity);

    Inset createInset(Activity activity, String str);

    @Deprecated
    void download(String str, int i, DownloadListener downloadListener);

    void download(String str, String str2, DownloadListener downloadListener);

    boolean executeAnima(int i, boolean z, Bundle bundle);

    @Deprecated
    boolean executeAnima(boolean z);

    boolean executeAnima(boolean z, Bundle bundle);

    void getAllApps(GetAllAppsListener getAllAppsListener);

    AppInfo getAppInfo(String str);

    CardDebugController getCardDebugController();

    @Deprecated
    CardDebugService getCardDebugService();

    String getCardEngineVersion();

    int getCardEngineVersionCode();

    CardInfo getCardInfo(String str);

    CardMessageManager getCardMessageManager();

    int getPlatformVersion();

    boolean grantPermissions(String str);

    void init(Context context, String str);

    void init(Context context, String str, ICardEngineCallback iCardEngineCallback);

    void install(String str, int i, InstallListener installListener);

    void install(String str, String str2, InstallListener installListener);

    boolean isInitIdentifier(int i, Bundle bundle);

    void registerIdentifier(int i, boolean z, Bundle bundle);

    void release();

    void resumeWindowBlur(int i);

    void setConfig(CardConfig cardConfig);

    Bundle setDynamicConfig(Bundle bundle);

    void setResContext(Context context);

    void setRuntimeErrorListener(RuntimeErrorListener runtimeErrorListener);

    void setStatisticsListener(StatisticsListener statisticsListener);

    void setTheme(Context context, String str);

    void unRegisterIdentifier(int i, Bundle bundle);

    void uninstall(String str, UninstallListener uninstallListener);

    void updateToInverseColorMode(int i, boolean z, Bundle bundle);

    void updateToInverseColorMode(boolean z);

    void updateToMaterialMode(int i, boolean z, Bundle bundle);

    void updateToMaterialMode(boolean z);

    void updateToNormalMode(int i, boolean z, Bundle bundle);

    void updateToNormalMode(boolean z);

    void updateToSingleClockMode(int i);

    void updateToSingleClockMode(int i, int i2, Bundle bundle);

    void updateToSingleColorMode(int i, Bitmap bitmap, boolean z, Bundle bundle);

    @Deprecated
    void updateToSingleColorMode(int i, boolean z);

    void updateToSingleColorMode(Bitmap bitmap, boolean z);

    void updateToSingleColorModeWithSeedColor(int i, int i2, boolean z, String str, Bundle bundle);
}
