package com.lifesense.android.bluetooth.core.bean;

import android.util.Log;
import com.lifesense.android.bluetooth.core.enums.DataType;
import com.lifesense.android.bluetooth.core.interfaces.OnDeviceMeasureDataListener;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDeviceData {
    public int batteryLevel;
    public float batteryVoltage;
    public String broadcastId;
    public String deviceId;
    public String userId;

    public boolean canEqual(Object obj) {
        return obj instanceof BaseDeviceData;
    }

    public boolean checkStringValue(String str) {
        return str != null && str.length() > 0;
    }

    public abstract void decodeFromData(String str);

    public void decodeFromMessage(HandlerMessage handlerMessage) {
        decodeFromData((String) handlerMessage.getData());
    }

    public abstract List<BaseDeviceData> decodeListFromData(String str);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseDeviceData)) {
            return false;
        }
        BaseDeviceData baseDeviceData = (BaseDeviceData) obj;
        if (!baseDeviceData.canEqual(this)) {
            return false;
        }
        String deviceId = getDeviceId();
        String deviceId2 = baseDeviceData.getDeviceId();
        if (deviceId != null ? !deviceId.equals(deviceId2) : deviceId2 != null) {
            return false;
        }
        String broadcastId = getBroadcastId();
        String broadcastId2 = baseDeviceData.getBroadcastId();
        if (broadcastId != null ? !broadcastId.equals(broadcastId2) : broadcastId2 != null) {
            return false;
        }
        String userId = getUserId();
        String userId2 = baseDeviceData.getUserId();
        if (userId != null ? userId.equals(userId2) : userId2 == null) {
            return getBatteryLevel() == baseDeviceData.getBatteryLevel() && Float.compare(getBatteryVoltage(), baseDeviceData.getBatteryVoltage()) == 0;
        }
        return false;
    }

    public String getActualClassName() {
        return getClass().getName();
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public float getBatteryVoltage() {
        return this.batteryVoltage;
    }

    public String getBroadcastId() {
        return this.broadcastId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public DataType getMeasureDataType() {
        return DataType.valueOf(getClass().getSimpleName());
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String deviceId = getDeviceId();
        int iHashCode = deviceId == null ? 43 : deviceId.hashCode();
        String broadcastId = getBroadcastId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (broadcastId == null ? 43 : broadcastId.hashCode());
        String userId = getUserId();
        return (((((iHashCode2 * 59) + (userId != null ? userId.hashCode() : 43)) * 59) + getBatteryLevel()) * 59) + Float.floatToIntBits(getBatteryVoltage());
    }

    public void onReceiveDataCallback(OnDeviceMeasureDataListener onDeviceMeasureDataListener) {
        DataType measureDataType = getMeasureDataType();
        if (measureDataType == null) {
            Log.e(getActualClassName(), "unrecoginzed data type");
        }
        onDeviceMeasureDataListener.onReceiveDeviceMeasureData(measureDataType, this);
    }

    public void setBatteryLevel(int i) {
        this.batteryLevel = i;
    }

    public void setBatteryVoltage(float f) {
        this.batteryVoltage = f;
    }

    public void setBroadcastId(String str) {
        this.broadcastId = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean toBoolean(String str) {
        return checkStringValue(str) && !str.equalsIgnoreCase("null") && Integer.parseInt(str) == 1;
    }

    public float toFloat(String str) {
        if (!checkStringValue(str) || str.equalsIgnoreCase("null")) {
            return 0.0f;
        }
        return Float.parseFloat(str);
    }

    public int toInt(String str) {
        try {
            if (checkStringValue(str) && str != null && !str.equalsIgnoreCase("null")) {
                return Integer.parseInt(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public long toLong(String str) {
        if (!checkStringValue(str) || str.equalsIgnoreCase("null")) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    public String toString() {
        return "BaseDeviceData(deviceId=" + getDeviceId() + ", broadcastId=" + getBroadcastId() + ", userId=" + getUserId() + ", batteryLevel=" + getBatteryLevel() + ", batteryVoltage=" + getBatteryVoltage() + ")";
    }

    public Object toUploadData() {
        return null;
    }

    public String uploadUrl() {
        return null;
    }
}
