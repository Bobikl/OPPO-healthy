package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.api.ISportHealthDataAPI;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.databaseengine.option.DataReadOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class a96 {

    public class a extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f9252j;

        public a(MutableLiveData mutableLiveData) {
            this.f9252j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            List list = (List) commonBackBean.getObj();
            if (list == null || list.isEmpty()) {
                s47.b("ECGDataCardRepository", "ecgRecords is empty !");
            } else {
                this.f9252j.postValue((ECGRecord) list.get(0));
            }
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            s47.b("ECGDataCardRepository", "fetch ecg data error, msg : " + th.getMessage());
        }
    }

    public class b extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f9253j;
        public final /* synthetic */ ISportHealthDataAPI k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f9254l;
        public final /* synthetic */ long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f9255n;

        public b(long j2, ISportHealthDataAPI iSportHealthDataAPI, String str, long j3, long j4) {
            this.f9253j = j2;
            this.k = iSportHealthDataAPI;
            this.f9254l = str;
            this.m = j3;
            this.f9255n = j4;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (((Long) ((List) commonBackBean.getObj()).get(0)).longValue() < this.f9253j) {
                this.k.syncFriendData(this.f9254l, this.m, this.f9255n, 1012);
            }
        }
    }

    public class c extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f9256j;

        public c(MutableLiveData mutableLiveData) {
            this.f9256j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            Collection arrayList = (List) commonBackBean.getObj();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            this.f9256j.postValue(arrayList);
        }
    }

    public static /* synthetic */ boolean d(CommonBackBean commonBackBean) throws Throwable {
        return commonBackBean.getErrorCode() == 0;
    }

    public void b(String str, String str2, MutableLiveData<ECGRecord> mutableLiveData) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(str);
        dataReadOption.setDataTable(1012);
        dataReadOption.setDataId(str2);
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).subscribe(new a(mutableLiveData));
    }

    public void c(MutableLiveData<List<ECGRecord>> mutableLiveData, String str, long j2, long j3) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(str);
        dataReadOption.setDataTable(1012);
        dataReadOption.setEndTime(j3);
        dataReadOption.setStartTime(j2);
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).subscribe(new c(mutableLiveData));
    }

    public void e(String str, long j2, long j3, long j4) {
        s47.a("ECGDataCardRepository", "getLocalDataMaxModifiedTime maxModifiedTimestamp: " + j2);
        ISportHealthDataAPI sportHealthDataAPI = SportHealthDataAPI.getInstance();
        sportHealthDataAPI.getMaxModifiedTimestamp(str, j3, j4, 1012).L0(su8.c()).P(new mpe() { // from class: com.oplus.aiunit.vision.z86
            @Override // com.oplus.aiunit.vision.mpe
            public final boolean test(Object obj) {
                return a96.d((CommonBackBean) obj);
            }
        }).subscribe(new b(j2, sportHealthDataAPI, str, j3, j4));
    }
}
