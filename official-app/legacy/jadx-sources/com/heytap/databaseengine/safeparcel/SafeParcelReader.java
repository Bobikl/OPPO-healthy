package com.heytap.databaseengine.safeparcel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class SafeParcelReader {

    public static class ReadException extends RuntimeException {
        public ReadException(String str, Parcel parcel) {
            super(str);
        }
    }

    public static int a(int i) {
        return i & 65535;
    }

    public static boolean b(Parcel parcel, int i) {
        d(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] c(Parcel parcel, int i) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iP);
        return bArrCreateByteArray;
    }

    public static void d(Parcel parcel, int i, int i2) {
        int iP = p(parcel, i);
        if (iP == i2) {
            return;
        }
        throw new ReadException("Expected size " + i2 + " got " + iP + " (0x" + Integer.toHexString(iP) + ")", parcel);
    }

    public static float e(Parcel parcel, int i) {
        d(parcel, i, 4);
        return parcel.readFloat();
    }

    public static float[] f(Parcel parcel, int i) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iP);
        return fArrCreateFloatArray;
    }

    public static int g(Parcel parcel) {
        return parcel.readInt();
    }

    public static int h(Parcel parcel, int i) {
        d(parcel, i, 4);
        return parcel.readInt();
    }

    public static int[] i(Parcel parcel, int i) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iP);
        return iArrCreateIntArray;
    }

    public static long j(Parcel parcel, int i) {
        d(parcel, i, 8);
        return parcel.readLong();
    }

    public static HashMap k(Parcel parcel, int i, ClassLoader classLoader) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        HashMap hashMap = parcel.readHashMap(classLoader);
        parcel.setDataPosition(iDataPosition + iP);
        return hashMap;
    }

    public static int l(Parcel parcel) {
        int iG = g(parcel);
        int iP = p(parcel, iG);
        int iDataPosition = parcel.dataPosition();
        if (a(iG) != 20293) {
            throw new ReadException("Expected object header. Got 0x" + Integer.toHexString(iG), parcel);
        }
        int i = iP + iDataPosition;
        if (i >= iDataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new ReadException("Size read is invalid start=" + iDataPosition + " end=" + i, parcel);
    }

    public static <T extends Parcelable> T m(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iP);
        return tCreateFromParcel;
    }

    public static <T extends Parcelable> T[] n(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        T[] tArr = (T[]) ((Parcelable[]) parcel.createTypedArray(creator));
        parcel.setDataPosition(iDataPosition + iP);
        return tArr;
    }

    public static <T extends Parcelable> ArrayList<T> o(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iP);
        return arrayListCreateTypedArrayList;
    }

    public static int p(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static String q(Parcel parcel, int i) {
        int iP = p(parcel, i);
        if (iP == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iP);
        return string;
    }

    public static void r(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + p(parcel, i));
    }
}
