package com.heytap.health.watchpair.manager;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watchpair/manager/c;", "", "", "a", "<init>", "()V", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/watchpair/manager/c$a;", "Lcom/heytap/health/watchpair/manager/c$b;", "Lcom/heytap/health/watchpair/manager/c$c;", "Lcom/heytap/health/watchpair/manager/c$d;", "Lcom/heytap/health/watchpair/manager/c$e;", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchpair/manager/c$a;", "Lcom/heytap/health/watchpair/manager/c;", "", "toString", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends c {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "AlreadyDownloadSuccess";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/watchpair/manager/c$b;", "Lcom/heytap/health/watchpair/manager/c;", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "msg", "<init>", "(Ljava/lang/String;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String msg) {
            super(null);
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.msg = msg;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        @NotNull
        public String toString() {
            return "DownloadFail msg:" + this.msg;
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.watchpair.manager.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchpair/manager/c$c;", "Lcom/heytap/health/watchpair/manager/c;", "", "toString", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0709c extends c {

        @NotNull
        public static final C0709c INSTANCE = new C0709c();

        public C0709c() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "DownloadSuccess";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchpair/manager/c$d;", "Lcom/heytap/health/watchpair/manager/c;", "", "toString", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends c {

        @NotNull
        public static final d INSTANCE = new d();

        public d() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Downloading";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchpair/manager/c$e;", "Lcom/heytap/health/watchpair/manager/c;", "", "toString", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class e extends c {

        @NotNull
        public static final e INSTANCE = new e();

        public e() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Init";
        }
    }

    public c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return Intrinsics.areEqual(this, a.INSTANCE) || Intrinsics.areEqual(this, C0709c.INSTANCE);
    }
}
