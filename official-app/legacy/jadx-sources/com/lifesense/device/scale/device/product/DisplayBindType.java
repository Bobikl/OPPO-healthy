package com.lifesense.device.scale.device.product;

/* JADX INFO: loaded from: classes4.dex */
public enum DisplayBindType {
    qrcode(1),
    sn_qrcode(2),
    bluetooth(3),
    device_1597(4);

    public int code;

    DisplayBindType(int i) {
        this.code = i;
    }

    public static DisplayBindType toDisplayBindType(int i) {
        DisplayBindType displayBindType = qrcode;
        for (DisplayBindType displayBindType2 : values()) {
            if (displayBindType2.code == i) {
                return displayBindType2;
            }
        }
        return displayBindType;
    }
}
