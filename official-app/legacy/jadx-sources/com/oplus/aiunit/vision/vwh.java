package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.databaseengine.model.snore.SnoreDbBuff;
import com.heytap.databaseengine.model.snore.SnoreDbFileInfo;
import com.heytap.databaseengine.model.snore.TypicalFragmentBean;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.sleep.snore.bean.Audio;
import com.heytap.health.sleep.snore.bean.SnoreExcerptBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class vwh {
    public final String a = "SnoreFrgTransform";

    public List<SnoreExcerptBean> a(long j2, @NonNull List<TypicalFragmentBean> list, List<BloodOxygenSaturation> list2, List<SnoreDbBuff> list3, List<SnoreDbFileInfo> list4) {
        Audio audioF;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            TypicalFragmentBean typicalFragmentBean = list.get(i);
            SnoreExcerptBean snoreExcerptBean = new SnoreExcerptBean();
            snoreExcerptBean.setMode(typicalFragmentBean.getMode());
            if (typicalFragmentBean.getMode() == 0 || typicalFragmentBean.getMode() == 1) {
                long spo2BeginTime = j2 + (((long) typicalFragmentBean.getSpo2BeginTime()) * 1000);
                long spo2EndTime = j2 + (((long) typicalFragmentBean.getSpo2EndTime()) * 1000);
                snoreExcerptBean.setStartTime(spo2BeginTime);
                snoreExcerptBean.setEndTime(spo2EndTime);
                d(snoreExcerptBean, j2, typicalFragmentBean, list2);
            }
            if (typicalFragmentBean.getMode() != 0) {
                long snoreBeginUnix = typicalFragmentBean.getSnoreBeginUnix();
                long snoreEndUnix = typicalFragmentBean.getSnoreEndUnix();
                if (snoreExcerptBean.getStartTime() == 0 || snoreExcerptBean.getStartTime() > snoreBeginUnix) {
                    snoreExcerptBean.setStartTime(snoreBeginUnix);
                }
                if (snoreExcerptBean.getEndTime() == 0 || snoreExcerptBean.getEndTime() < snoreEndUnix) {
                    snoreExcerptBean.setEndTime(snoreEndUnix);
                }
                b(snoreExcerptBean, typicalFragmentBean, list3);
                SnoreDbFileInfo snoreDbFileInfoC = c(typicalFragmentBean, list4);
                snoreExcerptBean.setSnoreDbFileInfo(snoreDbFileInfoC);
                if (snoreDbFileInfoC != null && (audioF = ak0.f(snoreDbFileInfoC.getFilePath())) != null) {
                    audioF.setStart(snoreDbFileInfoC.getSnoreDbStartTimestamp() / 1000);
                    audioF.setEnd(snoreDbFileInfoC.getSnoreDbEndTimestamp() / 1000);
                    audioF.setClientFileId(snoreDbFileInfoC.getClientFileId());
                    snoreExcerptBean.setAudio(audioF);
                }
                arrayList.add(snoreExcerptBean);
            }
        }
        return arrayList;
    }

    public final void b(@NonNull SnoreExcerptBean snoreExcerptBean, TypicalFragmentBean typicalFragmentBean, List<SnoreDbBuff> list) {
        ArrayList arrayList = new ArrayList();
        long snoreBeginUnix = typicalFragmentBean.getSnoreBeginUnix();
        long snoreEndUnix = typicalFragmentBean.getSnoreEndUnix();
        a7b.f("SnoreFrgTransform", "buildDbBuffs: ,snoreStartTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", snoreBeginUnix)) + ",snoreEndTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", snoreEndUnix)) + ",size:" + list.size());
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            SnoreDbBuff snoreDbBuff = list.get(i);
            if (snoreDbBuff.getUtcTimestamp() < snoreBeginUnix || snoreDbBuff.getUtcTimestamp() > snoreEndUnix) {
                if (snoreDbBuff.getUtcTimestamp() > snoreEndUnix) {
                    break;
                }
            } else {
                TimeStampedData timeStampedData = new TimeStampedData();
                timeStampedData.setTimestamp(snoreDbBuff.getUtcTimestamp());
                timeStampedData.setY(snoreDbBuff.getSecondDBValue());
                arrayList.add(timeStampedData);
                if (snoreDbBuff.getSecondDBValue() > fFloatValue) {
                    fFloatValue = snoreDbBuff.getSecondDBValue();
                }
                if (snoreDbBuff.getSecondDBValue() < fFloatValue2 || fFloatValue2 == 0.0f) {
                    fFloatValue2 = snoreDbBuff.getSecondDBValue();
                }
            }
        }
        if (eik.a(typicalFragmentBean.getSnoreMaxDb(), 0.0f) > 0.0f) {
            fFloatValue = typicalFragmentBean.getSnoreMaxDb().floatValue();
        }
        if (eik.a(typicalFragmentBean.getSnoreMinDb(), 0.0f) > 0.0f) {
            fFloatValue2 = typicalFragmentBean.getSnoreMinDb().floatValue();
        }
        snoreExcerptBean.setSnoreNum(typicalFragmentBean.getSnoreNum());
        snoreExcerptBean.setMaxSnoreDB(BigDecimal.valueOf(fFloatValue).setScale(1, 4).floatValue());
        snoreExcerptBean.setMinSnoreDB(BigDecimal.valueOf(fFloatValue2).setScale(1, 4).floatValue());
        snoreExcerptBean.setSnoreDbBuffs(arrayList);
        a7b.f("SnoreFrgTransform", "buildDbBuffs result:" + arrayList.size());
    }

    public final SnoreDbFileInfo c(TypicalFragmentBean typicalFragmentBean, List<SnoreDbFileInfo> list) {
        long snoreBeginUnix = typicalFragmentBean.getSnoreBeginUnix();
        long snoreEndUnix = typicalFragmentBean.getSnoreEndUnix();
        a7b.f("SnoreFrgTransform", "buildDbFile: ,snoreStartTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", snoreBeginUnix)) + "/" + snoreBeginUnix + ",snoreEndTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", snoreEndUnix)) + "/" + snoreEndUnix + ",size:" + list.size());
        for (SnoreDbFileInfo snoreDbFileInfo : list) {
            if (snoreDbFileInfo.getSnoreDbStartTimestamp() >= snoreBeginUnix && snoreDbFileInfo.getSnoreDbEndTimestamp() <= snoreEndUnix) {
                StringBuilder sb = new StringBuilder();
                sb.append("item:");
                sb.append(snoreDbFileInfo.toString());
                if (TextUtils.isEmpty(snoreDbFileInfo.getFilePath())) {
                    String str = md7.g() + "/" + snoreDbFileInfo.getFileName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SnoreDbFileInfo filePath:");
                    sb2.append(str);
                    snoreDbFileInfo.setFilePath(str);
                }
                return snoreDbFileInfo;
            }
        }
        a7b.b("SnoreFrgTransform", "buildDbFile result is null !");
        return null;
    }

    public final void d(@NonNull SnoreExcerptBean snoreExcerptBean, long j2, TypicalFragmentBean typicalFragmentBean, List<BloodOxygenSaturation> list) {
        ArrayList arrayList = new ArrayList();
        long spo2BeginTime = (((long) typicalFragmentBean.getSpo2BeginTime()) * 1000) + j2;
        long spo2EndTime = (((long) typicalFragmentBean.getSpo2EndTime()) * 1000) + j2;
        a7b.f("SnoreFrgTransform", "buildSpo2: ,spo2StartTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", spo2BeginTime)) + ",spo2EndTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", spo2EndTime)) + ",firstSpo2Time: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j2)) + ",size:" + list.size());
        int bloodOxygenSaturationValue = 0;
        for (int i = 0; i < list.size(); i++) {
            BloodOxygenSaturation bloodOxygenSaturation = list.get(i);
            if (bloodOxygenSaturation.getDataCreatedTimestamp() < spo2BeginTime || bloodOxygenSaturation.getDataCreatedTimestamp() > spo2EndTime) {
                if (bloodOxygenSaturation.getDataCreatedTimestamp() > spo2EndTime) {
                    break;
                }
            } else {
                TimeStampedData timeStampedData = new TimeStampedData();
                timeStampedData.setTimestamp(bloodOxygenSaturation.getDataCreatedTimestamp());
                timeStampedData.setY(bloodOxygenSaturation.getBloodOxygenSaturationValue());
                arrayList.add(timeStampedData);
                bloodOxygenSaturationValue += bloodOxygenSaturation.getBloodOxygenSaturationValue();
            }
        }
        a7b.f("SnoreFrgTransform", "buildSpo2 result:" + arrayList.size());
        snoreExcerptBean.setSpo2List(arrayList);
        if (bloodOxygenSaturationValue <= 0 || arrayList.isEmpty()) {
            snoreExcerptBean.setAverageSpo2(0);
        } else {
            snoreExcerptBean.setAverageSpo2(bloodOxygenSaturationValue / arrayList.size());
        }
    }
}
