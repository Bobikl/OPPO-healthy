package com.sensorsdata.analytics.android.sdk.core.mediator;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SAModuleManager {
    private static final String TAG = "SA.ModuleManager";
    private static volatile SAModuleManager mSingleton;
    private final Map<String, SAModuleProtocol> mServiceMap = new HashMap();

    private SAModuleManager() {
    }

    public static SAModuleManager getInstance() {
        if (mSingleton == null) {
            synchronized (SAModuleManager.class) {
                if (mSingleton == null) {
                    mSingleton = new SAModuleManager();
                }
            }
        }
        return mSingleton;
    }

    private SAModuleProtocol getService(String str) {
        try {
            if (getInstance().hasModuleByName(str)) {
                return this.mServiceMap.get(str);
            }
            return null;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    private List<SAModuleProtocol> loadModule(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                arrayList.add((SAModuleProtocol) Class.forName(str).newInstance());
                SALog.i(TAG, "loadModule name: " + str);
            } catch (Throwable th) {
                SALog.i(TAG, "loadModule name: " + str + " error \n" + th);
            }
        }
        return arrayList;
    }

    public boolean hasModuleByName(String str) {
        SAModuleProtocol sAModuleProtocol;
        if (TextUtils.isEmpty(str) || !this.mServiceMap.containsKey(str) || (sAModuleProtocol = this.mServiceMap.get(str)) == null) {
            return false;
        }
        return sAModuleProtocol.isEnable();
    }

    public void installService(SAContextManager sAContextManager) {
        try {
            List<SAModuleProtocol> listLoadModule = loadModule(new ArrayList<String>() { // from class: com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager.1
                {
                    add("com.sensorsdata.analytics.android.autotrack.core.SensorsAutoTrackAPI");
                    add("com.sensorsdata.analytics.android.webview.impl.SensorsWebViewAPI");
                    add("com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptProtocolImpl");
                    add("com.sensorsdata.analytics.android.sdk.push.core.PushProtocolImp");
                    add("com.sensorsdata.analytics.android.sdk.visual.impl.SAVisualProtocolAPI");
                    add("com.sensorsdata.analytics.android.sdk.exposure.SAExposureProtocolImpl");
                    add("com.sensorsdata.analytics.android.sdk.advert.impl.SensorsAdvertProtocolAPI");
                }
            });
            Collections.sort(listLoadModule, new Comparator<SAModuleProtocol>() { // from class: com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager.2
                @Override // java.util.Comparator
                public int compare(SAModuleProtocol sAModuleProtocol, SAModuleProtocol sAModuleProtocol2) {
                    return sAModuleProtocol2.getPriority() - sAModuleProtocol.getPriority();
                }
            });
            for (SAModuleProtocol sAModuleProtocol : listLoadModule) {
                try {
                    sAModuleProtocol.install(sAContextManager);
                    this.mServiceMap.put(sAModuleProtocol.getModuleName(), sAModuleProtocol);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }

    public <T> T invokeModuleFunction(String str, String str2, Object... objArr) {
        try {
            SAModuleProtocol service = getService(str);
            if (service != null) {
                return (T) service.invokeModuleFunction(str2, objArr);
            }
            return null;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public void setModuleState(boolean z) {
        Iterator<SAModuleProtocol> it = this.mServiceMap.values().iterator();
        while (it.hasNext()) {
            it.next().setModuleState(z);
        }
    }

    public void setModuleStateByName(String str, boolean z) {
        SAModuleProtocol sAModuleProtocol;
        if (!this.mServiceMap.containsKey(str) || (sAModuleProtocol = this.mServiceMap.get(str)) == null || z == sAModuleProtocol.isEnable()) {
            return;
        }
        sAModuleProtocol.setModuleState(z);
    }
}
