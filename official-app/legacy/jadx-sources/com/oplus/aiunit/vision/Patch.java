package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.g9e, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\nB+\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/g9e;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "setAdds", "(Ljava/util/List;)V", "adds", "b", "setRemoves", "removes", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Patch {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "Patch";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("add")
    @Nullable
    private List<String> adds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(EventType.STATE_PACKAGE_CHANGED_REMOVE)
    @Nullable
    private List<String> removes;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.g9e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007R\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/g9e$a;", "", "", "", "originSrc", ClickApiEntity.NEW_SRC, "Lcom/oplus/aiunit/vision/g9e;", "a", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Patch a(@NotNull List<String> originSrc, @NotNull List<String> newSrc) {
            Intrinsics.checkNotNullParameter(originSrc, "originSrc");
            Intrinsics.checkNotNullParameter(newSrc, "newSrc");
            ltl.a(Patch.TAG, "create originSrc " + originSrc + " newSrc " + newSrc);
            List listB = cza.b(newSrc, originSrc);
            List listC = cza.c(newSrc, originSrc);
            ltl.a(Patch.TAG, "create addList " + listB + " removeList " + listC);
            return new Patch(listB, listC);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final Patch b() {
            return new Patch(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Patch() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final List<String> a() {
        return this.adds;
    }

    @Nullable
    public final List<String> b() {
        return this.removes;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Patch)) {
            return false;
        }
        Patch patch = (Patch) other;
        return Intrinsics.areEqual(this.adds, patch.adds) && Intrinsics.areEqual(this.removes, patch.removes);
    }

    public int hashCode() {
        List<String> list = this.adds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.removes;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Patch(adds=" + this.adds + ", removes=" + this.removes + ")";
    }

    public Patch(@Nullable List<String> list, @Nullable List<String> list2) {
        this.adds = list;
        this.removes = list2;
    }

    public /* synthetic */ Patch(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
