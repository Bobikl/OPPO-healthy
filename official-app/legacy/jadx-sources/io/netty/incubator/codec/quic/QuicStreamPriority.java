package io.netty.incubator.codec.quic;

import io.netty.util.internal.ObjectUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicStreamPriority {
    private final boolean incremental;
    private final int urgency;

    public QuicStreamPriority(int i, boolean z) {
        this.urgency = ObjectUtil.checkInRange(i, 0, 127, "urgency");
        this.incremental = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QuicStreamPriority.class != obj.getClass()) {
            return false;
        }
        QuicStreamPriority quicStreamPriority = (QuicStreamPriority) obj;
        return this.urgency == quicStreamPriority.urgency && this.incremental == quicStreamPriority.incremental;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.urgency), Boolean.valueOf(this.incremental));
    }

    public boolean isIncremental() {
        return this.incremental;
    }

    public String toString() {
        return "QuicStreamPriority{urgency=" + this.urgency + ", incremental=" + this.incremental + '}';
    }

    public int urgency() {
        return this.urgency;
    }
}
