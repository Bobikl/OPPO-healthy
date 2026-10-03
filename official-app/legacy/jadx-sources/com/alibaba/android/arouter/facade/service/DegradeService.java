package com.alibaba.android.arouter.facade.service;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes12.dex */
public interface DegradeService extends IProvider {
    void onLost(Context context, Postcard postcard);
}
