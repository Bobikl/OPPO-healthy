package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes3.dex */
public class bse implements ar9 {

    @NonNull
    public final ytf i;

    public bse(@NonNull ytf ytfVar) {
        this.i = ytfVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.i.getBody() == null) {
            return;
        }
        this.i.close();
    }

    @Override // com.oplus.aiunit.vision.ar9
    public InputStream f() throws IOException {
        if (this.i.getBody() != null) {
            return this.i.getBody().a();
        }
        throw new IOException("http response failed!");
    }

    @Override // com.oplus.aiunit.vision.ar9
    public String k() {
        Charset charset;
        MediaType k = this.i.getBody() == null ? null : this.i.getBody().getK();
        return (k == null || (charset = k.charset()) == null) ? StandardCharsets.UTF_8.name() : charset.name();
    }

    @Override // com.oplus.aiunit.vision.ar9
    public String r() {
        return this.i.getMessage();
    }

    @Override // com.oplus.aiunit.vision.ar9
    public int statusCode() {
        return this.i.getCode();
    }
}
