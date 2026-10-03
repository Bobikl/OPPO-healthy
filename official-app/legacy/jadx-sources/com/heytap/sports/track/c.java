package com.heytap.sports.track;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.StyleConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/sports/track/c;", "", "<init>", "()V", "a", "b", "Lcom/heytap/sports/track/c$a;", "Lcom/heytap/sports/track/c$b;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class c {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.heytap.sports.track.c$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/sports/track/c$a;", "Lcom/heytap/sports/track/c;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/oplus/aiunit/vision/l2j;", "a", "Lcom/oplus/aiunit/vision/l2j;", "()Lcom/oplus/aiunit/vision/l2j;", "config", "<init>", "(Lcom/oplus/aiunit/vision/l2j;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Change extends c {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final StyleConfig config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Change(@NotNull StyleConfig config) {
            super(null);
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final StyleConfig getConfig() {
            return this.config;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Change) && Intrinsics.areEqual(this.config, ((Change) other).config);
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Change(config=" + this.config + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/sports/track/c$b;", "Lcom/heytap/sports/track/c;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends c {
        public static final int $stable = 0;

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(null);
        }
    }

    public c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
