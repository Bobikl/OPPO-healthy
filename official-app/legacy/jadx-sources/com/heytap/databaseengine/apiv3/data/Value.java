package com.heytap.databaseengine.apiv3.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.safeparcel.AbstractSafeParcelable;
import com.heytap.databaseengine.safeparcel.SafeParcelReader;
import com.oplus.aiunit.vision.mcg;
import com.oplus.aiunit.vision.me8;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class Value extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Value> CREATOR = new a();
    private static final String TAG = "Value";
    private byte[] arrayByte;
    private float[] arrayFloat;
    private int[] arrayInt;
    private int format;
    private boolean isSet;
    private float valueFloat;
    private Map<String, MapValue> valueMap;
    private String valueString;

    public class a implements Parcelable.Creator<Value> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Value createFromParcel(Parcel parcel) {
            return new Value(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Value[] newArray(int i) {
            return new Value[i];
        }
    }

    public Value(int i) {
        this.format = i;
    }

    public float asFloat() {
        return this.valueFloat;
    }

    public int asInt() {
        return Float.floatToRawIntBits(this.valueFloat);
    }

    public String asString() {
        return this.valueString;
    }

    public boolean isSet() {
        return this.isSet;
    }

    public void setFloat(float f) {
        this.isSet = true;
        this.valueFloat = f;
    }

    public void setInt(int i) {
        this.isSet = true;
        this.valueFloat = Float.intBitsToFloat(i);
    }

    public void setKeyValue(String str, float f) {
        this.isSet = true;
        if (this.valueMap == null) {
            this.valueMap = new HashMap();
        }
        this.valueMap.put(str, MapValue.create(f));
    }

    public void setSet(boolean z) {
        this.isSet = z;
    }

    public void setString(String str) {
        this.isSet = true;
        this.valueString = str;
    }

    public void setValueMap(Map<String, Float> map) {
        this.isSet = true;
        this.valueMap = new HashMap();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            this.valueMap.put(entry.getKey(), MapValue.create(entry.getValue().floatValue()));
        }
    }

    @NonNull
    public String toString() {
        if (!this.isSet) {
            return "unset";
        }
        int i = this.format;
        if (i == 1) {
            return Integer.toString(asInt());
        }
        if (i != 2) {
            return i != 3 ? "unknown" : Float.toString(asFloat());
        }
        return asString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iP = mcg.p(parcel);
        try {
            mcg.e(parcel, 1, Integer.valueOf(this.format));
            mcg.c(parcel, 2, Boolean.valueOf(this.isSet));
            mcg.d(parcel, 3, Float.valueOf(this.valueFloat));
            mcg.g(parcel, 4, this.valueString, false);
            mcg.l(parcel, 5, this.arrayInt, false);
            mcg.k(parcel, 6, this.arrayFloat, false);
            mcg.j(parcel, 7, this.arrayByte, false);
            mcg.i(parcel, 8, this.valueMap, false);
        } catch (Exception e2) {
            me8.i(TAG, "Error writing field: " + e2);
        }
        mcg.a(parcel, iP);
    }

    public Value(Parcel parcel) {
        int iL = SafeParcelReader.l(parcel);
        while (parcel.dataPosition() < iL) {
            int iG = SafeParcelReader.g(parcel);
            int iA = SafeParcelReader.a(iG);
            switch (iA) {
                case 1:
                    this.format = SafeParcelReader.h(parcel, iG);
                    break;
                case 2:
                    this.isSet = SafeParcelReader.b(parcel, iG);
                    break;
                case 3:
                    this.valueFloat = SafeParcelReader.e(parcel, iG);
                    break;
                case 4:
                    this.valueString = SafeParcelReader.q(parcel, iG);
                    break;
                case 5:
                    this.arrayInt = SafeParcelReader.i(parcel, iG);
                    break;
                case 6:
                    this.arrayFloat = SafeParcelReader.f(parcel, iG);
                    break;
                case 7:
                    this.arrayByte = SafeParcelReader.c(parcel, iG);
                    break;
                case 8:
                    this.valueMap = SafeParcelReader.k(parcel, iG, MapValue.class.getClassLoader());
                    break;
                default:
                    me8.b(TAG, "unknown field id:" + iA);
                    SafeParcelReader.r(parcel, iG);
                    break;
            }
        }
    }
}
