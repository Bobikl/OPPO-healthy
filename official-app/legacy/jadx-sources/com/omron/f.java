package com.omron;

import com.omron.lib.model.BPData;
import com.omron.lib.model.BoData;
import com.omron.lib.model.BodyfatData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    static final /* synthetic */ boolean a = true;

    private f() {
    }

    public static List<BodyfatData> a(List<Map<dw, Object>> list) {
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Map<dw, Object> map = list.get(i);
            BodyfatData bodyfatData = new BodyfatData();
            Object obj = map.get(dw.TimeStampKey);
            Objects.requireNonNull(obj);
            bodyfatData.setmMeasureTime(obj.toString());
            bodyfatData.setmWeight(((BigDecimal) map.get(dw.WeightKey)).setScale(1, 5).toString());
            bodyfatData.setmPercentage(((BigDecimal) map.get(dw.BodyFatPercentageKey)).multiply(new BigDecimal(100)).setScale(1, 5).toString());
            bodyfatData.setmSkeletal(((BigDecimal) map.get(dw.SkeletalMusclePercentageKey)).multiply(new BigDecimal(100)).setScale(1, 5).toString());
            bodyfatData.setmBasal(Math.round(Double.valueOf(((BigDecimal) map.get(dw.BasalMetabolismKey)).setScale(0, 5).toString()).doubleValue() / 4.184d) + "");
            bodyfatData.setmBmi(((BigDecimal) map.get(dw.BMIKey)).setScale(1, 5).toString());
            bodyfatData.setmAge(((BigDecimal) map.get(dw.BodyAgeKey)).setScale(0, 5).toString());
            bodyfatData.setmVisceral(((BigDecimal) map.get(dw.VisceralFatLevelKey)).multiply(new BigDecimal(2)).setScale(0, 5).toString());
            arrayList.add(bodyfatData);
        }
        return arrayList;
    }

    public static List<BoData> b(List<Map<dw, Object>> list) {
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Map<dw, Object> map = list.get(i);
            BoData boData = new BoData();
            Object obj = map.get(dw.PulseOximeterSpo2Key);
            Objects.requireNonNull(obj);
            String string = obj.toString();
            boData.setOxygen(string.substring(0, string.indexOf(".")));
            Object obj2 = map.get(dw.PulseRateKey);
            Objects.requireNonNull(obj2);
            String string2 = obj2.toString();
            boData.setPulse(string2.substring(0, string2.indexOf(".")));
            arrayList.add(boData);
        }
        return arrayList;
    }

    public static List<BPData> c(List<Map<dw, Object>> list) {
        EnumSet<dn> enumSet;
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Map<dw, Object> map = list.get(i);
            BPData bPData = new BPData();
            dw dwVar = dw.SystolicKey;
            if (map.containsKey(dwVar)) {
                bPData.setSystolic(Integer.parseInt(((BigDecimal) map.get(dwVar)).setScale(0, 5).toString()));
            }
            dw dwVar2 = dw.PulseRateKey;
            if (map.containsKey(dwVar2)) {
                bPData.setPulse(Integer.parseInt(((BigDecimal) map.get(dwVar2)).setScale(0, 5).toString()));
            }
            dw dwVar3 = dw.DiastolicKey;
            if (map.containsKey(dwVar3)) {
                bPData.setDiastolic(Integer.parseInt(((BigDecimal) map.get(dwVar3)).setScale(0, 5).toString()));
            }
            dw dwVar4 = dw.TimeStampKey;
            if (map.containsKey(dwVar4)) {
                Object obj = map.get(dwVar4);
                Objects.requireNonNull(obj);
                bPData.setMeasureTime(i.a(obj.toString()));
            }
            bPData.setCwsFlg(0);
            bPData.setArrhythmiaFlg(0);
            bPData.setBmFlg(0);
            bPData.setMeasureUser(0);
            dw dwVar5 = dw.BloodPressureMeasurementStatusKey;
            if (map.containsKey(dwVar5) && (enumSet = (EnumSet) eo.a(map.get(dwVar5))) != null && !enumSet.isEmpty()) {
                for (dn dnVar : enumSet) {
                    if (dnVar == dn.BodyMovementDetected) {
                        bPData.setBmFlg(1);
                    } else if (dnVar == dn.CuffTooLoose) {
                        bPData.setCwsFlg(1);
                    } else if (dnVar == dn.IrregularPulseDetected) {
                        bPData.setArrhythmiaFlg(1);
                    } else if (dnVar == dn.AFIBDetectionSupport) {
                        bPData.setAfibMode(1);
                    } else if (dnVar == dn.AFIBDetection) {
                        bPData.setAfibFlg(1);
                    }
                }
            }
            dw dwVar6 = dw.UserIndexKey;
            if (map.containsKey(dwVar6)) {
                BigDecimal bigDecimal = (BigDecimal) map.get(dwVar6);
                if (!a && bigDecimal == null) {
                    throw new AssertionError();
                }
                bPData.setMeasureUser(Integer.parseInt(bigDecimal.setScale(0, RoundingMode.HALF_DOWN).toString()));
            }
            arrayList.add(bPData);
        }
        return arrayList;
    }
}
