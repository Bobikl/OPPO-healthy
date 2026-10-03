package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class nh5 {
    public static List<UserDeviceInfo> a(List<UserDeviceInfo> list) {
        Iterator<UserDeviceInfo> it = list.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            UserDeviceInfo next = it.next();
            if (!y5e.a(next).B() && !next.isCurrTerminal()) {
                it.remove();
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static void b(List<UserDeviceInfo> list) {
        Iterator<UserDeviceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getDeviceType() == 100) {
                it.remove();
            }
        }
    }
}
