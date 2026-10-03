package com.heytap.health.device_pair;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes16.dex */
public interface PairStateControl extends IProvider {
    public static final String PAIR_STATE_CONTROL = "/device_pair/PairStateControl";

    void w4(Context context, Bundle bundle);
}
