package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.db.LinkServiceDB;
import com.oplus.wearable.linkservice.db.device.AESHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class lxa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile lxa f13866c;
    public LinkServiceDB a;
    public final Object b = new Object();

    public static lxa c() {
        if (f13866c == null) {
            synchronized (lxa.class) {
                if (f13866c == null) {
                    f13866c = new lxa();
                }
            }
        }
        return f13866c;
    }

    public void a() {
        List<ui5> listB;
        synchronized (this.b) {
            listB = this.a.d().b();
        }
        if (listB.isEmpty()) {
            return;
        }
        Iterator<ui5> it = listB.iterator();
        while (it.hasNext()) {
            try {
                ui5 ui5VarB = yi5.b(it.next());
                String strE = ui5VarB.e();
                e(ui5VarB);
                synchronized (this.b) {
                    this.a.d().delete(strE);
                }
            } catch (IllegalAccessException unused) {
                a7b.b("LinkDBManager", "convertNotEncodeDb: getDecryptAbandoned failed");
            }
        }
        listB.clear();
    }

    public int b(@NonNull String str) {
        int iDelete;
        String strC = AESHelper.c(str);
        synchronized (this.b) {
            iDelete = this.a.d().delete(strC);
        }
        return iDelete;
    }

    public void d(Context context) {
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        synchronized (this.b) {
            this.a = LinkServiceDB.c(contextCreateDeviceProtectedStorageContext);
        }
    }

    public long e(@NonNull ui5 ui5Var) {
        long jC;
        ui5 ui5VarC = yi5.c(ui5Var);
        synchronized (this.b) {
            jC = this.a.d().c(ui5VarC);
        }
        return jC;
    }

    public List<ui5> f() {
        List<ui5> listB;
        synchronized (this.b) {
            listB = this.a.d().b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ui5> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(yi5.a(it.next()));
        }
        listB.clear();
        return arrayList;
    }

    public ui5 g(@NonNull String str) {
        ui5 ui5VarD;
        String strC = AESHelper.c(str);
        synchronized (this.b) {
            ui5VarD = this.a.d().d(strC);
        }
        return yi5.a(ui5VarD);
    }
}
