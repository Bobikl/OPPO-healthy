package io.netty.channel.unix;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public final class IovArray implements ChannelOutboundBuffer.MessageProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ADDRESS_SIZE;
    public static final int IOV_SIZE;
    private static final int MAX_CAPACITY;
    private int count;
    private long maxBytes;
    private final ByteBuf memory;
    private final long memoryAddress;
    private long size;

    static {
        int iAddressSize = Buffer.addressSize();
        ADDRESS_SIZE = iAddressSize;
        int i = iAddressSize * 2;
        IOV_SIZE = i;
        MAX_CAPACITY = Limits.IOV_MAX * i;
    }

    public IovArray() {
        this(Unpooled.wrappedBuffer(Buffer.allocateDirectWithNativeOrder(MAX_CAPACITY)).setIndex(0, 0));
    }

    private static int idx(int i) {
        return IOV_SIZE * i;
    }

    @Deprecated
    public boolean add(ByteBuf byteBuf) {
        return add(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public void clear() {
        this.count = 0;
        this.size = 0L;
    }

    public int count() {
        return this.count;
    }

    public void maxBytes(long j2) {
        this.maxBytes = Math.min(Limits.SSIZE_MAX, ObjectUtil.checkPositive(j2, "maxBytes"));
    }

    public long memoryAddress(int i) {
        return this.memoryAddress + ((long) idx(i));
    }

    @Override // io.netty.channel.ChannelOutboundBuffer.MessageProcessor
    public boolean processMessage(Object obj) throws Exception {
        if (!(obj instanceof ByteBuf)) {
            return false;
        }
        ByteBuf byteBuf = (ByteBuf) obj;
        return add(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public void release() {
        this.memory.release();
    }

    public long size() {
        return this.size;
    }

    public IovArray(ByteBuf byteBuf) {
        ByteBuf byteBufOrder;
        this.maxBytes = Limits.SSIZE_MAX;
        if (PlatformDependent.hasUnsafe()) {
            byteBufOrder = byteBuf;
        } else {
            byteBufOrder = byteBuf.order(PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        }
        this.memory = byteBufOrder;
        if (byteBuf.hasMemoryAddress()) {
            this.memoryAddress = byteBuf.memoryAddress();
        } else {
            this.memoryAddress = Buffer.memoryAddress(byteBuf.internalNioBuffer(0, byteBuf.capacity()));
        }
    }

    public boolean add(ByteBuf byteBuf, int i, int i2) {
        if (this.count == Limits.IOV_MAX) {
            return false;
        }
        if (byteBuf.nioBufferCount() == 1) {
            if (i2 == 0) {
                return true;
            }
            if (byteBuf.hasMemoryAddress()) {
                return add(this.memoryAddress, byteBuf.memoryAddress() + ((long) i), i2);
            }
            ByteBuffer byteBufferInternalNioBuffer = byteBuf.internalNioBuffer(i, i2);
            return add(this.memoryAddress, Buffer.memoryAddress(byteBufferInternalNioBuffer) + ((long) byteBufferInternalNioBuffer.position()), i2);
        }
        ByteBuffer[] byteBufferArrNioBuffers = byteBuf.nioBuffers(i, i2);
        for (ByteBuffer byteBuffer : byteBufferArrNioBuffers) {
            int iRemaining = byteBuffer.remaining();
            if (iRemaining != 0 && (!add(this.memoryAddress, Buffer.memoryAddress(byteBuffer) + ((long) byteBuffer.position()), iRemaining) || this.count == Limits.IOV_MAX)) {
                return false;
            }
        }
        return true;
    }

    public long maxBytes() {
        return this.maxBytes;
    }

    private boolean add(long j2, long j3, int i) {
        long j4 = i;
        if (this.maxBytes - j4 < this.size && this.count > 0) {
            return false;
        }
        int iCapacity = this.memory.capacity();
        int i2 = this.count;
        if (iCapacity < (i2 + 1) * IOV_SIZE) {
            return false;
        }
        int iIdx = idx(i2);
        int i3 = ADDRESS_SIZE;
        int i4 = iIdx + i3;
        this.size += j4;
        this.count++;
        if (i3 == 8) {
            if (PlatformDependent.hasUnsafe()) {
                PlatformDependent.putLong(((long) iIdx) + j2, j3);
                PlatformDependent.putLong(((long) i4) + j2, j4);
            } else {
                this.memory.setLong(iIdx, j3);
                this.memory.setLong(i4, j4);
            }
        } else if (PlatformDependent.hasUnsafe()) {
            PlatformDependent.putInt(((long) iIdx) + j2, (int) j3);
            PlatformDependent.putInt(((long) i4) + j2, i);
        } else {
            this.memory.setInt(iIdx, (int) j3);
            this.memory.setInt(i4, i);
        }
        return true;
    }
}
