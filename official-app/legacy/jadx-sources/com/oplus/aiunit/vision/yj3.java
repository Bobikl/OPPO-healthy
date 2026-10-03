package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/yj3;", "", "", "a", "I", "getType", "()I", "type", "b", "d", "level", "", "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", MapSchema.FIELD_NAME_KEY, "(Ljava/lang/String;)V", "title", b2n.g, "desc1", MapSchema.FIELD_NAME_ENTRY, "i", "desc2", "j", "descHighlight", b2n.f, "priority", "", "Z", "()Z", "isPositive", "<init>", "(II)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class yj3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int level;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String desc1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String desc2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String descHighlight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int priority;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean isPositive;

    /* JADX WARN: Illegal instructions before constructor call */
    public yj3() {
        int i = 0;
        this(i, i, 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDesc1() {
        return this.desc1;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDesc2() {
        return this.desc2;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescHighlight() {
        return this.descHighlight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsPositive() {
        return this.isPositive;
    }

    public final void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc1 = str;
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc2 = str;
    }

    public final void j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.descHighlight = str;
    }

    public final void k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    public yj3(int i, int i2) {
        int i3;
        this.type = i;
        this.level = i2;
        this.title = "";
        this.desc1 = "";
        this.desc2 = "";
        this.descHighlight = "";
        boolean z = false;
        if (i == 1) {
            if (1 <= i2 && i2 < 8) {
                i3 = 1;
            } else if (i2 == 8) {
                i3 = 2;
            } else {
                i3 = 3;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (1 <= i2 && i2 < 3) {
                    i3 = 1;
                }
            }
            i3 = 3;
        } else {
            if (1 <= i2 && i2 < 8) {
                i3 = 1;
            } else {
                i3 = 3;
            }
        }
        this.priority = i3;
        if (i == 1 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 3, 5, 6, 7}).contains(Integer.valueOf(i2)) : !(i == 2 ? !CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 4, 5, 7}).contains(Integer.valueOf(i2)) : i != 3 || i2 != 2)) {
            z = true;
        }
        this.isPositive = z;
    }

    public /* synthetic */ yj3(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
