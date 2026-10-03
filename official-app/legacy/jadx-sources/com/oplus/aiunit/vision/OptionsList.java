package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import io.protostuff.MapSchema;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hrd, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0015\u0010\u0010R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/hrd;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/util/List;)V", "picTypes", "", "Lcom/oplus/aiunit/vision/pz4;", "b", "setDataTypes", "dataTypes", "Lcom/oplus/aiunit/vision/wti;", "d", "setStickers", "stickers", "Lcom/oplus/aiunit/vision/nrj;", "setLayTypes", "layTypes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OptionsList {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public List<? extends JViewBean> picTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public List<DataType> dataTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public List<Sticker> stickers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public List<? extends nrj> layTypes;

    public OptionsList() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public final List<DataType> a() {
        return this.dataTypes;
    }

    @NotNull
    public final List<nrj> b() {
        return this.layTypes;
    }

    @NotNull
    public final List<? extends JViewBean> c() {
        return this.picTypes;
    }

    @NotNull
    public final List<Sticker> d() {
        return this.stickers;
    }

    public final void e(@NotNull List<? extends JViewBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.picTypes = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsList)) {
            return false;
        }
        OptionsList optionsList = (OptionsList) other;
        return Intrinsics.areEqual(this.picTypes, optionsList.picTypes) && Intrinsics.areEqual(this.dataTypes, optionsList.dataTypes) && Intrinsics.areEqual(this.stickers, optionsList.stickers) && Intrinsics.areEqual(this.layTypes, optionsList.layTypes);
    }

    public int hashCode() {
        return (((((this.picTypes.hashCode() * 31) + this.dataTypes.hashCode()) * 31) + this.stickers.hashCode()) * 31) + this.layTypes.hashCode();
    }

    @NotNull
    public String toString() {
        return "OptionsList(picTypes=" + this.picTypes + ", dataTypes=" + this.dataTypes + ", stickers=" + this.stickers + ", layTypes=" + this.layTypes + ")";
    }

    public OptionsList(@NotNull List<? extends JViewBean> picTypes, @NotNull List<DataType> dataTypes, @NotNull List<Sticker> stickers, @NotNull List<? extends nrj> layTypes) {
        Intrinsics.checkNotNullParameter(picTypes, "picTypes");
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(stickers, "stickers");
        Intrinsics.checkNotNullParameter(layTypes, "layTypes");
        this.picTypes = picTypes;
        this.dataTypes = dataTypes;
        this.stickers = stickers;
        this.layTypes = layTypes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OptionsList(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        }
        if ((i & 2) != 0) {
            list2 = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(list2, "emptyList()");
        }
        if ((i & 4) != 0) {
            list3 = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(list3, "emptyList()");
        }
        if ((i & 8) != 0) {
            list4 = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(list4, "emptyList()");
        }
        this(list, list2, list3, list4);
    }
}
