package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001f\u0018\u0000 .2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010&\u001a\u00020\u0018\u0012\u0006\u0010)\u001a\u00020\u0015\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J.\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0014\u0010&\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/gcf;", "", "Lcom/oplus/aiunit/vision/gq;", "address", "Lcom/oplus/aiunit/vision/dcf;", "call", "", "Lcom/oplus/aiunit/vision/syf;", "routes", "", "requireMultiplexed", "a", "Lokhttp3/internal/connection/RealConnection;", "connection", "", b2n.f, "c", "", "host", MapSchema.FIELD_NAME_ENTRY, "d", "", "now", "b", "", "f", "J", "keepAliveDurationNs", "Lcom/oplus/aiunit/vision/xoj;", "Lcom/oplus/aiunit/vision/xoj;", "cleanupQueue", "com/oplus/aiunit/vision/gcf$b", "Lcom/oplus/aiunit/vision/gcf$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "I", "maxIdleConnections", "Lcom/oplus/aiunit/vision/yoj;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lcom/oplus/aiunit/vision/yoj;IJLjava/util/concurrent/TimeUnit;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class gcf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long keepAliveDurationNs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final xoj cleanupQueue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final b cleanupTask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final ConcurrentLinkedQueue<RealConnection> connections;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int maxIdleConnections;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/aiunit/vision/gcf$b", "Lcom/oplus/aiunit/vision/koj;", "", "f", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class b extends koj {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // com.oplus.aiunit.vision.koj
        public long f() {
            return gcf.this.b(System.nanoTime());
        }
    }

    public gcf(@NotNull yoj taskRunner, int i, long j2, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j2);
        this.cleanupQueue = taskRunner.i();
        this.cleanupTask = new b(sqk.okHttpName + " ConnectionPool");
        this.connections = new ConcurrentLinkedQueue<>();
        if (j2 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j2).toString());
    }

    public final boolean a(@NotNull gq address, @NotNull dcf call, @Nullable List<syf> routes, boolean requireMultiplexed) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        for (RealConnection connection : this.connections) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (requireMultiplexed) {
                    if (!connection.w()) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (connection.u(address, routes)) {
                    call.c(connection);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return false;
    }

    public final long b(long now) {
        int i = 0;
        long j2 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i2 = 0;
        for (RealConnection connection : this.connections) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (f(connection, now) > 0) {
                    i2++;
                } else {
                    i++;
                    long idleAtNs = now - connection.getIdleAtNs();
                    if (idleAtNs > j2) {
                        Unit unit = Unit.INSTANCE;
                        realConnection = connection;
                        j2 = idleAtNs;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        long j3 = this.keepAliveDurationNs;
        if (j2 < j3 && i <= this.maxIdleConnections) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(realConnection);
        synchronized (realConnection) {
            if (!realConnection.o().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() + j2 != now) {
                return 0L;
            }
            realConnection.E(true);
            this.connections.remove(realConnection);
            sqk.l(realConnection.F());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.a();
            }
            return 0L;
        }
    }

    public final boolean c(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (sqk.assertionsEnabled && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            xoj.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        connection.E(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
        return true;
    }

    public final void d(@Nullable gq address) {
        if (address == null) {
            return;
        }
        Platform.INSTANCE.get().log("evict addresss" + address.getUrl().getHost(), 3, null);
        synchronized (this) {
            for (RealConnection realConnection : this.connections) {
                if (Intrinsics.areEqual(address, realConnection.getRoute().getAddress())) {
                    realConnection.E(true);
                    return;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void e(@Nullable String host) {
        if (host == null) {
            return;
        }
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "connections.iterator()");
            while (it.hasNext()) {
                RealConnection next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "i.next()");
                RealConnection realConnection = next;
                if (Intrinsics.areEqual(host, realConnection.getRoute().getAddress().getUrl().getHost())) {
                    realConnection.E(true);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int f(RealConnection connection, long now) {
        if (sqk.assertionsEnabled && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        List<Reference<dcf>> listO = connection.o();
        int i = 0;
        while (i < listO.size()) {
            Reference<dcf> reference = listO.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.INSTANCE.get().logCloseableLeak("A connection to " + connection.getRoute().getAddress().getUrl() + " was leaked. Did you forget to close a response body?", ((dcf.c) reference).getCallStackTrace());
                listO.remove(i);
                connection.E(true);
                if (listO.isEmpty()) {
                    connection.D(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return listO.size();
    }

    public final void g(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!sqk.assertionsEnabled || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            xoj.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }
}
