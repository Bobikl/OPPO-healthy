package io.netty.channel;

import com.heytap.webview.extension.protocol.Const;
import io.netty.util.AbstractReferenceCounted;
import io.netty.util.IllegalReferenceCountException;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultFileRegion extends AbstractReferenceCounted implements FileRegion {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) DefaultFileRegion.class);
    private final long count;
    private final File f;
    private FileChannel file;
    private final long position;
    private long transferred;

    public DefaultFileRegion(FileChannel fileChannel, long j2, long j3) {
        this.file = (FileChannel) ObjectUtil.checkNotNull(fileChannel, Const.Scheme.SCHEME_FILE);
        this.position = ObjectUtil.checkPositiveOrZero(j2, "position");
        this.count = ObjectUtil.checkPositiveOrZero(j3, "count");
        this.f = null;
    }

    public static void validate(DefaultFileRegion defaultFileRegion, long j2) throws IOException {
        long size = defaultFileRegion.file.size();
        if (defaultFileRegion.position + (defaultFileRegion.count - j2) + j2 <= size) {
            return;
        }
        throw new IOException("Underlying file size " + size + " smaller then requested count " + defaultFileRegion.count);
    }

    @Override // io.netty.channel.FileRegion
    public long count() {
        return this.count;
    }

    @Override // io.netty.util.AbstractReferenceCounted
    public void deallocate() {
        FileChannel fileChannel = this.file;
        if (fileChannel == null) {
            return;
        }
        this.file = null;
        try {
            fileChannel.close();
        } catch (IOException e2) {
            logger.warn("Failed to close a file.", (Throwable) e2);
        }
    }

    public boolean isOpen() {
        return this.file != null;
    }

    public void open() throws IOException {
        if (isOpen() || refCnt() <= 0) {
            return;
        }
        this.file = new RandomAccessFile(this.f, "r").getChannel();
    }

    @Override // io.netty.channel.FileRegion
    public long position() {
        return this.position;
    }

    @Override // io.netty.util.AbstractReferenceCounted, io.netty.util.ReferenceCounted
    public FileRegion touch() {
        return this;
    }

    @Override // io.netty.channel.FileRegion
    public long transferTo(WritableByteChannel writableByteChannel, long j2) throws IOException {
        long j3 = this.count - j2;
        if (j3 < 0 || j2 < 0) {
            throw new IllegalArgumentException("position out of range: " + j2 + " (expected: 0 - " + (this.count - 1) + ')');
        }
        if (j3 == 0) {
            return 0L;
        }
        if (refCnt() == 0) {
            throw new IllegalReferenceCountException(0);
        }
        open();
        long jTransferTo = this.file.transferTo(this.position + j2, j3, writableByteChannel);
        if (jTransferTo > 0) {
            this.transferred += jTransferTo;
        } else if (jTransferTo == 0) {
            validate(this, j2);
        }
        return jTransferTo;
    }

    @Override // io.netty.channel.FileRegion
    @Deprecated
    public long transfered() {
        return this.transferred;
    }

    @Override // io.netty.channel.FileRegion
    public long transferred() {
        return this.transferred;
    }

    @Override // io.netty.util.ReferenceCounted
    public FileRegion touch(Object obj) {
        return this;
    }

    @Override // io.netty.util.AbstractReferenceCounted, io.netty.util.ReferenceCounted
    public FileRegion retain() {
        super.retain();
        return this;
    }

    @Override // io.netty.util.AbstractReferenceCounted, io.netty.util.ReferenceCounted
    public FileRegion retain(int i) {
        super.retain(i);
        return this;
    }

    public DefaultFileRegion(File file, long j2, long j3) {
        this.f = (File) ObjectUtil.checkNotNull(file, "f");
        this.position = ObjectUtil.checkPositiveOrZero(j2, "position");
        this.count = ObjectUtil.checkPositiveOrZero(j3, "count");
    }
}
