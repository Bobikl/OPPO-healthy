package com.sensorsdata.analytics.android.sdk.visual.property;

import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.Dispatcher;

/* JADX INFO: loaded from: classes10.dex */
public class VisualConfigRequestHelper {
    private static final String TAG = "SA.VP.VisualConfigRequestHelper";
    private volatile CountDownTimer mCountDownTimer;

    /* JADX INFO: renamed from: com.sensorsdata.analytics.android.sdk.visual.property.VisualConfigRequestHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ IApiCallback val$callback;
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$version;

        public AnonymousClass1(Context context, String str, IApiCallback iApiCallback) {
            this.val$context = context;
            this.val$version = str;
            this.val$callback = iApiCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VisualConfigRequestHelper.this.mCountDownTimer != null) {
                    VisualConfigRequestHelper.this.mCountDownTimer.cancel();
                    VisualConfigRequestHelper.this.mCountDownTimer = null;
                }
                VisualConfigRequestHelper.this.mCountDownTimer = new CountDownTimer(90000L, 30000L) { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualConfigRequestHelper.1.1
                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j2) {
                        try {
                            if (TextUtils.isEmpty(SensorsDataAPI.sharedInstance().getServerUrl())) {
                                SALog.i(VisualConfigRequestHelper.TAG, "visualConfigRequest server url is null and return");
                                return;
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            String requestUrl = VisualConfigRequestHelper.this.getRequestUrl(anonymousClass1.val$context, anonymousClass1.val$version);
                            if (TextUtils.isEmpty(requestUrl)) {
                                SALog.i(VisualConfigRequestHelper.TAG, "visualConfigRequest request url is null and return");
                            } else {
                                new RequestHelper.Builder(HttpMethod.GET, requestUrl).callback(new HttpCallback.StringCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualConfigRequestHelper.1.1.1
                                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                                    public void onAfter() {
                                    }

                                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                                    public void onFailure(int i, String str) {
                                        if (i == 304 || i == 404 || i == 205) {
                                            VisualConfigRequestHelper.this.resetTimer();
                                            if (i == 205) {
                                                VisualPropertiesManager.getInstance().save2Cache("");
                                            }
                                            SALog.i(VisualConfigRequestHelper.TAG, "requestVisualConfig return 304 Or 404");
                                        }
                                    }

                                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                                    public void onResponse(String str) {
                                        VisualConfigRequestHelper.this.resetTimer();
                                        IApiCallback iApiCallback = AnonymousClass1.this.val$callback;
                                        if (iApiCallback != null) {
                                            iApiCallback.onSuccess(str);
                                        }
                                        SALog.i(VisualConfigRequestHelper.TAG, "requestVisualConfig success response is " + str);
                                    }
                                }).execute();
                            }
                        } catch (Exception e2) {
                            SALog.printStackTrace(e2);
                        }
                    }
                };
                VisualConfigRequestHelper.this.mCountDownTimer.start();
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    public interface IApiCallback {
        void onSuccess(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getRequestUrl(Context context, String str) {
        String str2;
        if (context == null) {
            SALog.i(TAG, "getRequestUrl context is null and return");
            return null;
        }
        String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
        if (TextUtils.isEmpty(serverUrl)) {
            SALog.i(TAG, "visualConfigRequest server url is null and return");
            return null;
        }
        int iLastIndexOf = serverUrl.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            str2 = serverUrl.substring(0, iLastIndexOf) + "/config/visualized/Android.conf";
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str2).buildUpon();
        if (!TextUtils.isEmpty(str)) {
            builderBuildUpon.appendQueryParameter("v", str);
        }
        String queryParameter = Uri.parse(serverUrl).getQueryParameter("project");
        if (!TextUtils.isEmpty(queryParameter)) {
            builderBuildUpon.appendQueryParameter("project", queryParameter);
        }
        String processName = AppInfoUtils.getProcessName(context);
        if (!TextUtils.isEmpty(processName)) {
            builderBuildUpon.appendQueryParameter("app_id", processName);
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimer() {
        try {
            try {
                if (this.mCountDownTimer != null) {
                    this.mCountDownTimer.cancel();
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        } finally {
            this.mCountDownTimer = null;
        }
    }

    public void requestVisualConfig(Context context, String str, IApiCallback iApiCallback) {
        Dispatcher.getInstance().post(new AnonymousClass1(context, str, iApiCallback));
    }
}
