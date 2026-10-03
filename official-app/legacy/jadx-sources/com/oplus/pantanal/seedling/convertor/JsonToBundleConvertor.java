package com.oplus.pantanal.seedling.convertor;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.pantanal.seedling.util.Logger;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/JsonToBundleConvertor;", "Lcom/oplus/pantanal/seedling/convertor/IConvertor;", "Lorg/json/JSONObject;", "Landroid/os/Bundle;", "()V", "from", "data", TypedValues.TransitionType.S_TO, "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJsonToBundleConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonToBundleConvertor.kt\ncom/oplus/pantanal/seedling/convertor/JsonToBundleConvertor\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n32#2,2:74\n1855#3,2:76\n*S KotlinDebug\n*F\n+ 1 JsonToBundleConvertor.kt\ncom/oplus/pantanal/seedling/convertor/JsonToBundleConvertor\n*L\n27#1:74,2\n64#1:76,2\n*E\n"})
public final class JsonToBundleConvertor implements IConvertor<JSONObject, Bundle> {
    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public Bundle to(@NotNull JSONObject data) throws JSONException {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = data.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = data.get(next);
            if (obj instanceof String) {
                bundle.putString(next, (String) obj);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(next, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                bundle.putBundle(next, (Bundle) ConvertorFactory.INSTANCE.get(JsonToBundleConvertor.class).to(obj));
            } else if (obj instanceof JSONArray) {
                bundle.putString(next, obj.toString());
                Logger.INSTANCE.i("JsonToBundleConvertor", " JsonToBundleConvertor is not support JSONArray, JSONArray convert to String");
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    bundle.putString(next, obj.toString());
                    Logger.INSTANCE.i("JsonToBundleConvertor", "JsonToBundleConvertor is not support type, convert to String");
                    objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    Logger.INSTANCE.i("JsonToBundleConvertor error", thM5290exceptionOrNullimpl.toString());
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
