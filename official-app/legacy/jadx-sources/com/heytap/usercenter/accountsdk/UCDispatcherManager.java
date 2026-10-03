package com.heytap.usercenter.accountsdk;

import android.content.Context;
import android.util.Log;
import com.accountbase.d;
import com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor;
import com.heytap.usercenter.accountsdk.http.UCNativeNetworkDispatcherImpl;
import com.heytap.usercenter.accountsdk.http.UCRequestCallBack;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.network.header.UCHeaderHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCDispatcherManager {
    private static final String TAG = "UCDispatcherManager";
    private static UCDispatcherManager mNetWorkManager;
    private IAsyncTaskExecutor mAsyncTaskExecutor;
    private UCIInstantDispatcher mInstantDispatcher;
    private UCINetWorkDispatcher mNetWorkDispatcher;
    private UCIOapsDispatcher mOapsDispatcher;
    private UCIStatisticsDispatcher mStatisticsDispatcher;

    public static UCDispatcherManager getInstance() {
        if (mNetWorkManager == null) {
            mNetWorkManager = new UCDispatcherManager();
        }
        return mNetWorkManager;
    }

    public void get(Context context, String str, UCRequestCallBack uCRequestCallBack) {
        HashMap<String, String> headers;
        try {
            headers = UCHeaderHelper.getHeaders(context);
        } catch (Exception unused) {
            headers = null;
        }
        if (uCRequestCallBack != null) {
            uCRequestCallBack.onReqStart();
        }
        if (this.mNetWorkDispatcher == null) {
            this.mNetWorkDispatcher = new UCNativeNetworkDispatcherImpl();
        }
        this.mNetWorkDispatcher.get(context, str, uCRequestCallBack, headers);
    }

    public IAsyncTaskExecutor getAsyncTaskExecutor() {
        if (this.mAsyncTaskExecutor == null) {
            this.mAsyncTaskExecutor = d.a();
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

    public void post(Context context, String str, String str2, UCRequestCallBack uCRequestCallBack) {
        HashMap<String, String> map;
        try {
            map = UCHeaderHelper.getHeaders(context);
        } catch (Exception unused) {
            map = new HashMap<>();
        }
        HashMap<String, String> map2 = map;
        if (uCRequestCallBack != null) {
            uCRequestCallBack.onReqStart();
        }
        if (this.mNetWorkDispatcher == null) {
            this.mNetWorkDispatcher = new UCNativeNetworkDispatcherImpl();
        }
        this.mNetWorkDispatcher.post(context, str, str2, uCRequestCallBack, map2);
    }

    public void registExecutorDispatcher(IAsyncTaskExecutor iAsyncTaskExecutor) {
        if (iAsyncTaskExecutor != null) {
            this.mAsyncTaskExecutor = iAsyncTaskExecutor;
        }
    }

    public void registInstantDispatcher(UCIInstantDispatcher uCIInstantDispatcher) {
        if (uCIInstantDispatcher != null) {
            this.mInstantDispatcher = uCIInstantDispatcher;
        }
    }

    public void registOapsDispatcher(UCIOapsDispatcher uCIOapsDispatcher) {
        if (uCIOapsDispatcher != null) {
            this.mOapsDispatcher = uCIOapsDispatcher;
        }
    }

    public void register(UCINetWorkDispatcher uCINetWorkDispatcher, UCIStatisticsDispatcher uCIStatisticsDispatcher) {
        if (uCINetWorkDispatcher != null) {
            this.mNetWorkDispatcher = uCINetWorkDispatcher;
        }
        if (uCIStatisticsDispatcher != null) {
            this.mStatisticsDispatcher = uCIStatisticsDispatcher;
        }
    }

    public void startInstant(Context context, String str, String str2) {
        UCIInstantDispatcher uCIInstantDispatcher = this.mInstantDispatcher;
        if (uCIInstantDispatcher != null) {
            uCIInstantDispatcher.startInstant(context, str, str2);
        }
    }

    public void unregister() {
        this.mNetWorkDispatcher = null;
        this.mStatisticsDispatcher = null;
        this.mInstantDispatcher = null;
        this.mOapsDispatcher = null;
        this.mAsyncTaskExecutor = null;
    }
}
