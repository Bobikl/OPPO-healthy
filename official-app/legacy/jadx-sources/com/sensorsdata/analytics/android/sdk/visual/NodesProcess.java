package com.sensorsdata.analytics.android.sdk.visual;

/* JADX INFO: loaded from: classes10.dex */
public class NodesProcess {
    private static volatile NodesProcess mSingleton;
    private volatile FlutterNodesManager mFlutterNodesManager;
    private volatile WebNodesManager mWebNodesManager;

    public static NodesProcess getInstance() {
        if (mSingleton == null) {
            synchronized (NodesProcess.class) {
                if (mSingleton == null) {
                    mSingleton = new NodesProcess();
                }
            }
        }
        return mSingleton;
    }

    public FlutterNodesManager getFlutterNodesManager() {
        if (this.mFlutterNodesManager == null) {
            synchronized (FlutterNodesManager.class) {
                if (this.mFlutterNodesManager == null) {
                    this.mFlutterNodesManager = new FlutterNodesManager();
                }
            }
        }
        return this.mFlutterNodesManager;
    }

    public WebNodesManager getWebNodesManager() {
        if (this.mWebNodesManager == null) {
            synchronized (WebNodesManager.class) {
                if (this.mWebNodesManager == null) {
                    this.mWebNodesManager = new WebNodesManager();
                }
            }
        }
        return this.mWebNodesManager;
    }
}
