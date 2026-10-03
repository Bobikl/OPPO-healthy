package com.oplus.coreapp.appfeature;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class AppFeatureProviderUtils {

    public enum CACHE_MODE {
        CACHE_ONLY,
        CACHE_AND_DB
    }

    public enum FeatureID {
        STATIC_COMPONENT,
        DYNAMIC_SIMSLOT_1,
        DYNAMIC_SIMSLOT_2
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FeatureID.values().length];
            a = iArr;
            try {
                iArr[FeatureID.STATIC_COMPONENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FeatureID.DYNAMIC_SIMSLOT_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FeatureID.DYNAMIC_SIMSLOT_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static Cursor a(ContentResolver contentResolver, FeatureID featureID, String str) {
        Cursor cursorB = com.oplus.coreapp.appfeature.a.d().b(featureID, str);
        return (cursorB != null || com.oplus.coreapp.appfeature.a.a(featureID) == CACHE_MODE.CACHE_ONLY) ? cursorB : contentResolver.query(g(featureID), null, "featurename=?", new String[]{str}, null);
    }

    public static int b(ContentResolver contentResolver, FeatureID featureID, String str, int i) {
        String strF = f(contentResolver, featureID, str, "int");
        if (strF != null) {
            return Integer.parseInt(strF);
        }
        Log.e("AppFeatureProviderUtils", "getInt: getStringForFeature return null");
        return i;
    }

    public static int c(ContentResolver contentResolver, String str, int i) {
        return b(contentResolver, FeatureID.STATIC_COMPONENT, str, i);
    }

    public static String d(ContentResolver contentResolver, FeatureID featureID, String str, String str2) {
        String strF = f(contentResolver, featureID, str, "String");
        if (strF != null) {
            return strF;
        }
        Log.e("AppFeatureProviderUtils", "getString: getStringForFeature return null");
        return str2;
    }

    public static String e(ContentResolver contentResolver, String str, String str2) {
        return d(contentResolver, FeatureID.STATIC_COMPONENT, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060 A[PHI: r0
  0x0060: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v3 java.lang.String), (r0v3 java.lang.String), (r0v5 java.lang.String) binds: [B:12:0x0021, B:14:0x0027, B:16:0x0030, B:29:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    public static String f(ContentResolver contentResolver, FeatureID featureID, String str, String str2) {
        int iIndexOf;
        String strSubstring = null;
        if (contentResolver != null && !TextUtils.isEmpty(str) && str2 != null) {
            Cursor cursorA = a(contentResolver, featureID, str);
            if (cursorA != null && cursorA.moveToFirst()) {
                do {
                    String string = cursorA.getString(cursorA.getColumnIndexOrThrow("parameters"));
                    if (string != null && !string.isEmpty()) {
                        String[] strArrSplit = string.split(";");
                        if (strArrSplit.length > 0) {
                            for (String str3 : strArrSplit) {
                                if (str3 != null && !str3.isEmpty() && (iIndexOf = str3.indexOf(":")) > 0 && str3.substring(0, iIndexOf).equals(str2)) {
                                    strSubstring = str3.substring(iIndexOf + 1);
                                    break;
                                }
                            }
                            if (strSubstring != null) {
                                break;
                            }
                        }
                    }
                } while (cursorA.moveToNext());
            }
            if (cursorA != null) {
                cursorA.close();
            }
        }
        return strSubstring;
    }

    public static Uri g(FeatureID featureID) {
        Uri uri = Uri.parse("content://com.oplus.customize.coreapp.configmanager.configprovider.AppFeatureProvider");
        int i = a.a[featureID.ordinal()];
        if (i == 1) {
            return uri.buildUpon().appendPath("app_feature").build();
        }
        if (i == 2) {
            return uri.buildUpon().appendPath("app_feature_first").build();
        }
        if (i == 3) {
            return uri.buildUpon().appendPath("app_feature_second").build();
        }
        throw new IllegalArgumentException("getUriBySimSlot simSlot is not support");
    }

    public static boolean h(ContentResolver contentResolver, FeatureID featureID, String str) {
        Cursor cursorA = a(contentResolver, featureID, str);
        boolean z = cursorA != null && cursorA.getCount() > 0;
        if (cursorA != null) {
            cursorA.close();
        }
        return z;
    }

    public static boolean i(ContentResolver contentResolver, String str) {
        return h(contentResolver, FeatureID.STATIC_COMPONENT, str);
    }
}
