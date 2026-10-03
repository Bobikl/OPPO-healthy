package io.netty.handler.codec.serialization;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.internal.ObjectUtil;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class CompatibleObjectEncoder extends MessageToByteEncoder<Serializable> {
    private final int resetInterval;
    private int writtenObjects;

    public CompatibleObjectEncoder() {
        this(16);
    }

    public ObjectOutputStream newObjectOutputStream(OutputStream outputStream) throws Exception {
        return new ObjectOutputStream(outputStream);
    }

    public CompatibleObjectEncoder(int i) {
        this.resetInterval = ObjectUtil.checkPositiveOrZero(i, "resetInterval");
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, Serializable serializable, ByteBuf byteBuf) throws Exception {
        ObjectOutputStream objectOutputStreamNewObjectOutputStream = newObjectOutputStream(new ByteBufOutputStream(byteBuf));
        try {
            int i = this.resetInterval;
            if (i != 0) {
                int i2 = this.writtenObjects + 1;
                this.writtenObjects = i2;
                if (i2 % i == 0) {
                    objectOutputStreamNewObjectOutputStream.reset();
                }
            }
            objectOutputStreamNewObjectOutputStream.writeObject(serializable);
            objectOutputStreamNewObjectOutputStream.flush();
        } finally {
            objectOutputStreamNewObjectOutputStream.close();
        }
    }
}
