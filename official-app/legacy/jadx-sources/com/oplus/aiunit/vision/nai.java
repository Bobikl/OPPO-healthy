package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.option.DataDeleteOption;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengine.option.DataSyncOption;
import com.heytap.databaseengineservice.db.AppDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class nai<U, V extends SportHealthData> implements ty9<V>, vy9 {
    public Context a;
    public sn3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppDatabase f14421c;

    public nai() {
        Context contextB = qa2.common.b();
        this.a = contextB;
        this.f14421c = AppDatabase.K(contextB);
    }

    public static /* synthetic */ void k(d8j d8jVar, DataReadOption dataReadOption, Boolean bool) throws Throwable {
        d8jVar.a(dataReadOption.getStartTime(), dataReadOption.getEndTime());
    }

    public int a(List<DataSet> list) {
        return jp6.ERR_FUN_NOT_IMPL;
    }

    @Override // com.oplus.aiunit.vision.ty9
    public int b(DataDeleteOption dataDeleteOption) {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.ty9
    public int c(List<V> list) {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.vy9
    public List<DataSet> d(DataReadOption dataReadOption) {
        pv4.INSTANCE.a(dataReadOption, this.f14421c);
        m(dataReadOption);
        List<U> listL = l(dataReadOption);
        if (hz.b(listL)) {
            listL = new ArrayList<>();
        }
        cj4.a("SportDataStore", listL.toString());
        return f(listL, dataReadOption);
    }

    public List<DataSet> f(List<U> list, DataReadOption dataReadOption) {
        return new ArrayList();
    }

    public abstract List<V> g(List<U> list, DataReadOption dataReadOption);

    public List<V> h(List<DataSet> list) {
        return new ArrayList();
    }

    public void i(int i, List<?> list, IDataReadResultListener iDataReadResultListener, DataReadOption dataReadOption) throws RemoteException {
        at4.p(dataReadOption.getIsParse() == 1);
        if (i == 1003 || i == 1021 || i == 1030 || i == 1041 || i == 1051 || i == 1027 || i == 1028) {
            at4.d(i, list, iDataReadResultListener);
        } else {
            at4.k(i, list, iDataReadResultListener);
        }
    }

    public long j(long j2, int i, long j3) {
        long j4;
        if (i == 3) {
            j4 = 3600000;
        } else if (i == 4) {
            j4 = 86400000;
        } else if (i == 5) {
            j4 = 604800000;
        } else if (i == 6) {
            j4 = 2592000000L;
        } else if (i == 7) {
            j4 = 31536000000L;
        } else {
            if (i != 11) {
                return j3;
            }
            j4 = ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL;
        }
        return (j2 + j4) - 1;
    }

    public abstract List<U> l(DataReadOption dataReadOption);

    public final void m(final DataReadOption dataReadOption) {
        if (n(dataReadOption.getSsoid())) {
            cj4.c("SportDataStore", "option userId is not right:" + dataReadOption.getSsoid());
            return;
        }
        DataSyncOption dataSyncOption = new DataSyncOption();
        dataSyncOption.setSsoid(dataReadOption.getSsoid());
        dataSyncOption.setEarliestVersion(dataReadOption.getStartTime());
        final d8j d8jVarA = t9j.a(dataReadOption.getDataTable(), dataSyncOption);
        if (d8jVarA == null) {
            cj4.c(String.valueOf(dataReadOption.getDataTable()), "not support sync optimization");
        } else if (dataReadOption.getIsParse() == 2) {
            f5h.q(Boolean.TRUE).y(u9j.b()).j(new o14() { // from class: com.oplus.aiunit.vision.mai
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    nai.k(d8jVarA, dataReadOption, (Boolean) obj);
                }
            }).v();
        } else {
            d8jVarA.a(dataReadOption.getStartTime(), dataReadOption.getEndTime());
        }
    }

    public final boolean n(String str) {
        return str.contains("com.") || TextUtils.isEmpty(str);
    }

    @Override // com.oplus.aiunit.vision.ty9
    public final void read(DataReadOption dataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        pv4.INSTANCE.a(dataReadOption, this.f14421c);
        m(dataReadOption);
        i(dataReadOption.getDataTable(), g(l(dataReadOption), dataReadOption), iDataReadResultListener, dataReadOption);
    }
}
