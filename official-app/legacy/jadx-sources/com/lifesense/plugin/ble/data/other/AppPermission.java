package com.lifesense.plugin.ble.data.other;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.n04;

/* JADX INFO: loaded from: classes5.dex */
public class AppPermission {
    private AppStatus applicationStatus = AppStatus.UNKOWN;
    private boolean enableAccessService;
    private boolean enableGps;
    private boolean enableReadContacts;
    private boolean enableReadPhoneState;
    private boolean enableReadSms;
    private boolean enableReceiveNotify;
    private boolean isAccessServiceWorking;
    private boolean isNotifyServiceBind;
    private boolean isNotifyServiceWorking;

    private static String getBooleanValue(boolean z) {
        return z ? ExifInterface.GPS_DIRECTION_TRUE : UserInfo.SEX_FEMALE;
    }

    public AppStatus getApplicationStatus() {
        return this.applicationStatus;
    }

    public String getLogogramValue() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(n04.OPEN_BRACE_REGEX);
        if (AppStatus.BACKGROUND == this.applicationStatus) {
            str = "appStatus:background,";
        } else {
            stringBuffer.append("PS:" + getBooleanValue(this.enableReadPhoneState) + ",");
            stringBuffer.append("GPS:" + getBooleanValue(this.enableGps) + ",");
            stringBuffer.append("Sms:" + getBooleanValue(this.enableReadSms) + ",");
            str = "Contacts:" + getBooleanValue(this.enableReadContacts) + ",";
        }
        stringBuffer.append(str);
        stringBuffer.append("NLS:[" + getBooleanValue(this.enableReceiveNotify) + ",isWork:" + getBooleanValue(this.isNotifyServiceWorking) + ",isBind:" + getBooleanValue(this.isNotifyServiceBind) + "], ");
        StringBuilder sb = new StringBuilder();
        sb.append("NAS:[");
        sb.append(getBooleanValue(this.enableAccessService));
        sb.append(",isConnect:");
        sb.append(getBooleanValue(this.isAccessServiceWorking));
        sb.append("]");
        stringBuffer.append(sb.toString());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public boolean isAccessServiceWorking() {
        return this.isAccessServiceWorking;
    }

    public boolean isEnableAccessService() {
        return this.enableAccessService;
    }

    public boolean isEnableGps() {
        return this.enableGps;
    }

    public boolean isEnableReadContacts() {
        return this.enableReadContacts;
    }

    public boolean isEnableReadPhoneState() {
        return this.enableReadPhoneState;
    }

    public boolean isEnableReadSms() {
        return this.enableReadSms;
    }

    public boolean isEnableReceiveNotify() {
        return this.enableReceiveNotify;
    }

    public boolean isNotifyServiceBind() {
        return this.isNotifyServiceBind;
    }

    public boolean isNotifyServiceWorking() {
        return this.isNotifyServiceWorking;
    }

    public void setAccessServiceWorking(boolean z) {
        this.isAccessServiceWorking = z;
    }

    public void setApplicationStatus(AppStatus appStatus) {
        this.applicationStatus = appStatus;
    }

    public void setEnableAccessService(boolean z) {
        this.enableAccessService = z;
    }

    public void setEnableGps(boolean z) {
        this.enableGps = z;
    }

    public void setEnableReadContacts(boolean z) {
        this.enableReadContacts = z;
    }

    public void setEnableReadPhoneState(boolean z) {
        this.enableReadPhoneState = z;
    }

    public void setEnableReadSms(boolean z) {
        this.enableReadSms = z;
    }

    public void setEnableReceiveNotify(boolean z) {
        this.enableReceiveNotify = z;
    }

    public void setNotifyServiceBind(boolean z) {
        this.isNotifyServiceBind = z;
    }

    public void setNotifyServiceWorking(boolean z) {
        this.isNotifyServiceWorking = z;
    }

    public String toString() {
        return "AppPermission [enableReadSms=" + this.enableReadSms + ", enableReadContacts=" + this.enableReadContacts + ", enableReadPhoneState=" + this.enableReadPhoneState + ", enableReceiveNotify=" + this.enableReceiveNotify + ", isNotifyServiceWorking=" + this.isNotifyServiceWorking + ", isNotifyServiceBind=" + this.isNotifyServiceBind + ", enableGps=" + this.enableGps + ", enableAccessService=" + this.enableAccessService + ", isAccessServiceWorking=" + this.isAccessServiceWorking + ", applicationStatus=" + this.applicationStatus + "]";
    }
}
