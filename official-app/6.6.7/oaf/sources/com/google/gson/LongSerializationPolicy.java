package com.google.gson;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l.toString());
        }
    };

    public abstract JsonElement serialize(Long l);
}
