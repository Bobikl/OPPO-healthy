package io.netty.incubator.codec.quic;

import com.oplus.aiunit.vision.i6b;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheLogger {
    private final i6b logger;

    public QuicheLogger(i6b i6bVar) {
        this.logger = i6bVar;
    }

    public void log(String str) {
        this.logger.info(str);
    }
}
