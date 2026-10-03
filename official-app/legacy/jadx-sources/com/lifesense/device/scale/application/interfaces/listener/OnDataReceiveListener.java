package com.lifesense.device.scale.application.interfaces.listener;

import com.lifesense.android.bluetooth.core.interfaces.OnDeviceMeasureDataListener;
import com.lifesense.device.scale.device.dto.receive.WeightData;

/* JADX INFO: loaded from: classes4.dex */
public interface OnDataReceiveListener extends OnDeviceMeasureDataListener {
    void onReceiveWeightData(WeightData weightData);
}
