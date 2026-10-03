package io.netty.incubator.codec.quic;

/* JADX INFO: loaded from: classes10.dex */
final class QuicStreamIdGenerator {
    private long nextBidirectionalStreamId;
    private long nextUnidirectionalStreamId;

    public QuicStreamIdGenerator(boolean z) {
        this.nextBidirectionalStreamId = z ? 1L : 0L;
        this.nextUnidirectionalStreamId = z ? 3L : 2L;
    }

    public long nextStreamId(boolean z) {
        if (z) {
            long j2 = this.nextBidirectionalStreamId;
            this.nextBidirectionalStreamId = 4 + j2;
            return j2;
        }
        long j3 = this.nextUnidirectionalStreamId;
        this.nextUnidirectionalStreamId = 4 + j3;
        return j3;
    }
}
