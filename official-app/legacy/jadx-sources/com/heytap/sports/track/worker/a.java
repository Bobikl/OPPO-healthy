package com.heytap.sports.track.worker;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/sports/track/worker/a;", "", "<init>", "()V", "a", "b", "c", "Lcom/heytap/sports/track/worker/a$a;", "Lcom/heytap/sports/track/worker/a$b;", "Lcom/heytap/sports/track/worker/a$c;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.heytap.sports.track.worker.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/sports/track/worker/a$a;", "Lcom/heytap/sports/track/worker/a;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0797a extends a {
        public static final int $stable = 0;

        @NotNull
        public static final C0797a INSTANCE = new C0797a();

        public C0797a() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/sports/track/worker/a$b;", "Lcom/heytap/sports/track/worker/a;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends a {
        public static final int $stable = 0;

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.heytap.sports.track.worker.a$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/sports/track/worker/a$c;", "Lcom/heytap/sports/track/worker/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "path", "<init>", "(Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Succeed extends a {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeed(@NotNull String path) {
            super(null);
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Succeed) && Intrinsics.areEqual(this.path, ((Succeed) other).path);
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        @NotNull
        public String toString() {
            return "Succeed(path=" + this.path + ")";
        }
    }

    public a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
