package com.oplus.aiunit.vision;

import android.telecom.PhoneAccountHandle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.inner.telecom.PhoneAccountHandleWrapper;
import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefInt;

/* JADX INFO: loaded from: classes4.dex */
public class phe {

    public static class a {
        private static RefInt mSlotId;
        private static RefInt mSubId;

        static {
            RefClass.load((Class<?>) a.class, (Class<?>) PhoneAccountHandle.class);
        }
    }

    @RequiresApi(api = 29)
    public static int a(@NonNull PhoneAccountHandle phoneAccountHandle) throws UnSupportedApiVersionException {
        if (jvk.n()) {
            return a.mSubId.get(phoneAccountHandle);
        }
        if (jvk.j()) {
            return PhoneAccountHandleWrapper.getSubId(phoneAccountHandle);
        }
        if (jvk.l()) {
            return ((Integer) b(phoneAccountHandle)).intValue();
        }
        throw new UnSupportedApiVersionException();
    }

    public static Object b(PhoneAccountHandle phoneAccountHandle) {
        return qhe.a(phoneAccountHandle);
    }
}
