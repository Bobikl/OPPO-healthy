package com.heytap.health.esim.nsc.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\n\u0013\u0004\u0014\t\u000e\u0015\u0016\u0017\u0007\fB\u001b\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\n\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a;", "", "other", "", "b", "", "toString", "i", "I", "d", "()I", "index", "j", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "message", "<init>", "(ILjava/lang/String;)V", "a", "c", "f", b2n.f, b2n.g, "Lcom/heytap/health/esim/nsc/repo/a$a;", "Lcom/heytap/health/esim/nsc/repo/a$b;", "Lcom/heytap/health/esim/nsc/repo/a$c;", "Lcom/heytap/health/esim/nsc/repo/a$d;", "Lcom/heytap/health/esim/nsc/repo/a$e;", "Lcom/heytap/health/esim/nsc/repo/a$f;", "Lcom/heytap/health/esim/nsc/repo/a$g;", "Lcom/heytap/health/esim/nsc/repo/a$h;", "Lcom/heytap/health/esim/nsc/repo/a$i;", "Lcom/heytap/health/esim/nsc/repo/a$j;", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class a implements Comparable<a> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: com.heytap.health.esim.nsc.repo.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$a;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0433a extends a {
        public static final int $stable = 0;

        @NotNull
        public static final C0433a INSTANCE = new C0433a();

        /* JADX WARN: Multi-variable type inference failed */
        public C0433a() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$b;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends a {
        public static final int $stable = 0;

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(-1, "已经存在Esim业务", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$c;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends a {
        public static final int $stable = 0;

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(-2, "已经存在Esim业务,不支持上网服务", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$d;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends a {
        public static final int $stable = 0;

        @NotNull
        public static final d INSTANCE = new d();

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$e;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class e extends a {
        public static final int $stable = 0;

        @NotNull
        public static final e INSTANCE = new e();

        public e() {
            super(3, "已经存在上网服务", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$f;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class f extends a {
        public static final int $stable = 0;

        @NotNull
        public static final f INSTANCE = new f();

        public f() {
            super(2, "已经存在上网服务,未下卡", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$g;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class g extends a {
        public static final int $stable = 0;

        @NotNull
        public static final g INSTANCE = new g();

        public g() {
            super(-3, "不支持上网服务", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$h;", "Lcom/heytap/health/esim/nsc/repo/a;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class h extends a {
        public static final int $stable = 0;

        @NotNull
        public static final h INSTANCE = new h();

        /* JADX WARN: Multi-variable type inference failed */
        public h() {
            super(0, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.esim.nsc.repo.a$i, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$i;", "Lcom/heytap/health/esim/nsc/repo/a;", "", "toString", "", "hashCode", "", "other", "", "equals", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "msg", "<init>", "(Ljava/lang/String;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class OTHER extends a {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @NotNull
        public final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OTHER(@NotNull String msg) {
            super(6, msg, null);
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.msg = msg;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OTHER) && Intrinsics.areEqual(this.msg, ((OTHER) other).msg);
        }

        public int hashCode() {
            return this.msg.hashCode();
        }

        @Override // com.heytap.health.esim.nsc.repo.a
        @NotNull
        public String toString() {
            return "OTHER(msg=" + this.msg + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.esim.nsc.repo.a$j, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/a$j;", "Lcom/heytap/health/esim/nsc/repo/a;", "", "toString", "", "hashCode", "", "other", "", "equals", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "msg", "<init>", "(Ljava/lang/String;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class OTHER_NETWORK extends a {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @NotNull
        public final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OTHER_NETWORK(@NotNull String msg) {
            super(7, msg, null);
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.msg = msg;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OTHER_NETWORK) && Intrinsics.areEqual(this.msg, ((OTHER_NETWORK) other).msg);
        }

        public int hashCode() {
            return this.msg.hashCode();
        }

        @Override // com.heytap.health.esim.nsc.repo.a
        @NotNull
        public String toString() {
            return "OTHER_NETWORK(msg=" + this.msg + ")";
        }
    }

    public /* synthetic */ a(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.index - other.index;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public String toString() {
        return this.message;
    }

    public a(int i, String str) {
        this.index = i;
        this.message = str;
    }

    public /* synthetic */ a(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, null);
    }
}
