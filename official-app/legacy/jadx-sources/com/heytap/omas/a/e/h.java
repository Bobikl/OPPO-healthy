package com.heytap.omas.a.e;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

/* JADX INFO: loaded from: classes19.dex */
public class h {
    private static final String a = "JsonUtils";

    public static <TypeName> TypeName a(String str, Class<TypeName> cls) throws JsonSyntaxException {
        return (TypeName) new GsonBuilder().disableHtmlEscaping().create().fromJson(str, (Class) cls);
    }

    public static <TypeName> String a(TypeName typename, Class<TypeName> cls) {
        return new GsonBuilder().disableHtmlEscaping().create().toJson(typename, cls);
    }
}
