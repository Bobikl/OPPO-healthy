package com.heytap.health.sleep.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.databaseengine.model.snore.SnoreDbBuff;
import com.heytap.databaseengine.model.snore.TypicalFragmentBean;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreDbDayBean {
    private float maxDb;
    private int meanDb;
    private float minDb;
    private final List<TimeStampedData> snoreDbDataList;
    private int snoreMaxDbScale;
    private int snoreMaxDbValue;
    private final List<TimeStampedData> snoreModelFrgDataList;
    private int snoreNumValue;
    private int snoreTimeValue;
    private final List<TimeStampedData> spo2ModelFrgDataList;

    public SnoreDbDayBean(OsaResultBean osaResultBean, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        this.snoreDbDataList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.snoreModelFrgDataList = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.spo2ModelFrgDataList = arrayList3;
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        if (osaResultBean == null || osaResultBean.getSnoreResultBean() == null) {
            return;
        }
        List<SnoreDbBuff> snoreDbBuff = osaResultBean.getSnoreResultBean().getSnoreDbBuff();
        int snoreDbBuffLen = osaResultBean.getSnoreResultBean().getSnoreDbBuffLen();
        a7b.f("SnoreDbDayBean", " snoreDbBuffList = " + snoreDbBuff.size());
        a7b.f("SnoreDbDayBean", " snoreDbBuffLen = " + snoreDbBuffLen);
        float snoreMaxDb = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < snoreDbBuff.size(); i2++) {
            SnoreDbBuff snoreDbBuff2 = snoreDbBuff.get(i2);
            if (snoreDbBuff2.getSnoreMaxDb() > 0.0f && snoreDbBuff2.getUtcTimestamp() >= j2 && snoreDbBuff2.getUtcTimestamp() < j3) {
                TimeStampedData timeStampedData = new TimeStampedData();
                timeStampedData.setTimestamp(snoreDbBuff2.getUtcTimestamp());
                timeStampedData.setY(snoreDbBuff2.getSnoreMaxDb());
                this.snoreDbDataList.add(timeStampedData);
                snoreMaxDb += snoreDbBuff2.getSnoreMaxDb();
                if (snoreDbBuff2.getSnoreMaxDb() > this.maxDb) {
                    this.maxDb = snoreDbBuff2.getSnoreMaxDb();
                }
                if (this.minDb == 0.0f || snoreDbBuff2.getSnoreMaxDb() < this.minDb) {
                    this.minDb = snoreDbBuff2.getSnoreMaxDb();
                }
                if (snoreDbBuff2.getSnoreMaxDb() > 60.0f) {
                    i++;
                }
            }
        }
        this.meanDb = (int) (snoreMaxDb / this.snoreDbDataList.size());
        List<TypicalFragmentBean> typicalFragmentBeanList = osaResultBean.getTypicalFragmentBeanList();
        Collections.sort(typicalFragmentBeanList, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.suh
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((TypicalFragmentBean) obj).getSnoreBeginUnix();
            }
        }));
        for (int i3 = 0; i3 < typicalFragmentBeanList.size(); i3++) {
            TypicalFragmentBean typicalFragmentBean = typicalFragmentBeanList.get(i3);
            int mode = typicalFragmentBean.getMode();
            TimeStampedData timeStampedData2 = new TimeStampedData();
            timeStampedData2.setY(getMaxDb());
            if (mode == 0 || mode == 1) {
                timeStampedData2.setTimestamp((((long) typicalFragmentBean.getSpo2BeginTime()) * 1000) + osaResultBean.getFirstSpo2Time());
                this.spo2ModelFrgDataList.add(timeStampedData2);
            }
            if (mode != 0) {
                timeStampedData2.setTimestamp(typicalFragmentBean.getSnoreBeginUnix());
                this.snoreModelFrgDataList.add(timeStampedData2);
            }
        }
        this.snoreTimeValue = (osaResultBean.getSnoreResultBean().getSnoreSumTimeMs() / 1000) / 60;
        this.snoreNumValue = osaResultBean.getSnoreResultBean().getSnoreSumNum();
        this.snoreMaxDbValue = (int) osaResultBean.getSnoreResultBean().getSnoreMaxDb();
        int i4 = this.snoreTimeValue;
        if (i4 <= 0) {
            this.snoreMaxDbScale = 0;
        } else {
            this.snoreMaxDbScale = i / i4;
        }
    }

    public long getFirstTime() {
        if (lza.a(this.snoreDbDataList)) {
            return 0L;
        }
        return this.snoreDbDataList.get(0).getTimestamp();
    }

    public long getLastTime() {
        if (lza.a(this.snoreDbDataList)) {
            return 0L;
        }
        List<TimeStampedData> list = this.snoreDbDataList;
        return list.get(list.size() - 1).getTimestamp();
    }

    public int getMaxDb() {
        float f = this.maxDb;
        if (f > 10.0f) {
            return (((int) (f / 10.0f)) + 1) * 10;
        }
        return 10;
    }

    public int getMeanDb() {
        return ((getMaxDb() - getMinDb()) / 2) + getMinDb();
    }

    public int getMinDb() {
        float f = this.minDb;
        if (f < 10.0f) {
            return 0;
        }
        return ((int) (f / 10.0f)) * 10;
    }

    public List<TimeStampedData> getSnoreDbDataList() {
        a7b.f("SnoreDbDayBean", " snoreDbDataList:" + this.snoreDbDataList.size());
        return this.snoreDbDataList;
    }

    public int getSnoreMaxDbScale() {
        return this.snoreMaxDbScale;
    }

    public int getSnoreMaxDbValue() {
        return this.snoreMaxDbValue;
    }

    public List<TimeStampedData> getSnoreModelFrgDataList() {
        return this.snoreModelFrgDataList;
    }

    public int getSnoreNumValue() {
        return this.snoreNumValue;
    }

    public int getSnoreTimeValue() {
        return this.snoreTimeValue;
    }

    public List<TimeStampedData> getSpo2ModelFrgDataList() {
        return this.spo2ModelFrgDataList;
    }

    public boolean isEmpty() {
        return this.snoreDbDataList.size() <= 0;
    }
}
