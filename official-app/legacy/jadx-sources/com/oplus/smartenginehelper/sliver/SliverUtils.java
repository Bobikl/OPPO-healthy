package com.oplus.smartenginehelper.sliver;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¨\u0006\u000b"}, d2 = {"Lcom/oplus/smartenginehelper/sliver/SliverUtils;", "", "()V", "tryReplaceOrAdd", "", "jsonArray", "Lorg/json/JSONArray;", "id", "", "key", "value", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class SliverUtils {

    @NotNull
    public static final SliverUtils INSTANCE = new SliverUtils();

    private SliverUtils() {
    }

    public final void tryReplaceOrAdd(@NotNull JSONArray jsonArray, @NotNull String id, @NotNull String key, @NotNull Object value) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i);
            jSONObjectOptJSONObject.getString("type");
            if (Intrinsics.areEqual(id, jSONObjectOptJSONObject.optString("id"))) {
                if (Intrinsics.areEqual(ParserTag.TAG_ONCLICK, key)) {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(key);
                    if (jSONArrayOptJSONArray != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                i2 = -1;
                                break;
                            }
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 != null && Intrinsics.areEqual("activity", jSONObjectOptJSONObject2.optString("type"))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i2 == -1) {
                            jSONArrayOptJSONArray.put(value);
                        } else {
                            jSONArrayOptJSONArray.put(i2, value);
                        }
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(value);
                        jSONObjectOptJSONObject.put(key, jSONArray);
                    }
                } else {
                    jSONObjectOptJSONObject.put(key, value);
                }
            }
        }
    }
}
