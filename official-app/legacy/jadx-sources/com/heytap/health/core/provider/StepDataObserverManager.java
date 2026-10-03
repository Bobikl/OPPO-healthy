package com.heytap.health.core.provider;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/core/provider/StepDataObserverManager;", "", "Lcom/heytap/health/core/provider/StepDataObserverManager$a;", "listener", "", "addListener", "removeListener", "c", "d", "", "a", "Ljava/util/List;", "listeners", "", "b", "Z", "registered", "Landroid/database/ContentObserver;", "Lkotlin/Lazy;", "()Landroid/database/ContentObserver;", "contentObserver", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class StepDataObserverManager {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean registered;

    @NotNull
    public static final StepDataObserverManager INSTANCE = new StepDataObserverManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<a> listeners = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy contentObserver = LazyKt__LazyJVMKt.lazy(new Function0<StepDataObserverManager$contentObserver$2.a>() { // from class: com.heytap.health.core.provider.StepDataObserverManager$contentObserver$2

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/core/provider/StepDataObserverManager$contentObserver$2$a", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "operations_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                List list;
                super.onChange(selfChange);
                int size = StepDataObserverManager.listeners.size();
                StringBuilder sb = new StringBuilder();
                sb.append("onChange, listeners size=");
                sb.append(size);
                synchronized (StepDataObserverManager.listeners) {
                    list = CollectionsKt___CollectionsKt.toList(StepDataObserverManager.listeners);
                    Unit unit = Unit.INSTANCE;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((StepDataObserverManager.a) it.next()).a();
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
            return new a(new Handler(Looper.getMainLooper()));
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/core/provider/StepDataObserverManager$a;", "", "", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();
    }

    public final synchronized void addListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<a> list = listeners;
        if (!list.contains(listener)) {
            list.add(listener);
            int size = list.size();
            StringBuilder sb = new StringBuilder();
            sb.append("addListener, size=");
            sb.append(size);
        }
        c();
    }

    public final ContentObserver b() {
        return (ContentObserver) contentObserver.getValue();
    }

    public final synchronized void c() {
        if (!registered && (!listeners.isEmpty())) {
            Context contextA = b78.a();
            if (contextA == null) {
                return;
            }
            contextA.getContentResolver().registerContentObserver(Uri.parse("content://com.heytap.health.sporthealthprovider/self/sport"), true, b());
            registered = true;
            a7b.f("StepDataObserverManager", "ContentObserver registered");
        }
    }

    public final synchronized void d() {
        if (registered && listeners.isEmpty()) {
            Context contextA = b78.a();
            if (contextA == null) {
                return;
            }
            contextA.getContentResolver().unregisterContentObserver(b());
            registered = false;
            a7b.f("StepDataObserverManager", "ContentObserver unregistered");
        }
    }

    public final synchronized void removeListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<a> list = listeners;
        list.remove(listener);
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        sb.append("removeListener, size=");
        sb.append(size);
        d();
    }
}
