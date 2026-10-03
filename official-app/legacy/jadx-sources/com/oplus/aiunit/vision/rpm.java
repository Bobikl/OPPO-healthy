package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class rpm {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f16301j = {"_id", iim.a.b, "type", iim.a.d, iim.a.f12557e, iim.a.f, iim.a.i, iim.a.f12558j, iim.a.k, "url", "size", iim.a.f12560n, "file_name", iim.a.q, iim.a.s, iim.a.t, iim.a.u, iim.a.y};
    public final Context a;
    public esm b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16302c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16303e;
    public qea f;
    public Float g;
    public Integer h;
    public nfa i;

    public class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public esm doInBackground(String... strArr) {
            esm esmVarD;
            try {
                rpm rpmVar = rpm.this;
                esmVarD = rpmVar.d(rpmVar.a, rpm.this.f16303e);
            } catch (Exception e2) {
                StringBuilder sbA = hcm.a("the errorInfo is ");
                sbA.append(e2.getMessage());
                Log.i("SauJar", sbA.toString());
                esmVarD = null;
            }
            rpm.this.b = esmVarD;
            return esmVarD;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(esm esmVar) {
            boolean zK = false;
            if (esmVar == null) {
                Log.i("SauJar", "pkgInfo = null");
                if (rpm.this.f != null) {
                    rpm.this.f.b(0, -1, false);
                    return;
                }
                return;
            }
            try {
                rpm rpmVar = rpm.this;
                zK = rpmVar.k(rpmVar.a, esmVar);
            } catch (Exception e2) {
                StringBuilder sbA = hcm.a("the errorInfo is ");
                sbA.append(e2.getMessage());
                Log.i("SauJar", sbA.toString());
            }
            if (rpm.this.f != null) {
                rpm.this.f.b(1, esmVar.d, zK);
            }
        }
    }

    public rpm(Context context, nfa nfaVar) {
        this.a = context;
        this.i = nfaVar;
    }

    public static Integer g(Context context, String str, int i) throws IllegalArgumentException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), new Integer(i));
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Exception unused) {
            return Integer.valueOf(i);
        }
    }

    public final int a(Context context, esm esmVar) {
        cmm cmmVar = new cmm();
        cmmVar.i(this.i.r(this.a));
        cmmVar.j(this.i.s(this.a));
        cmmVar.h(context, esmVar, this.f);
        return cmmVar.b(this.f16302c, this.g, this.h);
    }

    public long b() {
        esm esmVar = this.b;
        if (esmVar != null) {
            return esmVar.g;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00bf  */
    public final esm d(Context context, String str) {
        esm esmVar;
        if (context == null || str == null) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(iim.a.a, f16301j, "pkg_name='" + str + "'", null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    esmVar = new esm();
                    esmVar.a = cursorQuery.getString(1);
                    esmVar.m = cursorQuery.getInt(2);
                    esmVar.d = cursorQuery.getInt(3);
                    esmVar.f11065e = cursorQuery.getString(4);
                    esmVar.f = cursorQuery.getString(5);
                    esmVar.i = cursorQuery.getInt(6);
                    esmVar.f11068n = cursorQuery.getString(7);
                    esmVar.o = cursorQuery.getString(8);
                    esmVar.b = cursorQuery.getString(9);
                    esmVar.g = cursorQuery.getInt(10);
                    esmVar.h = cursorQuery.getInt(11);
                    esmVar.f11064c = cursorQuery.getString(12);
                    esmVar.p = cursorQuery.getString(13);
                    esmVar.k = cursorQuery.getInt(14);
                    esmVar.f11066j = cursorQuery.getInt(15);
                    esmVar.f11067l = cursorQuery.getInt(16);
                    esmVar.q = cursorQuery.getInt(17);
                } else {
                    esmVar = null;
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        } else {
            esmVar = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (esmVar == null || esmVar.q != 1) {
            return esmVar;
        }
        return null;
    }

    public void h(String str, int i, String str2, qea qeaVar, Float f, Integer num) {
        this.f16302c = str;
        this.d = i;
        this.f16303e = str2;
        this.f = qeaVar;
        this.g = f;
        this.h = num;
        q();
    }

    public final boolean k(Context context, esm esmVar) {
        if (esmVar == null) {
            return false;
        }
        int i = esmVar.i;
        int i2 = this.d;
        if (i2 == 0 && i == 0) {
            return a(context, esmVar) == 1;
        }
        return l(context, esmVar.a, i2) && a(context, esmVar) == 1;
    }

    public final boolean l(Context context, String str, int i) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        int i2 = defaultSharedPreferences.getInt(str, 1);
        if (i == 0 && (i = g(context, "persist.sys.sau.launchcheck", 2).intValue()) <= 0) {
            i = 2;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        if (i2 == 0 || i2 < i) {
            editorEdit.putInt(str, i2 + 1);
            editorEdit.commit();
            return false;
        }
        editorEdit.putInt(str, 1);
        editorEdit.commit();
        return true;
    }

    public String n() {
        esm esmVar = this.b;
        if (esmVar != null) {
            return esmVar.f11065e;
        }
        return null;
    }

    public boolean o() {
        esm esmVar = this.b;
        return esmVar != null && esmVar.i == 1;
    }

    public String p() {
        esm esmVar = this.b;
        if (esmVar != null) {
            return esmVar.f;
        }
        return null;
    }

    public final void q() {
        Context context = this.a;
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            StringBuilder sbA = hcm.a("Activity context SauCheckUpdate , pkg = ");
            sbA.append(this.f16303e);
            Log.i("SauJar", sbA.toString());
            new b().execute("SAU");
            return;
        }
        if (!(this.a instanceof Service)) {
            Log.i("SauJar", "context is null or activity context is finishing");
            return;
        }
        StringBuilder sbA2 = hcm.a("Service context SauCheckUpdate , pkg = ");
        sbA2.append(this.f16303e);
        Log.i("SauJar", sbA2.toString());
        new b().execute("SAU");
    }
}
