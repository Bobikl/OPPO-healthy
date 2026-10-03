package com.oplus.smartenginehelper.dsl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001J*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/oplus/smartenginehelper/dsl/DSLUtils;", "", "()V", "SMART_PACKAGE", "", "getEngineVersionCode", "", "context", "Landroid/content/Context;", "parseEntityPatch", "", "oldJSONObject", "Lorg/json/JSONObject;", "newJSONObject", "patchArray", "Lorg/json/JSONArray;", "parsePatch", "tryReplaceOrAdd", "jsonObject", ParserTag.TAG_ID, Node.I_KEY, "value", "tryReplaceOrAddInternal", "entityObject", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class DSLUtils {

    @NotNull
    public static final DSLUtils INSTANCE = new DSLUtils();

    @NotNull
    public static final String SMART_PACKAGE = "com.oplus.smartengine";

    private DSLUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:106:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x005c A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void parseEntityPatch(JSONObject oldJSONObject, JSONObject newJSONObject, JSONArray patchArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        boolean z = newJSONObject.length() < oldJSONObject.length();
        if (z) {
            patchArray.put(newJSONObject);
            return;
        }
        Iterator<String> itKeys = newJSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                switch (next.hashCode()) {
                    case -1351902487:
                        if (next.equals(ParserTag.TAG_ONCLICK)) {
                            Object objOpt = oldJSONObject.opt(next);
                            Object objOpt2 = newJSONObject.opt(next);
                            if (objOpt != null) {
                                i++;
                            }
                            if (objOpt == null || objOpt2 == null) {
                                if (!Intrinsics.areEqual(objOpt, objOpt2)) {
                                    jSONObject.put(next, objOpt2);
                                }
                            } else if (!Intrinsics.areEqual(objOpt.toString(), objOpt2.toString())) {
                                jSONObject.put(next, objOpt2);
                            }
                        }
                        break;
                    case -99188444:
                        if (next.equals(ParserTag.TAG_SLIVER_ANIM)) {
                            if (oldJSONObject.has(next)) {
                                i++;
                            }
                            JSONObject jSONObjectOptJSONObject = newJSONObject.optJSONObject(next);
                            if (jSONObjectOptJSONObject != null) {
                                jSONObject.put(next, jSONObjectOptJSONObject);
                            }
                        }
                        break;
                    case 3355:
                        if (next.equals(ParserTag.TAG_ID)) {
                            if (oldJSONObject.has(next)) {
                                i++;
                            }
                        }
                        break;
                    case 2998801:
                        if (next.equals(ParserTag.TAG_ANIM)) {
                            if (oldJSONObject.has(next)) {
                                i++;
                            }
                        }
                        break;
                    case 3575610:
                        if (next.equals("type")) {
                            if (oldJSONObject.has(next)) {
                                i++;
                            }
                        }
                        break;
                    case 94631196:
                        if (next.equals(ParserTag.TAG_CHILD)) {
                            if (oldJSONObject.has(next)) {
                                i++;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            Object objOpt3 = oldJSONObject.opt(next);
            Object objOpt4 = newJSONObject.opt(next);
            if (objOpt3 != null) {
                i++;
            }
            if (!Intrinsics.areEqual(objOpt3, objOpt4)) {
                jSONObject.put(next, objOpt4);
            }
        }
        if (oldJSONObject.length() <= i ? z : true) {
            patchArray.put(newJSONObject);
        } else if (jSONObject.length() > 0) {
            jSONObject.put(ParserTag.TAG_ID, newJSONObject.optString(ParserTag.TAG_ID));
            jSONObject.put("type", newJSONObject.optString("type"));
            patchArray.put(jSONObject);
        }
    }

    private final void tryReplaceOrAddInternal(JSONObject entityObject, String id, String key, Object value) throws JSONException {
        if (Intrinsics.areEqual(id, entityObject.optString(ParserTag.TAG_ID))) {
            if (value == null) {
                entityObject.remove(key);
            } else {
                entityObject.put(key, value);
            }
        }
    }

    public final long getEngineVersionCode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            PackageInfo packageInfo = packageManager.getPackageInfo(SMART_PACKAGE, 0);
            if (packageInfo != null) {
                return packageInfo.getLongVersionCode();
            }
        } catch (Exception unused) {
        }
        return -1L;
    }

    public final void parsePatch(@NotNull JSONObject oldJSONObject, @NotNull JSONObject newJSONObject, @NotNull JSONArray patchArray) throws JSONException {
        Intrinsics.checkNotNullParameter(oldJSONObject, "oldJSONObject");
        Intrinsics.checkNotNullParameter(newJSONObject, "newJSONObject");
        Intrinsics.checkNotNullParameter(patchArray, "patchArray");
        parseEntityPatch(oldJSONObject, newJSONObject, patchArray);
        JSONArray jSONArrayOptJSONArray = newJSONObject.optJSONArray(ParserTag.TAG_CHILD);
        JSONArray jSONArrayOptJSONArray2 = oldJSONObject.optJSONArray(ParserTag.TAG_CHILD);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject != null) {
                if (Intrinsics.areEqual(ParserTag.TYPE_CONSTRAINT, jSONObjectOptJSONObject.getString("type")) && Intrinsics.areEqual(ParserTag.TYPE_CONSTRAINT, jSONObjectOptJSONObject2.getString("type"))) {
                    parsePatch(jSONObjectOptJSONObject2, jSONObjectOptJSONObject, patchArray);
                } else {
                    parseEntityPatch(jSONObjectOptJSONObject2, jSONObjectOptJSONObject, patchArray);
                }
            }
        }
    }

    public final void tryReplaceOrAdd(@NotNull JSONObject jsonObject, @NotNull String id, @NotNull String key, @Nullable Object value) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(id, ParserTag.TAG_ID);
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        tryReplaceOrAddInternal(jsonObject, id, key, value);
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(ParserTag.TAG_CHILD);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (Intrinsics.areEqual(ParserTag.TYPE_CONSTRAINT, jSONObjectOptJSONObject.getString("type"))) {
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "entityObject");
                    tryReplaceOrAdd(jSONObjectOptJSONObject, id, key, value);
                } else {
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "entityObject");
                    tryReplaceOrAddInternal(jSONObjectOptJSONObject, id, key, value);
                }
            }
        }
    }
}
