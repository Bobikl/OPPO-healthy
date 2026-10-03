package com.oplus.carlink.controlsdk.data;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class CarStatus {
    public String companyId = "";
    public String carId = "";
    public List<ControlInstruction> availableInstructions = null;
    public float batteryEnduranceMileage = 0.0f;
    public float batteryLeftPercent = 0.0f;
    public float oilEnduranceMileage = 0.0f;
    public float oilLeftPercent = 0.0f;
    public float totalEnduranceMileage = 0.0f;
    public boolean charging = false;
    public long remainChargingTime = -1;
    public long finishChargingTime = -1;
    public long carStatusUpdateTime = -1;
    public String airTemperature = "";
    public String insideTemperature = "";
    public String outsideTemperature = "";
    public boolean isBluetoothConnected = false;
    public boolean isNetConnected = false;
    public String acTemperatureSetting = "";
}
