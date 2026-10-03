package com.heytap.nearx.tangramconfig.statistic;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.bean.ConfigTrace;
import com.heytap.nearx.tangramconfig.datasource.DirConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.tangramconfig.util.LogUtils;
import com.oplus.nearx.track.TrackApi;
import com.oplus.nearx.track.TrackApiHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004J*\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/heytap/nearx/tangramconfig/statistic/Statistics;", "", "()V", "GROUP_ID", "", "OBUS_APPID", "", "OBUS_APPK", "OBUS_APPS", "QUERY_CONFIG_RESULT", "TAG", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "packageName", "statEnable", "", "getStatEnable", "()Z", "setStatEnable", "(Z)V", "checkAccessClass", "getEventId", Fields.PRODUCT_ID, "configcode", "init", "", HttpHeaders.CTX, "Landroid/content/Context;", "initTrackApi", "context", "recordQueryStatistic", "configTrace", "Lcom/heytap/nearx/tangramconfig/bean/ConfigTrace;", "result", "recordStatistic", "categoryId", "eventId", "map", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Statistics {

    @NotNull
    private static final String GROUP_ID = "tanggram_sdk";
    private static final long OBUS_APPID = 136101;

    @NotNull
    private static final String OBUS_APPK = "2220";

    @NotNull
    private static final String OBUS_APPS = "PUNT4UrlQhKUrdZUvXON0kVEsg3ydScG";

    @NotNull
    private static final String QUERY_CONFIG_RESULT = "query_";

    @Nullable
    private static String packageName;
    private static boolean statEnable;

    @NotNull
    public static final Statistics INSTANCE = new Statistics();

    @NotNull
    private static final String TAG = "CloudConfig_EntityDB";

    @NotNull
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    private Statistics() {
    }

    private final boolean checkAccessClass() {
        try {
            TrackApiHelper trackApiHelper = TrackApiHelper.INSTANCE;
            return true;
        } catch (ClassNotFoundException unused) {
            Log.e(TAG, "当前业务没有集成埋点SDK,请集成com.oplus.nearx:track:3.4.29.1或更新版本!");
            return false;
        }
    }

    private final String getEventId(String productId, String configcode) {
        if (TextUtils.isEmpty(packageName) || TextUtils.isEmpty(productId) || TextUtils.isEmpty(configcode)) {
            return "";
        }
        String str = packageName;
        packageName = str != null ? StringsKt__StringsJVMKt.replace$default(str, ".", "_", false, 4, (Object) null) : null;
        return QUERY_CONFIG_RESULT + packageName + '_' + productId + '_' + configcode;
    }

    private final void initTrackApi(Context context) {
        try {
            if (!(context instanceof Application)) {
                Log.e(TAG, "init TrackApi context error");
                return;
            }
            isInitialized.compareAndSet(false, true);
            try {
                packageName = ((Application) context).getPackageName();
                TrackApi.c cVarA = new TrackApi.c.a(TrackApiHelper.INSTANCE.getRegion()).c(false).a();
                TrackApi.Companion companion = TrackApi.INSTANCE;
                companion.n((Application) context, cVarA);
                companion.j(OBUS_APPID).D(new TrackApi.b.a(OBUS_APPK, OBUS_APPS).a());
            } catch (Throwable th) {
                Log.e(TAG, "init TrackApi error", th);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean getStatEnable() {
        return statEnable;
    }

    public final void init(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    public final void recordQueryStatistic(@NotNull ConfigTrace configTrace, @NotNull String result) {
        Intrinsics.checkNotNullParameter(configTrace, "configTrace");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            if (isInitialized.get() && configTrace.getDirConfig() != null) {
                String productId = configTrace.getDirConfig().getProductId();
                Log.d(TAG, "recordQueryStatistic productId : " + productId);
                String configId = configTrace.getConfigId();
                if (TextUtils.isEmpty(getEventId(productId, configId))) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("sdk_version", "1216");
                map.put("product_id", productId);
                map.put("product_version", String.valueOf(configTrace.getDirConfig().productVersion()));
                map.put("configcode", configId);
                map.put("config_version", String.valueOf(configTrace.getConfigVersion()));
                map.put("config_max_version", String.valueOf(DirConfig.configMaxVersion$default(configTrace.getDirConfig(), configId, 0, 2, null)));
                map.put("type", String.valueOf(configTrace.getConfigType()));
                map.put("query_result", result);
            }
        } catch (Throwable th) {
            LogUtils.INSTANCE.e(TAG, "recordQueryStatistic error", th, new Object[0]);
        }
    }

    public final void recordStatistic(@NotNull String categoryId, @NotNull String eventId, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(map, "map");
        try {
            isInitialized.get();
        } catch (Throwable unused) {
        }
    }

    public final void setStatEnable(boolean z) {
        statEnable = z;
    }
}
