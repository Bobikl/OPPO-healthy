package com.platform.usercenter.account.router.interfaces;

import android.content.Context;
import com.platform.usercenter.account.router.wrapper.RouterOapsWrapper;

/* JADX INFO: loaded from: classes9.dex */
public interface IRouterService {
    void openInstant(Context context, String str, String str2);

    default void openOaps(Context context, String str) {
        RouterOapsWrapper.openOaps(context, str);
    }

    void openWebView(Context context, String str);
}
