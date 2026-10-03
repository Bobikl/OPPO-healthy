package com.heytap.log.strategy;

import android.content.Context;
import android.content.IntentFilter;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.BuildConfig;
import com.heytap.log.Logger;
import com.heytap.log.brd.KitBrdcast;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.consts.LogConstants;
import com.heytap.log.core.DataCallback;
import com.heytap.log.dto.TraceConfigDto;
import com.heytap.log.kit.init.SalvageManager;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.BrandUtil;
import com.heytap.log.util.DeviceUtil;
import com.heytap.log.util.SPUtil;
import com.heytap.log.util.ThreadUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class KitConfigHelper {
    private static String KIT_STRATEGY_KEY = "strategy_kit";
    private static String KIT_STRATEGY_PREV_TIME_KEY = "strategy_prev_time_kit";
    private static long MILLIONS_TIME_UNIT = 1000;
    public static final int SEND_SYNC_KIT_CHANGE_MSG_INTERVAL = 60000;
    private static final String SETTINGS_KIT_LAST_START_TS_KEY = "hlog_kit_last_start_ts";
    private static final String SETTINGS_KIT_START_INTERVAL_MS_KEY = "hlog_kit_start_interval_ms";
    private static final String SETTINGS_SALVAGE_CONFIG_KEY = "hlog_salvage_config";
    private static final String TAG = "HLog_KitStrategyHelper";
    private static volatile KitConfigHelper instance;
    private Context context;
    private KitBrdcast kitBrdcast;
    private CctrlStrategyEntity strategyEntity;
    private boolean diableMode = false;
    private boolean canUseKitMode = false;
    private boolean canAccessKit = false;
    private AtomicBoolean isAlreadyReg = new AtomicBoolean(false);
    private Map<String, Logger> LoggerMap = new ConcurrentHashMap();
    private final AtomicBoolean isInit = new AtomicBoolean(false);

    private boolean canAccessKit(Context context) {
        try {
            if (!checkKitClass()) {
                return false;
            }
            boolean zIsOwnBrand = BrandUtil.isOwnBrand();
            boolean zIsOversea = AppUtil.isOversea();
            boolean zIsSupportHLogKit = SalvageManager.isSupportHLogKit(context);
            boolean z = !zIsOversea && zIsOwnBrand && zIsSupportHLogKit;
            debug(TAG, "canAccessKit : " + z + " isOversea : " + zIsOversea + " isHomeBrand : " + zIsOwnBrand + " isKitSupport : " + zIsSupportHLogKit);
            if (z && !this.isAlreadyReg.get()) {
                dynRegisterBroadcast(AppUtil.getAppSpContext());
            }
            return z;
        } catch (Exception e2) {
            Log.e(TAG, "canAccessKit exception : " + e2);
            return false;
        }
    }

    private boolean canUseKitMode(Context context) {
        if (this.diableMode) {
            debug(TAG, "KitStrategyHelper canUseKitMode : 当前是模拟SDK模式");
            return false;
        }
        boolean strategyMode = isCanAccessKit() ? getStrategyMode(context) : false;
        debug(TAG, "useKitMode : " + strategyMode);
        if (strategyMode && !this.isAlreadyReg.get()) {
            dynRegisterBroadcast(AppUtil.getAppSpContext());
        }
        return strategyMode;
    }

    private static boolean checkKitClass() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkSimplifiedConfigMatch(Context context, String str) {
        try {
            String strLoadSalvageConfigFromSettings = loadSalvageConfigFromSettings(context);
            debug(TAG, "checkSimplifiedConfigMatch: settings -> " + strLoadSalvageConfigFromSettings);
            if (TextUtils.isEmpty(strLoadSalvageConfigFromSettings)) {
                return false;
            }
            String packageName = context != null ? context.getPackageName() : "";
            if (TextUtils.isEmpty(packageName)) {
                return false;
            }
            JSONArray jSONArray = new JSONArray(strLoadSalvageConfigFromSettings);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("tracePkg", "");
                    String strOptString2 = jSONObjectOptJSONObject.optString("business", "");
                    long jOptLong = jSONObjectOptJSONObject.optLong("traceId", -1L);
                    boolean zEquals = !TextUtils.isEmpty(strOptString) ? strOptString.equals(packageName) : false;
                    boolean zEquals2 = (TextUtils.isEmpty(str) || TextUtils.isEmpty(strOptString2)) ? true : str.equals(strOptString2);
                    if (zEquals && zEquals2) {
                        if (jOptLong > 0) {
                            if (TextUtils.isEmpty(strOptString2)) {
                                strOptString2 = str;
                            }
                            if (!hasLocalTaskByTraceId(jOptLong, strOptString2)) {
                                debug(TAG, "checkSimplifiedConfigMatch: found match and local task not exists, pkg=" + packageName + ", business=" + strOptString2 + ", traceId=" + jOptLong);
                                return true;
                            }
                            debug(TAG, "checkSimplifiedConfigMatch: found match but local task exists, traceId=" + jOptLong + ", pkg=" + packageName + ", business=" + strOptString2);
                        } else {
                            debug(TAG, "checkSimplifiedConfigMatch: found match but traceId is invalid, traceId=" + jOptLong + ", pkg=" + packageName + ", business=" + str);
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            debug(TAG, "checkSimplifiedConfigMatch error: " + th);
            return false;
        }
    }

    private static CctrlStrategyEntity convStrategyJsonToEntity(String str) {
        CctrlStrategyEntity cctrlStrategyEntity;
        CctrlStrategyEntity cctrlStrategyEntity2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            cctrlStrategyEntity = new CctrlStrategyEntity();
            try {
                cctrlStrategyEntity.salvageModel = jSONObject.optInt("salvageModel");
                cctrlStrategyEntity.sdkSyncCfgIntervalSec = jSONObject.optLong("sdkSyncCfgIntervalSec");
                cctrlStrategyEntity.minkitVersion = jSONObject.optLong("minkitVersion");
                cctrlStrategyEntity.minSdkVersion = jSONObject.optLong("minSdkVersion");
            } catch (JSONException e2) {
                e = e2;
                cctrlStrategyEntity2 = cctrlStrategyEntity;
                Log.e(TAG, e.toString());
                cctrlStrategyEntity = cctrlStrategyEntity2;
            }
        } catch (JSONException e3) {
            e = e3;
        }
        debug(TAG, "convStrategyJsonToEntity : " + str);
        return cctrlStrategyEntity;
    }

    public static void debug(String str, String str2) {
        if (AppUtil.isOpenSysLog()) {
            Log.d(str, str2);
        }
    }

    public static void doSynKitStrategyConfig(String str) {
        debug(TAG, "doSynKitStrategyConfig : " + str);
        try {
            if (TextUtils.isEmpty(str) || !checkKitClass() || convStrategyJsonToEntity(str) == null) {
                return;
            }
            SPUtil.getInstance().put(KIT_STRATEGY_KEY, str);
        } catch (Throwable unused) {
        }
    }

    public static void doSynKitTaskConfigs(String str) {
        debug(TAG, "doSynKitTaskConfigs : " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            List<TraceConfigDto> listConvKitToDtos = TaskConv.convKitToDtos(str);
            if (listConvKitToDtos == null || listConvKitToDtos.isEmpty()) {
                return;
            }
            TaskConv.updatePushTaskInfo(listConvKitToDtos);
            SPUtil.getInstance().put(DynConfigManager.EFFORT, 2);
            getInstance().flushConfigEffot(str);
        } catch (Throwable unused) {
        }
    }

    private void dynRegisterBroadcast(Context context) {
        if (context == null) {
            Log.e(TAG, "注册广播失败");
            return;
        }
        if (checkKitClass() && !this.isAlreadyReg.get()) {
            this.isAlreadyReg.compareAndSet(false, true);
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(LogConstants.ACTION_SYNC_HLOG_FLUSH);
                intentFilter.addAction(LogConstants.ACTION_SYNC_HLOG_STRATEGY);
                intentFilter.addAction(LogConstants.ACTION_SYNC_HLOG_TASK);
                KitBrdcast kitBrdcast = new KitBrdcast();
                this.kitBrdcast = kitBrdcast;
                context.registerReceiver(kitBrdcast, intentFilter, 4);
            } catch (Exception e2) {
                Log.e(TAG, "注册广播失败 e : " + e2.toString());
            }
        }
    }

    private void flushConfigEffot(String str) {
        Map<String, Logger> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.LoggerMap) == null || map.isEmpty()) {
                return;
            }
            for (Map.Entry<String, Logger> entry : this.LoggerMap.entrySet()) {
                String key = entry.getKey();
                debug(TAG, "flushConfigEffot business: " + key);
                Logger value = entry.getValue();
                if (value != null && value.getMultiConfMgr() != null && !TextUtils.isEmpty(key) && str.contains(key)) {
                    debug(TAG, "flushConfigEffot ready to flush business: " + key);
                    value.getMultiConfMgr().flushCurrentTraceDto();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static KitConfigHelper getInstance() {
        if (instance == null) {
            synchronized (KitConfigHelper.class) {
                if (instance == null) {
                    instance = new KitConfigHelper();
                }
            }
        }
        return instance;
    }

    private boolean hasLocalTaskByTraceId(long j2, String str) {
        if (j2 <= 0) {
            return false;
        }
        try {
            Logger logger = getLogger(str);
            if (logger == null || logger.getMultiConfMgr() == null || logger.getMultiConfMgr().findDtoByTraceId(j2) == null) {
                return false;
            }
            debug(TAG, "hasLocalTaskByTraceId: found local task, traceId=" + j2 + ", business=" + str);
            return true;
        } catch (Throwable th) {
            debug(TAG, "hasLocalTaskByTraceId error: " + th);
            return false;
        }
    }

    private boolean isAllowedBySp(String str) {
        long j2 = SPUtil.getInstance().getLong(KIT_STRATEGY_PREV_TIME_KEY, 0L);
        long j3 = getStrategyConfig().sdkSyncCfgIntervalSec;
        debug(TAG, "isAllowedBySp[" + str + "]: prevTime=" + j2 + ", intervalSec=" + j3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j3 <= 0 || j2 <= 0) {
            SPUtil.getInstance().put(KIT_STRATEGY_PREV_TIME_KEY, jCurrentTimeMillis);
            debug(TAG, "isAllowedBySp[" + str + "]: updated prevTime=" + jCurrentTimeMillis);
            return true;
        }
        long j4 = j3 * MILLIONS_TIME_UNIT;
        long j5 = jCurrentTimeMillis - j2;
        debug(TAG, "isAllowedBySp[" + str + "]: duration=" + j5 + ", intervalMs=" + j4);
        boolean z = j5 >= j4;
        if (z) {
            SPUtil.getInstance().put(KIT_STRATEGY_PREV_TIME_KEY, jCurrentTimeMillis);
            debug(TAG, "isAllowedBySp[" + str + "]: updated prevTime=" + jCurrentTimeMillis);
        }
        return z;
    }

    private String loadSalvageConfigFromSettings(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), SETTINGS_SALVAGE_CONFIG_KEY);
        } catch (Throwable th) {
            debug(TAG, "Failed to read salvage config from Settings: " + th);
            return "";
        }
    }

    private CctrlStrategyEntity loadStrategyEntity() {
        CctrlStrategyEntity cctrlStrategyEntityConvStrategyJsonToEntity;
        String string = SPUtil.getInstance().getString(KIT_STRATEGY_KEY);
        debug(TAG, "loadStrategyEntity : " + string);
        return (TextUtils.isEmpty(string) || (cctrlStrategyEntityConvStrategyJsonToEntity = convStrategyJsonToEntity(string)) == null) ? new CctrlStrategyEntity() : cctrlStrategyEntityConvStrategyJsonToEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mspCanSupportService(Context context) {
        return SalvageManager.mspCanSupportService(context);
    }

    private long readSettingsLong(Context context, String str, long j2) {
        try {
            String string = Settings.System.getString(context.getContentResolver(), str);
            return TextUtils.isEmpty(string) ? j2 : Long.parseLong(string);
        } catch (Throwable th) {
            debug(TAG, "readSettingsLong error, key=" + str + " e=" + th);
            return j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncConfigs(final Context context) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.strategy.KitConfigHelper.3
            @Override // java.lang.Runnable
            public void run() {
                Context context2 = context;
                if (context2 == null) {
                    return;
                }
                SalvageManager.queryConfig(context2, "");
                if (KitConfigHelper.this.isCanUseKitMode()) {
                    SalvageManager.syncSalvageTask(context, "");
                }
            }
        });
    }

    private void syncKitModeWithAppStatus(Context context) {
        SalvageManager.changeSdkModeWithMspCrash(context, new DataCallback<Boolean>() { // from class: com.heytap.log.strategy.KitConfigHelper.5
            @Override // com.heytap.log.core.DataCallback
            public void onData(Boolean bool) {
                KitConfigHelper.debug(KitConfigHelper.TAG, "changeSdkModeWithMspCrash : " + bool);
                KitConfigHelper.this.canAccessKit = bool.booleanValue();
            }
        });
    }

    public void add(String str, Logger logger) {
        Map<String, Logger> map = this.LoggerMap;
        if (map != null) {
            try {
                map.remove(str);
                this.LoggerMap.put(str, logger);
            } catch (Throwable unused) {
            }
        }
    }

    public CctrlStrategyEntity flushStrategyConfig() {
        CctrlStrategyEntity cctrlStrategyEntityLoadStrategyEntity = loadStrategyEntity();
        this.strategyEntity = cctrlStrategyEntityLoadStrategyEntity;
        return cctrlStrategyEntityLoadStrategyEntity;
    }

    public Logger getLogger(String str) {
        Map<String, Logger> map;
        if (TextUtils.isEmpty(str) || (map = this.LoggerMap) == null || !map.containsKey(str)) {
            return null;
        }
        return this.LoggerMap.get(str);
    }

    public CctrlStrategyEntity getStrategyConfig() {
        if (this.strategyEntity == null) {
            this.strategyEntity = loadStrategyEntity();
        }
        return this.strategyEntity;
    }

    public boolean getStrategyMode(Context context) {
        long j2 = getStrategyConfig().minSdkVersion;
        long kitVersionCode = SalvageManager.getKitVersionCode(context);
        long j3 = getStrategyConfig().minkitVersion;
        debug(TAG, "localSdkVer: " + BuildConfig.SDK_VERSION_CODE + " localKitVer : " + kitVersionCode + " remoteKitVer: " + kitVersionCode + " minSdkVer: " + j2 + " minKitVerCode : " + j3 + " salvageModel : " + getStrategyConfig().salvageModel);
        if (BuildConfig.SDK_VERSION_CODE < j2 || kitVersionCode < j3) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("++++getStrategyMode result : ");
        sb.append(getStrategyConfig().salvageModel != 0);
        debug(TAG, sb.toString());
        return getStrategyConfig().salvageModel != 0;
    }

    public void init(Context context) {
        if (context == null) {
            throw new IllegalStateException("kit initial failure : logger is null !");
        }
        if (this.isInit.get()) {
            return;
        }
        this.isInit.compareAndSet(false, true);
        this.context = context;
        this.canAccessKit = canAccessKit(context);
        if (isCanAccessKit()) {
            syncKitModeWithAppStatus(context);
            SalvageManager.init(context);
            this.canUseKitMode = canUseKitMode(context);
            StringBuilder sb = new StringBuilder();
            sb.append("KitStrategyHelper canUseKitMode : ");
            sb.append(this.canUseKitMode ? "当前KIT模式" : "当前SDK模式");
            debug(TAG, sb.toString());
        }
    }

    public boolean isCanAccessKit() {
        return this.canAccessKit && !DeviceUtil.inBootTime();
    }

    public boolean isCanUseKitMode() {
        return this.canUseKitMode && !DeviceUtil.inBootTime();
    }

    public boolean isKitIpcAllowed(Context context) {
        try {
            int kitVersionCode = SalvageManager.getKitVersionCode(context);
            if (kitVersionCode > 0 && kitVersionCode < 10140) {
                debug(TAG, "isKitIpcAllowed: old version kit (" + kitVersionCode + "), use SP rate limiting");
                return isAllowedBySp("old logic");
            }
            debug(TAG, "isKitIpcAllowed: new version kit (" + kitVersionCode + "), use Settings rate limiting");
            long settingsLong = readSettingsLong(context, SETTINGS_KIT_LAST_START_TS_KEY, -1L);
            long settingsLong2 = readSettingsLong(context, SETTINGS_KIT_START_INTERVAL_MS_KEY, -1L);
            debug(TAG, "isKitIpcAllowed lastStartTs=" + settingsLong + ", intervalMs=" + settingsLong2);
            if (settingsLong > 0 && settingsLong2 > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - settingsLong;
                debug(TAG, "isKitIpcAllowed duration=" + jCurrentTimeMillis);
                return jCurrentTimeMillis >= settingsLong2;
            }
            debug(TAG, "isKitIpcAllowed: Settings not configured, fallback to SP");
            return isAllowedBySp("fallback");
        } catch (Throwable th) {
            debug(TAG, "isKitIpcAllowed error: " + th);
            return true;
        }
    }

    public void raiseUploadTask(String str, String str2) {
        try {
            if (isCanUseKitMode()) {
                SalvageManager.raiseUploadTask(this.context, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public void reQueryKitConfig(final Context context, final String str) {
        try {
            if (!this.isInit.get()) {
                debug(TAG, "reQueryKitConfig : intance not initial .");
            } else if (isCanAccessKit()) {
                ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.strategy.KitConfigHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (KitConfigHelper.this.checkSimplifiedConfigMatch(context, str)) {
                            KitConfigHelper.debug(KitConfigHelper.TAG, "reQueryKitConfig: found match in Settings and local task not exists, calling syncConfigs");
                            if (KitConfigHelper.this.mspCanSupportService(context)) {
                                KitConfigHelper.this.syncConfigs(context);
                                return;
                            } else {
                                KitConfigHelper.this.syncConfigs(context, str);
                                return;
                            }
                        }
                        if (KitConfigHelper.this.isKitIpcAllowed(context)) {
                            KitConfigHelper.debug(KitConfigHelper.TAG, "reQueryKitConfig: IPC allowed, calling syncConfigs");
                            if (KitConfigHelper.this.mspCanSupportService(context)) {
                                KitConfigHelper.this.syncConfigs(context);
                            } else {
                                KitConfigHelper.this.syncConfigs(context, str);
                            }
                        }
                    }
                });
            } else {
                debug(TAG, "reQueryKitConfig : can not support kit!");
            }
        } catch (Throwable unused) {
        }
    }

    public void setDiableMode(boolean z) {
        this.diableMode = z;
    }

    public void syncKitConfigs(Context context) {
        if (context == null || !isCanUseKitMode()) {
            return;
        }
        reQueryKitConfig(context);
    }

    public void unRegisterBroadcast(Context context) {
        if (context != null && checkKitClass() && this.isInit.get() && this.isAlreadyReg.get()) {
            try {
                if (isCanUseKitMode()) {
                    context.unregisterReceiver(this.kitBrdcast);
                }
            } catch (Exception e2) {
                Log.e(TAG, "反注册广播失败 e : " + e2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncConfigs(final Context context, final String str) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.strategy.KitConfigHelper.4
            @Override // java.lang.Runnable
            public void run() {
                Context context2 = context;
                if (context2 == null) {
                    return;
                }
                SalvageManager.queryConfig(context2, str);
                if (KitConfigHelper.this.isCanUseKitMode()) {
                    SalvageManager.syncSalvageTask(context, str);
                }
            }
        });
    }

    private void reQueryKitConfig(final Context context) {
        try {
            if (!this.isInit.get()) {
                debug(TAG, "reQueryKitConfig : intance not initial .");
            } else if (!isCanAccessKit()) {
                debug(TAG, "reQueryKitConfig : can not support kit!");
            } else {
                ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.strategy.KitConfigHelper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (KitConfigHelper.this.checkSimplifiedConfigMatch(context, "")) {
                            KitConfigHelper.debug(KitConfigHelper.TAG, "reQueryKitConfig: found match in Settings and local task not exists, calling syncConfigs");
                            if (KitConfigHelper.this.mspCanSupportService(context)) {
                                KitConfigHelper.this.syncConfigs(context);
                                return;
                            }
                            return;
                        }
                        if (KitConfigHelper.this.isKitIpcAllowed(context)) {
                            KitConfigHelper.debug(KitConfigHelper.TAG, "reQueryKitConfig: IPC allowed, calling syncConfigs");
                            if (KitConfigHelper.this.mspCanSupportService(context)) {
                                KitConfigHelper.this.syncConfigs(context);
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }
}
