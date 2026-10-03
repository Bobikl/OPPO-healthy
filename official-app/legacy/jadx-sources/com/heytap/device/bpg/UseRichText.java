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
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/device/bpg/UseRichText;", "Landroid/os/Parcelable;", "align", "", "spans", "", "Lcom/heytap/device/bpg/UseSpan;", "(Ljava/lang/String;Ljava/util/List;)V", "getAlign", "()Ljava/lang/String;", "getSpans", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "plainText", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_third_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UseRichText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UseRichText> CREATOR = new a();

    @Nullable
    private final String align;

    @NotNull
    private final List<UseSpan> spans;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UseRichText> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UseRichText createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UseSpan.CREATOR.createFromParcel(parcel));
            }
            return new UseRichText(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UseRichText[] newArray(int i) {
            return new UseRichText[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UseRichText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UseRichText copy$default(UseRichText useRichText, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = useRichText.align;
        }
        if ((i & 2) != 0) {
            list = useRichText.spans;
        }
        return useRichText.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlign() {
        return this.align;
    }

    @NotNull
    public final List<UseSpan> component2() {
        return this.spans;
    }

    @NotNull
    public final UseRichText copy(@Nullable String align, @NotNull List<UseSpan> spans) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        return new UseRichText(align, spans);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UseRichText)) {
            return false;
        }
        UseRichText useRichText = (UseRichText) other;
        return Intrinsics.areEqual(this.align, useRichText.align) && Intrinsics.areEqual(this.spans, useRichText.spans);
    }

    @Nullable
    public final String getAlign() {
        return this.align;
    }

    @NotNull
    public final List<UseSpan> getSpans() {
        return this.spans;
    }

    public int hashCode() {
        String str = this.align;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.spans.hashCode();
    }

    @NotNull
    public final String plainText() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.spans, "", null, null, 0, null, new Function1<UseSpan, CharSequence>() { // from class: com.heytap.device.bpg.UseRichText.plainText.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull UseSpan it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getText();
            }
        }, 30, null);
    }

    @NotNull
    public String toString() {
        return "UseRichText(align=" + this.align + ", spans=" + this.spans + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.align);
        List<UseSpan> list = this.spans;
        parcel.writeInt(list.size());
        Iterator<UseSpan> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public UseRichText(@Nullable String str, @NotNull List<UseSpan> spans) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        this.align = str;
        this.spans = spans;
    }

    public /* synthetic */ UseRichText(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
