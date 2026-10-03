package com.heytap.health.connect.rawapi.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/b;", "Lcom/heytap/health/connect/rawapi/impl/listener/a;", "<init>", "()V", "Companion", "a", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class b extends com.heytap.health.connect.rawapi.impl.listener.a {

    @Nullable
    public static b A;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.health.connect.rawapi.impl.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/b$a;", "", "Lcom/heytap/health/connect/rawapi/impl/b;", "a", "sInstance", "Lcom/heytap/health/connect/rawapi/impl/b;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized b a() {
            b bVar;
            bVar = b.A;
            if (bVar == null) {
                bVar = new b();
                b.A = bVar;
            }
            return bVar;
        }
    }
}
