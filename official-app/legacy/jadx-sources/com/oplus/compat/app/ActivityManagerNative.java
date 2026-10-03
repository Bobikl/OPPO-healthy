package com.oplus.compat.app;

import android.app.ActivityManager;
import android.app.IActivityManager;
import android.app.IProcessObserver;
import android.content.Context;
import android.content.pm.IPackageDataObserver;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.ep6;
import com.oplus.aiunit.vision.jvk;
import com.oplus.aiunit.vision.xu9;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import com.oplus.utils.reflect.MethodName;
import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefMethod;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityManagerNative {
    public static final Map<Object, IProcessObserver.Stub> a = new HashMap();
    public static final Map<xu9, PackageDataObserver> b = new ConcurrentHashMap();

    public static class PackageDataObserver extends IPackageDataObserver.Stub {
        private final xu9 mObserverNative;

        public PackageDataObserver(xu9 xu9Var) {
        }

        @Override // android.content.pm.IPackageDataObserver.Stub, android.content.pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z) throws RemoteException {
        }
    }

    public static class a {
        private static RefMethod<List<ActivityManager.RunningAppProcessInfo>> getRunningAppProcesses;
        private static RefMethod<IActivityManager> getService;

        @MethodName(name = "switchUser", params = {int.class})
        private static RefMethod<Boolean> switchUser;

        static {
            RefClass.load((Class<?>) a.class, (Class<?>) ActivityManager.class);
        }
    }

    @RequiresApi(api = 29)
    public static List<ActivityManager.RunningAppProcessInfo> a(Context context) throws UnSupportedApiVersionException {
        if (!jvk.m()) {
            if (!jvk.l()) {
                throw new UnSupportedApiVersionException("not supported before Q");
            }
            return (List) a.getRunningAppProcesses.call((ActivityManager) context.getSystemService("activity"), new Object[0]);
        }
        Response responseD = ep6.o(new Request.b().c("android.app.ActivityManager").b("getRunningAppProcesses").a()).d();
        if (responseD.isSuccessful()) {
            return responseD.getBundle().getParcelableArrayList("result");
        }
        Log.d("ActivityManagerNative", "getRunningAppProcesses: call failed");
        return Collections.emptyList();
    }
}
