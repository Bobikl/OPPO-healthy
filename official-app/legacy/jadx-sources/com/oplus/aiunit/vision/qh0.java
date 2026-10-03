package com.oplus.aiunit.vision;

import com.heytap.health.health_archives.bean.AsrResultType;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\nB-\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\n\u0010\u0015R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/qh0;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/health_archives/bean/AsrResultType;", "a", "Lcom/heytap/health/health_archives/bean/AsrResultType;", "getResultType", "()Lcom/heytap/health/health_archives/bean/AsrResultType;", "resultType", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "text", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "errorCode", "d", "errorMessage", MapSchema.FIELD_NAME_ENTRY, "()Z", "isFinal", "f", "isPartial", "isError", "<init>", "(Lcom/heytap/health/health_archives/bean/AsrResultType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Companion", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class qh0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AsrResultType resultType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer errorCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String errorMessage;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.qh0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/qh0$a;", "", "", "text", "Lcom/oplus/aiunit/vision/qh0;", "b", "c", "", "code", "message", "a", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final qh0 a(int code, @Nullable String message) {
            return new qh0(AsrResultType.ERROR, null, Integer.valueOf(code), message);
        }

        @NotNull
        public final qh0 b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new qh0(AsrResultType.PARTIAL, text, null, null);
        }

        @NotNull
        public final qh0 c(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new qh0(AsrResultType.FINAL, text, null, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AsrResultType.values().length];
            try {
                iArr[AsrResultType.PARTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AsrResultType.FINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AsrResultType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qh0(@NotNull AsrResultType resultType, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        this.resultType = resultType;
        this.text = str;
        this.errorCode = num;
        this.errorMessage = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean d() {
        return this.resultType == AsrResultType.ERROR;
    }

    public final boolean e() {
        return this.resultType == AsrResultType.FINAL;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof qh0)) {
            return false;
        }
        qh0 qh0Var = (qh0) other;
        return this.resultType == qh0Var.resultType && Intrinsics.areEqual(this.text, qh0Var.text) && Intrinsics.areEqual(this.errorCode, qh0Var.errorCode) && Intrinsics.areEqual(this.errorMessage, qh0Var.errorMessage);
    }

    public final boolean f() {
        return this.resultType == AsrResultType.PARTIAL;
    }

    public int hashCode() {
        int iHashCode = this.resultType.hashCode() * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.errorCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.errorMessage;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = b.$EnumSwitchMapping$0[this.resultType.ordinal()];
        if (i == 1) {
            return "AsrResult(partial, text=" + this.text + ")";
        }
        if (i == 2) {
            return "AsrResult(final, text=" + this.text + ")";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "AsrResult(error, code=" + this.errorCode + ", message=" + this.errorMessage + ")";
    }
}
