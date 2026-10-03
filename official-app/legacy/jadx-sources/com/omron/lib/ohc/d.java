package com.omron.lib.ohc;

import android.support.annotation.NonNull;
import com.omron.aj;

/* JADX INFO: loaded from: classes5.dex */
public enum d {
    CharacteristicExtendedProperties("2900", "Characteristic Extended Properties"),
    CharacteristicUserDescription("2901", "Characteristic User Description"),
    ClientCharacteristicConfiguration("2902", "Client Characteristic Configuration"),
    ServerCharacteristicConfiguration("2903", "Server Characteristic Configuration"),
    CharacteristicPresentationFormat("2904", "Characteristic Presentation Format"),
    CharacteristicAggregateFormat("2905", "Characteristic Aggregate Format"),
    ValidRange("2906", "Valid Range"),
    ExternalReportReference("2907", "External Report Reference"),
    ReportReference("2908", "Report Reference"),
    NumberofDigitals("2909", "Number of Digitals"),
    ValueTriggerSetting("290A", "Value Trigger Setting"),
    EnvironmentalSensingConfiguration("290B", "Environmental Sensing Configuration"),
    EnvironmentalSensingMeasurement("290C", "Environmental Sensing Measurement"),
    EnvironmentalSensingTriggerSetting("290D", "Environmental Sensing Trigger Setting"),
    TimeTriggerSetting("290E", "Time Trigger Setting");


    @NonNull
    private final String a;

    @NonNull
    private final String b;

    d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public aj a() {
        return aj.a(this.a);
    }
}
