package com.oppo.store.web;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.c8l;
import com.oppo.store.web.util.DirUtil;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class WBH5FaceVerifySDK {
    private static final String NETWORK_2G = "NETWORK_2G";
    private static final String NETWORK_3G = "NETWORK_3G";
    private static final String NETWORK_4G = "NETWORK_4G";
    private static final String NETWORK_MOBILE = "NETWORK_MOBILE";
    private static final String NETWORK_NONE = "NETWORK_NONE";
    private static final String NETWORK_WIFI = "NETWORK_WIFI";
    public static final int VIDEO_REQUEST = 17;
    private static WBH5FaceVerifySDK instance;
    private Uri imageUri;
    private ValueCallback<Uri[]> mUploadCallbackAboveL;
    private ValueCallback<Uri> mUploadMessage;
    private Uri videoUri;

    private WBH5FaceVerifySDK() {
    }

    public static synchronized WBH5FaceVerifySDK getInstance() {
        if (instance == null) {
            instance = new WBH5FaceVerifySDK();
        }
        return instance;
    }

    private static String getNetWorkState(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                return NETWORK_WIFI;
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 != null) {
                NetworkInfo.State state2 = networkInfo2.getState();
                String subtypeName = networkInfo2.getSubtypeName();
                if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return NETWORK_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return NETWORK_3G;
                        case 13:
                            return NETWORK_4G;
                        default:
                            return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NETWORK_3G : NETWORK_MOBILE;
                    }
                }
            }
        }
        return NETWORK_NONE;
    }

    private void handleMethod(Activity activity, String str) {
        if (TextUtils.equals(str, "image/*")) {
            openImageChooserActivity(activity);
        } else if (TextUtils.equals(str, "video/webank")) {
            recordVideo(activity);
        }
    }

    private void openImageChooserActivity(Activity activity) {
        try {
            File file = new File(DirUtil.getTempImagesPath(activity) + File.separator + System.currentTimeMillis() + ".jpg");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            this.imageUri = FileProvider.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".storeweb.fileprovider", file);
            Intent intent = new Intent();
            intent.addFlags(1);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            intent.setAction("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", this.imageUri);
            Intent intent2 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent2.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "vnd.android.cursor.dir/image");
            Intent intent3 = new Intent("android.intent.action.CHOOSER");
            intent3.putExtra("android.intent.extra.INTENT", intent2);
            intent3.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            activity.startActivityForResult(intent3, 10011);
        } catch (Exception unused) {
        }
    }

    private void recordVideo(Activity activity) {
        try {
            File file = new File(DirUtil.getTempImagesPath(activity) + File.separator + System.currentTimeMillis() + ".mp4");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            this.videoUri = FileProvider.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".storeweb.fileprovider", file);
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", 1);
            intent.addFlags(1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            intent.putExtra("output", this.videoUri);
            activity.startActivityForResult(intent, 17);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void setmUploadCallbackAboveL(ValueCallback<Uri[]> valueCallback) {
        this.mUploadCallbackAboveL = valueCallback;
    }

    private void setmUploadMessage(ValueCallback<Uri> valueCallback) {
        this.mUploadMessage = valueCallback;
    }

    private boolean supportAcceptType(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(c8l.IMAGE_KEY) || str.contains("video");
    }

    public boolean isTencentH5FaceVerify(WebView webView, WebChromeClient.FileChooserParams fileChooserParams, String str) {
        if ("video/webank".equals(str)) {
            return true;
        }
        if (fileChooserParams != null && fileChooserParams.getAcceptTypes() != null && fileChooserParams.getAcceptTypes().length > 0 && "video/webank".equals(fileChooserParams.getAcceptTypes()[0])) {
            return true;
        }
        if (webView != null && !TextUtils.isEmpty(webView.getUrl())) {
            try {
                String str2 = webView.getUrl().split("//")[1].split("\\.")[0];
                return str2.contains("kyc") || str2.contains("ida");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public boolean receiveH5FaceVerifyResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 17 && i != 10011) {
            return false;
        }
        if (this.mUploadMessage == null && this.mUploadCallbackAboveL == null) {
            return true;
        }
        Uri data = (intent == null || i2 != -1) ? null : intent.getData();
        if (i == 17) {
            uriArr = new Uri[1];
            if (data == null) {
                uriArr[0] = this.videoUri;
            } else {
                uriArr[0] = data;
            }
        } else {
            uriArr = new Uri[1];
            if (data == null) {
                uriArr[0] = this.imageUri;
            } else {
                uriArr[0] = data;
            }
        }
        ValueCallback<Uri[]> valueCallback = this.mUploadCallbackAboveL;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            setmUploadCallbackAboveL(null);
        } else {
            this.mUploadMessage.onReceiveValue(data);
            setmUploadMessage(null);
        }
        return true;
    }

    @TargetApi(21)
    public boolean recordVideoForApi21(WebView webView, ValueCallback<Uri[]> valueCallback, Activity activity, WebChromeClient.FileChooserParams fileChooserParams) {
        Log.d("faceVerify", "accept is " + fileChooserParams.getAcceptTypes()[0] + "---url---" + webView.getUrl());
        if (!isTencentH5FaceVerify(webView, fileChooserParams, null) && !supportAcceptType(fileChooserParams.getAcceptTypes()[0])) {
            return false;
        }
        setmUploadCallbackAboveL(valueCallback);
        recordVideo(activity);
        return true;
    }

    public boolean recordVideoForApiBelow21(ValueCallback<Uri> valueCallback, String str, Activity activity) {
        if (!isTencentH5FaceVerify(null, null, str) && !supportAcceptType(str)) {
            return false;
        }
        setmUploadMessage(valueCallback);
        recordVideo(activity);
        return true;
    }

    public void setWebViewSettings(WebView webView, Context context, String str) {
        if (webView == null) {
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setTextZoom(100);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        if (str == null || Uri.parse(str) == null || Uri.parse(str).getScheme() == null || !Uri.parse(str).getScheme().equalsIgnoreCase(Const.Scheme.SCHEME_FILE)) {
            settings.setJavaScriptEnabled(true);
        } else {
            settings.setJavaScriptEnabled(false);
        }
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setLoadWithOverviewMode(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabasePath(context.getDir("databases", 0).getPath());
        settings.setGeolocationDatabasePath(context.getDir("geolocation", 0).getPath());
        settings.setPluginState(WebSettings.PluginState.ON_DEMAND);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setAllowUniversalAccessFromFileURLs(true);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        String userAgentString = settings.getUserAgentString();
        try {
            settings.setUserAgentString(userAgentString + ";webank/h5face;webank/1.0;netType:" + getNetWorkState(context) + ";appVersion:" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode + ";packageName:" + context.getPackageName());
        } catch (PackageManager.NameNotFoundException e2) {
            settings.setUserAgentString(userAgentString + ";webank/h5face;webank/1.0");
            e2.printStackTrace();
        }
    }

    public boolean isTencentH5FaceVerify(String str) {
        try {
            String str2 = str.split("//")[1].split("\\.")[0];
            return str2.contains("kyc") || str2.contains("ida");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
