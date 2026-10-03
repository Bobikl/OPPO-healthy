package io.netty.channel.epoll;

import io.netty.channel.unix.Buffer;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class EpollEventArray {
    private int length;
    private ByteBuffer memory;
    private long memoryAddress;
    private static final int EPOLL_EVENT_SIZE = Native.sizeofEpollEvent();
    private static final int EPOLL_DATA_OFFSET = Native.offsetofEpollData();

    public EpollEventArray(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("length must be >= 1 but was " + i);
        }
        this.length = i;
        ByteBuffer byteBufferAllocateDirectWithNativeOrder = Buffer.allocateDirectWithNativeOrder(calculateBufferCapacity(i));
        this.memory = byteBufferAllocateDirectWithNativeOrder;
        this.memoryAddress = Buffer.memoryAddress(byteBufferAllocateDirectWithNativeOrder);
    }

    private static int calculateBufferCapacity(int i) {
        return i * EPOLL_EVENT_SIZE;
    }

    private int getInt(int i, int i2) {
        if (!PlatformDependent.hasUnsafe()) {
            return this.memory.getInt((i * EPOLL_EVENT_SIZE) + i2);
        }
        return PlatformDependent.getInt(this.memoryAddress + (((long) i) * ((long) EPOLL_EVENT_SIZE)) + ((long) i2));
    }

    public int events(int i) {
        return getInt(i, 0);
    }

    public int fd(int i) {
        return getInt(i, EPOLL_DATA_OFFSET);
    }

    public void free() {
        Buffer.free(this.memory);
        this.memoryAddress = 0L;
    }

    public void increase() {
        int i = this.length << 1;
        this.length = i;
        ByteBuffer byteBufferAllocateDirectWithNativeOrder = Buffer.allocateDirectWithNativeOrder(calculateBufferCapacity(i));
        Buffer.free(this.memory);
        this.memory = byteBufferAllocateDirectWithNativeOrder;
        this.memoryAddress = Buffer.memoryAddress(byteBufferAllocateDirectWithNativeOrder);
    }

    public int length() {
        return this.length;
    }

    public long memoryAddress() {
        return this.memoryAddress;
    }
}
