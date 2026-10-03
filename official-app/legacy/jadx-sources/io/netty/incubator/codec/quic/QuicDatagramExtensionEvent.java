package io.netty.incubator.codec.quic;

import com.oplus.smartenginehelper.ParserTag;
import io.netty.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicDatagramExtensionEvent implements QuicExtensionEvent {
    private final int maxLength;

    public QuicDatagramExtensionEvent(int i) {
        this.maxLength = ObjectUtil.checkPositiveOrZero(i, ParserTag.TAG_MAX_LENGTH);
    }

    public int maxLength() {
        return this.maxLength;
    }
}
