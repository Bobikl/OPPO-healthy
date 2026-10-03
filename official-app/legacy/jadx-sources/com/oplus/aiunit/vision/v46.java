package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes13.dex */
public class v46 implements pak<Drawable> {
    public final int a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w46 f17703c;

    public static class a {
        public final int a;
        public boolean b;

        public a(int i) {
            this.a = i;
        }

        public v46 a() {
            return new v46(this.a, this.b);
        }
    }

    public v46(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // com.oplus.aiunit.vision.pak
    public oak<Drawable> a(DataSource dataSource, boolean z) {
        return dataSource == DataSource.MEMORY_CACHE ? itc.b() : b();
    }

    public final oak<Drawable> b() {
        if (this.f17703c == null) {
            this.f17703c = new w46(this.a, this.b);
        }
        return this.f17703c;
    }
}
