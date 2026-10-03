package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.bean.BottomUIState;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0006\u0011\u0012B\u001f\b\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/b43;", "", "", "Lcom/oplus/aiunit/vision/pn9;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "cardList", "Lcom/heytap/health/cardiovascular/bean/BottomUIState;", "Lcom/heytap/health/cardiovascular/bean/BottomUIState;", "()Lcom/heytap/health/cardiovascular/bean/BottomUIState;", "setBottomUIState", "(Lcom/heytap/health/cardiovascular/bean/BottomUIState;)V", "bottomUIState", "<init>", "(Ljava/util/List;Lcom/heytap/health/cardiovascular/bean/BottomUIState;)V", "c", "d", "Lcom/oplus/aiunit/vision/b43$a;", "Lcom/oplus/aiunit/vision/b43$b;", "Lcom/oplus/aiunit/vision/b43$c;", "Lcom/oplus/aiunit/vision/b43$d;", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public abstract class b43 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<pn9> cardList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public BottomUIState bottomUIState;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/b43$a;", "Lcom/oplus/aiunit/vision/b43;", "", "c", "Z", "getSupport60s", "()Z", "support60s", "", "Lcom/oplus/aiunit/vision/pn9;", "cardList", "Lcom/heytap/health/cardiovascular/bean/BottomUIState;", "bottomUIState", "<init>", "(ZLjava/util/List;Lcom/heytap/health/cardiovascular/bean/BottomUIState;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends b43 {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean support60s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, @NotNull List<pn9> cardList, @NotNull BottomUIState bottomUIState) {
            super(cardList, bottomUIState, null);
            Intrinsics.checkNotNullParameter(cardList, "cardList");
            Intrinsics.checkNotNullParameter(bottomUIState, "bottomUIState");
            this.support60s = z;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/b43$b;", "Lcom/oplus/aiunit/vision/b43;", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends b43 {
        public static final int $stable = 0;

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(new ArrayList(), BottomUIState.None, null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/b43$c;", "Lcom/oplus/aiunit/vision/b43;", "", "Lcom/oplus/aiunit/vision/pn9;", "cardList", "Lcom/heytap/health/cardiovascular/bean/BottomUIState;", "bottomUIState", "<init>", "(Ljava/util/List;Lcom/heytap/health/cardiovascular/bean/BottomUIState;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends b43 {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull List<pn9> cardList, @NotNull BottomUIState bottomUIState) {
            super(cardList, bottomUIState, null);
            Intrinsics.checkNotNullParameter(cardList, "cardList");
            Intrinsics.checkNotNullParameter(bottomUIState, "bottomUIState");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/b43$d;", "Lcom/oplus/aiunit/vision/b43;", "", "c", "I", "()I", "unReadOldDataSize", "", "Lcom/oplus/aiunit/vision/pn9;", "cardList", "Lcom/heytap/health/cardiovascular/bean/BottomUIState;", "bottomUIState", "<init>", "(ILjava/util/List;Lcom/heytap/health/cardiovascular/bean/BottomUIState;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends b43 {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int unReadOldDataSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, @NotNull List<pn9> cardList, @NotNull BottomUIState bottomUIState) {
            super(cardList, bottomUIState, null);
            Intrinsics.checkNotNullParameter(cardList, "cardList");
            Intrinsics.checkNotNullParameter(bottomUIState, "bottomUIState");
            this.unReadOldDataSize = i;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getUnReadOldDataSize() {
            return this.unReadOldDataSize;
        }
    }

    public /* synthetic */ b43(List list, BottomUIState bottomUIState, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, bottomUIState);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BottomUIState getBottomUIState() {
        return this.bottomUIState;
    }

    @NotNull
    public final List<pn9> b() {
        return this.cardList;
    }

    public b43(List<pn9> list, BottomUIState bottomUIState) {
        this.cardList = list;
        this.bottomUIState = bottomUIState;
    }
}
