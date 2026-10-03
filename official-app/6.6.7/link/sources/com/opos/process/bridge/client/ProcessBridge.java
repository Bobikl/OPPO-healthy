package com.opos.process.bridge.client;

import com.opos.process.bridge.dispatch.Dispatcher;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ProcessBridge {
    private static final ProcessBridge ourInstance = new ProcessBridge();

    private ProcessBridge() {
    }

    public static ProcessBridge getInstance() {
        return ourInstance;
    }

    public void init() {
        Dispatcher.getInstance().init();
    }
}
