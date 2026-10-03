package com.coloros.sceneservice.utils;

import android.os.Bundle;
import com.coloros.sceneservice.m.h;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class BundleSerializer implements JsonSerializer {
    @Override // com.google.gson.JsonSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonElement serialize(Bundle bundle, Type type, JsonSerializationContext jsonSerializationContext) {
        if (bundle == null || bundle.size() <= 0) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        JsonObject jsonObject = new JsonObject();
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            if (obj instanceof Number) {
                jsonObject.addProperty(str, (Number) obj);
            } else if (obj instanceof String) {
                jsonObject.addProperty(str, (String) obj);
            } else if (obj instanceof Boolean) {
                jsonObject.addProperty(str, (Boolean) obj);
            } else if (obj instanceof boolean[]) {
                JsonArray jsonArray = new JsonArray();
                for (boolean z : (boolean[]) obj) {
                    jsonArray.add(Boolean.valueOf(z));
                }
                jsonObject.add(str, jsonArray);
            } else if (obj instanceof ArrayList) {
                jsonObject.add(str, new JsonParser().parse(h.b(obj)));
            }
        }
        return jsonObject;
    }
}
