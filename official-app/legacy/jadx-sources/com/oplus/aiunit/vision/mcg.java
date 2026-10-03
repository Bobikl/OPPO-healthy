package com.oplus.aiunit.vision;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import com.heytap.databaseengine.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class mcg {
    public static void a(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void b(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iQ = q(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            a(parcel, iQ);
        }
    }

    public static void c(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        o(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        o(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void e(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        o(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void f(Parcel parcel, int i, Long l2) {
        if (l2 == null) {
            return;
        }
        o(parcel, i, 8);
        parcel.writeLong(l2.longValue());
    }

    public static void g(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iQ = q(parcel, i);
            parcel.writeString(str);
            a(parcel, iQ);
        }
    }

    public static <T extends Parcelable> void h(Parcel parcel, int i, List<T> list, int i2, boolean z) {
        if (list == null) {
            if (z) {
                o(parcel, i, 0);
                return;
            }
            return;
        }
        int iQ = q(parcel, i);
        parcel.writeInt(list.size());
        for (T t : list) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                n(parcel, t, i2);
            }
        }
        a(parcel, iQ);
    }

    public static void i(Parcel parcel, int i, Map map, boolean z) {
        if (map == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iQ = q(parcel, i);
            parcel.writeMap(map);
            a(parcel, iQ);
        }
    }

    public static void j(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iQ = q(parcel, i);
            parcel.writeByteArray(bArr);
            a(parcel, iQ);
        }
    }

    public static void k(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iQ = q(parcel, i);
            parcel.writeFloatArray(fArr);
            a(parcel, iQ);
        }
    }

    public static void l(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                o(parcel, i, 0);
            }
        } else {
            int iQ = q(parcel, i);
            parcel.writeIntArray(iArr);
            a(parcel, iQ);
        }
    }

    public static <T extends Parcelable> void m(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                o(parcel, i, 0);
                return;
            }
            return;
        }
        int iQ = q(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                n(parcel, t, i2);
            }
        }
        a(parcel, iQ);
    }

    public static <T extends Parcelable> void n(Parcel parcel, T t, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void o(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt(i | (i2 << 16));
        } else {
            parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i2);
        }
    }

    public static int p(Parcel parcel) {
        o(parcel, SafeParcelable.SAFE_PARCEL_OBJECT_MAGIC, 65535);
        return parcel.dataPosition();
    }

    public static int q(Parcel parcel, int i) {
        o(parcel, i, 65535);
        return parcel.dataPosition();
    }
}
