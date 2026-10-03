package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.db.LinkServiceDB;
import com.oplus.wearable.linkservice.db.device.AESHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wya {
    public static volatile wya c;
    public LinkServiceDB a;
    public final Object b = new Object();

    public static wya c() {
        if (c == null) {
            synchronized (wya.class) {
                if (c == null) {
                    c = new wya();
                }
            }
        }
        return c;
    }

    public void a() {
        List<qj5> listB;
        synchronized (this.b) {
            listB = this.a.d().b();
        }
        if (listB.isEmpty()) {
            return;
        }
        Iterator<qj5> it = listB.iterator();
        while (it.hasNext()) {
            try {
                qj5 qj5VarB = uj5.b(it.next());
                String strE = qj5VarB.e();
                e(qj5VarB);
                synchronized (this.b) {
                    this.a.d().delete(strE);
                }
            } catch (IllegalAccessException unused) {
                m8b.b("LinkDBManager", "convertNotEncodeDb: getDecryptAbandoned failed");
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

    public long e(@NonNull qj5 qj5Var) {
        long jC;
        qj5 qj5VarC = uj5.c(qj5Var);
        synchronized (this.b) {
            jC = this.a.d().c(qj5VarC);
        }
        return jC;
    }

    public List<qj5> f() {
        List<qj5> listB;
        synchronized (this.b) {
            listB = this.a.d().b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<qj5> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(uj5.a(it.next()));
        }
        listB.clear();
        return arrayList;
    }

    public qj5 g(@NonNull String str) {
        qj5 qj5VarD;
        String strC = AESHelper.c(str);
        synchronized (this.b) {
            qj5VarD = this.a.d().d(strC);
        }
        return uj5.a(qj5VarD);
    }
}
