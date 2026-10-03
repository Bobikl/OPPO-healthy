package com.omron.lib.ohc;

import android.support.annotation.NonNull;
import com.omron.aj;

/* JADX INFO: loaded from: classes5.dex */
public enum e {
    GenericAccess("1800", "Generic Access"),
    GenericAttribute("1801", "Generic Attribute"),
    ImmediateAlert("1802", "Immediate Alert"),
    LinkLoss("1803", "Link Loss"),
    TxPower("1804", "Tx Power"),
    CurrentTimeService("1805", "Current Time Service"),
    ReferenceTimeUpdateService("1806", "Reference Time Update Service"),
    NextDSTChangeService("1807", "Next DST Change Service"),
    Glucose("1808", "Glucose"),
    HealthThermometer("1809", "Health Thermometer"),
    DeviceInformation("180A", "Device Information"),
    HeartRate("180D", "Heart Rate"),
    PhoneAlertStatusService("180E", "Phone Alert Status Service"),
    BatteryService("180F", "Battery Service"),
    BloodPressure("1810", "Blood Pressure"),
    AFBloodPressure("FCC5", "Blood Pressure"),
    AlertNotificationService("1811", "Alert Notification Service"),
    HumanInterfaceDevice("1812", "Human Interface Device"),
    ScanParameters("1813", "Scan Parameters"),
    RunningSpeedandCadence("1814", "Running Speed and Cadence"),
    AutomationIO("1815", "Automation IO"),
    CyclingSpeedandCadence("1816", "Cycling Speed and Cadence"),
    CyclingPower("1818", "Cycling Power"),
    LocationandNavigation("1819", "Location and Navigation"),
    EnvironmentalSensing("181A", "Environmental Sensing"),
    BodyComposition("181B", "Body Composition"),
    UserData("181C", "User Data"),
    WeightScale("181D", "Weight Scale"),
    BondManagementService("181E", "Bond Management Service"),
    ContinuousGlucoseMonitoring("181F", "Continuous Glucose Monitoring"),
    InternetProtocolSupportService("1820", "Internet Protocol Support Service"),
    IndoorPositioning("1821", "Indoor Positioning"),
    PulseOximeterService("1822", "Pulse Oximeter Service"),
    HTTPProxy("1823", "HTTP Proxy"),
    TransportDiscovery("1824", "Transport Discovery"),
    ObjectTransferService("1825", "Object Transfer Service"),
    FitnessMachine("1826", "Fitness Machine"),
    MeshProvisioningService("1827", "Mesh Provisioning Service"),
    MeshProxyService("1828", "Mesh Proxy Service"),
    OmronOptionalService("5DF5E817-A945-4F81-89C0-3D4E9759C07C", "Omron Optional Service"),
    OmronCustomPLXService("6E400001-B5A3-F393-EFA9-E50E24DCCA9E", "Omron Custom PLX Service");


    @NonNull
    private final String a;

    @NonNull
    private final String b;

    e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public aj a() {
        return aj.a(this.a);
    }
}
