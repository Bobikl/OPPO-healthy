package com.heytap.health.main.viewmodel;

import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.lifecycle.ViewModel;
import com.heytap.health.healthbase.bean.TargetBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ju8;
import com.oplus.aiunit.vision.xm3;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class TargetClockModel extends ViewModel {
    public final String i = "TargetClockModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ju8 f4967j = new ju8();

    public void u(List<TargetBean> list) {
        try {
            for (TargetBean targetBean : list) {
                String signInStartTime = targetBean.getSignInStartTime();
                if (!TextUtils.isEmpty(signInStartTime) && signInStartTime.contains(":")) {
                    int iIndexOf = signInStartTime.indexOf(":");
                    targetBean.setStartTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).withHour(Integer.parseInt(signInStartTime.substring(0, iIndexOf))).withMinute(Integer.parseInt(signInStartTime.substring(iIndexOf + 1))).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
                }
                String signInEndTime = targetBean.getSignInEndTime();
                if (!TextUtils.isEmpty(signInEndTime) && signInEndTime.contains(":")) {
                    int iIndexOf2 = signInEndTime.indexOf(":");
                    targetBean.setEndTimeStamp(LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).withHour(Integer.parseInt(signInEndTime.substring(0, iIndexOf2))).withMinute(Integer.parseInt(signInEndTime.substring(iIndexOf2 + 1))).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
                }
                a7b.f("TargetClockModel", "disposeData startTime:" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", targetBean.getStartTimeStamp())) + "/endTime:" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", targetBean.getEndTimeStamp())));
            }
            ArrayList arrayList = new ArrayList();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<TargetBean> it = list.iterator();
            while (it.hasNext()) {
                TargetBean next = it.next();
                if (next.getStartTimeStamp() > jCurrentTimeMillis) {
                    it.remove();
                    arrayList.add(next);
                }
            }
            list.addAll(arrayList);
        } catch (Exception e2) {
            a7b.b("TargetClockModel", "disposeData e:" + e2.getMessage());
        }
    }

    public void v(TargetBean targetBean, int i, xm3<Boolean> xm3Var) {
        this.f4967j.g(targetBean, i, xm3Var);
    }
}
