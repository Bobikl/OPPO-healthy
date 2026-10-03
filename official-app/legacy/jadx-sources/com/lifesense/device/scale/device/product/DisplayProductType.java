package com.lifesense.device.scale.device.product;

/* JADX INFO: loaded from: classes4.dex */
public enum DisplayProductType {
    pedometer(1),
    watches(2),
    weight(3),
    bloodPressure(4),
    interconnection(5);

    public int code;

    DisplayProductType(int i) {
        this.code = i;
    }

    public static DisplayProductType toProductType(int i) {
        DisplayProductType displayProductType = pedometer;
        for (DisplayProductType displayProductType2 : values()) {
            if (displayProductType2.code == i) {
                return displayProductType2;
            }
        }
        return displayProductType;
    }
}
