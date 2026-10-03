package com.oplus.phonenoareainquire;

import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.oplus.aiunit.vision.cvk;
import com.oplus.aiunit.vision.g3e;
import com.oplus.aiunit.vision.gqe;
import com.oplus.aiunit.vision.mb4;
import com.oplus.aiunit.vision.pnk;
import com.oplus.aiunit.vision.xje;
import com.oplus.phonenoareainquire.service.OplusLocaleChangeJobIntentService;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class UpdateDatabaseReceiver extends BroadcastReceiver {
    public static ThreadPoolExecutor c;
    public static LinkedBlockingQueue<Runnable> d;
    public static final boolean b = c.DEBUG;
    public static final String a = cvk.a();

    public class a implements Runnable {
        public final /* synthetic */ ArrayList i;
        public final /* synthetic */ pnk j;
        public final /* synthetic */ Context k;
        public final /* synthetic */ ContentProviderClient l;

        public a(ArrayList arrayList, pnk pnkVar, Context context, ContentProviderClient contentProviderClient) {
            this.i = arrayList;
            this.j = pnkVar;
            this.k = context;
            this.l = contentProviderClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : this.i) {
                if (str.startsWith("PhoneNumberData_3_1_0")) {
                    UpdateDatabaseReceiver.d(this.j);
                } else {
                    if (str.equals("carrier_data")) {
                        this.j.k(UpdateDatabaseReceiver.a, PhoneNoInquireProvider.getDataFilePath(), str);
                    } else {
                        this.j.m(UpdateDatabaseReceiver.a, PhoneNoInquireProvider.getDataFilePath(), str);
                    }
                    if (str.equals("city_name_table.txt")) {
                        this.k.getContentResolver().call(PhoneNoInquireProvider.CONTENT_URI, xje.METHOD_REFRESH_PROVINCE_AND_CITY_TABLE, (String) null, (Bundle) null);
                    }
                    if (str.equals("Multi_Language_Table.txt")) {
                        try {
                            OplusLocaleChangeJobIntentService.c(c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile), this.k, null);
                        } catch (Exception e) {
                            try {
                                OplusLocaleChangeJobIntentService.c(null, this.k, null);
                            } catch (Exception unused) {
                                g3e.b("UpdateDatabaseReceiver", "e = " + e);
                            }
                            g3e.b("UpdateDatabaseReceiver", "" + e);
                        }
                    }
                }
                ContentProvider localContentProvider = this.l.getLocalContentProvider();
                if (localContentProvider instanceof PhoneNoInquireProvider) {
                    PhoneNoInquireProvider phoneNoInquireProvider = (PhoneNoInquireProvider) localContentProvider;
                    b.a();
                    phoneNoInquireProvider.readPhoneNumberDataToCache(new DataInputStream(c.b("PhoneNumberData_3_1_0.dat", PhoneNoInquireProvider.sResourceFile)));
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    phoneNoInquireProvider.setInitializationLatch(countDownLatch);
                    mb4 mb4Var = mb4.INSTANCE;
                    mb4.i(this.k, phoneNoInquireProvider.VERSION_CN, countDownLatch);
                    gqe.b();
                    try {
                        gqe.h();
                    } catch (Throwable th) {
                        g3e.b("UpdateDatabaseReceiver", "Exception when init loadLocationInfoCache in sExecutor's task" + th);
                    }
                }
            }
            this.l.close();
        }
    }

    public static void c(Context context) {
        ArrayList<String> arrayListE = pnk.e(a);
        if (arrayListE == null || arrayListE.isEmpty()) {
            return;
        }
        ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(PhoneNoInquireProvider.AUTHORITY);
        c.execute(new a(arrayListE, new pnk(context), context, contentProviderClientAcquireContentProviderClient));
    }

    public static void d(pnk pnkVar) {
        if (pnkVar.l(pnkVar.f(), a + "PhoneNumberData_3_1_0.dat") == 27) {
            int iJ = pnkVar.j();
            if (b) {
                g3e.a("UpdateDatabaseReceiver", "revertDbFile result = " + iJ);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null || context == null) {
            return;
        }
        if (c == null) {
            d = new LinkedBlockingQueue<>();
            c = new ThreadPoolExecutor(1, 1, 100L, TimeUnit.SECONDS, d);
        }
        String action = intent.getAction();
        g3e.a("UpdateDatabaseReceiver", "received update broadcast action = " + action);
        if (cvk.b(action)) {
            c(context);
        }
    }
}
