package com.lifesense.device.scale.data.weight;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.lifesense.android.bluetooth.core.tools.l;
import com.lifesense.device.scale.data.entity.WeightDbDataDao;
import com.lifesense.device.scale.device.dto.receive.WeightData;
import com.oplus.aiunit.vision.kvl;
import com.oplus.aiunit.vision.tli;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.lifesense.device.scale.data.weight.a {
    public WeightDbDataDao a;

    public class a implements Runnable {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.a.size(); i++) {
                b.this.a((String) this.a.get(i), true);
            }
        }
    }

    public b(WeightDbDataDao weightDbDataDao) {
        this.a = weightDbDataDao;
    }

    public WeightData a(com.lifesense.device.scale.data.entity.a aVar) {
        WeightData weightData = new WeightData();
        weightData.setUserId(aVar.n());
        weightData.setDeviceId(aVar.d());
        weightData.setDeviceMode(aVar.e());
        weightData.setDbId(aVar.g());
        weightData.setMeasurementTime(aVar.i() * 1000);
        weightData.setResistance5k(aVar.m());
        weightData.setResistance50k(aVar.l());
        weightData.setUserNo(aVar.o());
        weightData.setWeight(aVar.q());
        weightData.setWeightLevel(aVar.r());
        weightData.setBattery(aVar.a());
        weightData.setDbId(aVar.g());
        return weightData;
    }

    public SQLiteDatabase b() {
        return ((tli) this.a.getDatabase()).c();
    }

    @Override // com.lifesense.device.scale.data.weight.a
    public List<WeightData> a() {
        List<com.lifesense.device.scale.data.entity.a> listF = this.a.queryBuilder().o(WeightDbDataDao.Properties.IsTreated.a(0), new kvl[0]).k(20).c().f();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listF.size(); i++) {
            arrayList.add(a(listF.get(i)));
        }
        return arrayList;
    }

    public com.lifesense.device.scale.data.entity.a b(WeightData weightData) {
        com.lifesense.device.scale.data.entity.a aVar = new com.lifesense.device.scale.data.entity.a();
        aVar.b(weightData.getUserId());
        aVar.a(weightData.getDeviceId());
        aVar.b(weightData.getDeviceMode());
        aVar.c(weightData.getDbId());
        aVar.a(weightData.getMeasurementTime());
        aVar.f(weightData.getResistance5K());
        aVar.e(weightData.getResistance50k());
        aVar.b(weightData.getUserNo());
        aVar.h(weightData.getWeight());
        aVar.i(weightData.getWeightLevel());
        aVar.a(weightData.getBattery());
        if (TextUtils.isEmpty(aVar.g())) {
            aVar.c(l.a());
        }
        return aVar;
    }

    @Override // com.lifesense.device.scale.data.weight.a
    public void a(WeightData weightData) {
        com.lifesense.device.scale.data.entity.a aVarB = b(weightData);
        aVarB.b(false);
        List<com.lifesense.device.scale.data.entity.a> listL = this.a.queryBuilder().o(WeightDbDataDao.Properties.MeasurementTime.a(Long.valueOf(weightData.getMeasurementTime())), WeightDbDataDao.Properties.Weight.a(Double.valueOf(weightData.getWeight()))).k(1).l();
        if (listL == null || listL.size() <= 0) {
            this.a.insertOrReplace(aVarB);
        }
    }

    public final void a(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(WeightDbDataDao.Properties.IsTreated.f19199e, Integer.valueOf(z ? 1 : 0));
        b().update(this.a.getTablename(), contentValues, WeightDbDataDao.Properties.Id.f19199e + "=?", new String[]{str});
    }

    @Override // com.lifesense.device.scale.data.weight.a
    public void a(List<WeightData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WeightData weightData = list.get(i);
            if (weightData != null && weightData.getDbId() != null) {
                arrayList.add(weightData.getDbId());
            }
        }
        this.a.getSession().runInTx(new a(arrayList));
    }
}
