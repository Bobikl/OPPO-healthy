package com.oplus.mydevices.sdk;

import android.content.Context;
import com.heytap.deviceinfo.MyDevicesInterface;
import com.oplus.mydevices.sdk.internal.DeviceSdkImpl;
import com.oplus.mydevices.sdk.internal.DeviceServiceConnection;
import com.oplus.mydevices.sdk.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0000H\u0002J\r\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001cJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0007J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u000bH\u0007J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0006H\u0007J \u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0007J \u0010(\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020'H\u0007J\b\u0010*\u001a\u00020'H\u0007J\r\u0010+\u001a\u00020'H\u0000¢\u0006\u0002\b,J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000fH\u0007J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0004H\u0007J\u0010\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/oplus/mydevices/sdk/DeviceSdk;", "", "()V", "RETRY_FOR_CALLBACK_LIMIT_TIMES", "", "TAG", "", "TIME_OUT_WAIT_CALLBACK", "", "mAliveFlag", "mApplicationContext", "Landroid/content/Context;", "mAuthority", "mCallbacks", "", "Lcom/oplus/mydevices/sdk/IDeviceCallback;", "getMCallbacks$sdk_domesticRelease", "()Ljava/util/List;", "mConnection", "Lcom/oplus/mydevices/sdk/internal/DeviceServiceConnection;", "mLock", "Ljava/lang/Object;", "mRetryTimes", "Ljava/util/concurrent/atomic/AtomicInteger;", "bind", "", "bindService", "getAliveFlag", "getAliveFlag$sdk_domesticRelease", "getApplicationContext", "getCallbacksLock", "", "getInterfaces", "Lcom/heytap/deviceinfo/MyDevicesInterface;", "getInterfaces$sdk_domesticRelease", "init", "context", "authority", "bindNow", "", "initWrapper", "isMyDevicesSupportAudioLinkage", "isMyDevicesSupportNotKeepAlive", "isServiceConnected", "isServiceConnected$sdk_domesticRelease", "registerCallback", "callback", "setAliveFlag", "flag", "unregisterCallback", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class DeviceSdk {
    private static final int RETRY_FOR_CALLBACK_LIMIT_TIMES = 5;
    private static final String TAG = "DeviceSdk";
    private static final long TIME_OUT_WAIT_CALLBACK = 1000;
    private static int mAliveFlag;

    @JvmField
    @Nullable
    public static Context mApplicationContext;
    private static String mAuthority;
    private static DeviceServiceConnection mConnection;
    public static final DeviceSdk INSTANCE = new DeviceSdk();

    @NotNull
    private static final List<IDeviceCallback> mCallbacks = new ArrayList();
    private static final Object mLock = new Object();
    private static final AtomicInteger mRetryTimes = new AtomicInteger(0);

    private DeviceSdk() {
    }

    @JvmStatic
    public static final void bind() {
        INSTANCE.bindService();
    }

    private final DeviceSdk bindService() {
        LogUtils.INSTANCE.d(TAG, "bind service");
        if (mConnection == null) {
            mConnection = new DeviceServiceConnection();
        }
        DeviceServiceConnection deviceServiceConnection = mConnection;
        if (deviceServiceConnection != null) {
            deviceServiceConnection.bindService();
        }
        return this;
    }

    @JvmStatic
    @Nullable
    public static final Context getApplicationContext() {
        return mApplicationContext;
    }

    @JvmStatic
    public static final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mApplicationContext = context.getApplicationContext();
        try {
            LogUtils.INSTANCE.i(TAG, "init device sdk, version: 14.0.0-beta9f39ddc");
        } catch (Throwable unused) {
            LogUtils.INSTANCE.e(TAG, "initial error!");
        }
    }

    private final DeviceSdk initWrapper(Context context, String authority, boolean bindNow) {
        DeviceSdk deviceSdk;
        synchronized (mLock) {
            mApplicationContext = context.getApplicationContext();
            mAuthority = authority;
            if (bindNow) {
                INSTANCE.bindService();
            }
            deviceSdk = INSTANCE;
        }
        return deviceSdk;
    }

    @JvmStatic
    public static final boolean isMyDevicesSupportAudioLinkage() {
        return new DeviceSdkImpl().isSupportLinkage();
    }

    @JvmStatic
    public static final boolean isMyDevicesSupportNotKeepAlive() {
        return new DeviceSdkImpl().isSupportNotKeepAlive();
    }

    @JvmStatic
    @NotNull
    public static final DeviceSdk registerCallback(@NotNull IDeviceCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<IDeviceCallback> list = mCallbacks;
        synchronized (list) {
            list.add(callback);
            if (list == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            list.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        LogUtils.INSTANCE.d(TAG, "register callback");
        return INSTANCE;
    }

    @JvmStatic
    public static final void setAliveFlag(int flag) {
        DeviceServiceConnection deviceServiceConnection;
        mAliveFlag = flag;
        LogUtils.INSTANCE.i(TAG, "current flag: " + flag);
        if (flag != 0 || (deviceServiceConnection = mConnection) == null) {
            return;
        }
        deviceServiceConnection.unbindIfNeed();
    }

    @JvmStatic
    @NotNull
    public static final DeviceSdk unregisterCallback(@NotNull IDeviceCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<IDeviceCallback> list = mCallbacks;
        synchronized (list) {
            list.remove(callback);
        }
        LogUtils.INSTANCE.d(TAG, "unregister callback");
        return INSTANCE;
    }

    public final int getAliveFlag$sdk_domesticRelease() {
        return mAliveFlag;
    }

    @NotNull
    public final List<IDeviceCallback> getCallbacksLock() {
        List<IDeviceCallback> list = mCallbacks;
        if (list.isEmpty()) {
            AtomicInteger atomicInteger = mRetryTimes;
            if (atomicInteger.get() == 5) {
                LogUtils.INSTANCE.i(TAG, "has retry for limit times.");
                return list;
            }
            synchronized (list) {
                try {
                    LogUtils.INSTANCE.i(TAG, "wait for device app callback.");
                    atomicInteger.incrementAndGet();
                    if (list == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    list.wait(1000L);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    LogUtils.INSTANCE.e(TAG, "wait callback error!", e2);
                }
            }
        }
        return mCallbacks;
    }

    @Nullable
    public final MyDevicesInterface getInterfaces$sdk_domesticRelease() {
        if (mConnection == null) {
            synchronized (mLock) {
                if (mConnection == null) {
                    mConnection = new DeviceServiceConnection();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        DeviceServiceConnection deviceServiceConnection = mConnection;
        if (deviceServiceConnection != null) {
            return deviceServiceConnection.getInterfaceLock();
        }
        return null;
    }

    @NotNull
    public final List<IDeviceCallback> getMCallbacks$sdk_domesticRelease() {
        return mCallbacks;
    }

    public final boolean isServiceConnected$sdk_domesticRelease() {
        DeviceServiceConnection deviceServiceConnection = mConnection;
        return deviceServiceConnection != null && deviceServiceConnection.isConnected();
    }

    @Deprecated(message = "deprecated at os 12")
    @JvmStatic
    @NotNull
    public static final DeviceSdk init(@NotNull Context context, @NotNull String authority, boolean bindNow) {
        DeviceSdk deviceSdkInitWrapper;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        synchronized (mLock) {
            deviceSdkInitWrapper = INSTANCE.initWrapper(context, authority, bindNow);
        }
        return deviceSdkInitWrapper;
    }

    @JvmStatic
    @NotNull
    public static final DeviceSdk init(@NotNull Context context, @NotNull String authority) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        init(context, authority, false);
        return INSTANCE;
    }
}
