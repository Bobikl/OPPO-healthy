package com.squareup.moshi;

import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes10.dex */
public abstract class JsonAdapter<T> {

    public interface Factory {
        @CheckReturnValue
        @Nullable
        JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi);
    }

    @CheckReturnValue
    public final JsonAdapter<T> failOnUnknown() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.3
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean zFailOnUnknown = jsonReader.failOnUnknown();
                jsonReader.setFailOnUnknown(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setFailOnUnknown(zFailOnUnknown);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return this.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, @Nullable T t) throws IOException {
                this.toJson(jsonWriter, t);
            }

            public String toString() {
                return this + ".failOnUnknown()";
            }
        };
    }

    @CheckReturnValue
    @Nullable
    public abstract T fromJson(JsonReader jsonReader) throws IOException;

    @CheckReturnValue
    @Nullable
    public final T fromJson(BufferedSource bufferedSource) throws IOException {
        return fromJson(JsonReader.of(bufferedSource));
    }

    @CheckReturnValue
    @Nullable
    public final T fromJsonValue(@Nullable Object obj) {
        try {
            return fromJson(new JsonValueReader(obj));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @CheckReturnValue
    public JsonAdapter<T> indent(final String str) {
        if (str != null) {
            return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.4
                @Override // com.squareup.moshi.JsonAdapter
                @Nullable
                public T fromJson(JsonReader jsonReader) throws IOException {
                    return (T) this.fromJson(jsonReader);
                }

                @Override // com.squareup.moshi.JsonAdapter
                public boolean isLenient() {
                    return this.isLenient();
                }

                @Override // com.squareup.moshi.JsonAdapter
                public void toJson(JsonWriter jsonWriter, @Nullable T t) throws IOException {
                    String indent = jsonWriter.getIndent();
                    jsonWriter.setIndent(str);
                    try {
                        this.toJson(jsonWriter, t);
                    } finally {
                        jsonWriter.setIndent(indent);
                    }
                }

                public String toString() {
                    return this + ".indent(\"" + str + "\")";
                }
            };
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    @CheckReturnValue
    public final JsonAdapter<T> lenient() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.2
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean zIsLenient = jsonReader.isLenient();
                jsonReader.setLenient(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setLenient(zIsLenient);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return true;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, @Nullable T t) throws IOException {
                boolean zIsLenient = jsonWriter.isLenient();
                jsonWriter.setLenient(true);
                try {
                    this.toJson(jsonWriter, t);
                } finally {
                    jsonWriter.setLenient(zIsLenient);
                }
            }

            public String toString() {
                return this + ".lenient()";
            }
        };
    }

    @CheckReturnValue
    public final JsonAdapter<T> nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    @CheckReturnValue
    public final JsonAdapter<T> nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    @CheckReturnValue
    public final JsonAdapter<T> serializeNulls() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.1
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public T fromJson(JsonReader jsonReader) throws IOException {
                return (T) this.fromJson(jsonReader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return this.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, @Nullable T t) throws IOException {
                boolean serializeNulls = jsonWriter.getSerializeNulls();
                jsonWriter.setSerializeNulls(true);
                try {
                    this.toJson(jsonWriter, t);
                } finally {
                    jsonWriter.setSerializeNulls(serializeNulls);
                }
            }

            public String toString() {
                return this + ".serializeNulls()";
            }
        };
    }

    public abstract void toJson(JsonWriter jsonWriter, @Nullable T t) throws IOException;

    public final void toJson(BufferedSink bufferedSink, @Nullable T t) throws IOException {
        toJson(JsonWriter.of(bufferedSink), t);
    }

    @CheckReturnValue
    @Nullable
    public final Object toJsonValue(@Nullable T t) {
        JsonValueWriter jsonValueWriter = new JsonValueWriter();
        try {
            toJson(jsonValueWriter, t);
            return jsonValueWriter.root();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @CheckReturnValue
    @Nullable
    public final T fromJson(String str) throws IOException {
        JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(str));
        T tFromJson = fromJson(jsonReaderOf);
        if (isLenient() || jsonReaderOf.peek() == JsonReader.Token.END_DOCUMENT) {
            return tFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    @CheckReturnValue
    public final String toJson(@Nullable T t) {
        Buffer buffer = new Buffer();
        try {
            toJson(buffer, t);
            return buffer.readUtf8();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
