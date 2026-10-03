package io.netty.channel.unix;

import io.netty.util.internal.ObjectUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class RawUnixChannelOption extends GenericUnixChannelOption<ByteBuffer> {
    private final int length;

    public RawUnixChannelOption(String str, int i, int i2, int i3) {
        super(str, i, i2);
        this.length = ObjectUtil.checkPositive(i3, "length");
    }

    public int length() {
        return this.length;
    }

    @Override // io.netty.channel.ChannelOption
    public void validate(ByteBuffer byteBuffer) {
        super.validate(byteBuffer);
        if (byteBuffer.remaining() == this.length) {
            return;
        }
        throw new IllegalArgumentException("Length of value does not match. Expected " + this.length + ", but got " + byteBuffer.remaining());
    }
}
