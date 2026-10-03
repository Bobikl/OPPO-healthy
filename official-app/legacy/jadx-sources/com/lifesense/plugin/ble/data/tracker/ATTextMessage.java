package com.lifesense.plugin.ble.data.tracker;

import com.heytap.accessory.utils.XmlReader;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.LSDeviceMessage;
import com.lifesense.plugin.ble.data.LSPhoneCallState;
import com.oplus.aiunit.vision.n04;

/* JADX INFO: loaded from: classes5.dex */
public class ATTextMessage extends LSDeviceMessage {
    private int appId;
    private long callerTime;
    private String content;
    private boolean enable;
    private boolean isWriteSuccess;
    private String packageName;
    private LSPhoneCallState phoneState;
    private String title;
    private int unreadCount;

    public ATTextMessage(LSAppCategory lSAppCategory) {
        super(lSAppCategory);
        this.callerTime = System.currentTimeMillis();
    }

    public String filterString() {
        String str = this.enable ? "enable" : XmlReader.VALUE_DISABLE;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(n04.OPEN_BRACE_REGEX);
        stringBuffer.append("id=" + this.appId);
        stringBuffer.append(", packet=" + this.packageName);
        stringBuffer.append(", type=" + this.msgCategory);
        stringBuffer.append(", status=" + str);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public String formatString() {
        return "ATTextMessage [packageName=" + this.packageName + ", title=" + this.title + ", type=" + this.msgCategory + "]";
    }

    public int getAppId() {
        return this.appId;
    }

    public long getCallerTime() {
        return this.callerTime;
    }

    public String getContent() {
        return this.content;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public LSPhoneCallState getPhoneState() {
        return this.phoneState;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUnreadCount() {
        return this.unreadCount;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isWriteSuccess() {
        return this.isWriteSuccess;
    }

    public void setAppId(int i) {
        this.appId = i;
    }

    public void setCallerTime(long j2) {
        this.callerTime = j2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPhoneState(LSPhoneCallState lSPhoneCallState) {
        this.phoneState = lSPhoneCallState;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUnreadCount(int i) {
        this.unreadCount = i;
    }

    public void setWriteSuccess(boolean z) {
        this.isWriteSuccess = z;
    }

    @Override // com.lifesense.plugin.ble.data.LSDeviceMessage
    public String toString() {
        return "ATTextMessage{appId=" + this.appId + ", packageName='" + this.packageName + "', title='" + this.title + "', content='" + this.content + "', enable=" + this.enable + ", isWriteSuccess=" + this.isWriteSuccess + ", unreadCount=" + this.unreadCount + ", msgCategory=" + this.msgCategory + '}';
    }
}
