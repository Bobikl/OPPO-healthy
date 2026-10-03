package com.oplus.aiunit.vision;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.JsonObject;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.TrackMetaData;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class i1g {
    public final String a = "RunDataManager";
    public final String b = "treadmill_data";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f12345c = b78.a().getSharedPreferences("treadmill_data", 0);

    public class a extends ao0<CommonBackBean> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            a7b.f("RunDataManager", "deleteTemporaryData errorCode:" + commonBackBean.getErrorCode() + "; obj:" + commonBackBean.getObj().toString());
        }
    }

    public class b extends ao0<CommonBackBean> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveTrackDataTemp errorCode:");
            sb.append(commonBackBean.getErrorCode());
            sb.append("; obj:");
            sb.append(commonBackBean.getObj().toString());
        }
    }

    public class c extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OneTimeSport f12348j;
        public final /* synthetic */ ccd k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f2g.a f12349l;

        public c(OneTimeSport oneTimeSport, ccd ccdVar, f2g.a aVar) {
            this.f12348j = oneTimeSport;
            this.k = ccdVar;
            this.f12349l = aVar;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (commonBackBean.getErrorCode() != 0) {
                a7b.b("RunDataManager", "save one sport data, errorcode:" + commonBackBean.getErrorCode());
                this.k.onError(new Throwable("save one sport data, errorcode:" + commonBackBean.getErrorCode()));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("save one sport data, sssoid:");
            sb.append(this.f12348j.getSsoid());
            sb.append(", start Time:");
            sb.append(this.f12348j.getStartTimestamp());
            sb.append(", end time:");
            sb.append(this.f12348j.getEndTimestamp());
            this.k.onNext(this.f12348j);
            i1g.this.m(this.f12349l.a);
            this.k.onComplete();
        }
    }

    public class d extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ccd f12350j;

        public d(ccd ccdVar) {
            this.f12350j = ccdVar;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (commonBackBean.getErrorCode() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("save sport detail data, errorcode:");
                sb.append(commonBackBean.getErrorCode());
            }
            this.f12350j.onNext(Boolean.TRUE);
            this.f12350j.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(f2g.a aVar, ccd ccdVar) throws Throwable {
        OneTimeSport oneTimeSportK = k(aVar);
        DataInsertOption dataInsertOptionL = l(oneTimeSportK);
        StringBuilder sb = new StringBuilder();
        sb.append("save data:");
        sb.append(oneTimeSportK.getData());
        SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOptionL).subscribe(new c(oneTimeSportK, ccdVar, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(f2g.a aVar, ccd ccdVar) throws Throwable {
        List<SportHealthData> listJ = j(aVar);
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDataTable(1001);
        dataInsertOption.setDatas(listJ);
        StringBuilder sb = new StringBuilder();
        sb.append("sportDetails:");
        sb.append(listJ.toString());
        SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).subscribe(new d(ccdVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Boolean bool) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("saveToDataDetail-->");
        sb.append(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Throwable th) throws Throwable {
        a7b.b("RunDataManager", "saveToDataDetail-->" + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ OneTimeSport v(f2g.a aVar, OneTimeSport oneTimeSport, Boolean bool) throws Exception {
        if (oneTimeSport == null) {
            throw new Exception("save data oneTimeSport is null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TotalDistance:");
        sb.append(aVar.g());
        sb.append("    TotalStep");
        sb.append(aVar.i());
        sb.append("    TotalEnergy");
        sb.append(aVar.h());
        sb.append("    listSize:");
        sb.append(aVar.f11183e.size());
        m(aVar.a);
        return oneTimeSport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd w(final f2g.a aVar) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("saveToDataPlatform-->fixRunData befor");
        sb.append(aVar);
        o(aVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("saveToDataPlatform-->fixRunData after");
        sb2.append(aVar);
        return lbd.k1(p(aVar), q(aVar), new md1() { // from class: com.oplus.aiunit.vision.g1g
            @Override // com.oplus.aiunit.vision.md1
            public final Object apply(Object obj, Object obj2) {
                return this.i.v(aVar, (OneTimeSport) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(MutableLiveData mutableLiveData, OneTimeSport oneTimeSport) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("save data oneTimeSport success:");
        sb.append(oneTimeSport);
        mutableLiveData.postValue(oneTimeSport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(MutableLiveData mutableLiveData, Throwable th) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("save data oneTimeSport error:");
        sb.append(th.getMessage());
        mutableLiveData.postValue(null);
    }

    public void A(f2g.a aVar) {
        q(aVar).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.a1g
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.t((Boolean) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.b1g
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.u((Throwable) obj);
            }
        });
    }

    public LiveData<OneTimeSport> B(f2g.a aVar) {
        bg5.j();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        lbd.h0(aVar).Q(new d08() { // from class: com.oplus.aiunit.vision.c1g
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.w((f2g.a) obj);
            }
        }).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.d1g
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.x(mutableLiveData, (OneTimeSport) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.e1g
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.y(mutableLiveData, (Throwable) obj);
            }
        });
        return mutableLiveData;
    }

    public void C(f2g.a aVar, String str) {
        v9g.x("preference_sport").W("is_in_motion", true);
        v9g.w().U("treadmill_mac", str);
        StringBuilder sb = new StringBuilder();
        sb.append("SPUtils.TREADMILL_MAC-->");
        sb.append(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(k(aVar));
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDataTable(1004);
        dataInsertOption.setDatas(arrayList);
        SportHealthDataAPI.getInstance().insertTrackTemp(dataInsertOption).L0(su8.f()).subscribe(new b());
    }

    @NotNull
    public final SportDataDetail i(f2g.a aVar, Long l2, Integer num, Integer num2, Integer num3, String str) {
        SportDataDetail sportDataDetail = new SportDataDetail();
        sportDataDetail.setSsoid(str);
        sportDataDetail.setDeviceUniqueId(aVar.f11182c);
        long jH = v05.h(l2.longValue());
        sportDataDetail.setStartTimestamp(jH);
        sportDataDetail.setEndTimestamp(jH + 60000);
        sportDataDetail.setSteps(num2.intValue());
        sportDataDetail.setCalories(num3.intValue() * 1000);
        sportDataDetail.setDistance(num.intValue());
        sportDataDetail.setSportMode(21);
        sportDataDetail.setAltitudeOffset(0);
        sportDataDetail.setDeviceType(op5.PHONE);
        return sportDataDetail;
    }

    public List<SportHealthData> j(f2g.a aVar) {
        ArrayList arrayList = new ArrayList();
        Long l2 = aVar.f11183e.get(0);
        String strD = v9g.w().D("user_ssoid");
        int i = 0;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Long l3 = l2;
        for (Long l4 : aVar.f11183e) {
            if (l4.longValue() - l3.longValue() >= 60000) {
                int iIntValue = aVar.h.get(i).intValue() - num.intValue();
                int iIntValue2 = aVar.f11184j.get(i).intValue() - num2.intValue();
                int iIntValue3 = aVar.k.get(i).intValue() - num3.intValue();
                SportDataDetail sportDataDetailI = i(aVar, l3, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), strD);
                Integer numValueOf = Integer.valueOf(num.intValue() + iIntValue);
                Integer numValueOf2 = Integer.valueOf(num2.intValue() + iIntValue2);
                Integer numValueOf3 = Integer.valueOf(num3.intValue() + iIntValue3);
                arrayList.add(sportDataDetailI);
                num = numValueOf;
                num2 = numValueOf2;
                num3 = numValueOf3;
                l3 = l4;
            }
            i++;
        }
        int size = aVar.f11183e.size() - 1;
        if (!l3.equals(aVar.f11183e.get(size))) {
            arrayList.add(i(aVar, l3, Integer.valueOf(aVar.h.get(size).intValue() - num.intValue()), Integer.valueOf(aVar.f11184j.get(size).intValue() - num2.intValue()), Integer.valueOf(aVar.k.get(size).intValue() - num3.intValue()), strD));
        }
        return arrayList;
    }

    public final OneTimeSport k(f2g.a aVar) {
        OneTimeSport oneTimeSport = new OneTimeSport();
        oneTimeSport.setClientDataId(UUID.randomUUID().toString().replace("-", ""));
        oneTimeSport.setDeviceType(op5.PHONE);
        oneTimeSport.setSportMode(21);
        oneTimeSport.setSsoid(v9g.w().D("user_ssoid"));
        oneTimeSport.setVersion(100);
        oneTimeSport.setStartTimestamp(aVar.e());
        oneTimeSport.setEndTimestamp(aVar.b());
        oneTimeSport.setTimezone(v05.r(null));
        oneTimeSport.setSyncStatus(0);
        oneTimeSport.setDeviceUniqueId(aVar.f11182c);
        String strF = aVar.f();
        if (strF != null) {
            HashMap map = new HashMap();
            map.put(RecordCombinedLineChart.KEY_STEP_CADENCE, strF);
            oneTimeSport.setData(sc8.g(map));
        }
        TrackMetaData trackMetaData = new TrackMetaData();
        trackMetaData.setSportId(aVar.e() + "");
        trackMetaData.setSportMode(21);
        trackMetaData.setTotalCalories(((long) aVar.d) * 1000);
        trackMetaData.setTotalTime(aVar.j());
        trackMetaData.setTotalDistance(aVar.g());
        trackMetaData.setTotalSteps(aVar.i());
        trackMetaData.setAvgPace(aVar.a());
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("dataSource", (Number) 1);
        trackMetaData.setRunExtra(jsonObject.toString());
        Map<Integer, Integer> mapC = aVar.c();
        if (mapC != null) {
            trackMetaData.setPaceMap(mapC);
            trackMetaData.setBestPace(((Integer) Collections.min(mapC.values())).intValue());
        }
        trackMetaData.setAvgStepRate((int) Math.round(((double) aVar.i()) / (aVar.j() / 60000.0d)));
        trackMetaData.setBestStepRate(trackMetaData.getAvgStepRate());
        oneTimeSport.setMetaData(sc8.g(trackMetaData));
        StringBuilder sb = new StringBuilder();
        sb.append("Save OneTimeData:");
        sb.append(oneTimeSport.toString());
        return oneTimeSport;
    }

    public final DataInsertOption l(OneTimeSport oneTimeSport) {
        OneTimeSport oneTimeSportCopyData = oneTimeSport.copyData();
        oneTimeSportCopyData.setData(wei.oneTimeSport.h(oneTimeSportCopyData));
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDataTable(1004);
        ArrayList arrayList = new ArrayList();
        arrayList.add(oneTimeSportCopyData);
        dataInsertOption.setDatas(arrayList);
        return dataInsertOption;
    }

    public void m(String str) {
        this.f12345c.edit().remove(str).apply();
    }

    public void n() {
        v9g.x("preference_sport").W("is_in_motion", false);
        v9g.w().U("treadmill_mac", "");
        SportHealthDataAPI.getInstance().deleteTrackTemp(v9g.w().D("user_ssoid")).L0(su8.f()).subscribe(new a());
    }

    public final void o(f2g.a aVar) {
        int i = 0;
        Integer num = aVar.f.get(0);
        Integer num2 = aVar.h.get(0);
        Long l2 = aVar.f11183e.get(0);
        Integer num3 = aVar.f11184j.get(0);
        Integer num4 = aVar.k.get(0);
        if (num.intValue() <= 60 || num2.intValue() <= 0) {
            return;
        }
        float fIntValue = num.intValue() / 60.0f;
        float fIntValue2 = num2.intValue() / fIntValue;
        float fIntValue3 = num3.intValue() != 0 ? num3.intValue() / fIntValue : 0.0f;
        float fIntValue4 = num4.intValue() != 0 ? num4.intValue() / fIntValue : 0.0f;
        long jLongValue = l2.longValue() - ((long) (num.intValue() * 1000));
        float f = (60.0f * fIntValue2) / 100.0f;
        int i2 = 0;
        while (true) {
            float f2 = i;
            if (f2 >= fIntValue) {
                return;
            }
            aVar.h.add(i2, Integer.valueOf((int) Math.floor(f2 * fIntValue2)));
            aVar.f11183e.add(i2, Long.valueOf(((long) (60000 * i)) + jLongValue));
            aVar.f11184j.add(i2, Integer.valueOf((int) Math.floor(i2 * fIntValue3)));
            aVar.g.add(i2, Float.valueOf(f));
            aVar.k.add(i2, Integer.valueOf((int) Math.floor(f2 * fIntValue4)));
            aVar.f.add(i2, Integer.valueOf(i * 60));
            i2++;
            i++;
        }
    }

    public lbd<OneTimeSport> p(final f2g.a aVar) {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.h1g
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.r(aVar, ccdVar);
            }
        });
    }

    public lbd<Boolean> q(final f2g.a aVar) {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.f1g
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.s(aVar, ccdVar);
            }
        });
    }

    public void z(f2g.a aVar) {
        this.f12345c.edit().putString(aVar.a, sc8.g(aVar)).apply();
    }
}
