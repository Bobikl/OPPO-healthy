package com.lifesense.device.scale.infrastructure.repository;

import android.content.Context;
import com.lifesense.device.scale.context.LDAppHolder;
import com.lifesense.device.scale.data.entity.DaoMaster;
import com.lifesense.device.scale.data.entity.DaoSession;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static volatile DaoSession a;

    /* JADX INFO: renamed from: com.lifesense.device.scale.infrastructure.repository.a$a, reason: collision with other inner class name */
    public static class C0842a extends DaoMaster.b {
        public C0842a(Context context, String str) {
            super(context, str);
        }
    }

    public static synchronized DaoSession a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    C0842a c0842a = new C0842a(LDAppHolder.getContext(), "DeviceManger.db");
                    c0842a.setWriteAheadLoggingEnabled(true);
                    a = new DaoMaster(c0842a.getWritableDb()).newSession();
                }
            }
        }
        return a;
    }
}
