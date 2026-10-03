package com.platform.usercenter;

import android.content.Context;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;

/* JADX INFO: loaded from: classes9.dex */
public class BaseApp {
    public static Context mContext;

    public static void init(Context context) {
        if (context == null) {
            UCLogUtil.e("init context is null");
        } else {
            mContext = context;
            UCRuntimeEnvironment.init(context);
        }
    }
}
