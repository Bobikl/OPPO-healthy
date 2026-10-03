package com.oplus.deepthinker.sdk.app.awareness.fence;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0002=>B?\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b9\u0010;J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R$\u00106\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!¨\u0006?"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFence;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "component2", "", "component3", "Landroid/os/Bundle;", "component4", "component5", "fenceName", "fenceType", "fenceDuration", "fenceArgs", "fenceCategory", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getFenceName", "()Ljava/lang/String;", "setFenceName", "(Ljava/lang/String;)V", "getFenceType", "setFenceType", "J", "getFenceDuration", "()J", "setFenceDuration", "(J)V", "Landroid/os/Bundle;", "getFenceArgs", "()Landroid/os/Bundle;", "setFenceArgs", "(Landroid/os/Bundle;)V", "I", "getFenceCategory", "()I", "setFenceCategory", "(I)V", "packageName", "getPackageName", "setPackageName", "fenceId", "getFenceId", "setFenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "b", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class AwarenessFence implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Bundle fenceArgs;
    private int fenceCategory;
    private long fenceDuration;

    @Nullable
    private String fenceId;

    @Nullable
    private String fenceName;

    @Nullable
    private String fenceType;

    @Nullable
    private String packageName;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFence$a;", "", "Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFence;", "a", "", "Ljava/lang/String;", "fenceName", "b", "fenceType", "", "c", "J", "fenceDuration", "Landroid/os/Bundle;", "d", "Landroid/os/Bundle;", "fenceArgs", "", MapSchema.FIELD_NAME_ENTRY, "I", "fenceCategory", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String fenceName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String fenceType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long fenceDuration;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public Bundle fenceArgs;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int fenceCategory = 1;

        @NotNull
        public final AwarenessFence a() {
            return new AwarenessFence(this.fenceName, this.fenceType, this.fenceDuration, this.fenceArgs, this.fenceCategory);
        }
    }

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.fence.AwarenessFence$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\b\u001a\u00020\u00022\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFence$b;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFence;", "Lkotlin/Function1;", "Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFence$a;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "Landroid/os/Parcel;", "parcel", "b", "", "size", "", "c", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFence;", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<AwarenessFence> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AwarenessFence a(@NotNull Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return aVar.a();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AwarenessFence createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AwarenessFence(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AwarenessFence[] newArray(int size) {
            return new AwarenessFence[size];
        }
    }

    public AwarenessFence() {
        this(null, null, 0L, null, 0, 31, null);
    }

    @JvmStatic
    @NotNull
    public static final AwarenessFence build(@NotNull Function1<? super a, Unit> function1) {
        return INSTANCE.a(function1);
    }

    public static /* synthetic */ AwarenessFence copy$default(AwarenessFence awarenessFence, String str, String str2, long j2, Bundle bundle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awarenessFence.fenceName;
        }
        if ((i2 & 2) != 0) {
            str2 = awarenessFence.fenceType;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j2 = awarenessFence.fenceDuration;
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            bundle = awarenessFence.fenceArgs;
        }
        Bundle bundle2 = bundle;
        if ((i2 & 16) != 0) {
            i = awarenessFence.fenceCategory;
        }
        return awarenessFence.copy(str, str3, j3, bundle2, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFenceName() {
        return this.fenceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFenceType() {
        return this.fenceType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getFenceDuration() {
        return this.fenceDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bundle getFenceArgs() {
        return this.fenceArgs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFenceCategory() {
        return this.fenceCategory;
    }

    @NotNull
    public final AwarenessFence copy(@Nullable String fenceName, @Nullable String fenceType, long fenceDuration, @Nullable Bundle fenceArgs, int fenceCategory) {
        return new AwarenessFence(fenceName, fenceType, fenceDuration, fenceArgs, fenceCategory);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwarenessFence)) {
            return false;
        }
        AwarenessFence awarenessFence = (AwarenessFence) other;
        return Intrinsics.areEqual(this.fenceName, awarenessFence.fenceName) && Intrinsics.areEqual(this.fenceType, awarenessFence.fenceType) && this.fenceDuration == awarenessFence.fenceDuration && Intrinsics.areEqual(this.fenceArgs, awarenessFence.fenceArgs) && this.fenceCategory == awarenessFence.fenceCategory;
    }

    @Nullable
    public final Bundle getFenceArgs() {
        return this.fenceArgs;
    }

    public final int getFenceCategory() {
        return this.fenceCategory;
    }

    public final long getFenceDuration() {
        return this.fenceDuration;
    }

    @Nullable
    public final String getFenceId() {
        return this.fenceId;
    }

    @Nullable
    public final String getFenceName() {
        return this.fenceName;
    }

    @Nullable
    public final String getFenceType() {
        return this.fenceType;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        String str = this.fenceName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fenceType;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.fenceDuration)) * 31;
        Bundle bundle = this.fenceArgs;
        return ((iHashCode2 + (bundle != null ? bundle.hashCode() : 0)) * 31) + Integer.hashCode(this.fenceCategory);
    }

    public final void setFenceArgs(@Nullable Bundle bundle) {
        this.fenceArgs = bundle;
    }

    public final void setFenceCategory(int i) {
        this.fenceCategory = i;
    }

    public final void setFenceDuration(long j2) {
        this.fenceDuration = j2;
    }

    public final void setFenceId(@Nullable String str) {
        this.fenceId = str;
    }

    public final void setFenceName(@Nullable String str) {
        this.fenceName = str;
    }

    public final void setFenceType(@Nullable String str) {
        this.fenceType = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    @NotNull
    public String toString() {
        return "AwarenessFence(fenceName=" + ((Object) this.fenceName) + ", fenceType=" + ((Object) this.fenceType) + ", fenceDuration=" + this.fenceDuration + ", fenceArgs=" + this.fenceArgs + ", fenceCategory=" + this.fenceCategory + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.fenceName);
        parcel.writeString(this.fenceType);
        parcel.writeLong(this.fenceDuration);
        parcel.writeBundle(this.fenceArgs);
        parcel.writeInt(this.fenceCategory);
        parcel.writeString(this.packageName);
        parcel.writeString(this.fenceId);
    }

    public AwarenessFence(@Nullable String str, @Nullable String str2, long j2, @Nullable Bundle bundle, int i) {
        this.fenceName = str;
        this.fenceType = str2;
        this.fenceDuration = j2;
        this.fenceArgs = bundle;
        this.fenceCategory = i;
    }

    public /* synthetic */ AwarenessFence(String str, String str2, long j2, Bundle bundle, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? null : bundle, (i2 & 16) != 0 ? 1 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AwarenessFence(@NotNull Parcel parcel) {
        this(null, null, 0L, null, 0, 31, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.fenceName = parcel.readString();
        this.fenceType = parcel.readString();
        this.fenceDuration = parcel.readLong();
        this.fenceArgs = parcel.readBundle(AwarenessFence.class.getClassLoader());
        this.fenceCategory = parcel.readInt();
        this.packageName = parcel.readString();
        this.fenceId = parcel.readString();
    }
}
