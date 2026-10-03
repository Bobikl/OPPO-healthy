package com.heytap.store.base.core.util.deeplink.command;

import android.app.Activity;
import android.os.Handler;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.statistics.bean.StatisticsBean;

/* JADX INFO: loaded from: classes3.dex */
public interface IDeepLinkCommandReceiver {
    void addCommand(DeepLinkCommand deepLinkCommand);

    DeepLinkCommand lookupCommandByAddress(String str);

    DeepLinkCommand lookupCommandByType(int i);

    void runCommand(Activity activity, DeepLinkInterpreter deepLinkInterpreter, Handler handler, StatisticsBean statisticsBean);
}
