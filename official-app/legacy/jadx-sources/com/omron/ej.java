package com.omron;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class ej {
    @NonNull
    public static Bundle a(@Nullable Bundle bundle, @NonNull Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("The number of arguments is not an even number.");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            Object obj = objArr[i];
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Key type is not String.");
            }
            String str = (String) obj;
            Object obj2 = objArr[i + 1];
            if (obj2 == null) {
                bundle.putString(str, null);
            }
            if (obj2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj2);
            } else if (obj2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj2);
            } else if (obj2 instanceof Byte) {
                bundle.putByte(str, ((Byte) obj2).byteValue());
            } else if (obj2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj2);
            } else if (obj2 instanceof String) {
                bundle.putString(str, (String) obj2);
            } else if (obj2 instanceof String[]) {
                bundle.putStringArray(str, (String[]) obj2);
            } else if (obj2 instanceof Character) {
                bundle.putChar(str, ((Character) obj2).charValue());
            } else if (obj2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj2);
            } else if (obj2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj2);
            } else if (obj2 instanceof CharSequence[]) {
                bundle.putCharSequenceArray(str, (CharSequence[]) obj2);
            } else if (obj2 instanceof Double) {
                bundle.putDouble(str, ((Double) obj2).doubleValue());
            } else if (obj2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj2);
            } else if (obj2 instanceof Float) {
                bundle.putFloat(str, ((Float) obj2).floatValue());
            } else if (obj2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj2);
            } else if (obj2 instanceof Short) {
                bundle.putShort(str, ((Short) obj2).shortValue());
            } else if (obj2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj2);
            } else if (obj2 instanceof Integer) {
                bundle.putInt(str, ((Integer) obj2).intValue());
            } else if (obj2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj2);
            } else if (obj2 instanceof Long) {
                bundle.putLong(str, ((Long) obj2).longValue());
            } else if (obj2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj2);
            } else if (obj2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj2);
            } else if (obj2 instanceof Parcelable[]) {
                bundle.putParcelableArray(str, (Parcelable[]) obj2);
            } else {
                if (!(obj2 instanceof Serializable)) {
                    throw new IllegalArgumentException("Illegal key. " + str);
                }
                bundle.putSerializable(str, (Serializable) obj2);
            }
        }
        return bundle;
    }

    @NonNull
    public static Bundle a(@NonNull Object... objArr) {
        return a(null, objArr);
    }
}
