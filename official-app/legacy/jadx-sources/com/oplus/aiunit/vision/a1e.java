package com.oplus.aiunit.vision;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes15.dex */
public class a1e {
    public static Gson a = new GsonBuilder().addSerializationExclusionStrategy(new a()).create();

    public class a implements ExclusionStrategy {
        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            String name = fieldAttributes.getName();
            return "memoizedSerializedSize".equals(name) || "unknownFields".equals(name) || "memoizedHashCode".equals(name) || "byteIcon_".equals(name) || "icon_".equals(name) || "stateMemoizedSerializedSize".equals(name);
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase();
            if (upperCase.length() < 2) {
                sb.append(0);
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    public static String b(Object obj) {
        return a.toJson(obj);
    }
}
