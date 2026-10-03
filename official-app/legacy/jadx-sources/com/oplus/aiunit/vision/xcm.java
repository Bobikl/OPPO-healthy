package com.oplus.aiunit.vision;

import java.io.IOException;
import okhttp3.MediaType;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* JADX INFO: loaded from: classes10.dex */
public final class xcm extends gqf {
    public final /* synthetic */ gqf a;

    public xcm(gqf gqfVar) {
        this.a = gqfVar;
    }

    @Override // com.oplus.aiunit.vision.gqf
    public final long contentLength() {
        return -1L;
    }

    @Override // com.oplus.aiunit.vision.gqf
    /* JADX INFO: renamed from: contentType */
    public final MediaType getContentType() {
        return this.a.getContentType();
    }

    @Override // com.oplus.aiunit.vision.gqf
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(bufferedSink));
        this.a.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.close();
    }
}
