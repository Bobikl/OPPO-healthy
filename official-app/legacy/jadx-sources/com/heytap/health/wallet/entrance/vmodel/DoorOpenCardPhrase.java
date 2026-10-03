package com.heytap.health.wallet.entrance.vmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Parcelize
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/wallet/entrance/vmodel/DoorOpenCardPhrase;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "F_UNKNOWN", "F_CHECK_ENV", "F_STICK_CARD", "F_STICK_CARD_2", "F_READ_DOOR_DATA", "F_DEEP_READ_DOOR_DATA", "F_OPEN_DOOR", "F_OPEN_RESULT", "F_PICK_LOCATION", "entrance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum DoorOpenCardPhrase implements Parcelable {
    F_UNKNOWN,
    F_CHECK_ENV,
    F_STICK_CARD,
    F_STICK_CARD_2,
    F_READ_DOOR_DATA,
    F_DEEP_READ_DOOR_DATA,
    F_OPEN_DOOR,
    F_OPEN_RESULT,
    F_PICK_LOCATION;


    @NotNull
    public static final Parcelable.Creator<DoorOpenCardPhrase> CREATOR = new Parcelable.Creator<DoorOpenCardPhrase>() { // from class: com.heytap.health.wallet.entrance.vmodel.DoorOpenCardPhrase.a
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DoorOpenCardPhrase createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return DoorOpenCardPhrase.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DoorOpenCardPhrase[] newArray(int i) {
            return new DoorOpenCardPhrase[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(name());
    }
}
