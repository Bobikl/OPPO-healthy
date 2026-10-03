package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import androidx.window.embedding.ActivityEmbeddingController;
import com.customer.feedback.sdk.activity.FeedbackActivity;
import com.customer.feedback.sdk.feedbacka;
import com.customer.feedback.sdk.log.CustomerLogCallback;
import com.customer.feedback.sdk.util.H5Callback;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.customer.feedback.sdk.util.LogUtil;
import com.customer.feedback.sdk.util.UploadListener;
import com.customer.feedback.sdk.widget.ContainerView;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.webview.extension.protocol.Const;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import feedbackg.feedbackh;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class pwm {
    public static UploadListener feedbackc;
    public static H5Callback feedbackd;
    public static String feedbacke;
    public final Activity a;
    public final ContainerView b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            pwm.this.a.onBackPressed();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ boolean i;

        public b(boolean z) {
            this.i = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((FeedbackActivity) pwm.this.a).onHomePage(this.i);
        }
    }

    public pwm(Activity activity, ContainerView containerView) {
        this.a = activity;
        this.b = containerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(FeedbackActivity feedbackActivity, ArrayList arrayList) {
        feedbackActivity.setStatusBarAndNav(kwm.n(), arrayList, this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        try {
            Uri uri = Uri.parse("tel:" + str);
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(uri);
            this.a.startActivity(intent);
        } catch (Exception e2) {
            LogUtil.e("HeaderInterface", "callDialer error: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(boolean z) {
        ((FeedbackActivity) this.a).enableStatusBarPadding(z);
    }

    @JavascriptInterface
    public void callDialer(final String str) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.nwm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.e(str);
            }
        });
    }

    @JavascriptInterface
    public void dismissLoading() {
        if (this.a != null) {
            LogUtil.d("HeaderInterface", "dismissLoading");
            FeedbackActivity feedbackActivity = (FeedbackActivity) this.a;
            if (feedbackActivity.isLoadFailedState()) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            feedbackActivity.getHandler().sendMessage(messageObtain);
        }
    }

    @JavascriptInterface
    public void enableStatusBarPadding(final boolean z) {
        LogUtil.d("HeaderInterface", "enableStatusBarPadding: " + z);
        Activity activity = this.a;
        if (activity instanceof FeedbackActivity) {
            activity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.mwm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(z);
                }
            });
        }
    }

    @JavascriptInterface
    public void fbLog(String str) {
        LogUtil.d("HeaderInterface", str);
    }

    @JavascriptInterface
    public void finishActivity() {
        LogUtil.d("HeaderInterface", "finishActivity");
        Activity activity = this.a;
        if (activity != null) {
            activity.finish();
        }
    }

    @JavascriptInterface
    public int getFontWeight() {
        int i = -1;
        if (this.a != null && ixm.a()) {
            try {
                int i2 = Settings.System.getInt(this.a.getContentResolver(), "font_variation_settings", -1);
                int i3 = (61440 & i2) >> 12;
                int i4 = i2 & 4095;
                if (i3 == 1) {
                    i = i4;
                }
            } catch (Exception e2) {
                LogUtil.d("HeaderInterface", "getFontWeight error: " + e2.getMessage());
            }
        }
        LogUtil.d("HeaderInterface", "getFontWeight: " + i);
        return i;
    }

    @JavascriptInterface
    public String getH5NightBg() {
        LogUtil.d("HeaderInterface", "getH5NightBg");
        CopyOnWriteArrayList copyOnWriteArrayList = feedbacka.f2201feedbackf;
        StringBuilder sb = new StringBuilder();
        float[] fArr = feedbacka.feedbackw;
        sb.append(fArr[0] * 255.0f);
        sb.append(",");
        sb.append(fArr[1] * 255.0f);
        sb.append(",");
        sb.append(fArr[2] * 255.0f);
        return sb.toString();
    }

    @JavascriptInterface
    public String getHeader() {
        LogUtil.d("HeaderInterface", "getHeader");
        Map<String, String> header = HeaderInfoHelper.getHeader(this.a.getApplicationContext());
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : header.keySet()) {
            String str2 = header.get(str);
            if (z) {
                sb.append(str + HttpUtils.EQUAL_SIGN + str2);
                z = false;
            } else if (str2 != null) {
                sb.append("&" + str + HttpUtils.EQUAL_SIGN + str2);
            } else {
                sb.append("&" + str + HttpUtils.EQUAL_SIGN);
            }
        }
        return sb.toString();
    }

    @JavascriptInterface
    public boolean getLogReminder() {
        LogUtil.d("HeaderInterface", "getLogReminder");
        return feedbacka.feedbackx;
    }

    @JavascriptInterface
    public int getNavigationBarHeight() {
        LogUtil.d("HeaderInterface", "getNavigationBarHeight");
        return kwm.k(this.a);
    }

    @JavascriptInterface
    public int getNavigationBarHeightDp() {
        LogUtil.d("HeaderInterface", "getNavigationBarHeightDp");
        Activity activity = this.a;
        return bwm.f(activity, kwm.k(activity));
    }

    @JavascriptInterface
    public String getNetType() {
        LogUtil.d("HeaderInterface", "getNetType");
        return HeaderInfoHelper.getNetType(this.a);
    }

    @JavascriptInterface
    public boolean getNightMode() {
        LogUtil.d("HeaderInterface", "getNightMode");
        return kwm.n();
    }

    @JavascriptInterface
    public int getStatusBarHeightDp() {
        Activity activity = this.a;
        int iF = bwm.f(activity, kwm.m(activity));
        LogUtil.d("HeaderInterface", "getStatusBarHeightDp: " + iF);
        return iF;
    }

    @JavascriptInterface
    public String getThemeColor() {
        int i;
        LogUtil.d("HeaderInterface", "getThemeColor");
        CopyOnWriteArrayList copyOnWriteArrayList = feedbacka.f2201feedbackf;
        if (!kwm.n() || feedbacka.a == -1) {
            LogUtil.d("FeedbackHelper", "in LightMode, use themeColor: " + feedbacka.feedbackz);
            i = feedbacka.feedbackz;
        } else {
            LogUtil.d("FeedbackHelper", "in NightMode, use DarkThemeColor: " + feedbacka.a);
            i = feedbacka.a;
        }
        int i2 = (16711680 & i) >> 16;
        int i3 = (65280 & i) >> 8;
        int i4 = i & 255;
        if (i == -1) {
            return "0";
        }
        return i2 + "," + i3 + "," + i4;
    }

    @JavascriptInterface
    public String getToken() {
        LogUtil.d("HeaderInterface", AcCommonApiMethod.GET_TOKEN);
        return feedbacka.feedbackt;
    }

    @JavascriptInterface
    public void goNoticePageDirect(boolean z) {
        LogUtil.d("HeaderInterface", "goNoticePageDirect");
        ((FeedbackActivity) this.a).setGoNoticePageDirect(z);
    }

    @JavascriptInterface
    public void h5Callback(int i, String str, String str2) {
        Activity activity;
        LogUtil.d("HeaderInterface", "h5Callback: " + i);
        if (i == 1) {
            LogUtil.d("HeaderInterface", "performH5CallbackForOnlineCodeTokenError, code=" + i + ", msg=" + str + ", data=" + str2);
            if (TextUtils.isEmpty(str2) && (activity = this.a) != null) {
                ((FeedbackActivity) activity).waitForToken();
            }
            H5Callback h5Callback = feedbackd;
            if (h5Callback != null) {
                h5Callback.callback(i, str, str2);
                return;
            }
            return;
        }
        if (i == 2 || i == 3) {
            LogUtil.d("HeaderInterface", "performH5Callback, code=" + i + ", msg=" + str + ", data=" + str2);
            H5Callback h5Callback2 = feedbackd;
            if (h5Callback2 != null) {
                h5Callback2.callback(i, str, str2);
                return;
            }
            return;
        }
        if (i == 4) {
            LogUtil.d("HeaderInterface", "performH5CallbackForSelfService, code=" + i + ", msg=" + str + ", data=" + str2);
            if (feedbacka.b) {
                H5Callback h5Callback3 = feedbackd;
                if (h5Callback3 != null) {
                    h5Callback3.callback(i, str, str2);
                    return;
                }
                return;
            }
            try {
                toNoticePage((String) new JSONObject(str2).get("link"));
                return;
            } catch (JSONException e2) {
                LogUtil.e("HeaderInterface", "performH5CallbackForSelfService", e2);
                return;
            }
        }
        if (i != 5) {
            H5Callback h5Callback4 = feedbackd;
            if (h5Callback4 != null) {
                h5Callback4.callback(i, str, str2);
                return;
            }
            return;
        }
        LogUtil.d("HeaderInterface", "performH5CallbackForOnlineService, code=" + i + ", msg=" + str + ", data=" + str2);
        if (feedbacka.f2199c) {
            H5Callback h5Callback5 = feedbackd;
            if (h5Callback5 != null) {
                h5Callback5.callback(i, str, str2);
                return;
            }
            return;
        }
        try {
            toNoticePage((String) new JSONObject(str2).get("link"));
        } catch (JSONException e3) {
            LogUtil.e("HeaderInterface", "performH5CallbackForOnlineService", e3);
        }
    }

    @JavascriptInterface
    public void hideInputMethod() {
        LogUtil.d("HeaderInterface", "hideInputMethod");
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        View currentFocus = this.a.getCurrentFocus();
        if (currentFocus == null || inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @JavascriptInterface
    public boolean isActivityEmbedded() {
        Activity activity;
        boolean zIsActivityEmbedded = false;
        if (ixm.b() && (activity = this.a) != null) {
            try {
                zIsActivityEmbedded = ActivityEmbeddingController.getInstance(activity).isActivityEmbedded(activity);
            } catch (Exception e2) {
                LogUtil.e("FbUtils", "isActivityEmbedded error: " + e2.getMessage(), e2);
            }
        }
        LogUtil.d("HeaderInterface", "isActivityEmbedded: " + zIsActivityEmbedded);
        return zIsActivityEmbedded;
    }

    @JavascriptInterface
    public boolean isGestureNavMode() {
        LogUtil.d("HeaderInterface", "isGestureNavMode");
        return kwm.p(this.a);
    }

    @JavascriptInterface
    public boolean isNeedMinusGestureBarHeight() {
        LogUtil.d("HeaderInterface", "isNeedMinusGestureBarHeight");
        return true;
    }

    @JavascriptInterface
    public boolean isTaskBarShowInApp() {
        LogUtil.d("HeaderInterface", "isTaskBarShowInApp");
        return Settings.System.getInt(this.a.getContentResolver(), "enable_launcher_taskbar", 0) == 1;
    }

    @JavascriptInterface
    public void notifyRequestServer(String str) {
        LogUtil.d("HeaderInterface", "notifyRequestServer");
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("HeaderInterface", "json is null");
            return;
        }
        try {
            feedbackh.a(new JSONObject(str));
        } catch (JSONException unused) {
            LogUtil.e("HeaderInterface", "json is invalid: " + str);
        }
    }

    @JavascriptInterface
    public void onHomePage(boolean z) {
        LogUtil.d("HeaderInterface", "onHomePage->" + z);
        try {
            Activity activity = this.a;
            if (activity instanceof FeedbackActivity) {
                activity.runOnUiThread(new b(z));
            }
        } catch (Exception e2) {
            LogUtil.e("HeaderInterface", "exceptionInfo：" + e2);
        }
    }

    @JavascriptInterface
    public void onKeyBackPress() {
        LogUtil.d("HeaderInterface", "onKeyBackPress");
        try {
            this.a.runOnUiThread(new a());
        } catch (Exception e2) {
            LogUtil.e("HeaderInterface", "exceptionInfo：" + e2);
        }
    }

    @JavascriptInterface
    public void sendLog(String str) {
        LogUtil.d("HeaderInterface", "sendLog");
        String string = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                string = new JSONObject(str).getString("fid");
            } catch (Exception e2) {
                LogUtil.e("JsonParser", "exceptionInfo：" + e2);
            }
        }
        feedbacke = string;
        if (!TextUtils.isEmpty(string)) {
            CustomerLogCallback customerLogCallback = feedbacka.feedbackv;
            if (customerLogCallback != null) {
                LogUtil.d("HeaderInterface", "customerLogCallback.startUploadCustomerLog()");
                customerLogCallback.startUploadCustomerLog();
            } else {
                new Thread(new xwm(new ywm(this.a.getApplicationContext()), feedbacke)).start();
            }
        }
        if (feedbackc != null) {
            LogUtil.d("HeaderInterface", "sendLog , sUploadListener.onUploaded");
            feedbackc.onUploaded(true);
        }
        twm.c(str);
    }

    @JavascriptInterface
    public void setStatusAndNavColor(String str, String str2, String str3, String str4) {
        LogUtil.d("HeaderInterface", "h5 setStatusAndNavColor: " + str + ", " + str2 + ", " + str3 + ", " + str4);
        int color = Color.parseColor(str);
        int color2 = Color.parseColor(str2);
        int color3 = Color.parseColor(str3);
        int color4 = Color.parseColor(str4);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(color));
        arrayList.add(Integer.valueOf(color2));
        arrayList.add(Integer.valueOf(color3));
        arrayList.add(Integer.valueOf(color4));
        Activity activity = this.a;
        if (activity == null) {
            LogUtil.e("HeaderInterface", "setStatusAndNavColor mActivity is null");
        } else {
            final FeedbackActivity feedbackActivity = (FeedbackActivity) activity;
            feedbackActivity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.owm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d(feedbackActivity, arrayList);
                }
            });
        }
    }

    @JavascriptInterface
    public void showInputMethod() {
        LogUtil.d("HeaderInterface", "showInputMethod");
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.a.getCurrentFocus(), 0);
        }
    }

    @JavascriptInterface
    public void showLoading() {
        if (this.a != null) {
            LogUtil.d("HeaderInterface", "showLoading");
            FeedbackActivity feedbackActivity = (FeedbackActivity) this.a;
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            feedbackActivity.getHandler().sendMessage(messageObtain);
        }
    }

    @JavascriptInterface
    public void showToast(String str) {
        LogUtil.d("HeaderInterface", " showToast " + str);
        hxm.a(this.a.getApplicationContext(), str);
    }

    @JavascriptInterface
    @SuppressLint({"UnsafeImplicitIntentLaunch"})
    public void toNoticePage(String str) {
        LogUtil.d("HeaderInterface", "toNoticePage -> " + str);
        Activity activity = this.a;
        if (activity != null) {
            FeedbackActivity feedbackActivity = (FeedbackActivity) activity;
            if (!TextUtils.isEmpty(str) && (str.startsWith(Const.Scheme.SCHEME_HTTPS) || str.startsWith("http") || str.startsWith("file://"))) {
                feedbackActivity.jumpToNoticePage(str);
                return;
            }
            try {
                feedbackActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception e2) {
                LogUtil.e("HeaderInterface", "toNoticePage :" + e2);
            }
        }
    }
}
