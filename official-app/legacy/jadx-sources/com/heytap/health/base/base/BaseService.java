package com.heytap.health.base.base;

import android.app.Service;
import android.content.Intent;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseService extends Service {
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
