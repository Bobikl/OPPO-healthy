package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes10.dex */
public final class wvm {

    @Deprecated
    public static final Charset feedbacka;

    @Deprecated
    public static final Charset feedbackb;

    @Deprecated
    public static final Charset feedbackc;

    @Deprecated
    public static final Charset feedbackd;

    static {
        Charset.forName("ISO-8859-1");
        Charset.forName(CharEncoding.US_ASCII);
        feedbacka = Charset.forName(CharEncoding.UTF_16);
        feedbackb = Charset.forName(CharEncoding.UTF_16BE);
        feedbackc = Charset.forName(CharEncoding.UTF_16LE);
        feedbackd = Charset.forName("UTF-8");
    }

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
