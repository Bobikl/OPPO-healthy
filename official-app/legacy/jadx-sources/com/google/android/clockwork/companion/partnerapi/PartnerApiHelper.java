package com.google.android.clockwork.companion.partnerapi;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PartnerApiHelper {
    private static final int REMOTE_EXCEPTION_CODE = -1;
    private static final String TAG = "PartnerApiHelper";

    @WorkerThread
    public static void batchSetAppNotificationConfigs(@NonNull Context context, @NonNull List<AppNotificationConfig> list, @NonNull BatchSetAppNotificationConfigsCallback batchSetAppNotificationConfigsCallback) {
        MLog.d(TAG, "[getAppNotificationConfigs]");
        checkNotUIThread();
        PartnerApi partnerApi = PartnerApiHolder.getInstance().getPartnerApi(context);
        if (partnerApi != null) {
            try {
                partnerApi.batchSetAppNotificationConfigs(list, batchSetAppNotificationConfigsCallback);
            } catch (RemoteException e2) {
                MLog.e(TAG, "[removeDeviceByNodeId] RemoteException:" + e2.getMessage());
            }
        }
    }

    private static void checkNotUIThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("not allow run in UI thread");
        }
    }

    @WorkerThread
    public static List<AppNotificationConfig> getAppNotificationConfigs(@NonNull Context context) {
        MLog.d(TAG, "[getAppNotificationConfigs]");
        checkNotUIThread();
        PartnerApi partnerApi = PartnerApiHolder.getInstance().getPartnerApi(context);
        if (partnerApi != null) {
            try {
                return partnerApi.getAppNotificationConfigs();
            } catch (RemoteException e2) {
                MLog.e(TAG, "[removeDeviceByNodeId] RemoteException:" + e2.getMessage());
            }
        }
        return new ArrayList();
    }

    @WorkerThread
    public static boolean reconnectByNodeId(@NonNull Context context, String str) {
        MLog.d(TAG, "[reconnectByNodeId]");
        checkNotUIThread();
        PartnerApi partnerApi = PartnerApiHolder.getInstance().getPartnerApi(context);
        if (partnerApi == null) {
            return false;
        }
        try {
            return partnerApi.reconnectByNodeId(str);
        } catch (RemoteException e2) {
            MLog.e(TAG, "[reconnectByNodeId] RemoteException:" + e2.getMessage());
            return false;
        }
    }

    @WorkerThread
    public static boolean removeDeviceByNodeId(@NonNull Context context, String str, @NonNull DeviceRemovalCallback deviceRemovalCallback) {
        MLog.d(TAG, "[removeDeviceByNodeId]");
        checkNotUIThread();
        PartnerApi partnerApi = PartnerApiHolder.getInstance().getPartnerApi(context);
        if (partnerApi == null) {
            return false;
        }
        try {
            return partnerApi.removeDeviceByNodeId(str, deviceRemovalCallback);
        } catch (RemoteException e2) {
            MLog.e(TAG, "[removeDeviceByNodeId] RemoteException:" + e2.getMessage());
            return false;
        }
    }

    @WorkerThread
    public static int setAppNotificationConfig(@NonNull Context context, @NonNull AppNotificationConfig appNotificationConfig) {
        MLog.d(TAG, "[setAppNotificationConfig]");
        checkNotUIThread();
        PartnerApi partnerApi = PartnerApiHolder.getInstance().getPartnerApi(context);
        if (partnerApi == null) {
            return -1;
        }
        try {
            return partnerApi.setAppNotificationConfig(appNotificationConfig);
        } catch (RemoteException e2) {
            MLog.e(TAG, "[removeDeviceByNodeId] RemoteException:" + e2.getMessage());
            return -1;
        }
    }

    public void addPartApiDeadListener(PartApiDeadListener partApiDeadListener) {
        PartnerApiHolder.getInstance().addPartApiDeadListener(partApiDeadListener);
    }

    public void removePartApiDeadListener(PartApiDeadListener partApiDeadListener) {
        PartnerApiHolder.getInstance().removePartApiDeadListener(partApiDeadListener);
    }
}
