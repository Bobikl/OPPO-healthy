package com.sensorsdata.analytics.android.sdk.advert.oaid;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Looper;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.impl.OAIDFactory;
import com.sensorsdata.analytics.android.sdk.core.business.SAPropertyManager;
import com.sensorsdata.analytics.android.sdk.internal.beans.LimitKey;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public class SAOaidHelper {
    private static final String TAG = "SA.SAOaidHelper";
    private static Class<?> jLibrary = null;
    private static CountDownLatch mCountDownLatch = null;
    private static Class<?> mIdSupplier = null;
    private static Class<?> mIdentifyListener = null;
    private static final List<String> mLoadLibrary = new LinkedList<String>() { // from class: com.sensorsdata.analytics.android.sdk.advert.oaid.SAOaidHelper.1
        {
            add("msaoaidsec");
            add("nllvm1632808251147706677");
            add("nllvm1630571663641560568");
            add("nllvm1623827671");
        }
    };
    private static Class<?> mMidSDKHelper = null;
    private static String mOAID = "";
    private static String mOidCertFilePath = null;
    private static String mReflectionOAID = "";

    public static class IdentifyListenerHandler implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (!"OnSupport".equalsIgnoreCase(method.getName())) {
                    return null;
                }
                Method declaredMethod = SAOaidHelper.mIdSupplier.getDeclaredMethod("getOAID", new Class[0]);
                if (objArr.length == 1) {
                    String unused = SAOaidHelper.mOAID = (String) declaredMethod.invoke(objArr[0], new Object[0]);
                } else {
                    String unused2 = SAOaidHelper.mOAID = (String) declaredMethod.invoke(objArr[1], new Object[0]);
                }
                SALog.i(SAOaidHelper.TAG, "oaid:" + SAOaidHelper.mOAID);
                SAOaidHelper.mCountDownLatch.countDown();
                return null;
            } catch (Throwable unused3) {
                SAOaidHelper.mCountDownLatch.countDown();
                return null;
            }
        }
    }

    static {
        initSDKLibrary();
    }

    private static boolean allZero(String str) {
        String strReplace = str.replace("-", "").replace("#", "").replace("_", "");
        for (int i = 0; i < strReplace.length(); i++) {
            if (strReplace.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    private static String getMSAOAID(Context context) {
        try {
            mCountDownLatch = new CountDownLatch(1);
            initInvokeListener();
            if (mMidSDKHelper != null && mIdentifyListener != null && mIdSupplier != null) {
                if (!TextUtils.isEmpty(mOAID)) {
                    return mOAID;
                }
                getOAIDReflect(context, 2);
                try {
                    mCountDownLatch.await();
                } catch (InterruptedException e2) {
                    SALog.printStackTrace(e2);
                }
                SALog.i(TAG, "CountDownLatch await");
                return mOAID;
            }
            SALog.i(TAG, "OAID class create failed");
            return "";
        } catch (Throwable th) {
            SALog.i(TAG, th.getMessage());
            return "";
        }
    }

    private static void getOAIDReflect(Context context, int i) {
        if (i == 0) {
            return;
        }
        try {
            initPemCert(context);
            Class<?> cls = jLibrary;
            if (cls != null) {
                cls.getDeclaredMethod("InitEntry", Context.class).invoke(null, context);
            }
            int iIntValue = ((Integer) mMidSDKHelper.getDeclaredMethod("InitSdk", Context.class, Boolean.TYPE, mIdentifyListener).invoke(null, context, Boolean.TRUE, Proxy.newProxyInstance(context.getClassLoader(), new Class[]{mIdentifyListener}, new IdentifyListenerHandler()))).intValue();
            SALog.i(TAG, "MdidSdkHelper ErrorCode : " + iIntValue);
            if (iIntValue != 1008614 && iIntValue != 1008610) {
                i--;
                getOAIDReflect(context, i);
                if (i == 0) {
                    mCountDownLatch.countDown();
                }
            }
            new Thread(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.oaid.SAOaidHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException unused) {
                    }
                    SAOaidHelper.mCountDownLatch.countDown();
                }
            }).start();
        } catch (Throwable th) {
            SALog.i(TAG, th.getMessage());
            int i2 = i - 1;
            getOAIDReflect(context, i2);
            if (i2 == 0) {
                mCountDownLatch.countDown();
            }
        }
    }

    public static synchronized String getOpenAdIdentifier(Context context) {
        if (!SensorsDataUtils.isOAIDEnabled()) {
            SALog.i(TAG, "Sensors getOAID disabled");
            return "";
        }
        if (SAPropertyManager.getInstance().isLimitKey(LimitKey.OAID)) {
            return SAPropertyManager.getInstance().getLimitValue(LimitKey.OAID);
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            SALog.i(TAG, "function can not be called on main thread");
            return "";
        }
        if (!TextUtils.isEmpty(mOAID)) {
            return mOAID;
        }
        mOAID = getMSAOAID(context);
        SALog.i(TAG, "MSA OAID is " + mOAID);
        if (TextUtils.isEmpty(mOAID) || allZero(mOAID)) {
            String romoaid = getROMOAID(context);
            mReflectionOAID = romoaid;
            if (TextUtils.isEmpty(romoaid) || allZero(mReflectionOAID)) {
                mReflectionOAID = "";
            }
            mOAID = mReflectionOAID;
            SALog.i(TAG, "Rom OAID is" + mOAID);
        }
        return mOAID;
    }

    public static String getOpenAdIdentifierByReflection(Context context) {
        if (!SensorsDataUtils.isOAIDEnabled()) {
            SALog.i(TAG, "Sensors getOAIDReflection disabled");
            return "";
        }
        if (TextUtils.isEmpty(mOAID)) {
            getOpenAdIdentifier(context);
        }
        return mReflectionOAID;
    }

    private static String getROMOAID(Context context) {
        return OAIDFactory.create(context).getRomOAID();
    }

    private static void initInvokeListener() {
        try {
            mMidSDKHelper = Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            try {
                try {
                    try {
                        mIdentifyListener = Class.forName("com.bun.miitmdid.interfaces.IIdentifierListener");
                        mIdSupplier = Class.forName("com.bun.miitmdid.interfaces.IdSupplier");
                    } catch (Exception unused) {
                        mIdentifyListener = Class.forName("com.bun.supplier.IIdentifierListener");
                        mIdSupplier = Class.forName("com.bun.supplier.IdSupplier");
                        jLibrary = Class.forName("com.bun.miitmdid.core.JLibrary");
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                mIdentifyListener = Class.forName("com.bun.miitmdid.core.IIdentifierListener");
                mIdSupplier = Class.forName("com.bun.miitmdid.supplier.IdSupplier");
                jLibrary = Class.forName("com.bun.miitmdid.core.JLibrary");
            }
        } catch (ClassNotFoundException e2) {
            SALog.i(TAG, e2.getMessage());
        }
    }

    private static void initPemCert(Context context) {
        try {
            String strLoadPemFromAssetFile = loadPemFromAssetFile(context);
            if (TextUtils.isEmpty(strLoadPemFromAssetFile)) {
                return;
            }
            mMidSDKHelper.getDeclaredMethod("InitCert", Context.class, String.class).invoke(null, context, strLoadPemFromAssetFile);
        } catch (Throwable th) {
            SALog.i(TAG, th.getMessage());
        }
    }

    private static void initSDKLibrary() {
        Iterator<String> it = mLoadLibrary.iterator();
        while (it.hasNext()) {
            try {
                System.loadLibrary(it.next());
                return;
            } catch (Throwable unused) {
            }
        }
    }

    private static String loadPemFromAssetFile(Context context) {
        InputStream inputStreamOpen;
        try {
            String str = context.getPackageName() + ".cert.pem";
            AssetManager assets = context.getAssets();
            if (TextUtils.isEmpty(mOidCertFilePath)) {
                inputStreamOpen = assets.open(str);
            } else {
                try {
                    inputStreamOpen = assets.open(mOidCertFilePath);
                } catch (IOException unused) {
                    inputStreamOpen = assets.open(str);
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
                sb.append('\n');
            }
        } catch (IOException unused2) {
            SALog.i(TAG, "loadPemFromAssetFile failed");
            return "";
        }
    }

    public static void setOaidCertFilePath(String str) {
        mOidCertFilePath = str;
    }
}
