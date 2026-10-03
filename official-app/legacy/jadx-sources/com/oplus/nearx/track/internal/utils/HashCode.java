package com.oplus.nearx.track.internal.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.smartenginehelper.ParserTag;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\t\b\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Lcom/oplus/nearx/track/internal/utils/HashCode;", "", "", "asInt", "", "bArr", "i", "i2", "", "writeBytesToImpl", "<init>", "()V", "Companion", "a", "IntHashCode", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public abstract class HashCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/oplus/nearx/track/internal/utils/HashCode$IntHashCode;", "Lcom/oplus/nearx/track/internal/utils/HashCode;", "Ljava/io/Serializable;", "", "asInt", "", "dest", TypedValues.CycleType.S_WAVE_OFFSET, ParserTag.TAG_MAX_LENGTH, "", "writeBytesToImpl", "hash", "I", "getHash", "()I", "<init>", "(I)V", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        private final int hash;

        public IntHashCode(int i) {
            this.hash = i;
        }

        @Override // com.oplus.nearx.track.internal.utils.HashCode
        /* JADX INFO: renamed from: asInt, reason: from getter */
        public int getHash() {
            return this.hash;
        }

        public final int getHash() {
            return this.hash;
        }

        @Override // com.oplus.nearx.track.internal.utils.HashCode
        public void writeBytesToImpl(@Nullable byte[] dest, int offset, int maxLength) {
            for (int i = 0; i < maxLength; i++) {
                if (dest != null) {
                    dest[offset + i] = (byte) (this.hash >> (i * 8));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.utils.HashCode$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/nearx/track/internal/utils/HashCode$a;", "", "", "hash", "Lcom/oplus/nearx/track/internal/utils/HashCode;", "a", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashCode a(int hash) {
            return new IntHashCode(hash);
        }
    }

    /* JADX INFO: renamed from: asInt */
    public abstract int getHash();

    public abstract void writeBytesToImpl(@Nullable byte[] bArr, int i, int i2);
}
