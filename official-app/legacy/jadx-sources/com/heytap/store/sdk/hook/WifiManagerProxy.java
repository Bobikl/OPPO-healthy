package com.heytap.store.sdk.hook;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.os.ServiceManager;
import android.util.Log;
import com.heytap.store.base.core.util.GlobalFlagUtils;
import com.heytap.store.platform.tools.ReflectUtil;
import com.heytap.store.util.HarmonyOSUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes7.dex */
public class WifiManagerProxy {
    private static final String TAG = "WifiManagerProxy";

    public static class NotificationHandler implements InvocationHandler {
        private Object mDefaultNotificationManager;

        public NotificationHandler(Object obj) {
            this.mDefaultNotificationManager = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("getConnectionInfo".equals(method.getName())) {
                boolean z = false;
                try {
                    StackTraceElement[] stackTrace = new Exception().getStackTrace();
                    if (stackTrace != null) {
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (stackTraceElement.getClassName().contains("AndroidNetworkLibrary")) {
                                z = true;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (GlobalFlagUtils.INSTANCE.getNeedHookWifiManager() || z) {
                    return null;
                }
            }
            return method.invoke(this.mDefaultNotificationManager, objArr);
        }
    }

    public static Object asInterface(IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return ReflectUtil.invokeStaticMethod(Class.forName("android.net.wifi.IWifiManager$Stub").getName(), "asInterface", new Class[]{IBinder.class}, iBinder);
    }

    public static Object createWifiManager() {
        try {
            Object objAsInterface = asInterface(ServiceManager.getService("wifi"));
            return Proxy.newProxyInstance(objAsInterface.getClass().getClassLoader(), objAsInterface.getClass().getInterfaces(), new NotificationHandler(objAsInterface));
        } catch (Exception e2) {
            Log.e(TAG, "createWifiManager failed: ", e2);
            return null;
        }
    }

    public static String getName() {
        return "wifi";
    }

    public static void hookWifiManager(Context context) {
        Object objCreateWifiManager;
        try {
            if (HarmonyOSUtil.isHarmonyOSa() && (objCreateWifiManager = createWifiManager()) != null) {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                Field declaredField = WifiManager.class.getDeclaredField("mService");
                declaredField.setAccessible(true);
                declaredField.set(wifiManager, objCreateWifiManager);
            }
        } catch (Exception unused) {
        }
    }
}
