package com.heytap.health.watchface.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.devicemanager.lock.LockList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DeepCloneUtils {
    public static <T> T a(T t, Class<T> cls) {
        Gson gson = new Gson();
        return (T) gson.fromJson(gson.toJson(t), (Class) cls);
    }

    public static <T> ArrayList<T> b(List<T> list, Class<T> cls) {
        Gson gson = new Gson();
        ArrayList arrayList = (ArrayList) gson.fromJson(gson.toJson(list), new TypeToken<ArrayList<JsonObject>>() { // from class: com.heytap.health.watchface.utils.DeepCloneUtils.1
        }.getType());
        LockList lockList = (ArrayList<T>) new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lockList.add(gson.fromJson((JsonElement) it.next(), (Class) cls));
        }
        return lockList;
    }
}
