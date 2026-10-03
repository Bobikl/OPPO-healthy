package com.oplus.aiunit.vision;

import android.os.Binder;
import android.os.UserHandle;
import com.heytap.mcssdk.PushService;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class bym {
    public static final String a = PushService.class.getSimpleName();

    public static int a() {
        try {
            UserHandle callingUserHandle = Binder.getCallingUserHandle();
            Method declaredMethod = callingUserHandle.getClass().getDeclaredMethod("getIdentifier", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(callingUserHandle, new Object[0])).intValue();
        } catch (Exception e2) {
            cpm.b(a, "get userId exception," + e2);
            return 0;
        }
    }

    public static int b(int i, int i2) {
        return (i2 * 100000) + (i % 100000);
    }
}
