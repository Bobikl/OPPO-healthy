package com.oplus.mydevices.sdk.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.heytap.deviceinfo.DeviceAppCallbackInterface;
import com.oplus.mydevices.sdk.Constants;
import com.oplus.mydevices.sdk.DeviceSdk;
import com.oplus.mydevices.sdk.IDeviceCallback;
import com.oplus.mydevices.sdk.IResult;
import com.oplus.mydevices.sdk.utils.LogUtils;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/DeviceCallProcessor;", "Lcom/oplus/mydevices/sdk/internal/IDeviceCallProcessor;", "()V", "process", "Landroid/os/Bundle;", "method", "", "args", "extra", "Companion", "ResultCallback", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class DeviceCallProcessor implements IDeviceCallProcessor {
    private static final String KEY_NAME = "name";
    private static final String METHOD_ALIVE_FLAG = "push_alive_flag";
    private static final String METHOD_CALL = "call";
    private static final String METHOD_CONNECT = "connect";
    private static final String METHOD_DELETE_DEVICE = "delete_device";
    private static final String METHOD_DISCONNECT = "disconnect";
    private static final String METHOD_ON_CARD_HIDE = "card_hide";
    private static final String METHOD_ON_CARD_SHOW = "card_show";
    private static final String METHOD_RENAME = "rename";
    private static final String TAG = "DeviceCallProcessor";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/DeviceCallProcessor$ResultCallback;", "Lcom/oplus/mydevices/sdk/IResult;", "callback", "Lcom/heytap/deviceinfo/DeviceAppCallbackInterface;", "(Lcom/heytap/deviceinfo/DeviceAppCallbackInterface;)V", "getCallback", "()Lcom/heytap/deviceinfo/DeviceAppCallbackInterface;", "result", "", "code", "", "msg", "", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final class ResultCallback implements IResult {

        @NotNull
        private final DeviceAppCallbackInterface callback;

        public ResultCallback(@NotNull DeviceAppCallbackInterface callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
        }

        @NotNull
        public final DeviceAppCallbackInterface getCallback() {
            return this.callback;
        }

        @Override // com.oplus.mydevices.sdk.IResult
        public void result(int code, @NotNull String msg) throws RemoteException {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Bundle bundle = new Bundle();
            bundle.putInt("result_code", code);
            bundle.putString(Constants.KEY_RESPONSE_MSG, msg);
            this.callback.call(Constants.CODE_INNER_NOTIFY_CALLBACK, bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.oplus.mydevices.sdk.internal.IDeviceCallProcessor
    @NotNull
    public Bundle process(@NotNull String method, @NotNull String args, @NotNull Bundle extra) throws Exception {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(extra, "extra");
        LogUtils.INSTANCE.i(TAG, "process : " + method);
        DeviceAppCallbackInterface callback = DeviceAppCallbackInterface.Stub.asInterface(extra.getBinder(Constants.KEY_DEVICE_CALL_BINDER));
        Intrinsics.checkNotNullExpressionValue(callback, "callback");
        ResultCallback resultCallback = new ResultCallback(callback);
        Bundle bundle = new Bundle();
        if (Intrinsics.areEqual(method, METHOD_ALIVE_FLAG)) {
            DeviceSdk.setAliveFlag(Integer.parseInt(args));
        }
        DeviceSdk deviceSdk = DeviceSdk.INSTANCE;
        List<IDeviceCallback> callbacksLock = deviceSdk.getCallbacksLock();
        if (callbacksLock.isEmpty()) {
            bundle.putInt("result_code", Constants.CODE_INNER_NO_CALLBACK);
            return bundle;
        }
        switch (method) {
            case "rename":
                String string = extra.getString("name");
                Iterator<T> it = callbacksLock.iterator();
                while (it.hasNext()) {
                    ((IDeviceCallback) it.next()).setAlias(args, string != null ? string : "", resultCallback);
                }
            case "delete_device":
                Iterator<T> it2 = callbacksLock.iterator();
                while (it2.hasNext()) {
                    ((IDeviceCallback) it2.next()).deleteDevice(args, resultCallback);
                }
            case "card_hide":
                DeviceSdk.setAliveFlag(deviceSdk.getAliveFlag$sdk_domesticRelease() ^ 1);
                Iterator<T> it3 = callbacksLock.iterator();
                while (it3.hasNext()) {
                    ((IDeviceCallback) it3.next()).onCardHide();
                }
            case "card_show":
                DeviceSdk.setAliveFlag(deviceSdk.getAliveFlag$sdk_domesticRelease() | 1);
                Iterator<T> it4 = callbacksLock.iterator();
                while (it4.hasNext()) {
                    ((IDeviceCallback) it4.next()).onCardShow();
                }
            case "call":
                Bundle bundle2 = new Bundle();
                int i = extra.getInt(Constants.KEY_REQUEST_CODE);
                Iterator<T> it5 = callbacksLock.iterator();
                while (it5.hasNext()) {
                    bundle2 = ((IDeviceCallback) it5.next()).call(i, extra);
                }
                return bundle2;
            case "disconnect":
                Iterator<T> it6 = callbacksLock.iterator();
                while (it6.hasNext()) {
                    ((IDeviceCallback) it6.next()).disconnect(args, resultCallback);
                }
            case "connect":
                Iterator<T> it7 = callbacksLock.iterator();
                while (it7.hasNext()) {
                    ((IDeviceCallback) it7.next()).connect(args, resultCallback);
                }
            default:
                if (method.equals(METHOD_RENAME)) {
                    String string2 = extra.getString("name");
                    Iterator<T> it8 = callbacksLock.iterator();
                    while (it8.hasNext()) {
                        ((IDeviceCallback) it8.next()).setAlias(args, string2 != null ? string2 : "", resultCallback);
                    }
                }
                return bundle;
        }
    }
}
