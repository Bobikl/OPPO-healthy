package com.heytap.health.watch.notification;

import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes19.dex */
public interface INotificationApiService extends IProvider {
    public static final String HAS_SEND_INTERCEPT = "has_send_intercept";
    public static final String KILL_KEY = "has_killed_once";
    public static final String SP_NAME = "ntf_service";
    public static final String STOP_SELF = "can_kill_self";

    void J8();

    void M4();

    void Z7();

    void g2();

    void la(boolean z);

    void r6(boolean z);
}
