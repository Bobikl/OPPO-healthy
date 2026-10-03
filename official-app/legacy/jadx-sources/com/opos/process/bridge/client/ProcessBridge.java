package com.opos.process.bridge.client;

import com.opos.process.bridge.dispatch.Dispatcher;

/* JADX INFO: loaded from: classes9.dex */
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
