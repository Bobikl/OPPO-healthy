package com.lifesense.android.bluetooth.core.interfaces;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceData;
import com.lifesense.android.bluetooth.core.enums.DataType;

/* JADX INFO: loaded from: classes4.dex */
public interface OnDeviceMeasureDataListener {
    void onReceiveDeviceMeasureData(DataType dataType, BaseDeviceData baseDeviceData);
}
