package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.TrackMetadataStat;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/cei;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/oplus/aiunit/vision/cei$a;", "Lcom/oplus/aiunit/vision/cei$b;", "Lcom/oplus/aiunit/vision/cei$c;", "Lcom/oplus/aiunit/vision/cei$d;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class cei {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/cei$a;", "Lcom/oplus/aiunit/vision/cei;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends cei {
        public static final int $stable = 0;

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/cei$b;", "Lcom/oplus/aiunit/vision/cei;", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "Ljava/util/List;", "()Ljava/util/List;", "defaultData", "", "b", "Z", "()Z", "hasMore", "<init>", "(Ljava/util/List;Z)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends cei {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<TrackMetadataStat> defaultData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean hasMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends TrackMetadataStat> defaultData, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(defaultData, "defaultData");
            this.defaultData = defaultData;
            this.hasMore = z;
        }

        @NotNull
        public final List<TrackMetadataStat> a() {
            return this.defaultData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/cei$c;", "Lcom/oplus/aiunit/vision/cei;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends cei {
        public static final int $stable = 0;

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/cei$d;", "Lcom/oplus/aiunit/vision/cei;", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "moreData", "", "b", "Z", "()Z", "hasMore", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "jumpToDate", "<init>", "(Ljava/util/List;ZLjava/time/LocalDate;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends cei {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<TrackMetadataStat> moreData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean hasMore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final LocalDate jumpToDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull List<? extends TrackMetadataStat> moreData, boolean z, @Nullable LocalDate localDate) {
            super(null);
            Intrinsics.checkNotNullParameter(moreData, "moreData");
            this.moreData = moreData;
            this.hasMore = z;
            this.jumpToDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getJumpToDate() {
            return this.jumpToDate;
        }

        @NotNull
        public final List<TrackMetadataStat> c() {
            return this.moreData;
        }

        public /* synthetic */ d(List list, boolean z, LocalDate localDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, (i & 4) != 0 ? null : localDate);
        }
    }

    public cei() {
    }

    public /* synthetic */ cei(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
