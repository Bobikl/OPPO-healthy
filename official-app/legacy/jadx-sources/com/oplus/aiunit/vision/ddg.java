package com.oplus.aiunit.vision;

import java.io.IOException;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes11.dex */
public final class ddg<T> implements ma4<T, gqf> {
    public static final ddg<Object> a = new ddg<>();
    public static final MediaType b = MediaType.get("text/plain; charset=UTF-8");

    @Override // com.oplus.aiunit.vision.ma4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gqf convert(T t) throws IOException {
        return gqf.create(b, String.valueOf(t));
    }
}
