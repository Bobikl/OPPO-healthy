package com.heytap.databaseengine.apiv3.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.safeparcel.AbstractSafeParcelable;
import com.heytap.databaseengine.safeparcel.SafeParcelReader;
import com.oplus.aiunit.vision.mcg;
import com.oplus.aiunit.vision.me8;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class MapValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapValue> CREATOR = new a();
    private static final String TAG = "MapValue";
    private int format;
    private float value;

    public class a implements Parcelable.Creator<MapValue> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MapValue createFromParcel(Parcel parcel) {
            return new MapValue(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MapValue[] newArray(int i) {
            return new MapValue[i];
        }
    }

    public MapValue(int i, float f) {
        this.format = i;
        this.value = f;
    }

    public static MapValue create(float f) {
        return new MapValue(3, f);
    }

    public float asFloat() {
        return this.value;
    }

    @NonNull
    public String toString() {
        return "MapValue{format=" + this.format + ", value=" + this.value + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iP = mcg.p(parcel);
        try {
            mcg.e(parcel, 1, Integer.valueOf(this.format));
            mcg.d(parcel, 2, Float.valueOf(this.value));
        } catch (Exception e2) {
            me8.i("Value", "Error writing field: " + e2);
        }
        mcg.a(parcel, iP);
    }

    public MapValue(Parcel parcel) {
        int iL = SafeParcelReader.l(parcel);
        while (parcel.dataPosition() < iL) {
            int iG = SafeParcelReader.g(parcel);
            int iA = SafeParcelReader.a(iG);
            if (iA == 1) {
                this.format = SafeParcelReader.h(parcel, iG);
            } else if (iA != 2) {
                me8.b(TAG, "unknown field id:" + iA);
                SafeParcelReader.r(parcel, iG);
            } else {
                this.value = SafeParcelReader.e(parcel, iG);
            }
        }
    }
}
