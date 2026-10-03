package com.omron;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class bj implements bc {
    @Override // com.omron.bc
    public void a(int i, String str, String str2) {
        if (i == 1) {
            Log.d(str, str2);
        } else if (i == 2) {
            Log.e(str, str2);
        }
    }
}
