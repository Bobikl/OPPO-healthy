package com.sensorsdata.analytics.android.sdk.visual;

import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.ReflectUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewVisualInterface {
    private static final String TAG = "SA.Visual.WebViewVisualInterface";
    private WeakReference<View> mWebView;

    public WebViewVisualInterface(View view) {
        this.mWebView = new WeakReference<>(view);
    }

    @JavascriptInterface
    public void sensorsdata_hover_web_nodes(String str) {
        try {
            NodesProcess.getInstance().getWebNodesManager().handlerMessage(str);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @JavascriptInterface
    public void sensorsdata_visualized_alert_info(final String str) {
        try {
            SALog.i(TAG, "sensorsdata_visualized_alert_info msg: " + str);
            if (this.mWebView.get() != null) {
                this.mWebView.get().post(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.visual.WebViewVisualInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = (String) ReflectUtil.callMethod(WebViewVisualInterface.this.mWebView.get(), "getUrl", new Object[0]);
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        SALog.i(WebViewVisualInterface.TAG, "sensorsdata_visualized_alert_info url: " + str2);
                        NodesProcess.getInstance().getWebNodesManager().handlerFailure(str2, str);
                    }
                });
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @JavascriptInterface
    public boolean sensorsdata_visualized_mode() {
        return VisualizedAutoTrackService.getInstance().isServiceRunning() || HeatMapService.getInstance().isServiceRunning();
    }
}
