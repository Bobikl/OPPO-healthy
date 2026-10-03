package com.omron;

import android.support.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public enum dw {
    UserIndexKey("User Index"),
    TimeStampKey("Time Stamp"),
    SequenceNumberKey("Sequence Number"),
    BloodPressureUnitKey("Blood Pressure Unit"),
    SystolicKey("Systolic"),
    DiastolicKey("Diastolic"),
    MeanArterialPressureKey("Mean Arterial Pressure"),
    PulseRateKey("Pulse Rate"),
    BloodPressureMeasurementStatusKey("Blood Pressure Measurement Status"),
    WeightUnitKey("Weight Unit"),
    HeightUnitKey("Height Unit"),
    WeightKey("Weight"),
    HeightKey("Height"),
    BMIKey("BMI"),
    BodyFatPercentageKey("Body Fat Percentage"),
    BasalMetabolismKey("Basal Metabolism"),
    MusclePercentageKey("Muscle Percentage"),
    MuscleMassKey("Muscle Mass"),
    FatFreeMassKey("Fat Free Mass"),
    SoftLeanMassKey("Soft Lean Mass"),
    BodyWaterMassKey("Body Water Mass"),
    ImpedanceKey("Impedance"),
    SkeletalMusclePercentageKey("Skeletal Muscle Percentage"),
    VisceralFatLevelKey("Visceral Fat Level"),
    BodyAgeKey("Body Age"),
    BodyFatPercentageStageEvaluationKey("Body Fat Percentage Stage Evaluation"),
    SkeletalMusclePercentageStageEvaluationKey("Skeletal Muscle Percentage Stage Evaluation"),
    VisceralFatLevelStageEvaluationKey("Visceral Fat Level Stage Evaluation"),
    PulseOximeterSpo2Key("Saturation Of Percutaneous Oxygen"),
    BodyTemperatureKey("Body Temperature"),
    BodyTemperatureUnitKey("Body Temperature Unit"),
    BodyTemperatureTypeKey("Body Temperature Type");


    @NonNull
    private String a;

    dw(@NonNull String str) {
        this.a = str;
    }
}
