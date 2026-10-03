package com.heytap.msp.ipc.client;

import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class g {

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
        }
    }

    public static List<j> a(IPCModule iPCModule) {
        ArrayList arrayList = new ArrayList();
        if (iPCModule != null) {
            int i = a.a[iPCModule.ipcType().ordinal()];
            int i2 = 0;
            if (i == 1 || i == 2) {
                String[] strArrAuthsOrActions = iPCModule.authsOrActions();
                int length = strArrAuthsOrActions.length;
                while (i2 < length) {
                    j jVarB = j.b(iPCModule.targetPackage(), null, strArrAuthsOrActions[i2], iPCModule.targetComponentClass());
                    if (jVarB != null) {
                        arrayList.add(jVarB);
                    }
                    i2++;
                }
            } else if (i == 3) {
                String[] strArrAuthsOrActions2 = iPCModule.authsOrActions();
                int length2 = strArrAuthsOrActions2.length;
                while (i2 < length2) {
                    j jVarD = j.d(iPCModule.targetPackage(), null, strArrAuthsOrActions2[i2], iPCModule.targetComponentClass());
                    if (jVarD != null) {
                        arrayList.add(jVarD);
                    }
                    i2++;
                }
            }
        }
        return arrayList;
    }
}
