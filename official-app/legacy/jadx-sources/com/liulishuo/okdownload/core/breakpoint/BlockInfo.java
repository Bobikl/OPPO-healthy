package com.liulishuo.okdownload.core.breakpoint;

import android.support.annotation.IntRange;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class BlockInfo {

    @IntRange(from = 0)
    private final long contentLength;
    private final AtomicLong currentOffset;

    @IntRange(from = 0)
    private final long startOffset;

    public BlockInfo(long j2, long j3) {
        this(j2, j3, 0L);
    }

    public BlockInfo copy() {
        return new BlockInfo(this.startOffset, this.contentLength, this.currentOffset.get());
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public long getCurrentOffset() {
        return this.currentOffset.get();
    }

    public long getRangeLeft() {
        return this.startOffset + this.currentOffset.get();
    }

    public long getRangeRight() {
        return (this.startOffset + this.contentLength) - 1;
    }

    public long getStartOffset() {
        return this.startOffset;
    }

    public void increaseCurrentOffset(@IntRange(from = 1) long j2) {
        this.currentOffset.addAndGet(j2);
    }

    public void resetBlock() {
        this.currentOffset.set(0L);
    }

    public String toString() {
        return "[" + this.startOffset + ", " + getRangeRight() + ")-current:" + this.currentOffset;
    }

    public BlockInfo(long j2, long j3, @IntRange(from = 0) long j4) {
        if (j2 < 0 || ((j3 < 0 && j3 != -1) || j4 < 0)) {
            throw new IllegalArgumentException();
        }
        this.startOffset = j2;
        this.contentLength = j3;
        this.currentOffset = new AtomicLong(j4);
    }
}
