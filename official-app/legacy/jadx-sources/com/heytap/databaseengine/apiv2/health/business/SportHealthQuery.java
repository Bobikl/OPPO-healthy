package com.heytap.databaseengine.apiv2.health.business;

import android.content.pm.PackageManager;
import android.util.SparseArray;
import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.aiunit.vision.at4;
import com.oplus.aiunit.vision.h7e;
import com.oplus.aiunit.vision.jp6;
import com.oplus.aiunit.vision.me8;
import com.oplus.aiunit.vision.nf8;
import com.oplus.aiunit.vision.pf8;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class SportHealthQuery<T> extends pf8 {

    /* JADX INFO: renamed from: com.heytap.databaseengine.apiv2.health.business.SportHealthQuery$1, reason: invalid class name */
    public class AnonymousClass1 extends IDataReadResultListener.Stub {
        final /* synthetic */ SparseArray val$allData;
        final /* synthetic */ DataReadOption val$mOption;
        final /* synthetic */ List val$partData;

        public AnonymousClass1(DataReadOption dataReadOption, List list, SparseArray sparseArray) {
            this.val$mOption = dataReadOption;
            this.val$partData = list;
            this.val$allData = sparseArray;
        }

        @Override // com.heytap.databaseengine.callback.IDataReadResultListener
        public void onResult(List list, int i, int i2) {
            if (i != jp6.a(true, 0) && i < 100) {
                me8.a("SportHealthQuery", "get data failed, errorCode: " + i);
                me8.e("SportHealthQuery", "readSportHealthData onFailure: endTime = " + System.currentTimeMillis());
                SportHealthQuery.c(SportHealthQuery.this);
                throw null;
            }
            int dataTable = this.val$mOption.getDataTable();
            if (at4.m(list, i, i2, this.val$partData, this.val$allData)) {
                if (this.val$allData.size() <= 0) {
                    me8.a("SportHealthQuery", "allData is empty");
                    SportHealthQuery.c(SportHealthQuery.this);
                    jp6.a(true, 101005);
                    throw null;
                }
                me8.a("SportHealthQuery", "readSportHealthData table: " + dataTable + " allData.get size: " + ((List) this.val$allData.get(dataTable)).size());
                SportHealthQuery.c(SportHealthQuery.this);
                throw null;
            }
        }
    }

    public static /* bridge */ /* synthetic */ nf8 c(SportHealthQuery sportHealthQuery) {
        sportHealthQuery.getClass();
        return null;
    }

    @Override // com.oplus.aiunit.vision.pf8
    public void a(Exception exc) {
        me8.b("SportHealthQuery", "e:" + exc.getMessage());
        if (exc.getClass().equals(PackageManager.NameNotFoundException.class)) {
            jp6.a(true, jp6.ERR_HEALTH_APP_IS_NOT_INSTALLED);
            throw null;
        }
        if (exc.getClass().equals(IllegalStateException.class)) {
            jp6.a(true, jp6.ERR_HEALTH_APP_VERSION_IS_TOO_LOW);
            throw null;
        }
        jp6.a(true, jp6.ERR_BINDER_EXCEPTION);
        throw null;
    }

    @Override // com.oplus.aiunit.vision.pf8
    public void b() throws Exception {
        new h7e();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public DataReadOption d(HeytapHealthParams heytapHealthParams) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setStartTime(heytapHealthParams.getStartTime());
        dataReadOption.setEndTime(heytapHealthParams.getEndTime());
        int tableType = HeytapHealthParams.getTableType(heytapHealthParams.getDataType() + heytapHealthParams.getMode());
        dataReadOption.setDataTable(tableType);
        if (tableType == 1005) {
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setGroupUnitType(8);
        } else if (tableType != 1009) {
            switch (tableType) {
                case 1001:
                    dataReadOption.setAggregateType(107);
                    break;
                case 1002:
                case 1003:
                    dataReadOption.setReadSportMode(-2);
                    break;
            }
        } else {
            dataReadOption.setGroupUnitType(4);
        }
        return dataReadOption;
    }
}
