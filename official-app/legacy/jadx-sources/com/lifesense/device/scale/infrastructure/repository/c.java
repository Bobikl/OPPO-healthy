package com.lifesense.device.scale.infrastructure.repository;

import android.util.Log;
import com.lifesense.device.scale.data.entity.DeviceSettingDao;
import com.lifesense.device.scale.infrastructure.entity.DeviceSetting;
import com.oplus.aiunit.vision.h5f;
import com.oplus.aiunit.vision.kvl;
import com.oplus.aiunit.vision.yye;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/* JADX INFO: loaded from: classes4.dex */
public class c extends a {
    public DeviceSetting a(String str, String str2) {
        List<DeviceSetting> listL;
        try {
            h5f<DeviceSetting> h5fVarQueryBuilder = a.a().getDeviceSettingDao().queryBuilder();
            kvl kvlVarA = DeviceSettingDao.Properties.DeviceId.a(str);
            yye yyeVar = DeviceSettingDao.Properties.SettingTime;
            h5fVarQueryBuilder.o(kvlVarA, DeviceSettingDao.Properties.SettingClass.a(str2), DeviceSettingDao.Properties.Deleted.a(Boolean.FALSE), yyeVar.b(Long.valueOf(System.currentTimeMillis()))).n(yyeVar).k(1);
            listL = h5fVarQueryBuilder.l();
        } catch (Exception e2) {
            Log.e("DeviceSettingRepository", e2.getMessage());
            listL = null;
        }
        if (CollectionUtils.isEmpty(listL)) {
            return null;
        }
        return listL.get(0);
    }

    public void a(DeviceSetting deviceSetting) {
        a.a().getDeviceSettingDao().insertOrReplace(deviceSetting);
    }

    public void a(String str) {
        a.a().getDeviceSettingDao().queryBuilder().o(DeviceSettingDao.Properties.Id.a(str), new kvl[0]).d().d();
    }

    public void a(String str, long j2) {
        a.a().getDeviceSettingDao().queryBuilder().o(DeviceSettingDao.Properties.DeviceId.a(str), new kvl[0]).d().d();
    }

    public void a(List<DeviceSetting> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        for (DeviceSetting deviceSetting : list) {
            DeviceSetting deviceSettingA = a(deviceSetting.getDeviceId(), deviceSetting.getSettingClass());
            a(deviceSetting);
            if (deviceSettingA != null) {
                deviceSettingA.getSettingTime();
                deviceSetting.getSettingTime();
            }
        }
    }
}
