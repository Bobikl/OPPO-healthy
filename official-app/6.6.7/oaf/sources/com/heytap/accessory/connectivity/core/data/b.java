package com.heytap.accessory.connectivity.core.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public Map<String, com.heytap.accessory.base.bean.b> a = new ConcurrentHashMap();

    public void a(com.heytap.accessory.base.bean.b bVar) {
        this.a.put(bVar.d() + "&" + bVar.h() + "&" + bVar.F(), bVar);
    }

    public com.heytap.accessory.base.bean.b b(com.heytap.accessory.base.bean.b bVar) {
        return this.a.get(bVar.d() + "&" + bVar.h() + "&" + bVar.F());
    }

    public boolean c(com.heytap.accessory.base.bean.b bVar) {
        for (com.heytap.accessory.base.bean.b bVar2 : this.a.values()) {
            if (bVar2 != null && bVar.d().equals(bVar2.d()) && bVar.h() == bVar2.h() && bVar.F() == bVar2.F() && bVar2.I()) {
                return true;
            }
        }
        return false;
    }

    public com.heytap.accessory.base.bean.b d(com.heytap.accessory.base.bean.b bVar) {
        return this.a.remove(bVar.d() + "&" + bVar.h() + "&" + bVar.F());
    }

    public com.heytap.accessory.base.bean.b a(String str, int i, int i2) {
        return this.a.get(str + "&" + i + "&" + i2);
    }

    public com.heytap.accessory.base.bean.b a(long j) {
        for (Map.Entry<String, com.heytap.accessory.base.bean.b> entry : this.a.entrySet()) {
            if (entry.getValue().l() == j) {
                return entry.getValue();
            }
        }
        return null;
    }

    public List<com.heytap.accessory.base.bean.b> a(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.a.keySet().iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split("&");
            com.heytap.accessory.base.bean.b bVarA = a(strArrSplit[0], Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
            if (bVarA != null && i == bVarA.h()) {
                arrayList.add(bVarA);
            }
        }
        return arrayList;
    }
}
