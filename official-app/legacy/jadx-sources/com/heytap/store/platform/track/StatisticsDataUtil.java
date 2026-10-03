package com.heytap.store.platform.track;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0002¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/platform/track/StatisticsDataUtil;", "", "()V", "bundleToJson", "Lorg/json/JSONObject;", "bundle", "Landroid/os/Bundle;", "checkType", "key", "", "value", "handleStatisticsEventDataToBundle", ExifInterface.GPS_DIRECTION_TRUE, "eventData", "Lcom/heytap/store/platform/track/EventData;", "handleStatisticsEventDataToJSONObject", "jsonToBundle", "jsonObject", "mapToBundle", "map", "", "mapToJson", "stringToJson", "jsonStr", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StatisticsDataUtil {

    @NotNull
    public static final StatisticsDataUtil INSTANCE = new StatisticsDataUtil();

    private StatisticsDataUtil() {
    }

    private final JSONObject bundleToJson(Bundle bundle) throws JSONException {
        Set<String> keySet = bundle.keySet();
        JSONObject jSONObject = new JSONObject();
        Intrinsics.checkNotNullExpressionValue(keySet, "keySet");
        for (String str : keySet) {
            jSONObject.put(str, bundle.get(str));
        }
        return jSONObject;
    }

    private final Bundle checkType(String key, Object value) {
        Bundle bundle = new Bundle();
        if (value != null) {
            if (value instanceof IBinder) {
                bundle.putBinder(key, (IBinder) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Bundle) {
                bundle.putBundle(key, (Bundle) value);
            } else if (value instanceof Byte) {
                bundle.putByte(key, ((Number) value).byteValue());
            } else if (value instanceof Character) {
                bundle.putChar(key, ((Character) value).charValue());
            } else if (value instanceof CharSequence) {
                bundle.putCharSequence(key, (CharSequence) value);
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Float) {
                bundle.putFloat(key, ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                bundle.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Parcelable) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Short) {
                bundle.putShort(key, ((Number) value).shortValue());
            } else if (value instanceof Size) {
                bundle.putSize(key, (Size) value);
            } else if (value instanceof SizeF) {
                bundle.putSizeF(key, (SizeF) value);
            } else if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Serializable) {
                Log.w("StatisticsDataUtil", Intrinsics.stringPlus("Warning: using Serializable for bundling value of class ", value.getClass()));
                bundle.putSerializable(key, (Serializable) value);
            } else {
                if (!(value instanceof PersistableBundle)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot put to bundle, unsupported type: ", value.getClass()));
                }
                bundle.putAll((PersistableBundle) value);
            }
        }
        return bundle;
    }

    private final Bundle jsonToBundle(JSONObject jsonObject) {
        Iterator<String> keys = jsonObject.keys();
        Bundle bundle = new Bundle();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            StatisticsDataUtil statisticsDataUtil = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            bundle.putAll(statisticsDataUtil.checkType(key, jsonObject.get(key)));
        }
        return bundle;
    }

    private final Bundle mapToBundle(Map<?, ?> map) {
        Set<?> setKeySet = map.keySet();
        Bundle bundle = new Bundle();
        for (Object obj : setKeySet) {
            if (obj instanceof String) {
                bundle.putAll(INSTANCE.checkType((String) obj, map.get(obj)));
            }
        }
        return bundle;
    }

    private final JSONObject mapToJson(Map<?, ?> map) throws JSONException {
        Set<?> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        for (Object obj : setKeySet) {
            if (obj instanceof String) {
                jSONObject.put((String) obj, map.get(obj));
            }
        }
        return jSONObject;
    }

    private final JSONObject stringToJson(String jsonStr) {
        return new JSONObject(jsonStr);
    }

    @Nullable
    public final <T> Bundle handleStatisticsEventDataToBundle(@NotNull EventData<T> eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        try {
            T data = eventData.getData();
            if (data instanceof JSONObject) {
                return jsonToBundle((JSONObject) data);
            }
            if (data instanceof Bundle) {
                return (Bundle) data;
            }
            return data instanceof Map ? mapToBundle((Map) data) : new Bundle();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final <T> JSONObject handleStatisticsEventDataToJSONObject(@NotNull EventData<T> eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        try {
            T data = eventData.getData();
            if (data instanceof JSONObject) {
                return (JSONObject) data;
            }
            if (data instanceof Bundle) {
                return bundleToJson((Bundle) data);
            }
            if (data instanceof Map) {
                return mapToJson((Map) data);
            }
            return data instanceof String ? stringToJson((String) data) : new JSONObject();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
