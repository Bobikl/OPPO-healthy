package com.lifesense.android.bluetooth.core.business;

import com.lifesense.android.bluetooth.core.protocol.worker.BaseDeviceWorker;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static final c b = new c();
    public Map<String, BaseDeviceWorker> a = new ConcurrentSkipListMap();

    public static c a() {
        return b;
    }

    public void b(String str) {
        this.a.remove(str);
    }

    public BaseDeviceWorker a(String str) {
        return this.a.get(str);
    }

    public void a(String str, BaseDeviceWorker baseDeviceWorker) {
        this.a.put(str, baseDeviceWorker);
    }
}
