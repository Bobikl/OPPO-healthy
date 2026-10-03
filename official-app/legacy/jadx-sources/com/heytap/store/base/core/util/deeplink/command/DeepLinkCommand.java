package com.heytap.store.base.core.util.deeplink.command;

import android.app.Activity;
import android.os.Handler;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.deeplink.interceptor.IInterceptor;
import com.heytap.store.base.core.util.statistics.bean.StatisticsBean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeepLinkCommand {
    protected final String deepLinkUrl;
    private int deepLinkUrlType;
    private IInterceptor interceptor;

    public DeepLinkCommand(String str) {
        this.deepLinkUrl = str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof DeepLinkCommand)) {
            return this == obj || this.deepLinkUrlType == ((DeepLinkCommand) obj).deepLinkUrlType;
        }
        return false;
    }

    public abstract void execute(Activity activity, DeepLinkInterpreter deepLinkInterpreter, Handler handler, StatisticsBean statisticsBean);

    public String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public int getDeepLinkUrlType() {
        return this.deepLinkUrlType;
    }

    public IInterceptor getInterceptor() {
        return this.interceptor;
    }

    public void setDeepLinkUrlType(int i) {
        this.deepLinkUrlType = i;
    }

    public void setInterceptor(IInterceptor iInterceptor) {
        this.interceptor = iInterceptor;
    }
}
