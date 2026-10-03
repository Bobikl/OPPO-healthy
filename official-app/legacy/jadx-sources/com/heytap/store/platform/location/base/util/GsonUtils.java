package com.heytap.store.platform.location.base.util;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/store/platform/location/base/util/GsonUtils;", "", "()V", "Companion", "location_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GsonUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Gson gson = new Gson();

    @NotNull
    private static final JsonParser jsonParser = new JsonParser();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J%\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ.\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0014\"\u0004\b\u0000\u0010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0017J-\u0010\u0018\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aJ-\u0010\u0018\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0017¢\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/heytap/store/platform/location/base/util/GsonUtils$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "jsonParser", "Lcom/google/gson/JsonParser;", "GsonUtils", "", "fromJsonString", ExifInterface.GPS_DIRECTION_TRUE, "json", "", "typeOfT", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "isJSONValid", "", "jsonInString", "jsonToList", "", "gsonString", "cls", "Ljava/lang/Class;", "jsonToObject", "object", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "toJsonString", "location_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void GsonUtils() {
            throw new AssertionError();
        }

        public final <T> T fromJsonString(@Nullable String json, @Nullable Type typeOfT) {
            return (T) GsonUtils.gson.fromJson(json, typeOfT);
        }

        public final boolean isJSONValid(@Nullable String jsonInString) {
            try {
                GsonUtils.gson.fromJson(jsonInString, Object.class);
                return true;
            } catch (JsonSyntaxException unused) {
                return false;
            }
        }

        @Nullable
        public final <T> List<T> jsonToList(@Nullable String gsonString, @Nullable Class<T> cls) {
            if (TextUtils.isEmpty(gsonString)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = GsonUtils.jsonParser.parse(gsonString).getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(GsonUtils.gson.fromJson(it.next(), (Class) cls));
            }
            return arrayList;
        }

        @Nullable
        public final <T> T jsonToObject(@Nullable String json, @Nullable Class<T> cls) {
            try {
                return (T) GsonUtils.gson.fromJson(json, (Class) cls);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        @Nullable
        public final String toJsonString(@Nullable Object object) {
            return GsonUtils.gson.toJson(object);
        }

        @Nullable
        public final String toJsonString(@Nullable Object object, @Nullable Type typeOfT) {
            return GsonUtils.gson.toJson(object, typeOfT);
        }

        @Nullable
        public final <T> T jsonToObject(@Nullable Object object, @Nullable Class<T> cls) {
            try {
                return (T) GsonUtils.gson.fromJson(toJsonString(object), (Class) cls);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }
}
