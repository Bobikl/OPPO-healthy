package com.oplus.aiunit.vision;

import android.net.Uri;

/* JADX INFO: loaded from: classes15.dex */
public class f4a extends srb {
    public String r;
    public int s;

    public static class a extends srb.a<a, f4a> {
        public String r;
        public int s;

        public a(Uri uri) {
            super(uri);
        }

        public f4a v() {
            return new f4a(this);
        }
    }

    public f4a(a aVar) {
        super(aVar);
        this.r = aVar.r;
        this.s = aVar.s;
    }
}
