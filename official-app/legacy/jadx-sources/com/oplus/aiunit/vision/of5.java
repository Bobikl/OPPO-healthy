package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.deepthinker.sdk.app.ServiceHolder;

/* JADX INFO: loaded from: classes5.dex */
public class of5 implements kp9 {
    public static final String ARG_EVENT_ID = "event_id";
    public static final String ARG_EXTRA = "extra";
    public static final String ARG_ID = "id";
    public static final String ARG_PKG = "pkg";
    public static final int EVENTFOUNTAIN_RANGE_END = 199999;
    public static final int EVENTFOUNTAIN_RANGE_START = 100000;
    public static final String TARGET_EVENTFOUNTAIN = "eventfountain_call_handle";
    public static final String TRIGGER_EVENT = "trigger_event";
    public final Context a;
    public ServiceHolder b;

    public of5(Context context, ServiceHolder serviceHolder) {
        this.a = context;
        this.b = serviceHolder;
    }
}
