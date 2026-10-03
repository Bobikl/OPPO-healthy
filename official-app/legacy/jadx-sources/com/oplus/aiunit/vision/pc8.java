package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class pc8<T> implements ma4<cuf, T> {
    public final Gson a;
    public final TypeAdapter<T> b;

    public pc8(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // com.oplus.aiunit.vision.ma4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(cuf cufVar) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.a.newJsonReader(cufVar.h());
        try {
            T t = this.b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            cufVar.close();
            return t;
        } catch (Throwable th) {
            cufVar.close();
            throw th;
        }
    }
}
