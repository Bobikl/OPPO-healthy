package com.oplus.pantanal.seedling.convertor;

import android.os.Bundle;
import com.oplus.pantanal.seedling.util.Logger;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/JsonToBundleConvertor;", "Lcom/oplus/pantanal/seedling/convertor/IConvertor;", "Lorg/json/JSONObject;", "Landroid/os/Bundle;", "()V", "from", "data", "to", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJsonToBundleConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonToBundleConvertor.kt\ncom/oplus/pantanal/seedling/convertor/JsonToBundleConvertor\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n32#2,2:74\n1855#3,2:76\n*S KotlinDebug\n*F\n+ 1 JsonToBundleConvertor.kt\ncom/oplus/pantanal/seedling/convertor/JsonToBundleConvertor\n*L\n27#1:74,2\n64#1:76,2\n*E\n"})
public final class JsonToBundleConvertor implements IConvertor<JSONObject, Bundle> {
    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public Bundle to(@NotNull JSONObject data) throws JSONException {
        Object obj;
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = data.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj2 = data.get(next);
            if (obj2 instanceof String) {
                bundle.putString(next, (String) obj2);
            } else if (obj2 instanceof Boolean) {
                bundle.putBoolean(next, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof Integer) {
                bundle.putInt(next, ((Number) obj2).intValue());
            } else if (obj2 instanceof Long) {
                bundle.putLong(next, ((Number) obj2).longValue());
            } else if (obj2 instanceof Float) {
                bundle.putFloat(next, ((Number) obj2).floatValue());
            } else if (obj2 instanceof Double) {
                bundle.putDouble(next, ((Number) obj2).doubleValue());
            } else if (obj2 instanceof JSONObject) {
                bundle.putBundle(next, (Bundle) ConvertorFactory.INSTANCE.get(JsonToBundleConvertor.class).to(obj2));
            } else if (obj2 instanceof JSONArray) {
                bundle.putString(next, obj2.toString());
                Logger.INSTANCE.i("JsonToBundleConvertor", " JsonToBundleConvertor is not support JSONArray, JSONArray convert to String");
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    bundle.putString(next, obj2.toString());
                    Logger.INSTANCE.i("JsonToBundleConvertor", "JsonToBundleConvertor is not support type, convert to String");
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    Logger.INSTANCE.i("JsonToBundleConvertor error", th2.toString());
                }
            }
        }
        return bundle;
    }

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public JSONObject from(@NotNull Bundle data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        Set<String> setKeySet = data.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Object objFrom = data.get(str);
            if (objFrom instanceof Bundle) {
                objFrom = ConvertorFactory.INSTANCE.get(JsonToBundleConvertor.class).from(objFrom);
            }
            jSONObject.put(str, JSONObject.wrap(objFrom));
        }
        return jSONObject;
    }
}
