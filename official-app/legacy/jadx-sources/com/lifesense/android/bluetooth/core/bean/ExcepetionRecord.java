package com.lifesense.android.bluetooth.core.bean;

import android.text.TextUtils;
import com.lifesense.android.bluetooth.core.business.detect.common.c;

/* JADX INFO: loaded from: classes4.dex */
public class ExcepetionRecord {
    public int errorCategoryCode;
    public int errorCode;
    public String firmwareVersion;
    public String modelNumber;

    public ExcepetionRecord(int i, int i2, String str, String str2) {
        this.errorCode = i;
        this.errorCategoryCode = i2;
        this.firmwareVersion = str;
        this.modelNumber = str2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ExcepetionRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExcepetionRecord)) {
            return false;
        }
        ExcepetionRecord excepetionRecord = (ExcepetionRecord) obj;
        if (!excepetionRecord.canEqual(this) || getErrorCode() != excepetionRecord.getErrorCode() || getErrorCategoryCode() != excepetionRecord.getErrorCategoryCode()) {
            return false;
        }
        String firmwareVersion = getFirmwareVersion();
        String firmwareVersion2 = excepetionRecord.getFirmwareVersion();
        if (firmwareVersion != null ? !firmwareVersion.equals(firmwareVersion2) : firmwareVersion2 != null) {
            return false;
        }
        String modelNumber = getModelNumber();
        String modelNumber2 = excepetionRecord.getModelNumber();
        return modelNumber != null ? modelNumber.equals(modelNumber2) : modelNumber2 == null;
    }

    public String formatString() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("exception msg >>");
            String hexString = Integer.toHexString(this.errorCategoryCode);
            if (!TextUtils.isEmpty(hexString)) {
                hexString = hexString.toUpperCase();
            }
            stringBuffer.append("errorCode=" + this.errorCode + "[" + hexString + "],");
            StringBuilder sb = new StringBuilder();
            sb.append("firmwareVersion=");
            sb.append(this.firmwareVersion);
            sb.append(",");
            stringBuffer.append(sb.toString());
            stringBuffer.append("modelNumber=" + this.modelNumber);
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "null";
        }
    }

    public int getErrorCategoryCode() {
        return this.errorCategoryCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getModelNumber() {
        return this.modelNumber;
    }

    public int hashCode() {
        int errorCode = ((getErrorCode() + 59) * 59) + getErrorCategoryCode();
        String firmwareVersion = getFirmwareVersion();
        int i = errorCode * 59;
        int iHashCode = firmwareVersion == null ? 43 : firmwareVersion.hashCode();
        String modelNumber = getModelNumber();
        return ((i + iHashCode) * 59) + (modelNumber != null ? modelNumber.hashCode() : 43);
    }

    public void setErrorCategoryCode(int i) {
        this.errorCategoryCode = i;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setModelNumber(String str) {
        this.modelNumber = str;
    }

    public String toString() {
        return "ExcepetionRecord(errorCode=" + getErrorCode() + ", errorCategoryCode=" + getErrorCategoryCode() + ", firmwareVersion=" + getFirmwareVersion() + ", modelNumber=" + getModelNumber() + ")";
    }

    public ExcepetionRecord(int i, String str, String str2) {
        this.errorCode = i;
        this.firmwareVersion = str;
        this.modelNumber = str2;
        this.errorCategoryCode = c.a(i).a();
    }
}
