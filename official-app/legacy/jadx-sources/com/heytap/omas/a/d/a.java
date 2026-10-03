package com.heytap.omas.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.heytap.omas.a.b.c;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.WbKeyTableInfo;
import com.heytap.omas.omkms.data.WbUseInfo;
import com.heytap.omas.omkms.data.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final String a = "WbManager";
    private static final String b = "wb_used_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, WbKeyTableInfo> f7592c = new HashMap();

    public static class b {
        private static a a = new a();

        private b() {
        }
    }

    private a() {
    }

    public static a a() {
        return b.a;
    }

    private WbKeyTableInfo b(Context context, h hVar) {
        String string = context.getSharedPreferences(b, 0).getString(a(hVar), null);
        if (!TextUtils.isEmpty(string)) {
            return (WbKeyTableInfo) a(string, WbKeyTableInfo.CREATOR);
        }
        i.b(a, "loadWbKeyTableUsedInfoFromFile: fail.");
        return null;
    }

    public boolean c(Context context, h hVar) {
        synchronized (f7592c) {
            try {
                if (hVar == null) {
                    throw new IllegalArgumentException("InitParamSpec cannot be null.");
                }
                String strA = a(hVar);
                if (f7592c.containsKey(strA)) {
                    f7592c.get(strA).toString();
                    WbKeyTableInfo wbKeyTableInfo = f7592c.get(strA);
                    if (wbKeyTableInfo.resetCount(hVar) == null) {
                        i.b(a, "resetWbKeyTableUsedInfo: failed.");
                        return false;
                    }
                    wbKeyTableInfo.toString();
                    return a(context, hVar, wbKeyTableInfo);
                }
                WbKeyTableInfo wbKeyTableInfoB = b(context, hVar);
                if (wbKeyTableInfoB != null && wbKeyTableInfoB.resetCount(hVar) != null) {
                    wbKeyTableInfoB.toString();
                    f7592c.put(strA, wbKeyTableInfoB);
                    return a(context, hVar, wbKeyTableInfoB);
                }
                if (wbKeyTableInfoB == null) {
                    wbKeyTableInfoB = WbKeyTableInfo.newBuilder().a();
                }
                f7592c.put(strA, wbKeyTableInfoB);
                i.b(a, "resetWbKeyTableUsedInfo: not record data.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WbKeyTableInfo d(Context context, h hVar) {
        synchronized (f7592c) {
            try {
                if (hVar == null) {
                    throw new IllegalArgumentException("InitParamSpec cannot be null.");
                }
                String strA = a(hVar);
                if (f7592c.containsKey(strA)) {
                    f7592c.get(strA).toString();
                    WbKeyTableInfo wbKeyTableInfoUpdateCount = f7592c.get(strA).updateCount(hVar, 1);
                    if (wbKeyTableInfoUpdateCount == null) {
                        i.b(a, "updateDecryptCount: updateCount fail.");
                        return null;
                    }
                    if (a(context, hVar, wbKeyTableInfoUpdateCount)) {
                        wbKeyTableInfoUpdateCount.toString();
                        return wbKeyTableInfoUpdateCount;
                    }
                    i.b(a, "updateDecryptCount: saveWbUsedInfoToFile fail.");
                    return null;
                }
                WbKeyTableInfo wbKeyTableInfoB = b(context, hVar);
                if (wbKeyTableInfoB == null) {
                    wbKeyTableInfoB = new WbKeyTableInfo();
                }
                wbKeyTableInfoB.toString();
                if (wbKeyTableInfoB.updateCount(hVar, 1) == null) {
                    i.b(a, "updateDecryptCount: updateCount fail.");
                    return null;
                }
                wbKeyTableInfoB.toString();
                f7592c.put(strA, wbKeyTableInfoB);
                if (a(context, hVar, wbKeyTableInfoB)) {
                    wbKeyTableInfoB.toString();
                    return wbKeyTableInfoB;
                }
                i.b(a, "updateDecryptCount: saveWbUsedInfoToFile fail.");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WbKeyTableInfo e(Context context, h hVar) {
        synchronized (f7592c) {
            try {
                if (hVar == null) {
                    throw new IllegalArgumentException("InitParamSpec cannot be null.");
                }
                String strA = a(hVar);
                if (f7592c.containsKey(strA)) {
                    f7592c.get(strA).toString();
                    WbKeyTableInfo wbKeyTableInfoUpdateCount = f7592c.get(strA).updateCount(hVar, 0);
                    if (wbKeyTableInfoUpdateCount == null) {
                        i.b(a, "updateEncryptCount: updateCount fail.");
                        return null;
                    }
                    if (a(context, hVar, wbKeyTableInfoUpdateCount)) {
                        wbKeyTableInfoUpdateCount.toString();
                        return wbKeyTableInfoUpdateCount;
                    }
                    i.b(a, "updateEncryptCount: saveWbUsedInfoToFile fail.");
                    return null;
                }
                WbKeyTableInfo wbKeyTableInfoB = b(context, hVar);
                if (wbKeyTableInfoB == null) {
                    wbKeyTableInfoB = new WbKeyTableInfo();
                    wbKeyTableInfoB.toString();
                }
                wbKeyTableInfoB.toString();
                if (wbKeyTableInfoB.updateCount(hVar, 0) == null) {
                    i.b(a, "updateEncryptCount: updateCount fail.");
                    return null;
                }
                f7592c.put(strA, wbKeyTableInfoB);
                wbKeyTableInfoB.toString();
                if (a(context, hVar, wbKeyTableInfoB)) {
                    wbKeyTableInfoB.toString();
                    return wbKeyTableInfoB;
                }
                i.b(a, "updateEncryptCount: saveWbUsedInfoToFile fail.");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WbKeyTableInfo a(Context context, h hVar) {
        synchronized (f7592c) {
            try {
                if (hVar == null) {
                    throw new IllegalArgumentException("InitParamSpec cannot be null.");
                }
                String strA = a(hVar);
                if (f7592c.containsKey(strA)) {
                    f7592c.get(strA).toString();
                    WbKeyTableInfo wbKeyTableInfo = f7592c.get(strA);
                    wbKeyTableInfo.toString();
                    return wbKeyTableInfo;
                }
                WbKeyTableInfo wbKeyTableInfoB = b(context, hVar);
                if (wbKeyTableInfoB != null) {
                    wbKeyTableInfoB.toString();
                    return wbKeyTableInfoB;
                }
                WbUseInfo wbUseInfoA = WbUseInfo.newBuilder().a(hVar.getAppName()).b(hVar.getWbId()).c(hVar.getWbKeyId()).a();
                HashMap map = new HashMap();
                map.put(strA, wbUseInfoA);
                WbKeyTableInfo.newBuilder().a(map);
                wbUseInfoA.toString();
                return wbKeyTableInfoB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private <TypeName> TypeName a(String str, Parcelable.Creator<TypeName> creator) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "objectDeserialize: objBase64 cannot be null or empty.";
        } else {
            try {
                byte[] bArrDecode = Base64.decode(str, 2);
                Arrays.toString(bArrDecode);
                return (TypeName) a(bArrDecode, creator);
            } catch (Exception e2) {
                str2 = "objectSerialization: exception:" + e2.getMessage();
            }
        }
        i.b(a, str2);
        return null;
    }

    private <TypeName> TypeName a(byte[] bArr, Parcelable.Creator<TypeName> creator) {
        String str;
        if (bArr == null || bArr.length == 0) {
            str = "objectDeserialize: objBytes cannot be null or empty.";
        } else {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                TypeName typenameCreateFromParcel = creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                typenameCreateFromParcel.toString();
                return typenameCreateFromParcel;
            } catch (Exception e2) {
                str = "objectDeserialize: exception:" + e2.getMessage();
            }
        }
        i.b(a, str);
        return null;
    }

    @Nullable
    private String a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            WbUseInfo.CREATOR.createFromParcel(parcelObtain).toString();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return Base64.encodeToString(bArrMarshall, 2);
        } catch (Exception e2) {
            i.b(a, "objectSerialization: exception:" + e2.getMessage());
            return null;
        }
    }

    @Nullable
    private <TypeName> String a(Parcelable parcelable, Parcelable.Creator<TypeName> creator) {
        String str;
        if (parcelable == null || creator == null) {
            str = "objectSerialization: Parameters invalid.";
        } else {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelable.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                creator.createFromParcel(parcelObtain).toString();
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                return Base64.encodeToString(bArrMarshall, 2);
            } catch (Exception e2) {
                str = "objectSerialization: exception:" + e2.getMessage();
            }
        }
        i.b(a, str);
        return null;
    }

    public static String a(h hVar) {
        String authMode = hVar.getAuthMode();
        authMode.hashCode();
        if (authMode.equals(c.b)) {
            return Base64.encodeToString(com.heytap.omas.a.e.c.a(hVar.getAppName(), hVar.getDeviceId()), 2);
        }
        if (authMode.equals("WB")) {
            return Base64.encodeToString(com.heytap.omas.a.e.c.a(hVar.getAppName(), hVar.getWbId(), hVar.getWbVersionBytes()), 2);
        }
        throw new IllegalStateException("Unexpected value: " + hVar.getAuthMode());
    }

    private boolean a(Context context, h hVar, WbKeyTableInfo wbKeyTableInfo) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(b, 0).edit();
        String strA = a(hVar);
        String strA2 = a(wbKeyTableInfo, WbKeyTableInfo.CREATOR);
        if (TextUtils.isEmpty(strA2)) {
            return false;
        }
        editorEdit.putString(strA, strA2);
        editorEdit.apply();
        wbKeyTableInfo.toString();
        return true;
    }
}
