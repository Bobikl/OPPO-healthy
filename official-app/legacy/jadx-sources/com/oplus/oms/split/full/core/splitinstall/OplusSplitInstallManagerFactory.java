package com.oplus.oms.split.full.core.splitinstall;

import android.content.Context;
import com.oplus.aiunit.vision.xbm;

/* JADX INFO: loaded from: classes8.dex */
public class OplusSplitInstallManagerFactory {
    public static <S extends OplusSplitInstallSessionState> OplusSplitInstallManager<S> create(Context context, OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory) {
        return new xbm(context.getApplicationContext(), oplusSplitInstallSessionStateFactory);
    }
}
