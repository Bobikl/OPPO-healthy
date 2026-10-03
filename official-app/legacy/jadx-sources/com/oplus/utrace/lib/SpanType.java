package com.oplus.utrace.lib;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/oplus/utrace/lib/SpanType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "CodeSpans", "IntentTrace", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SpanType {
    CodeSpans(1),
    IntentTrace(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/utrace/lib/SpanType$Companion;", "", "()V", "find", "Lcom/oplus/utrace/lib/SpanType;", "value", "", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSpanType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanType.kt\ncom/oplus/utrace/lib/SpanType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final SpanType find(int value) {
            for (SpanType spanType : SpanType.values()) {
                if (spanType.getValue() == value) {
                    if (spanType == null) {
                        return SpanType.CodeSpans;
                    }
                    return spanType;
                }
            }
            spanType = null;
            if (spanType == null) {
                return SpanType.CodeSpans;
            }
            return spanType;
        }
    }

    SpanType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* synthetic */ SpanType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
