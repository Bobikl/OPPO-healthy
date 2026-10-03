package com.heytap.accessory.connectivity.params;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a extends c {
    public com.heytap.accessory.connectivity.ble.bean.b b;
    public com.heytap.accessory.connectivity.ble.bean.c c = null;
    public com.heytap.accessory.connectivity.ble.bean.c d = null;

    @Override // com.heytap.accessory.connectivity.params.c
    public void a(int i) {
        if (i == 1) {
            this.b = new com.heytap.accessory.connectivity.ble.bean.b("0000bb15-0000-1000-8000-00805f9b34fb");
            this.c = new com.heytap.accessory.connectivity.ble.bean.c("0000bb16-0000-1000-8000-00805f9b34fb");
            this.d = new com.heytap.accessory.connectivity.ble.bean.c("0000bb17-0000-1000-8000-00805f9b34fb");
        } else {
            this.b = new com.heytap.accessory.connectivity.ble.bean.b("0000aa15-0000-1000-8000-00805f9b34fb");
            this.c = new com.heytap.accessory.connectivity.ble.bean.c("0000aa16-0000-1000-8000-00805f9b34fb");
            this.d = new com.heytap.accessory.connectivity.ble.bean.c("0000aa17-0000-1000-8000-00805f9b34fb");
        }
        this.b.a(this.c);
        this.b.a(this.d);
        if (i == 1) {
            this.c.a("0000bb18-0000-1000-8000-00805f9b34fb");
        } else {
            this.c.a("0000aa18-0000-1000-8000-00805f9b34fb");
        }
    }

    public com.heytap.accessory.connectivity.ble.bean.c b() {
        return this.c;
    }

    public com.heytap.accessory.connectivity.ble.bean.c c() {
        return this.d;
    }

    @Override // com.heytap.accessory.connectivity.params.c
    public String a() {
        com.heytap.accessory.connectivity.ble.bean.b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        List<com.heytap.accessory.connectivity.ble.bean.c> listA = bVar.a();
        if (listA.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (com.heytap.accessory.connectivity.ble.bean.c cVar : listA) {
            List<com.heytap.accessory.connectivity.ble.bean.d> listA2 = cVar.a();
            try {
                if (listA2.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(cVar.b(), JSONObject.NULL);
                    jSONArray.put(jSONObject2);
                } else {
                    for (com.heytap.accessory.connectivity.ble.bean.d dVar : listA2) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(cVar.b(), dVar.a());
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put(this.b.b(), jSONArray);
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.e("BleConnectionParam", "params2String failed");
            }
        }
        return jSONObject.toString();
    }

    public c a(String str) {
        try {
            ArrayMap arrayMap = new ArrayMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            if (!itKeys.hasNext()) {
                return null;
            }
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Iterator<String> itKeys2 = jSONObject2.keys();
                if (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    Object obj = jSONObject2.get(next2);
                    if (obj.equals(JSONObject.NULL)) {
                        arrayMap.put(next2, null);
                    } else {
                        List arrayList = (List) arrayMap.get(next2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap.put(next2, arrayList);
                        }
                        arrayList.add((String) obj);
                    }
                }
            }
            com.heytap.accessory.connectivity.ble.bean.b bVar = new com.heytap.accessory.connectivity.ble.bean.b(next);
            for (Map.Entry entry : arrayMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List<String> list = (List) entry.getValue();
                com.heytap.accessory.connectivity.ble.bean.c cVar = new com.heytap.accessory.connectivity.ble.bean.c(str2);
                if (list != null) {
                    cVar.a(list);
                }
                bVar.a(cVar);
            }
            this.b = bVar;
        } catch (JSONException e) {
            com.heytap.accessory.base.logging.a.b("BleConnectionParam", "fromString JSONException," + e);
        }
        return this;
    }
}
