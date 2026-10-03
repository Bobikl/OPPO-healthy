package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.http.HttpUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u000220\u0012,\u0012*\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u0004j\u0014\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u0001`\u00050\u0003:\u0001\u0010B#\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\b\u001a*\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u0004j\u0014\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u0001`\u0005H\u0016J4\u0010\r\u001a&\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004j\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/lh8;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/squareup/moshi/JsonReader;", "reader", "d", "", "toString", "a", "Lcom/squareup/moshi/JsonAdapter;", "keyAdapter", "b", "valueAdapter", "Lcom/squareup/moshi/Moshi;", "moshi", "Ljava/lang/reflect/Type;", f04.JSON_KEY_DIGITAL_KEY_TYPE, "valueType", "<init>", "(Lcom/squareup/moshi/Moshi;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "Companion", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class lh8<K, V> extends JsonAdapter<HashMap<K, V>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final JsonAdapter.Factory f13693c = new JsonAdapter.Factory() { // from class: com.oplus.aiunit.vision.kh8
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
            return lh8.b(type, set, moshi);
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final JsonAdapter<K> keyAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final JsonAdapter<V> valueAdapter;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.lh8$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/lh8$a;", "", "Lcom/squareup/moshi/JsonAdapter$Factory;", "FACTORY", "Lcom/squareup/moshi/JsonAdapter$Factory;", "a", "()Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsonAdapter.Factory a() {
            return lh8.f13693c;
        }
    }

    public lh8(@NotNull Moshi moshi, @Nullable Type type, @Nullable Type type2) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonAdapter<K> jsonAdapterAdapter = moshi.adapter(type);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "moshi.adapter(keyType)");
        this.keyAdapter = jsonAdapterAdapter;
        JsonAdapter<V> jsonAdapterAdapter2 = moshi.adapter(type2);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "moshi.adapter(valueType)");
        this.valueAdapter = jsonAdapterAdapter2;
    }

    public static final JsonAdapter b(Type type, Set annotations, Moshi moshi) {
        Class<?> rawType = Types.getRawType(type);
        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
        if ((!annotations.isEmpty()) || !Intrinsics.areEqual(rawType, HashMap.class)) {
            return null;
        }
        Type[] typeArr = type == Properties.class ? new Type[]{String.class, String.class} : new Type[]{Object.class, Object.class};
        Intrinsics.checkNotNullExpressionValue(moshi, "moshi");
        return new lh8(moshi, typeArr[0], typeArr[1]).nullSafe();
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> fromJson(@NotNull JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        HashMap<K, V> map = new HashMap<>();
        reader.beginObject();
        while (reader.hasNext()) {
            reader.promoteNameToValue();
            K kFromJson = this.keyAdapter.fromJson(reader);
            V vFromJson = this.valueAdapter.fromJson(reader);
            V vPut = map.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new JsonDataException("Map key '" + kFromJson + "' has multiple values at path " + reader.getPath() + ": " + vPut + " and " + vFromJson);
            }
        }
        reader.endObject();
        return map;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull JsonWriter writer, @Nullable HashMap<K, V> value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.beginObject();
        Intrinsics.checkNotNull(value);
        for (Map.Entry<K, V> entry : value.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry, "value!!.entries");
            Map.Entry<K, V> entry2 = entry;
            if (entry2.getKey() == null) {
                throw new JsonDataException("Map key is null at " + writer.getPath());
            }
            writer.promoteValueToName();
            this.keyAdapter.toJson(writer, entry2.getKey());
            this.valueAdapter.toJson(writer, entry2.getValue());
        }
        writer.endObject();
    }

    @NotNull
    public String toString() {
        return "JsonAdapter(" + this.keyAdapter + HttpUtils.EQUAL_SIGN + this.valueAdapter + ")";
    }
}
