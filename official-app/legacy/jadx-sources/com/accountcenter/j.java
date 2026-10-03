package com.accountcenter;

import com.platform.usercenter.basic.core.mvvm.AppExecutors;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    public static class a {
        public static final j a = new j();
    }

    public j() {
        AppExecutors.getInstance().mainThread();
        AppExecutors.getInstance().networkIO();
    }
}
