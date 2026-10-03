package com.platform.usercenter.account;

import com.platform.usercenter.account.router.interfaces.IRouterService;

/* JADX INFO: loaded from: classes9.dex */
public class UcRouterAgent {
    private static volatile UcRouterAgent INSTANCE;
    private IRouterService mRouterService;

    public static UcRouterAgent getInstance() {
        if (INSTANCE == null) {
            synchronized (UcRouterAgent.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UcRouterAgent();
                }
            }
        }
        return INSTANCE;
    }

    public IRouterService getRouterService() {
        return this.mRouterService;
    }

    public void setRouterService(IRouterService iRouterService) {
        this.mRouterService = iRouterService;
    }
}
