package com.lifesense.android.bluetooth.core.bean;

/* JADX INFO: loaded from: classes4.dex */
public class VoltageState {
    public static final int CHARGE = 1;
    public static final int NON = -1;
    public static final int NORMAL_WORK = 0;

    public static String toString(int i) {
        if (i == -1) {
            return "NON";
        }
        if (i != 0) {
            return i != 1 ? "" : "CHARGE";
        }
        return "NORMAL_WORK";
    }
}
