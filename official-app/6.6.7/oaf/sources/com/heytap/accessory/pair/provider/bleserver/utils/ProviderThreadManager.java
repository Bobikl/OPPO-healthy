package com.heytap.accessory.pair.provider.bleserver.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.utils.XmlReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ProviderThreadManager {
    private static final String TAG = "ProviderThreadManager";
    public static final String TYPE_DAEMON = "daemon";
    private static ProviderThreadManager sThreadManager;
    private Map<String, HandlerThread> mThreadMap = new HashMap();
    private Map<String, Handler> mHandlerMap = new HashMap();

    private String composePrefixThreadNameForConnection(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (i == 1) {
            sb.append(XmlReader.TRANSPORT_BLE);
        } else if (i == 2) {
            sb.append(XmlReader.TRANSPORT_BT);
        } else if (i != 4) {
            sb.append("UnknownConnectType");
        } else {
            sb.append(XmlReader.TRANSPORT_WIFI);
        }
        sb.append("-");
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }

    public static synchronized ProviderThreadManager getInstance() {
        if (sThreadManager == null) {
            sThreadManager = new ProviderThreadManager();
        }
        return sThreadManager;
    }

    private synchronized HandlerThread getThread(String str) {
        if (!isValidatedName(str)) {
            return null;
        }
        HandlerThread handlerThread = this.mThreadMap.get(str);
        if (handlerThread == null) {
            handlerThread = new HandlerThread(str);
            handlerThread.start();
            this.mThreadMap.put(str, handlerThread);
        }
        return handlerThread;
    }

    private boolean isValidatedName(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        PairLog.e(TAG, "address is invalidate");
        return false;
    }

    public synchronized Handler getHandler(String str) {
        if (!isValidatedName(str)) {
            return null;
        }
        Handler handler = this.mHandlerMap.get(str);
        if (handler == null) {
            Looper looper = getLooper(str);
            if (looper != null) {
                handler = new Handler(looper);
                this.mHandlerMap.put(str, handler);
            } else {
                PairLog.e(TAG, "getHandler loop is null " + str);
            }
        }
        return handler;
    }

    public synchronized Looper getLooper(String str) {
        HandlerThread thread;
        thread = getThread(str);
        return thread != null ? thread.getLooper() : null;
    }

    public synchronized String getThreadNameForConnection(int i, String str, String str2, int i2) {
        int i3;
        String strComposePrefixThreadNameForConnection = composePrefixThreadNameForConnection(i, str, str2);
        if (!isValidatedName(strComposePrefixThreadNameForConnection)) {
            return null;
        }
        int i4 = -1;
        for (String str3 : this.mThreadMap.keySet()) {
            if (str3.contains(strComposePrefixThreadNameForConnection)) {
                String[] strArrSplit = str3.split("-");
                if (strArrSplit.length == 5 && (i3 = Integer.parseInt(strArrSplit[3])) > i4) {
                    i4 = i3;
                }
            }
        }
        String str4 = strComposePrefixThreadNameForConnection + "-" + (i4 + 1) + "-" + i2;
        PairLog.d(TAG, "getThreadNameForConnection: " + str4);
        return str4;
    }

    public synchronized boolean post(String str, Runnable runnable, long j) {
        boolean zPostDelayed = false;
        if (isValidatedName(str) && runnable != null) {
            Handler handler = getHandler(str);
            if (handler != null) {
                zPostDelayed = j > 0 ? handler.postDelayed(runnable, j) : handler.post(runnable);
            }
            return zPostDelayed;
        }
        return false;
    }

    public synchronized boolean quitThread(String str) {
        boolean zQuitSafely = false;
        if (!isValidatedName(str)) {
            return false;
        }
        HandlerThread thread = getThread(str);
        if (thread != null) {
            zQuitSafely = thread.quitSafely();
            this.mThreadMap.remove(str);
            this.mHandlerMap.remove(str);
        }
        return zQuitSafely;
    }
}
