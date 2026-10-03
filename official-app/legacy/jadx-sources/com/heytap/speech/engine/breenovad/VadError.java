package com.heytap.speech.engine.breenovad;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class VadError implements Parcelable {
    public static final Parcelable.Creator<VadError> CREATOR = new a();
    public static final String ERR_DESCRIPTION_PCM_LOST = "lost pcm";
    public static final String ERR_DESCRIPTION_VAD_ENGINE = "can't start engine";
    public static final int ERR_NO_SPEECH = 70904;
    public static final int ERR_PCM_LOST = 70905;
    public static final int ERR_VAD_ENGINE = 70902;
    private String error;
    private int errorId;

    public class a implements Parcelable.Creator<VadError> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VadError createFromParcel(Parcel parcel) {
            return new VadError(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VadError[] newArray(int i) {
            return new VadError[i];
        }
    }

    public VadError(int i, String str) {
        this.errorId = i;
        this.error = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getError() {
        return this.error;
    }

    public int getErrorId() {
        return this.errorId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.error);
        parcel.writeInt(this.errorId);
    }

    public VadError(Parcel parcel) {
        this.error = parcel.readString();
        this.errorId = parcel.readInt();
    }
}
