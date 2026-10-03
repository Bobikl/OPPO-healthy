package com.oplus.ocs.wearengine.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.MessageLite;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u0018*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ProtoParcelable;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/protobuf/MessageLite;", "Landroid/os/Parcelable;", "()V", "bytes", "", "getBytes", "()[B", "proto", "getProto", "()Lcom/google/protobuf/MessageLite;", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class ProtoParcelable<T extends MessageLite> implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u000e\b\u0001\u0010\u0005\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00062\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00050\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ProtoParcelable$Companion;", "", "()V", "newCreator", "Landroid/os/Parcelable$Creator;", "U", "Lcom/oplus/ocs/wearengine/data/ProtoParcelable;", "parser", "Lkotlin/Function1;", "", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final /* synthetic */ <U extends ProtoParcelable<?>> Parcelable.Creator<U> newCreator(final Function1<? super byte[], ? extends U> parser) {
            Intrinsics.checkNotNullParameter(parser, "parser");
            Intrinsics.needClassReification();
            return (Parcelable.Creator<U>) new Parcelable.Creator<U>() { // from class: com.oplus.ocs.wearengine.data.ProtoParcelable$Companion$newCreator$1
                /* JADX WARN: Incorrect return type in method signature: (Landroid/os/Parcel;)TU; */
                @Override // android.os.Parcelable.Creator
                @Nullable
                public ProtoParcelable createFromParcel(@NotNull Parcel source) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    byte[] bArrCreateByteArray = source.createByteArray();
                    if (bArrCreateByteArray == null) {
                        return null;
                    }
                    return (ProtoParcelable) parser.invoke(bArrCreateByteArray);
                }

                /* JADX WARN: Incorrect return type in method signature: (I)[TU; */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public ProtoParcelable[] newArray(int size) {
                    Intrinsics.reifiedOperationMarker(0, "U?");
                    return new ProtoParcelable[size];
                }
            };
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        return Arrays.equals(getBytes(), ((ProtoParcelable) other).getBytes());
    }

    @NotNull
    public final byte[] getBytes() {
        byte[] byteArray = getProto().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "proto.toByteArray()");
        return byteArray;
    }

    @NotNull
    public abstract T getProto();

    public int hashCode() {
        return Arrays.hashCode(getBytes());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByteArray(getBytes());
    }
}
