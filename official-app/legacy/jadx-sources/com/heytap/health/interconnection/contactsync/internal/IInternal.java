package com.heytap.health.interconnection.contactsync.internal;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes16.dex */
public interface IInternal extends IProvider {
    public static final String ROUTER_PATH = "/contactsync_impl/Internal";

    void M9(boolean z);

    void P3(Context context);

    void V2(Context context);

    boolean m9();
}
