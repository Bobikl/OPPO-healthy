package com.lifesense.android.bluetooth.core.tools;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class h {
    @SuppressLint({"PrivateApi"})
    public static Object a(BluetoothAdapter bluetoothAdapter) {
        return a((Class<?>) BluetoothAdapter.class, "getBluetoothManager", (Class<?>[]) new Class[0]).invoke(bluetoothAdapter, new Object[0]);
    }

    public static boolean b(BluetoothAdapter bluetoothAdapter) {
        Object objA;
        Method methodA;
        boolean z;
        if (bluetoothAdapter == null) {
            return false;
        }
        try {
            Object objA2 = a(bluetoothAdapter);
            if (objA2 == null || (objA = a(objA2)) == null) {
                return false;
            }
            Class cls = Integer.TYPE;
            Method methodA2 = a(objA, "unregisterClient", (Class<?>[]) new Class[]{cls});
            try {
                methodA = a(objA, "stopScan", (Class<?>[]) new Class[]{cls, Boolean.TYPE});
                z = false;
            } catch (Exception unused) {
                methodA = a(objA, "stopScan", (Class<?>[]) new Class[]{Integer.TYPE});
                z = true;
            }
            for (int i = 0; i <= 40; i++) {
                if (!z) {
                    try {
                        methodA.invoke(objA, Integer.valueOf(i), Boolean.FALSE);
                    } catch (Exception unused2) {
                    }
                }
                if (z) {
                    try {
                        methodA.invoke(objA, Integer.valueOf(i));
                    } catch (Exception unused3) {
                    }
                }
                try {
                    methodA2.invoke(objA, Integer.valueOf(i));
                } catch (Exception unused4) {
                }
            }
            methodA.setAccessible(false);
            methodA2.setAccessible(false);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @SuppressLint({"PrivateApi"})
    public static Object a(Object obj) {
        return a(obj, "getBluetoothGatt", (Class<?>[]) new Class[0]).invoke(obj, new Object[0]);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public static Method a(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
