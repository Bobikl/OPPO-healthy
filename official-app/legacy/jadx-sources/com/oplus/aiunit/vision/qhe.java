package com.oplus.aiunit.vision;

import android.telecom.PhoneAccountHandle;
import com.color.inner.telecom.PhoneAccountHandleWrapper;

/* JADX INFO: loaded from: classes4.dex */
public class qhe {
    public static Object a(PhoneAccountHandle phoneAccountHandle) {
        return Integer.valueOf(PhoneAccountHandleWrapper.getSubId(phoneAccountHandle));
    }
}
