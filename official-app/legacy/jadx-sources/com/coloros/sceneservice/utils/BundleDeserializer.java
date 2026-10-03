package com.coloros.sceneservice.utils;

import android.os.Bundle;
import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeReader;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class BundleDeserializer implements JsonDeserializer {
    public static final String TAG = "BundleDeserializer";

    private Bundle a(JsonElement jsonElement) {
        Set<Map.Entry<String, JsonElement>> setEntrySet = jsonElement.getAsJsonObject().entrySet();
        Bundle bundle = new Bundle(setEntrySet.size());
        for (Map.Entry<String, JsonElement> entry : setEntrySet) {
            String key = entry.getKey();
            if (key != null) {
                JsonElement value = entry.getValue();
                if (value.isJsonArray()) {
                    bundle.putParcelableArray(key, b(value));
                } else if (value.isJsonObject()) {
                    bundle.putBundle(key, a(value));
                } else if (value.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = value.getAsJsonPrimitive();
                    if (asJsonPrimitive.isBoolean()) {
                        bundle.putBoolean(key, asJsonPrimitive.getAsBoolean());
                    } else if (asJsonPrimitive.isString() || asJsonPrimitive.isNumber()) {
                        bundle.putString(key, asJsonPrimitive.getAsString());
                    }
                }
            }
        }
        return bundle;
    }

    private Bundle[] b(JsonElement jsonElement) {
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        int size = asJsonArray.size();
        Bundle[] bundleArr = new Bundle[size];
        for (int i = 0; i < size; i++) {
            JsonElement jsonElement2 = asJsonArray.get(i);
            if (jsonElement2.isJsonObject()) {
                bundleArr[i] = a(jsonElement2);
            } else {
                Log.e(TAG, new JsonTreeReader(jsonElement2).getPath() + " is not json object.");
            }
        }
        return bundleArr;
    }

    @Override // com.google.gson.JsonDeserializer
    public Bundle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            return a(jsonElement);
        }
        return null;
    }
}
