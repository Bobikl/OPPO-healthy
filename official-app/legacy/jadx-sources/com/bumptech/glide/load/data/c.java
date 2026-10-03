package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.ix3;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public final RecyclableBufferedInputStream a;

    public static final class a implements com.bumptech.glide.load.data.a.InterfaceC0176a<InputStream> {
        public final ch0 a;

        public a(ch0 ch0Var) {
            this.a = ch0Var;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0176a
        @NonNull
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0176a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, ch0 ch0Var) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, ch0Var);
        this.a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(ix3.DEFAULT_MQTT_MAX_SIZE);
    }

    public void a() {
        this.a.g();
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
        this.a.release();
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream c() throws IOException {
        this.a.reset();
        return this.a;
    }
}
