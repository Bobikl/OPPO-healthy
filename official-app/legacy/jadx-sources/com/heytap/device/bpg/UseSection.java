package com.heytap.device.bpg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/device/bpg/UseSection;", "Landroid/os/Parcelable;", "title", "Lcom/heytap/device/bpg/UseRichText;", "blocks", "", "Lcom/heytap/device/bpg/UseBlock;", "(Lcom/heytap/device/bpg/UseRichText;Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "getTitle", "()Lcom/heytap/device/bpg/UseRichText;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_third_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UseSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UseSection> CREATOR = new a();

    @NotNull
    private final List<UseBlock> blocks;

    @NotNull
    private final UseRichText title;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UseSection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UseSection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UseRichText useRichTextCreateFromParcel = UseRichText.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UseBlock.CREATOR.createFromParcel(parcel));
            }
            return new UseSection(useRichTextCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UseSection[] newArray(int i) {
            return new UseSection[i];
        }
    }

    public UseSection(@NotNull UseRichText title, @NotNull List<UseBlock> blocks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.title = title;
        this.blocks = blocks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UseSection copy$default(UseSection useSection, UseRichText useRichText, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            useRichText = useSection.title;
        }
        if ((i & 2) != 0) {
            list = useSection.blocks;
        }
        return useSection.copy(useRichText, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UseRichText getTitle() {
        return this.title;
    }

    @NotNull
    public final List<UseBlock> component2() {
        return this.blocks;
    }

    @NotNull
    public final UseSection copy(@NotNull UseRichText title, @NotNull List<UseBlock> blocks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new UseSection(title, blocks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UseSection)) {
            return false;
        }
        UseSection useSection = (UseSection) other;
        return Intrinsics.areEqual(this.title, useSection.title) && Intrinsics.areEqual(this.blocks, useSection.blocks);
    }

    @NotNull
    public final List<UseBlock> getBlocks() {
        return this.blocks;
    }

    @NotNull
    public final UseRichText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.blocks.hashCode();
    }

    @NotNull
    public String toString() {
        return "UseSection(title=" + this.title + ", blocks=" + this.blocks + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.title.writeToParcel(parcel, flags);
        List<UseBlock> list = this.blocks;
        parcel.writeInt(list.size());
        Iterator<UseBlock> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ UseSection(UseRichText useRichText, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(useRichText, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
