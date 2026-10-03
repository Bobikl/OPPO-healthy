package com.heytap.msp.sdk.common.crash;

import android.content.Context;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.common.executor.impl.ThreadExecutor;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.common.util.AppUtils;
import com.heytap.msp.sdk.base.common.util.SharedPreferencesHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class AppCrashManager {
    private static final String KEY_CRASH_COUNT = "key_crash_count";
    private static final String KEY_LAUNCH_COUNT = "key_launch_count";
    private static final String KEY_PROCESS_NAME = "key_process_name";
    private static final String KEY_VERSION_CODE = "key_version_code";
    private static final String KEY_VERSION_NAME = "key_version_name";
    private static final String TAG = "AppCrashManager";
    private static Map<String, List<MspCrashListener>> sCrashListMap;

    public static class AppCrashManagerHolder {
        private static final AppCrashManager INSTANCE = new AppCrashManager();

        private AppCrashManagerHolder() {
        }
    }

    private void checkAppRecover(final Context context, String str) {
        ThreadExecutor.getInstance().execute(new Runnable() { // from class: com.heytap.msp.sdk.common.crash.a
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$checkAppRecover$0(context);
            }
        });
    }

    public static AppCrashManager getInstance() {
        return AppCrashManagerHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAppRecover$0(Context context) {
        int iIntValue = ((Integer) new SharedPreferencesHelper(BaseSdkAgent.getInstance().getContext(), "sp_common_file", 0).getValue(KEY_VERSION_CODE, 0)).intValue();
        if (iIntValue > 0) {
            int mspAppVersionCode = AppUtils.getMspAppVersionCode(context);
            String mspAppVersionName = AppUtils.getMspAppVersionName(context);
            if (mspAppVersionCode > iIntValue) {
                onMspProcessCrashRecover(mspAppVersionCode, mspAppVersionName);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onSaveMspProcessCrashMsg$1(String str, int i, int i2, int i3, String str2) {
        try {
            SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(BaseSdkAgent.getInstance().getContext(), "sp_common_file", 0);
            sharedPreferencesHelper.putValue(KEY_PROCESS_NAME, str);
            sharedPreferencesHelper.putValue(KEY_CRASH_COUNT, Integer.valueOf(i));
            sharedPreferencesHelper.putValue(KEY_LAUNCH_COUNT, Integer.valueOf(i2));
            sharedPreferencesHelper.putValue(KEY_VERSION_CODE, Integer.valueOf(i3));
            sharedPreferencesHelper.putValue(KEY_VERSION_NAME, str2);
            sharedPreferencesHelper.apply();
        } catch (Exception e2) {
            MspLog.e(TAG, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeCrashMsg$2() {
        try {
            new SharedPreferencesHelper(BaseSdkAgent.getInstance().getContext(), "sp_common_file", 0).removeValue(KEY_VERSION_CODE).removeValue(KEY_VERSION_NAME).removeValue(KEY_CRASH_COUNT).removeValue(KEY_LAUNCH_COUNT).removeValue(KEY_PROCESS_NAME).apply();
        } catch (Exception e2) {
            MspLog.e(TAG, e2);
        }
    }

    private synchronized void onSaveMspProcessCrashMsg(final String str, final int i, final int i2, final int i3, final String str2) {
        ThreadExecutor.getInstance().execute(new Runnable() { // from class: com.heytap.msp.sdk.common.crash.b
            @Override // java.lang.Runnable
            public final void run() {
                AppCrashManager.lambda$onSaveMspProcessCrashMsg$1(str, i, i2, i3, str2);
            }
        });
    }

    private synchronized void removeCrashMsg() {
        ThreadExecutor.getInstance().execute(new Runnable() { // from class: com.heytap.msp.sdk.common.crash.c
            @Override // java.lang.Runnable
            public final void run() {
                AppCrashManager.lambda$removeCrashMsg$2();
            }
        });
    }

    private static void setsCrashListMap(Map<String, List<MspCrashListener>> map) {
        sCrashListMap = map;
    }

    public synchronized void addMspProcessCrashListener(Context context, String str, MspCrashListener mspCrashListener) {
        if (sCrashListMap == null) {
            setsCrashListMap(new ConcurrentHashMap());
        }
        List<MspCrashListener> copyOnWriteArrayList = sCrashListMap.containsKey(str) ? sCrashListMap.get(str) : null;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (copyOnWriteArrayList.size() > 10) {
            return;
        }
        copyOnWriteArrayList.add(mspCrashListener);
        sCrashListMap.put(str, copyOnWriteArrayList);
        checkAppRecover(context, str);
    }

    public synchronized void handleCrashMsg(String str, int i, int i2, int i3, String str2) {
        onSaveMspProcessCrashMsg(str, i, i2, i3, str2);
        if (sCrashListMap.containsKey(str)) {
            List<MspCrashListener> list = sCrashListMap.get(str);
            if (list != null && list.size() > 0) {
                Iterator<MspCrashListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onMspProcessCrash(i2, i, str, i3, str2);
                }
            }
        }
    }

    public synchronized void onMspProcessCrashRecover(int i, String str) {
        removeCrashMsg();
        for (String str2 : sCrashListMap.keySet()) {
            List<MspCrashListener> list = sCrashListMap.get(str2);
            if (list != null && list.size() > 0) {
                Iterator<MspCrashListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onMspProcessRecover(str2, i, str);
                }
            }
        }
    }
}
