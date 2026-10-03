package com.oplus.aiunit.vision;

import com.heytap.health.stress.R$array;

/* JADX INFO: loaded from: classes18.dex */
public class v1j {
    public static String a(int i) {
        return e88.a().getResources().getStringArray(R$array.health_stress_desc_array)[b(i)];
    }

    public static int b(int i) {
        if (i <= 29) {
            return 0;
        }
        if (i <= 59) {
            return 1;
        }
        return i <= 79 ? 2 : 3;
    }
}