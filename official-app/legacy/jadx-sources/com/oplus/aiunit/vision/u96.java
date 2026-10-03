package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.api.ISportHealthDataAPI;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.option.DataDeleteOption;
import com.heytap.databaseengine.option.DataReadOption;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class u96 {

    public class a extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f17371j;
        public final /* synthetic */ Context k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ECGRecord f17372l;
        public final /* synthetic */ int m;

        public a(MutableLiveData mutableLiveData, Context context, ECGRecord eCGRecord, int i) {
            this.f17371j = mutableLiveData;
            this.k = context;
            this.f17372l = eCGRecord;
            this.m = i;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (commonBackBean == null || commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
                aa6.b("ECGDetailRepository", "sharePdf failed");
                return;
            }
            try {
                List list = (List) commonBackBean.getObj();
                if (list != null && !list.isEmpty()) {
                    u96.this.e(this.f17371j, this.k, this.f17372l, this.m, (UserInfo) list.get(0));
                    return;
                }
                aa6.b("ECGDetailRepository", "sharePdf failed, userInfo is null");
            } catch (Exception e2) {
                aa6.b("ECGDetailRepository", "sharePdf, " + e2.toString());
            }
        }
    }

    public class b extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f17374j;

        public b(MutableLiveData mutableLiveData) {
            this.f17374j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            List list = (List) commonBackBean.getObj();
            if (list == null || list.isEmpty()) {
                aa6.b("ECGDetailRepository", "ecgRecords is empty !");
            } else {
                this.f17374j.postValue((ECGRecord) list.get(0));
            }
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            aa6.b("ECGDetailRepository", "fetchECGData error, " + th.toString());
        }
    }

    public class c extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f17375j;

        public c(MutableLiveData mutableLiveData) {
            this.f17375j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            aa6.a("ECGDetailRepository", "deleteRecord errorCode = " + commonBackBean.getErrorCode());
            this.f17375j.postValue(Boolean.valueOf(commonBackBean.getErrorCode() == 0));
        }
    }

    public class d extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ISportHealthDataAPI f17376j;
        public final /* synthetic */ String k;

        public d(ISportHealthDataAPI iSportHealthDataAPI, String str) {
            this.f17376j = iSportHealthDataAPI;
            this.k = str;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            List list = (List) commonBackBean.getObj();
            if (list == null || list.isEmpty()) {
                aa6.b("ECGDetailRepository", "syncFriendEcgData failed, ecgRecords is empty !");
                return;
            }
            ECGRecord eCGRecord = (ECGRecord) list.get(0);
            long jQ = v05.q(eCGRecord.getStartTimestamp());
            long jL = v05.l(eCGRecord.getStartTimestamp());
            aa6.a("ECGDetailRepository", "syncFriendData, startTime : " + fn9.g(jQ, "yyyMMMdd HH:mm") + ", endTime = " + fn9.g(jL, "yyyMMMdd HH:mm"));
            this.f17376j.syncFriendData(this.k, jQ, jL, 1012);
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            aa6.b("ECGDetailRepository", "syncFriendEcgData failed, " + th.toString());
        }
    }

    public static /* synthetic */ void h(p6h p6hVar, ccd ccdVar) throws Throwable {
        ccdVar.onNext(fa6.d().b(p6hVar));
        ccdVar.onComplete();
    }

    public static /* synthetic */ void i(MutableLiveData mutableLiveData, kde kdeVar) throws Throwable {
        aa6.a("ECGDetailRepository", "createPdf success, " + kdeVar.toString());
        mutableLiveData.postValue(kdeVar);
    }

    public static /* synthetic */ void j(MutableLiveData mutableLiveData, Throwable th) throws Throwable {
        mutableLiveData.postValue(null);
        aa6.b("ECGDetailRepository", "createPdf failed, " + th.toString());
    }

    public final void e(final MutableLiveData<kde> mutableLiveData, Context context, ECGRecord eCGRecord, int i, UserInfo userInfo) {
        final p6h p6hVar = new p6h(context, eCGRecord, userInfo, i);
        lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.r96
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                u96.h(p6hVar, ccdVar);
            }
        }).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.s96
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                u96.i(mutableLiveData, (kde) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.t96
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                u96.j(mutableLiveData, (Throwable) obj);
            }
        });
    }

    public void f(String str, MutableLiveData<Boolean> mutableLiveData) {
        DataDeleteOption dataDeleteOption = new DataDeleteOption();
        dataDeleteOption.setSsoid(v9g.w().D("user_ssoid"));
        dataDeleteOption.setDataTable(1012);
        dataDeleteOption.setClientDataId(str);
        SportHealthDataAPI.getInstance().deleteSportHealthData(dataDeleteOption).subscribe(new c(mutableLiveData));
    }

    public void g(String str, String str2, MutableLiveData<ECGRecord> mutableLiveData) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(str);
        dataReadOption.setDataTable(1012);
        dataReadOption.setDataId(str2);
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).subscribe(new b(mutableLiveData));
    }

    public void k(MutableLiveData<kde> mutableLiveData, Context context, ECGRecord eCGRecord, int i) {
        SportHealthDataAPI.getInstance().getUserInfo(v9g.w().D("user_ssoid")).n0(f30.c()).subscribe(new a(mutableLiveData, context, eCGRecord, i));
    }

    public void l(String str, String str2) {
        aa6.a("ECGDetailRepository", "syncFriendEcgData start, ecgItemId : " + str2);
        ISportHealthDataAPI sportHealthDataAPI = SportHealthDataAPI.getInstance();
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(str);
        dataReadOption.setDataTable(1012);
        dataReadOption.setDataId(str2);
        sportHealthDataAPI.readSportHealthData(dataReadOption).subscribe(new d(sportHealthDataAPI, str));
    }
}
