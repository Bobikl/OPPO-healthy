package com.heytap.nearx.tangramconfig.strategy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.mspsdk.core.b;
import com.heytap.mspsdk.log.MspLog;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.kit.DataCallback;
import com.heytap.nearx.tangramconfig.kit.KitSdk;
import com.heytap.nearx.tangramconfig.util.AppInfoUtil;
import com.heytap.nearx.tangramconfig.util.KitSPUtils;
import com.heytap.nearx.tangramconfig.util.ProcessProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010!\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/heytap/nearx/tangramconfig/strategy/StrategyHelper;", "", "()V", "MIN_SUPPORT_MSP_VERSION_CODE_DOMESTIC", "", "MIN_SUPPORT_MSP_VERSION_CODE_FOREIGN", "MIN_SUPPORT_MSP_VERSION_CODE_MCS", "TAG", "", "canUseKitMode", "", "lastSyncStrategyTime", "strategyEntity", "Lcom/heytap/nearx/tangramconfig/strategy/StrategyEntity;", "convEntityToStrategy", "entity", "convJsonToStrategy", Fields.SP_STRATEGY_FIELD, "convStrategyToJson", "getKitMinSupportVersion", "context", "Landroid/content/Context;", "getSdkVersion", "getSupportKitMode", "initKitMode", "", Fields.PRODUCT_ID, "host", "isForceKitMode", "mspVersionCanSupport", "parseStrategyEntity", "json", "syncKitModeWithAppStatus", "syncStrategyConfig", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StrategyHelper {

    @NotNull
    public static final String TAG = "CloudConfig_stgyHelper";
    private static long lastSyncStrategyTime;

    @NotNull
    public static final StrategyHelper INSTANCE = new StrategyHelper();

    @NotNull
    private static StrategyEntity strategyEntity = new StrategyEntity();
    private static boolean canUseKitMode = true;
    private static final long MIN_SUPPORT_MSP_VERSION_CODE_DOMESTIC = 2013520;
    private static final long MIN_SUPPORT_MSP_VERSION_CODE_FOREIGN = 2020612;
    private static final long MIN_SUPPORT_MSP_VERSION_CODE_MCS = 51710;

    private StrategyHelper() {
    }

    private final long getKitMinSupportVersion(Context context) {
        if (AppInfoUtil.INSTANCE.isMcsKitAvailable(context)) {
            return MIN_SUPPORT_MSP_VERSION_CODE_MCS;
        }
        return ProcessProperties.isForeign(context) ? MIN_SUPPORT_MSP_VERSION_CODE_FOREIGN : MIN_SUPPORT_MSP_VERSION_CODE_DOMESTIC;
    }

    @NotNull
    public final String convEntityToStrategy(@NotNull StrategyEntity entity) throws JSONException {
        Intrinsics.checkNotNullParameter(entity, "entity");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Fields.SYNC_SDK_CFG_INTERVAL_FIELD, Long.valueOf(entity.getSdkInterval()));
        jSONObject.put(Fields.MIN_SDK_VERSION_FIELD, Long.valueOf(entity.getMinSDKVersion()));
        jSONObject.put(Fields.STRATEGY_MODE_FIELD, Integer.valueOf(entity.getStrategyMode()));
        jSONObject.put(Fields.MIN_KIT_VERSION_FIELD, Long.valueOf(entity.getMinKitVersion()));
        jSONObject.put(Fields.VALID_REQ_PERIOD_FIELD, Long.valueOf(entity.getValidReqPeriod()));
        jSONObject.put(Fields.MAX_REQ_PRODUCT_FIELD, Long.valueOf(entity.getMaxReqProduct()));
        jSONObject.put(Fields.FORCE_KIT_IF_KIT_FIELD, Boolean.valueOf(entity.getForceKitIfKit()));
        jSONObject.put(Fields.BACKOFF_FIELD, Long.valueOf(entity.getBackoff()));
        MspLog.d(TAG, "current strategy info : " + jSONObject);
        strategyEntity = entity;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return string;
    }

    @NotNull
    public final StrategyEntity convJsonToStrategy(@NotNull String strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        if (TextUtils.isEmpty(strategy)) {
            return new StrategyEntity();
        }
        JSONObject jSONObject = new JSONObject(strategy);
        StrategyEntity strategyEntity2 = new StrategyEntity();
        strategyEntity2.setSdkInterval(jSONObject.optLong(Fields.SYNC_SDK_CFG_INTERVAL_FIELD));
        strategyEntity2.setMinSDKVersion(jSONObject.optLong(Fields.MIN_SDK_VERSION_FIELD));
        strategyEntity2.setStrategyMode(jSONObject.optInt(Fields.STRATEGY_MODE_FIELD));
        strategyEntity2.setMinKitVersion(jSONObject.optLong(Fields.MIN_KIT_VERSION_FIELD));
        if (jSONObject.has(Fields.VALID_REQ_PERIOD_FIELD)) {
            strategyEntity2.setValidReqPeriod(jSONObject.optLong(Fields.VALID_REQ_PERIOD_FIELD));
        }
        if (jSONObject.has(Fields.MAX_REQ_PRODUCT_FIELD)) {
            strategyEntity2.setMaxReqProduct(jSONObject.optLong(Fields.MAX_REQ_PRODUCT_FIELD));
        }
        if (jSONObject.has(Fields.FORCE_KIT_IF_KIT_FIELD)) {
            strategyEntity2.setForceKitIfKit(jSONObject.optBoolean(Fields.FORCE_KIT_IF_KIT_FIELD));
        }
        if (jSONObject.has(Fields.BACKOFF_FIELD)) {
            strategyEntity2.setBackoff(jSONObject.optLong(Fields.BACKOFF_FIELD));
        }
        return strategyEntity2;
    }

    @NotNull
    public final String convStrategyToJson() throws JSONException {
        if (strategyEntity == null) {
            strategyEntity = new StrategyEntity();
        }
        JSONObject jSONObject = new JSONObject();
        StrategyEntity strategyEntity2 = strategyEntity;
        jSONObject.put(Fields.SYNC_SDK_CFG_INTERVAL_FIELD, strategyEntity2 != null ? Long.valueOf(strategyEntity2.getSdkInterval()) : null);
        StrategyEntity strategyEntity3 = strategyEntity;
        jSONObject.put(Fields.MIN_SDK_VERSION_FIELD, strategyEntity3 != null ? Long.valueOf(strategyEntity3.getMinSDKVersion()) : null);
        StrategyEntity strategyEntity4 = strategyEntity;
        jSONObject.put(Fields.STRATEGY_MODE_FIELD, strategyEntity4 != null ? Integer.valueOf(strategyEntity4.getStrategyMode()) : null);
        StrategyEntity strategyEntity5 = strategyEntity;
        jSONObject.put(Fields.MIN_KIT_VERSION_FIELD, strategyEntity5 != null ? Long.valueOf(strategyEntity5.getMinKitVersion()) : null);
        StrategyEntity strategyEntity6 = strategyEntity;
        jSONObject.put(Fields.VALID_REQ_PERIOD_FIELD, strategyEntity6 != null ? Long.valueOf(strategyEntity6.getValidReqPeriod()) : null);
        StrategyEntity strategyEntity7 = strategyEntity;
        jSONObject.put(Fields.MAX_REQ_PRODUCT_FIELD, strategyEntity7 != null ? Long.valueOf(strategyEntity7.getMaxReqProduct()) : null);
        StrategyEntity strategyEntity8 = strategyEntity;
        jSONObject.put(Fields.FORCE_KIT_IF_KIT_FIELD, strategyEntity8 != null ? Boolean.valueOf(strategyEntity8.getForceKitIfKit()) : null);
        StrategyEntity strategyEntity9 = strategyEntity;
        jSONObject.put(Fields.BACKOFF_FIELD, strategyEntity9 != null ? Long.valueOf(strategyEntity9.getBackoff()) : null);
        MspLog.d(TAG, "current strategy info : " + jSONObject);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return string;
    }

    public final long getSdkVersion() {
        return BuildConfig.SDK_VERSION_CODE;
    }

    public final boolean getSupportKitMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (!KitSdk.INSTANCE.isMspSupportCloudCtrl(context) || !mspVersionCanSupport(context) || !canUseKitMode) {
                return false;
            }
            String spString = KitSPUtils.INSTANCE.getSpString(Fields.SP_STRATEGY_FIELD);
            if (!TextUtils.isEmpty(spString) && spString != null) {
                strategyEntity = INSTANCE.convJsonToStrategy(spString);
            }
            if (strategyEntity == null) {
                strategyEntity = new StrategyEntity();
            }
            MspLog.d(TAG, "getSupportKitMode strategyEntity : " + strategyEntity);
            int i = b.g(context).i();
            MspLog.d(TAG, "getSupportKitMode localSdkVersion : " + BuildConfig.SDK_VERSION_CODE);
            Log.d(TAG, "getSupportKitMode strategyEntity : " + strategyEntity);
            Log.d(TAG, "getSupportKitMode localSdkVersion : " + BuildConfig.SDK_VERSION_CODE);
            StrategyEntity strategyEntity2 = strategyEntity;
            Long lValueOf = strategyEntity2 != null ? Long.valueOf(strategyEntity2.getMinSDKVersion()) : null;
            Intrinsics.checkNotNull(lValueOf);
            if (BuildConfig.SDK_VERSION_CODE >= lValueOf.longValue()) {
                long j2 = i;
                StrategyEntity strategyEntity3 = strategyEntity;
                Long lValueOf2 = strategyEntity3 != null ? Long.valueOf(strategyEntity3.getMinKitVersion()) : null;
                Intrinsics.checkNotNull(lValueOf2);
                if (j2 >= lValueOf2.longValue()) {
                    StrategyEntity strategyEntity4 = strategyEntity;
                    if (strategyEntity4 != null && strategyEntity4.getStrategyMode() == 1) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void initKitMode(@NotNull Context context, @NotNull String productId, @NotNull String host) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(host, "host");
        try {
            syncKitModeWithAppStatus(context);
            syncStrategyConfig(context, productId, host);
        } catch (Exception e2) {
            MspLog.e(TAG, e2);
        }
    }

    public final boolean isForceKitMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!getSupportKitMode(context)) {
            return false;
        }
        StrategyEntity strategyEntity2 = strategyEntity;
        return strategyEntity2 != null && strategyEntity2.getForceKitIfKit();
    }

    public final boolean mspVersionCanSupport(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            int mspAppVersionCode = AppInfoUtil.INSTANCE.getMspAppVersionCode(context);
            Log.d(TAG, "mspVersionCanSupport mspKitVersion : " + mspAppVersionCode);
            return ((long) mspAppVersionCode) > getKitMinSupportVersion(context);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final StrategyEntity parseStrategyEntity(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(json);
        StrategyEntity strategyEntity2 = new StrategyEntity();
        strategyEntity2.setSdkInterval(jSONObject.optLong(Fields.SYNC_SDK_CFG_INTERVAL_FIELD));
        strategyEntity2.setMinSDKVersion(jSONObject.optLong(Fields.MIN_SDK_VERSION_FIELD));
        strategyEntity2.setStrategyMode(jSONObject.optInt(Fields.STRATEGY_MODE_FIELD));
        strategyEntity2.setMinKitVersion(jSONObject.optLong(Fields.MIN_KIT_VERSION_FIELD));
        if (jSONObject.has(Fields.VALID_REQ_PERIOD_FIELD)) {
            strategyEntity2.setValidReqPeriod(jSONObject.optLong(Fields.VALID_REQ_PERIOD_FIELD));
        }
        if (jSONObject.has(Fields.MAX_REQ_PRODUCT_FIELD)) {
            strategyEntity2.setMaxReqProduct(jSONObject.optLong(Fields.MAX_REQ_PRODUCT_FIELD));
        }
        if (jSONObject.has(Fields.FORCE_KIT_IF_KIT_FIELD)) {
            strategyEntity2.setForceKitIfKit(jSONObject.optBoolean(Fields.FORCE_KIT_IF_KIT_FIELD));
        }
        if (jSONObject.has(Fields.BACKOFF_FIELD)) {
            strategyEntity2.setBackoff(jSONObject.optLong(Fields.BACKOFF_FIELD));
        }
        return strategyEntity2;
    }

    public final void syncKitModeWithAppStatus(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MspLog.d(TAG, "syncKitModeWithAppStatus ... ...");
        KitSdk.INSTANCE.changeSdkModeWithMspCrash(context, new DataCallback<Integer>() { // from class: com.heytap.nearx.tangramconfig.strategy.StrategyHelper.syncKitModeWithAppStatus.1
            /* JADX WARN: Code duplicated, block: B:8:0x000d  */
            @Override // com.heytap.nearx.tangramconfig.kit.DataCallback
            public void callback(@Nullable Integer mode) {
                boolean z;
                StrategyHelper strategyHelper = StrategyHelper.INSTANCE;
                if (mode != null) {
                    z = mode.intValue() == 1;
                }
                StrategyHelper.canUseKitMode = z;
            }
        });
    }

    public final void syncStrategyConfig(@NotNull Context context, @NotNull String productId, @NotNull String host) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(host, "host");
        long jCurrentTimeMillis = System.currentTimeMillis();
        MspLog.d(TAG, "syncStrategyConfig inner, curTime:" + jCurrentTimeMillis + ", lastSyncStrategyTime:" + lastSyncStrategyTime);
        if (Math.abs(jCurrentTimeMillis - lastSyncStrategyTime) < strategyEntity.getSdkInterval()) {
            return;
        }
        lastSyncStrategyTime = System.currentTimeMillis();
        KitSdk.INSTANCE.getDynamicCondition(context, productId, host, new DataCallback<StrategyEntity>() { // from class: com.heytap.nearx.tangramconfig.strategy.StrategyHelper.syncStrategyConfig.1
            @Override // com.heytap.nearx.tangramconfig.kit.DataCallback
            public void callback(@Nullable StrategyEntity result) {
                MspLog.d(StrategyHelper.TAG, "syncStrategyConfig result : " + result);
                String strConvEntityToStrategy = result != null ? StrategyHelper.INSTANCE.convEntityToStrategy(result) : null;
                Log.d(StrategyHelper.TAG, "syncStrategyConfig strategy info : " + strConvEntityToStrategy);
                if (strConvEntityToStrategy == null || strConvEntityToStrategy.length() == 0) {
                    return;
                }
                KitSPUtils.INSTANCE.updateSpString(Fields.SP_STRATEGY_FIELD, strConvEntityToStrategy);
            }
        });
    }
}
