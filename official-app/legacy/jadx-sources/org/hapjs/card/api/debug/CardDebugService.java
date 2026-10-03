package org.hapjs.card.api.debug;

import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes11.dex */
public interface CardDebugService {
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    int onStartCommand(Intent intent, int i, int i2);

    boolean onUnbind(Intent intent);

    void setCardDebugHost(CardDebugHost cardDebugHost);
}
