package com.heytap.health.oaf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.health.base.base.BaseService;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.xs6;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes17.dex */
public class OafHostService extends BaseService {
    @SuppressLint({"HealthLint_AndroidServiceDetector"})
    public static void b(Context context) {
        Intent intent = new Intent(context, (Class<?>) OafHostService.class);
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (Exception e2) {
            wil.k("OafHostService", "init: with exception " + e2);
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        OafHost.i().g(printWriter, strArr);
        xs6.INSTANCE.c(printWriter, strArr);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return OafHost.i().j();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        wil.d("OafHostService", "onCreate: ");
        OafHost.i().q();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        wil.d("OafHostService", "onDestroy: ");
    }

    @Override // com.heytap.health.base.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
