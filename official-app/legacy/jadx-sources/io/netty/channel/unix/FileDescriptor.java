package io.netty.channel.unix;

import com.heytap.webview.extension.protocol.Const;
import io.netty.util.internal.ObjectUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes10.dex */
public class FileDescriptor {
    private static final int STATE_ALL_MASK = 7;
    private static final int STATE_CLOSED_MASK = 1;
    private static final int STATE_INPUT_SHUTDOWN_MASK = 2;
    private static final int STATE_OUTPUT_SHUTDOWN_MASK = 4;
    private static final AtomicIntegerFieldUpdater<FileDescriptor> stateUpdater = AtomicIntegerFieldUpdater.newUpdater(FileDescriptor.class, "state");
    final int fd;
    volatile int state;

    public FileDescriptor(int i) {
        ObjectUtil.checkPositiveOrZero(i, "fd");
        this.fd = i;
    }

    private static native int close(int i);

    public static FileDescriptor from(String str) throws IOException {
        int iOpen = open((String) ObjectUtil.checkNotNull(str, "path"));
        if (iOpen >= 0) {
            return new FileDescriptor(iOpen);
        }
        throw Errors.newIOException("open", iOpen);
    }

    public static int inputShutdown(int i) {
        return i | 2;
    }

    public static boolean isClosed(int i) {
        return (i & 1) != 0;
    }

    public static boolean isInputShutdown(int i) {
        return (i & 2) != 0;
    }

    public static boolean isOutputShutdown(int i) {
        return (i & 4) != 0;
    }

    private static native long newPipe();

    private static native int open(String str);

    public static int outputShutdown(int i) {
        return i | 4;
    }

    public static FileDescriptor[] pipe() throws IOException {
        long jNewPipe = newPipe();
        if (jNewPipe >= 0) {
            return new FileDescriptor[]{new FileDescriptor((int) (jNewPipe >>> 32)), new FileDescriptor((int) jNewPipe)};
        }
        throw Errors.newIOException("newPipe", (int) jNewPipe);
    }

    private static native int read(int i, ByteBuffer byteBuffer, int i2, int i3);

    private static native int readAddress(int i, long j2, int i2, int i3);

    private static native int write(int i, ByteBuffer byteBuffer, int i2, int i3);

    private static native int writeAddress(int i, long j2, int i2, int i3);

    private static native long writev(int i, ByteBuffer[] byteBufferArr, int i2, int i3, long j2);

    private static native long writevAddresses(int i, long j2, int i2);

    public final boolean casState(int i, int i2) {
        return stateUpdater.compareAndSet(this, i, i2);
    }

    public void close() throws IOException {
        int iClose;
        if (markClosed() && (iClose = close(this.fd)) < 0) {
            throw Errors.newIOException("close", iClose);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileDescriptor) && this.fd == ((FileDescriptor) obj).fd;
    }

    public int hashCode() {
        return this.fd;
    }

    public final int intValue() {
        return this.fd;
    }

    public boolean isOpen() {
        return !isClosed(this.state);
    }

    public boolean markClosed() {
        int i;
        do {
            i = this.state;
            if (isClosed(i)) {
                return false;
            }
        } while (!casState(i, i | 7));
        return true;
    }

    public final int read(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        int i3 = read(this.fd, byteBuffer, i, i2);
        if (i3 > 0) {
            return i3;
        }
        if (i3 == 0) {
            return -1;
        }
        return Errors.ioResult("read", i3);
    }

    public final int readAddress(long j2, int i, int i2) throws IOException {
        int address = readAddress(this.fd, j2, i, i2);
        if (address > 0) {
            return address;
        }
        if (address == 0) {
            return -1;
        }
        return Errors.ioResult("readAddress", address);
    }

    public String toString() {
        return "FileDescriptor{fd=" + this.fd + '}';
    }

    public final int write(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        int iWrite = write(this.fd, byteBuffer, i, i2);
        return iWrite >= 0 ? iWrite : Errors.ioResult("write", iWrite);
    }

    public final int writeAddress(long j2, int i, int i2) throws IOException {
        int iWriteAddress = writeAddress(this.fd, j2, i, i2);
        return iWriteAddress >= 0 ? iWriteAddress : Errors.ioResult("writeAddress", iWriteAddress);
    }

    public final long writev(ByteBuffer[] byteBufferArr, int i, int i2, long j2) throws IOException {
        long jWritev = writev(this.fd, byteBufferArr, i, Math.min(Limits.IOV_MAX, i2), j2);
        return jWritev >= 0 ? jWritev : Errors.ioResult("writev", (int) jWritev);
    }

    public final long writevAddresses(long j2, int i) throws IOException {
        long jWritevAddresses = writevAddresses(this.fd, j2, i);
        return jWritevAddresses >= 0 ? jWritevAddresses : Errors.ioResult("writevAddresses", (int) jWritevAddresses);
    }

    public static FileDescriptor from(File file) throws IOException {
        return from(((File) ObjectUtil.checkNotNull(file, Const.Scheme.SCHEME_FILE)).getPath());
    }
}
