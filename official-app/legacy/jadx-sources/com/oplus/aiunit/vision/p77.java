package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes18.dex */
public class p77 implements pka {
    public static p77 INSTANCE = new p77();

    @Override // com.oplus.aiunit.vision.pka
    public String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new Gson().toJson(obj);
    }

    @Override // com.oplus.aiunit.vision.pka
    public <T> T b(String str, Type type) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) new Gson().fromJson(str, type);
        } catch (Exception unused) {
            return null;
        }
    }
}
