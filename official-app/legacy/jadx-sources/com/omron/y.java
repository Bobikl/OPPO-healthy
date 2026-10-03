package com.omron;

import android.annotation.TargetApi;

/* JADX INFO: loaded from: classes5.dex */
class y {
    static final String a = a();
    static final String b = b();

    public enum a {
        Pin(0),
        Passkey(1),
        PasskeyConfirmation(2),
        Consent(3),
        DisplayPasskey(4),
        DisplayPin(5),
        OobConsent(6),
        Pin16Digits(7),
        Unknown(-1);

        private int a;

        a(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }

        public static a a(int i) throws IllegalArgumentException {
            for (a aVar : values()) {
                if (aVar.a() == i) {
                    return aVar;
                }
            }
            return Unknown;
        }
    }

    @TargetApi(19)
    private static String a() {
        return "android.bluetooth.device.action.PAIRING_REQUEST";
    }

    @TargetApi(19)
    private static String b() {
        return "android.bluetooth.device.extra.PAIRING_VARIANT";
    }
}
