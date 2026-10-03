package com.oplus.nearx.track.internal.balance;

import com.oplus.aiunit.vision.b2n;
import com.oplus.nearx.track.internal.common.UploadType;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\f\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\f\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006 "}, d2 = {"Lcom/oplus/nearx/track/internal/balance/BalanceEvent;", "", "", MapSchema.FIELD_NAME_ENTRY, "", "a", "Z", "isRealTime", "()Z", "setRealTime", "(Z)V", "", "b", "I", "d", "()I", b2n.g, "(I)V", "uploadType", "", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "createList", b2n.f, "uploadSuccessList", "<init>", "()V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class BalanceEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy<ConcurrentLinkedQueue<BalanceEvent>> f19924e = LazyKt__LazyJVMKt.lazy(new Function0<ConcurrentLinkedQueue<BalanceEvent>>() { // from class: com.oplus.nearx.track.internal.balance.BalanceEvent$Companion$pool$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentLinkedQueue<BalanceEvent> invoke() {
            return new ConcurrentLinkedQueue<>();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isRealTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int uploadType = UploadType.TIMING.getUploadType();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<Long> createList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public List<Long> uploadSuccessList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.balance.BalanceEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/nearx/track/internal/balance/BalanceEvent$a;", "", "Lcom/oplus/nearx/track/internal/balance/BalanceEvent;", "d", "b", "event", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/concurrent/ConcurrentLinkedQueue;", "pool$delegate", "Lkotlin/Lazy;", "c", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "pool", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BalanceEvent b() {
            return c().poll();
        }

        public final ConcurrentLinkedQueue<BalanceEvent> c() {
            return (ConcurrentLinkedQueue) BalanceEvent.f19924e.getValue();
        }

        @NotNull
        public final BalanceEvent d() {
            BalanceEvent balanceEventB = b();
            return balanceEventB == null ? new BalanceEvent() : balanceEventB;
        }

        public final boolean e(BalanceEvent event) {
            return c().offer(event);
        }
    }

    @Nullable
    public final List<Long> b() {
        return this.createList;
    }

    @Nullable
    public final List<Long> c() {
        return this.uploadSuccessList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getUploadType() {
        return this.uploadType;
    }

    public final synchronized void e() {
        this.isRealTime = false;
        this.createList = null;
        this.uploadSuccessList = null;
        INSTANCE.e(this);
    }

    public final void f(@Nullable List<Long> list) {
        this.createList = list;
    }

    public final void g(@Nullable List<Long> list) {
        this.uploadSuccessList = list;
    }

    public final void h(int i) {
        this.uploadType = i;
    }
}
