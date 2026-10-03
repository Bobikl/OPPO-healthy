package com.oplus.aiunit.vision;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0002\n\tB\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/n9a;", "", "", "ssoid", "", "type", "", "timestamp", "", "b", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "()V", "Companion", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class n9a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, Long> cache;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.n9a$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/n9a$a;", "", "Lcom/oplus/aiunit/vision/n9a;", "a", "()Lcom/oplus/aiunit/vision/n9a;", "instance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n9a a() {
            return b.INSTANCE.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/n9a$b;", "", "Lcom/oplus/aiunit/vision/n9a;", "a", "Lcom/oplus/aiunit/vision/n9a;", "()Lcom/oplus/aiunit/vision/n9a;", "instance", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        @NotNull
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final n9a instance = new n9a(null);

        @NotNull
        public final n9a a() {
            return instance;
        }
    }

    public /* synthetic */ n9a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final long a(@Nullable String ssoid, int type) {
        Long lValueOf = this.cache.get(ssoid + "_" + type);
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        long jLongValue = lValueOf.longValue();
        cj4.c("InsertDataTimestampCache", "get type:" + type + ", timestamp:" + jLongValue);
        return jLongValue;
    }

    public final void b(@Nullable String ssoid, int type, long timestamp) {
        cj4.c("InsertDataTimestampCache", "set type:" + type + ", timestamp:" + timestamp);
        Long lValueOf = Long.valueOf(timestamp);
        this.cache.put(ssoid + "_" + type, lValueOf);
    }

    public n9a() {
        this.cache = new ConcurrentHashMap<>();
    }
}
