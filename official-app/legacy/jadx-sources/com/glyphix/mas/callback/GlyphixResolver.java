package com.glyphix.mas.callback;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public interface GlyphixResolver {
    Integer onFailed(JSONObject jSONObject);

    default Integer onProgress(JSONObject jSONObject) {
        return 0;
    }

    Integer onSuccess(JSONObject jSONObject);

    default Integer retry() {
        return 3;
    }

    default Integer timeout() {
        return 5000;
    }
}
