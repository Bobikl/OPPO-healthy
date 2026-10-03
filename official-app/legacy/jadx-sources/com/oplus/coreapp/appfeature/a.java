package com.oplus.coreapp.appfeature;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AppFeatureProviderUtils.CACHE_MODE f19663e;
    public static AppFeatureProviderUtils.CACHE_MODE f;
    public static AppFeatureProviderUtils.CACHE_MODE g;
    public static final List<c> a = new ArrayList();
    public static final List<c> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<c> f19662c = new ArrayList();
    public static final Uri d = Uri.parse("content://com.oplus.customize.coreapp.configmanager.configprovider.AppFeatureProvider").buildUpon().appendPath("app_feature").build();
    public static boolean mCachedEnabled = false;

    /* JADX INFO: renamed from: com.oplus.coreapp.appfeature.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0955a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AppFeatureProviderUtils.FeatureID.values().length];
            a = iArr;
            try {
                iArr[AppFeatureProviderUtils.FeatureID.STATIC_COMPONENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AppFeatureProviderUtils.FeatureID.DYNAMIC_SIMSLOT_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AppFeatureProviderUtils.FeatureID.DYNAMIC_SIMSLOT_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {
        public static final a a = new a();
    }

    public static class c {
        public Integer a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f19664c;
        public String d;

        public String a() {
            return this.b;
        }

        public Integer b() {
            return this.a;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.f19664c;
        }

        public String toString() {
            return "AppFeatureData{_id='" + this.a + "'featureName='" + this.b + "', parameters='" + this.f19664c + "', jasonStr='" + this.d + "'}";
        }
    }

    static {
        AppFeatureProviderUtils.CACHE_MODE cache_mode = AppFeatureProviderUtils.CACHE_MODE.CACHE_AND_DB;
        f19663e = cache_mode;
        f = cache_mode;
        g = cache_mode;
    }

    public static AppFeatureProviderUtils.CACHE_MODE a(AppFeatureProviderUtils.FeatureID featureID) {
        int i = C0955a.a[featureID.ordinal()];
        if (i == 1) {
            return f19663e;
        }
        if (i == 2) {
            return f;
        }
        if (i == 3) {
            return g;
        }
        throw new IllegalArgumentException("getListFromSlot simSlot is not support");
    }

    public static a d() {
        return b.a;
    }

    public Cursor b(AppFeatureProviderUtils.FeatureID featureID, String str) {
        if (g(a)) {
            return null;
        }
        return c(e(featureID), str);
    }

    public final Cursor c(List<c> list, String str) {
        MatrixCursor matrixCursorF = f();
        synchronized (a.class) {
            for (c cVar : list) {
                if (cVar != null && cVar.a() != null && cVar.a().equals(str)) {
                    matrixCursorF.addRow(new Object[]{cVar.b(), cVar.a(), cVar.d(), cVar.c()});
                }
            }
        }
        if (matrixCursorF.getCount() != 0) {
            return matrixCursorF;
        }
        matrixCursorF.close();
        return null;
    }

    public final List<c> e(AppFeatureProviderUtils.FeatureID featureID) {
        int i = C0955a.a[featureID.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return f19662c;
        }
        throw new IllegalArgumentException("getListFromSlot simSlot is not support");
    }

    public final MatrixCursor f() {
        return new MatrixCursor(new String[]{"_id", "featurename", "parameters", "lists"});
    }

    public final boolean g(List list) {
        return list != null && list.size() == 0;
    }
}
