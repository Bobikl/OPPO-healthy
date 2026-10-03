package com.lifesense.device.scale.infrastructure.repository;

import com.lifesense.device.scale.context.LDAppHolder;
import com.lifesense.device.scale.data.entity.DeviceDao;
import com.lifesense.device.scale.infrastructure.entity.Device;
import com.oplus.aiunit.vision.h5f;
import com.oplus.aiunit.vision.kvl;
import com.oplus.aiunit.vision.yye;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a {
    public Device a(String str) {
        Device deviceLoad = a.a().getDeviceDao().load(str.toLowerCase());
        return deviceLoad == null ? a.a().getDeviceDao().load(str.toUpperCase()) : deviceLoad;
    }

    public Device b(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String strReplaceAll = str.replaceAll(":", "");
        h5f<Device> h5fVarQueryBuilder = a.a().getDeviceDao().queryBuilder();
        h5fVarQueryBuilder.o(DeviceDao.Properties.Mac.a(strReplaceAll), new kvl[0]);
        List<Device> listL = h5fVarQueryBuilder.l();
        if (CollectionUtils.isEmpty(listL)) {
            return null;
        }
        return listL.get(0);
    }

    public List<Device> a(long j2) {
        try {
            h5f<Device> h5fVarQueryBuilder = a.a().getDeviceDao().queryBuilder();
            h5fVarQueryBuilder.o(DeviceDao.Properties.UserId.a(Long.valueOf(j2)), new kvl[0]);
            return h5fVarQueryBuilder.l();
        } catch (Exception e2) {
            e2.printStackTrace();
            return Collections.emptyList();
        }
    }

    public void b(List<Device> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<Device> it = list.iterator();
            while (it.hasNext()) {
                it.next().setUserId(Long.valueOf(LDAppHolder.getUserId()));
            }
            a.a().getDeviceDao().insertOrReplaceInTx(list);
        }
    }

    public List<Device> a(long j2, d<Device> dVar) {
        List<Device> listA = a(j2);
        if (CollectionUtils.isEmpty(listA)) {
            return Collections.emptyList();
        }
        Iterator<Device> it = listA.iterator();
        while (it.hasNext()) {
            if (!dVar.a(it.next())) {
                it.remove();
            }
        }
        return listA;
    }

    public void a(Device device) {
        device.setUserId(Long.valueOf(LDAppHolder.getUserId()));
        a.a().getDeviceDao().insertOrReplace(device);
    }

    public void a(String str, long j2) {
        h5f<Device> h5fVarQueryBuilder = a.a().getDeviceDao().queryBuilder();
        yye yyeVar = DeviceDao.Properties.Id;
        h5fVarQueryBuilder.o(yyeVar.a(str.toLowerCase()), new kvl[0]).d().d();
        h5fVarQueryBuilder.o(yyeVar.a(str.toUpperCase()), new kvl[0]).d().d();
        com.lifesense.device.scale.utils.c.a(str);
    }

    public void a(List<Device> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<Device> it = list.iterator();
            while (it.hasNext()) {
                it.next().setUserId(Long.valueOf(LDAppHolder.getUserId()));
            }
            a.a().getDeviceDao().deleteInTx(list);
        }
    }
}
