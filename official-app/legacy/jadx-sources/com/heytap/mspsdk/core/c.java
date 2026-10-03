package com.heytap.mspsdk.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;
import com.heytap.msp.ipc.client.CompatServiceClient;
import com.heytap.mspsdk.constants.MspSdkCode;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.log.MspLog;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes19.dex */
public class c {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IPCType.values().length];
            a = iArr;
            try {
                iArr[IPCType.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IPCType.SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IPCType.PROVIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IPCType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> com.heytap.msp.ipc.client.f a(Context context, Class<T> cls, Parcelable parcelable, Bundle bundle) {
        IPCModule iPCModule;
        Annotation[] annotations = cls.getAnnotations();
        int length = annotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iPCModule = null;
                break;
            }
            Annotation annotation = annotations[i];
            MspLog.iIgnore("ProxyCompat", "annotation name is " + annotation.annotationType().getSimpleName());
            if (annotation instanceof IPCModule) {
                iPCModule = (IPCModule) annotation;
                MspLog.iIgnore("ProxyCompat", "ipcModule is " + iPCModule);
                break;
            }
            i++;
        }
        if (iPCModule == null) {
            throw new MspSdkException(2007, MspSdkCode.EXCEPTION_MSG_2007_NO_VALID_ANNOTATION);
        }
        int i2 = a.a[iPCModule.ipcType().ordinal()];
        if (i2 == 1) {
            return new com.heytap.msp.ipc.client.d(context, iPCModule, bundle);
        }
        if (i2 == 2) {
            return new CompatServiceClient(context, iPCModule, parcelable, bundle);
        }
        if (i2 == 3) {
            return new com.heytap.msp.ipc.client.e(context, iPCModule, parcelable, bundle);
        }
        throw new MspSdkException(2007, MspSdkCode.EXCEPTION_MSG_2007_ANNOTATION_ERROR);
    }
}
