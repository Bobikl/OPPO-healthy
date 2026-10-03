package com.oppo.store.web;

import android.annotation.TargetApi;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class H5FaceWebChromeClient extends WebChromeClient {
    private static final String TAG = "H5FaceWebChromeClient";
    private String acceptType;
    private Activity activity;
    private WebChromeClient.FileChooserParams fileChooserParams;
    private ValueCallback<Uri[]> filePathCallback;
    private PermissionRequest request;
    public SelectImageActivityWrapper selectImageActivityWrapper;
    private ValueCallback<Uri> uploadMsg;
    private WBH5FaceVerifyHelper wbh5FaceVerifyHelper;
    private WebView webView;

    public H5FaceWebChromeClient(Activity activity) {
        this.activity = activity;
        this.selectImageActivityWrapper = new SelectImageActivityWrapper(this.activity, new HashMap());
    }

    public boolean enterOldModeFaceVerify(boolean z) {
        if (z) {
            return WBH5FaceVerifySDK.getInstance().recordVideoForApiBelow21(this.uploadMsg, this.acceptType, this.activity);
        }
        return WBH5FaceVerifySDK.getInstance().recordVideoForApi21(this.webView, this.filePathCallback, this.activity, this.fileChooserParams);
    }

    public void enterTrtcFaceVerify() {
        WebView webView;
        PermissionRequest permissionRequest = this.request;
        if (permissionRequest == null || permissionRequest.getOrigin() == null) {
            if (this.request == null && (webView = this.webView) != null && webView.canGoBack()) {
                this.webView.goBack();
                return;
            }
            return;
        }
        if (this.request.getOrigin().toString().contains("https://miniprogram-kyc.tencentcloudapi.com")) {
            PermissionRequest permissionRequest2 = this.request;
            permissionRequest2.grant(permissionRequest2.getResources());
            this.request.getOrigin();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.request = permissionRequest;
        WBH5FaceVerifyHelper wBH5FaceVerifyHelper = this.wbh5FaceVerifyHelper;
        if (wBH5FaceVerifyHelper != null) {
            wBH5FaceVerifyHelper.requestCameraPermission();
        }
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.webView = webView;
        this.filePathCallback = valueCallback;
        this.fileChooserParams = fileChooserParams;
        if (this.wbh5FaceVerifyHelper == null || fileChooserParams == null || fileChooserParams.getAcceptTypes() == null || fileChooserParams.getAcceptTypes().length <= 0) {
            return true;
        }
        String str = fileChooserParams.getAcceptTypes()[0];
        this.acceptType = str;
        if (TextUtils.equals(str, "image/*")) {
            this.selectImageActivityWrapper.setFilePathCallback(valueCallback);
            this.selectImageActivityWrapper.selectImage();
            return true;
        }
        WBH5FaceVerifyHelper wBH5FaceVerifyHelper = this.wbh5FaceVerifyHelper;
        if (wBH5FaceVerifyHelper == null) {
            return true;
        }
        wBH5FaceVerifyHelper.requestCameraAndSomePermissions(this.acceptType, false);
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        this.uploadMsg = valueCallback;
        this.acceptType = str;
        if (TextUtils.equals(str, "image/*")) {
            this.selectImageActivityWrapper.setUploadFileCallback(valueCallback);
            this.selectImageActivityWrapper.selectImage();
        } else {
            WBH5FaceVerifyHelper wBH5FaceVerifyHelper = this.wbh5FaceVerifyHelper;
            if (wBH5FaceVerifyHelper != null) {
                wBH5FaceVerifyHelper.requestCameraAndSomePermissions(str, true);
            }
        }
    }

    public void setWbh5FaceVerifyHelper(WBH5FaceVerifyHelper wBH5FaceVerifyHelper) {
        this.wbh5FaceVerifyHelper = wBH5FaceVerifyHelper;
    }
}
