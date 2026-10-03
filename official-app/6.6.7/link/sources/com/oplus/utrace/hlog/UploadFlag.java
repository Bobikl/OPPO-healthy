package com.oplus.utrace.hlog;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/oplus/utrace/hlog/UploadFlag;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NEED_PROXY", "CAN_UPLOAD", "NO_UPLOAD", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum UploadFlag {
    NEED_PROXY(1),
    CAN_UPLOAD(2),
    NO_UPLOAD(3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/utrace/hlog/UploadFlag$Companion;", "", "()V", "from", "Lcom/oplus/utrace/hlog/UploadFlag;", "value", "", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHLogUploaderTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogUploaderTask.kt\ncom/oplus/utrace/hlog/UploadFlag$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,424:1\n1#2:425\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final UploadFlag from(int value) {
            for (UploadFlag uploadFlag : UploadFlag.values()) {
                if (uploadFlag.getValue() == value) {
                    return uploadFlag;
                }
            }
            return null;
        }
    }

    UploadFlag(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
