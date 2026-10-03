package com.heytap.health.devicelog.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/devicelog/feedback/a;", "", "<init>", "()V", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "f", "Lcom/heytap/health/devicelog/feedback/a$a;", "Lcom/heytap/health/devicelog/feedback/a$b;", "Lcom/heytap/health/devicelog/feedback/a$c;", "Lcom/heytap/health/devicelog/feedback/a$d;", "Lcom/heytap/health/devicelog/feedback/a$e;", "Lcom/heytap/health/devicelog/feedback/a$f;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.heytap.health.devicelog.feedback.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/devicelog/feedback/a$a;", "Lcom/heytap/health/devicelog/feedback/a;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0356a extends a {
        public static final int $stable = 0;

        @NotNull
        public static final C0356a INSTANCE = new C0356a();

        public C0356a() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/devicelog/feedback/a$b;", "Lcom/heytap/health/devicelog/feedback/a;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends a {
        public static final int $stable = 0;

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.devicelog.feedback.a$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\u0010\u0014\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/devicelog/feedback/a$c;", "Lcom/heytap/health/devicelog/feedback/a;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "a", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "b", "()Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "fbOption", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "error", "<init>", "(Lcom/heytap/health/devicelog/feedback/FeedbackOption;Ljava/lang/Exception;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Error extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final FeedbackOption fbOption;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Exception error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@Nullable FeedbackOption feedbackOption, @NotNull Exception error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.fbOption = feedbackOption;
            this.error = error;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final FeedbackOption getFbOption() {
            return this.fbOption;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error.getMessage(), ((Error) other).error.getMessage());
        }

        public int hashCode() {
            String message = this.error.getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "Error(fbOption=" + this.fbOption + ", error=" + this.error + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/devicelog/feedback/a$d;", "Lcom/heytap/health/devicelog/feedback/a;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends a {
        public static final int $stable = 0;

        @NotNull
        public static final d INSTANCE = new d();

        public d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.devicelog.feedback.a$e, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/devicelog/feedback/a$e;", "Lcom/heytap/health/devicelog/feedback/a;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "a", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "()Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "fbOption", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "fid", "<init>", "(Lcom/heytap/health/devicelog/feedback/FeedbackOption;Ljava/lang/String;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class LogkitOk extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final FeedbackOption fbOption;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogkitOk(@Nullable FeedbackOption feedbackOption, @NotNull String fid) {
            super(null);
            Intrinsics.checkNotNullParameter(fid, "fid");
            this.fbOption = feedbackOption;
            this.fid = fid;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final FeedbackOption getFbOption() {
            return this.fbOption;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFid() {
            return this.fid;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LogkitOk) && Intrinsics.areEqual(this.fid, ((LogkitOk) other).fid);
        }

        public int hashCode() {
            return this.fid.hashCode();
        }

        @NotNull
        public String toString() {
            return "LogkitOk(fbOption=" + this.fbOption + ", fid=" + this.fid + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/devicelog/feedback/a$f;", "Lcom/heytap/health/devicelog/feedback/a;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class f extends a {
        public static final int $stable = 0;

        @NotNull
        public static final f INSTANCE = new f();

        public f() {
            super(null);
        }
    }

    public a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
