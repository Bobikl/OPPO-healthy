package com.oplus.aiunit.vision;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes13.dex */
public class itc<R> implements oak<R> {
    public static final itc<?> a = new itc<>();
    public static final pak<?> b = new a();

    public static class a<R> implements pak<R> {
        @Override // com.oplus.aiunit.vision.pak
        public oak<R> a(DataSource dataSource, boolean z) {
            return itc.a;
        }
    }

    public static <R> oak<R> b() {
        return a;
    }

    public static <R> pak<R> c() {
        return (pak<R>) b;
    }

    @Override // com.oplus.aiunit.vision.oak
    public boolean a(Object obj, oak.a aVar) {
        return false;
    }
}
