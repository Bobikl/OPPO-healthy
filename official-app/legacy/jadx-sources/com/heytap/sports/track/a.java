package com.heytap.sports.track;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.StyleConfig;
import com.oplus.aiunit.vision.jzj;
import com.oplus.aiunit.vision.ws4;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/sports/track/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/heytap/sports/track/a$a;", "Lcom/heytap/sports/track/a$b;", "Lcom/heytap/sports/track/a$c;", "Lcom/heytap/sports/track/a$d;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.heytap.sports.track.a$a, reason: collision with other inner class name and from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/sports/track/a$a;", "Lcom/heytap/sports/track/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lcom/oplus/aiunit/vision/ws4;", "a", "Ljava/util/List;", "()Ljava/util/List;", "curveDatas", "<init>", "(Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EditingData extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<ws4> curveDatas;

        /* JADX WARN: Multi-variable type inference failed */
        public EditingData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Nullable
        public final List<ws4> a() {
            return this.curveDatas;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditingData) && Intrinsics.areEqual(this.curveDatas, ((EditingData) other).curveDatas);
        }

        public int hashCode() {
            List<ws4> list = this.curveDatas;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "EditingData(curveDatas=" + this.curveDatas + ")";
        }

        public EditingData(@Nullable List<ws4> list) {
            super(null);
            this.curveDatas = list;
        }

        public /* synthetic */ EditingData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    /* JADX INFO: renamed from: com.heytap.sports.track.a$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/sports/track/a$b;", "Lcom/heytap/sports/track/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/oplus/aiunit/vision/l2j;", "a", "Lcom/oplus/aiunit/vision/l2j;", "getConfig", "()Lcom/oplus/aiunit/vision/l2j;", "config", "<init>", "(Lcom/oplus/aiunit/vision/l2j;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EditingMap extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final StyleConfig config;

        /* JADX WARN: Multi-variable type inference failed */
        public EditingMap() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditingMap) && Intrinsics.areEqual(this.config, ((EditingMap) other).config);
        }

        public int hashCode() {
            StyleConfig styleConfig = this.config;
            if (styleConfig == null) {
                return 0;
            }
            return styleConfig.hashCode();
        }

        @NotNull
        public String toString() {
            return "EditingMap(config=" + this.config + ")";
        }

        public EditingMap(@Nullable StyleConfig styleConfig) {
            super(null);
            this.config = styleConfig;
        }

        public /* synthetic */ EditingMap(StyleConfig styleConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : styleConfig);
        }
    }

    /* JADX INFO: renamed from: com.heytap.sports.track.a$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/sports/track/a$c;", "Lcom/heytap/sports/track/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lcom/oplus/aiunit/vision/jzj;", "a", "Ljava/util/List;", "()Ljava/util/List;", "timeStyles", "<init>", "(Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EditingTime extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<jzj> timeStyles;

        /* JADX WARN: Multi-variable type inference failed */
        public EditingTime() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Nullable
        public final List<jzj> a() {
            return this.timeStyles;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditingTime) && Intrinsics.areEqual(this.timeStyles, ((EditingTime) other).timeStyles);
        }

        public int hashCode() {
            List<jzj> list = this.timeStyles;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "EditingTime(timeStyles=" + this.timeStyles + ")";
        }

        public EditingTime(@Nullable List<jzj> list) {
            super(null);
            this.timeStyles = list;
        }

        public /* synthetic */ EditingTime(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/sports/track/a$d;", "Lcom/heytap/sports/track/a;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends a {
        public static final int $stable = 0;

        @NotNull
        public static final d INSTANCE = new d();

        public d() {
            super(null);
        }
    }

    public a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
