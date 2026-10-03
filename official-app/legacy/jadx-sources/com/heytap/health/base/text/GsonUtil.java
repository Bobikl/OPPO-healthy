package com.heytap.health.base.text;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.oplus.aiunit.vision.a7b;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class GsonUtil {

    public static final class MapTypeAdapter extends TypeAdapter<Object> {
        public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.heytap.health.base.text.GsonUtil.MapTypeAdapter.1
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Map.class) {
                    return new MapTypeAdapter(gson);
                }
                return null;
            }
        };
        public final Gson a;

        public MapTypeAdapter(Gson gson) {
            this.a = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Object read2(JsonReader jsonReader) throws IOException {
            switch (a.a[jsonReader.peek().ordinal()]) {
                case 1:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(read2(jsonReader));
                    }
                    jsonReader.endArray();
                    return arrayList;
                case 2:
                    LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        linkedTreeMap.put(jsonReader.nextName(), read2(jsonReader));
                    }
                    jsonReader.endObject();
                    return linkedTreeMap;
                case 3:
                    return jsonReader.nextString();
                case 4:
                    String strNextString = jsonReader.nextString();
                    return (strNextString.contains(".") || strNextString.contains(MapSchema.FIELD_NAME_ENTRY) || strNextString.contains(ExifInterface.LONGITUDE_EAST)) ? Double.valueOf(Double.parseDouble(strNextString)) : Long.valueOf(Long.parseLong(strNextString));
                case 5:
                    return Boolean.valueOf(jsonReader.nextBoolean());
                case 6:
                    jsonReader.nextNull();
                    return null;
                default:
                    throw new IllegalStateException();
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            TypeAdapter adapter = this.a.getAdapter(obj.getClass());
            if (!(adapter instanceof ObjectTypeAdapter)) {
                adapter.write(jsonWriter, obj);
            } else {
                jsonWriter.beginObject();
                jsonWriter.endObject();
            }
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        try {
            return (T) new Gson().fromJson(str, (Class) cls);
        } catch (Exception e2) {
            a7b.b("GsonUtil", e2.getMessage());
            return null;
        }
    }

    public static <T> T b(String str, Type type) {
        try {
            return (T) new Gson().fromJson(str, type);
        } catch (JsonSyntaxException e2) {
            a7b.b("GsonUtil", e2.getMessage());
            return null;
        }
    }

    @Nullable
    public static <T> List<T> c(String str, Class cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (List) new Gson().fromJson(str, new GsonListType(cls));
        } catch (JsonSyntaxException e2) {
            a7b.b("GsonUtil", e2.getMessage());
            return null;
        }
    }

    public static <K, V> HashMap<K, V> d(String str, Class<K> cls, Class<V> cls2) {
        return (HashMap) new Gson().fromJson(str, TypeToken.getParameterized(HashMap.class, cls, cls2).getType());
    }

    public static String e(Object obj) {
        return new Gson().toJson(obj);
    }

    public static Map f(String str) {
        return (Map) new GsonBuilder().registerTypeAdapterFactory(MapTypeAdapter.FACTORY).create().fromJson(str, Map.class);
    }
}
