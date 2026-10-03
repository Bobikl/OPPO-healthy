package com.opos.process.bridge.server;

import android.app.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
class ProcessBridgeServiceManager {
    private static final ProcessBridgeServiceManager ourInstance = new ProcessBridgeServiceManager();
    private List<Service> cachedServices = Collections.synchronizedList(new ArrayList());

    private ProcessBridgeServiceManager() {
    }

    public static ProcessBridgeServiceManager getInstance() {
        return ourInstance;
    }

    public boolean add(Service service) {
        return this.cachedServices.add(service);
    }

    public boolean remove(Service service) {
        return this.cachedServices.remove(service);
    }

    public void stopAllService() {
        Iterator<Service> it = this.cachedServices.iterator();
        while (it.hasNext()) {
            it.next().stopSelf();
        }
    }
}
