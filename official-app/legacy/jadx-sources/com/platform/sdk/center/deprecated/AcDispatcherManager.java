package com.platform.sdk.center.deprecated;

import android.content.Context;
import android.util.Log;
import com.accountcenter.j;
import com.platform.sdk.center.sdk.instant.AcIInstantDispatcher;
import com.platform.sdk.center.sdk.oaps.UCIOapsDispatcher;
import com.platform.sdk.center.sdk.statistics.UCIStatisticsDispatcher;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.network.header.UCHeaderHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Deprecated
public class AcDispatcherManager {
    private static final String TAG = "UCDispatcherManager";
    private static AcDispatcherManager mNetWorkManager;
    private j mAsyncTaskExecutor;
    private AcIInstantDispatcher mInstantDispatcher;
    private AcINetWorkDispatcher mNetWorkDispatcher;
    private UCIOapsDispatcher mOapsDispatcher;
    private UCIStatisticsDispatcher mStatisticsDispatcher;

    public static AcDispatcherManager getInstance() {
        if (mNetWorkManager == null) {
            mNetWorkManager = new AcDispatcherManager();
        }
        return mNetWorkManager;
    }

    public void get(Context context, String str, AcRequestCallBack acRequestCallBack) {
        HashMap<String, String> headers;
        try {
            headers = UCHeaderHelper.getHeaders(context);
        } catch (Exception unused) {
            headers = null;
        }
        if (acRequestCallBack != null) {
            acRequestCallBack.onReqStart();
        }
        if (this.mNetWorkDispatcher == null) {
            this.mNetWorkDispatcher = new AcNativeNetworkDispatcherImpl();
        }
        this.mNetWorkDispatcher.get(context, str, acRequestCallBack, headers);
    }

    public j getAsyncTaskExecutor() {
        if (this.mAsyncTaskExecutor == null) {
            this.mAsyncTaskExecutor = j.a.a;
        }
        return this.mAsyncTaskExecutor;
    }

    public void onStatistics(String str, String str2, String str3, Map<String, String> map) {
        UCIStatisticsDispatcher uCIStatisticsDispatcher = this.mStatisticsDispatcher;
        if (uCIStatisticsDispatcher != null) {
            uCIStatisticsDispatcher.onStatistics(str, str2, str3, map);
        } else {
            Log.w(TAG, "you must implement interface UCIStatisticsDispatcher method and call UCDispatcherManager.getInstance().register");
        }
    }

    public void openByOaps(Context context, String str) {
        UCIOapsDispatcher uCIOapsDispatcher = this.mOapsDispatcher;
        if (uCIOapsDispatcher != null) {
            uCIOapsDispatcher.openByOaps(context, str);
        }
    }

    public void post(Context context, String str, String str2, AcRequestCallBack acRequestCallBack) {
        HashMap<String, String> map;
        try {
            map = UCHeaderHelper.getHeaders(context);
        } catch (Exception unused) {
            map = new HashMap<>();
        }
        HashMap<String, String> map2 = map;
        if (acRequestCallBack != null) {
            acRequestCallBack.onReqStart();
        }
        if (this.mNetWorkDispatcher == null) {
            this.mNetWorkDispatcher = new AcNativeNetworkDispatcherImpl();
        }
        this.mNetWorkDispatcher.post(context, str, str2, acRequestCallBack, map2);
    }

    public void registInstantDispatcher(AcIInstantDispatcher acIInstantDispatcher) {
        if (acIInstantDispatcher != null) {
            this.mInstantDispatcher = acIInstantDispatcher;
        }
    }

    public void registOapsDispatcher(UCIOapsDispatcher uCIOapsDispatcher) {
        if (uCIOapsDispatcher != null) {
            this.mOapsDispatcher = uCIOapsDispatcher;
        }
    }

    public void register(AcINetWorkDispatcher acINetWorkDispatcher, UCIStatisticsDispatcher uCIStatisticsDispatcher) {
        if (acINetWorkDispatcher != null) {
            this.mNetWorkDispatcher = acINetWorkDispatcher;
        }
        if (uCIStatisticsDispatcher != null) {
            this.mStatisticsDispatcher = uCIStatisticsDispatcher;
        }
    }

    public void startInstant(Context context, String str, String str2) {
        AcIInstantDispatcher acIInstantDispatcher = this.mInstantDispatcher;
        if (acIInstantDispatcher != null) {
            acIInstantDispatcher.startInstant(context, str, str2);
        }
    }
}
