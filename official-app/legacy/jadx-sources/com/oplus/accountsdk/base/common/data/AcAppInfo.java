package com.oplus.accountsdk.base.common.data;

import android.content.Context;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.aiunit.vision.k7;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcAppInfo {
    private int appVersion;
    private String appVersionName;
    private String bizTraceId;
    private String packageName;
    private String sdkType;
    private int sdkVersionCode;
    private String sdkVersionName;

    public static AcAppInfo getAppInfo(Context context, String str, int i) {
        AcAppInfo acAppInfo = new AcAppInfo();
        acAppInfo.setPackageName(context.getPackageName());
        acAppInfo.setAppVersionName(k7.c(context, context.getPackageName()));
        acAppInfo.setAppVersion(k7.b(context, context.getPackageName()));
        acAppInfo.setSdkVersionName(str);
        acAppInfo.setSdkVersionCode(i);
        acAppInfo.setSdkType(AcBaseConstants.a.ID_SDK_TYPE_VALUE);
        return acAppInfo;
    }

    public int getAppVersion() {
        return this.appVersion;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public String getBizTraceId() {
        return this.bizTraceId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSdkType() {
        return this.sdkType;
    }

    public int getSdkVersionCode() {
        return this.sdkVersionCode;
    }

    public String getSdkVersionName() {
        return this.sdkVersionName;
    }

    public void setAppVersion(int i) {
        this.appVersion = i;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setBizTraceId(String str) {
        this.bizTraceId = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSdkType(String str) {
        this.sdkType = str;
    }

    public void setSdkVersionCode(int i) {
        this.sdkVersionCode = i;
    }

    public void setSdkVersionName(String str) {
        this.sdkVersionName = str;
    }

    public static AcAppInfo getAppInfo(Context context, String str, String str2, int i) {
        AcAppInfo appInfo = getAppInfo(context, str2, i);
        appInfo.setBizTraceId(str);
        return appInfo;
    }
}
