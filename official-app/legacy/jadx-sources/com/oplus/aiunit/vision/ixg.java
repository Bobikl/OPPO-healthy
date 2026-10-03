package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/ixg;", "", "", "id", "value", b2n.g, "", "f", "a", "i", "d", "defaultValue", MapSchema.FIELD_NAME_ENTRY, "other", "", b2n.f, "I", "set", "", "b", "[I", "values", "()I", "headerTableSize", "c", "initialWindowSize", "<init>", "()V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class ixg {
    public static final int COUNT = 10;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int set;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int[] values = new int[10];

    public final int a(int id) {
        return this.values[id];
    }

    public final int b() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int defaultValue) {
        return (this.set & 32) != 0 ? this.values[5] : defaultValue;
    }

    public final boolean f(int id) {
        return (this.set & (1 << id)) != 0;
    }

    public final void g(@NotNull ixg other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (other.f(i)) {
                h(i, other.a(i));
            }
        }
    }

    @NotNull
    public final ixg h(int id, int value) {
        if (id >= 0) {
            int[] iArr = this.values;
            if (id < iArr.length) {
                this.set = (1 << id) | this.set;
                iArr[id] = value;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.set);
    }
}
