package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class gum {
    public static final String[] j = {"_id", qmm.a.b, "type", qmm.a.d, qmm.a.e, qmm.a.f, qmm.a.i, qmm.a.j, qmm.a.k, qmm.a.l, "size", qmm.a.n, qmm.a.p, qmm.a.q, qmm.a.s, qmm.a.t, qmm.a.u, qmm.a.y};
    public final Context a;
    public uwm b;
    public String c;
    public int d;
    public String e;
    public yfa f;
    public Float g;
    public Integer h;
    public vga i;

    public class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uwm doInBackground(String... strArr) {
            uwm uwmVarD;
            try {
                gum gumVar = gum.this;
                uwmVarD = gumVar.d(gumVar.a, gum.this.e);
            } catch (Exception e) {
                StringBuilder sbA = pgm.a("the errorInfo is ");
                sbA.append(e.getMessage());
                Log.i("SauJar", sbA.toString());
                uwmVarD = null;
            }
            gum.this.b = uwmVarD;
            return uwmVarD;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(uwm uwmVar) {
            boolean zK = false;
            if (uwmVar == null) {
                Log.i("SauJar", "pkgInfo = null");
                if (gum.this.f != null) {
                    gum.this.f.b(0, -1, false);
                    return;
                }
                return;
            }
            try {
                gum gumVar = gum.this;
                zK = gumVar.k(gumVar.a, uwmVar);
            } catch (Exception e) {
                StringBuilder sbA = pgm.a("the errorInfo is ");
                sbA.append(e.getMessage());
                Log.i("SauJar", sbA.toString());
            }
            if (gum.this.f != null) {
                gum.this.f.b(1, uwmVar.d, zK);
            }
        }
    }

    public gum(Context context, vga vgaVar) {
        this.a = context;
        this.i = vgaVar;
    }

    public static Integer g(Context context, String str, int i) throws IllegalArgumentException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), new Integer(i));
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return Integer.valueOf(i);
        }
    }

    public final int a(Context context, uwm uwmVar) {
        lqm lqmVar = new lqm();
        lqmVar.i(this.i.r(this.a));
        lqmVar.j(this.i.s(this.a));
        lqmVar.h(context, uwmVar, this.f);
        return lqmVar.b(this.c, this.g, this.h);
    }

    public long b() {
        uwm uwmVar = this.b;
        if (uwmVar != null) {
            return uwmVar.g;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00bf  */
    public final uwm d(Context context, String str) {
        uwm uwmVar;
        if (context == null || str == null) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(qmm.a.a, j, "pkg_name='" + str + "'", null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    uwmVar = new uwm();
                    uwmVar.a = cursorQuery.getString(1);
                    uwmVar.m = cursorQuery.getInt(2);
                    uwmVar.d = cursorQuery.getInt(3);
                    uwmVar.e = cursorQuery.getString(4);
                    uwmVar.f = cursorQuery.getString(5);
                    uwmVar.i = cursorQuery.getInt(6);
                    uwmVar.n = cursorQuery.getString(7);
                    uwmVar.o = cursorQuery.getString(8);
                    uwmVar.b = cursorQuery.getString(9);
                    uwmVar.g = cursorQuery.getInt(10);
                    uwmVar.h = cursorQuery.getInt(11);
                    uwmVar.c = cursorQuery.getString(12);
                    uwmVar.p = cursorQuery.getString(13);
                    uwmVar.k = cursorQuery.getInt(14);
                    uwmVar.j = cursorQuery.getInt(15);
                    uwmVar.l = cursorQuery.getInt(16);
                    uwmVar.q = cursorQuery.getInt(17);
                } else {
                    uwmVar = null;
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        } else {
            uwmVar = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (uwmVar == null || uwmVar.q != 1) {
            return uwmVar;
        }
        return null;
    }

    public void h(String str, int i, String str2, yfa yfaVar, Float f, Integer num) {
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = yfaVar;
        this.g = f;
        this.h = num;
        q();
    }

    public final boolean k(Context context, uwm uwmVar) {
        if (uwmVar == null) {
            return false;
        }
        int i = uwmVar.i;
        int i2 = this.d;
        if (i2 == 0 && i == 0) {
            return a(context, uwmVar) == 1;
        }
        return l(context, uwmVar.a, i2) && a(context, uwmVar) == 1;
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
        uwm uwmVar = this.b;
        if (uwmVar != null) {
            return uwmVar.e;
        }
        return null;
    }

    public boolean o() {
        uwm uwmVar = this.b;
        return uwmVar != null && uwmVar.i == 1;
    }

    public String p() {
        uwm uwmVar = this.b;
        if (uwmVar != null) {
            return uwmVar.f;
        }
        return null;
    }

    public final void q() {
        Context context = this.a;
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            StringBuilder sbA = pgm.a("Activity context SauCheckUpdate , pkg = ");
            sbA.append(this.e);
            Log.i("SauJar", sbA.toString());
            new b().execute("SAU");
            return;
        }
        if (!(this.a instanceof Service)) {
            Log.i("SauJar", "context is null or activity context is finishing");
            return;
        }
        StringBuilder sbA2 = pgm.a("Service context SauCheckUpdate , pkg = ");
        sbA2.append(this.e);
        Log.i("SauJar", sbA2.toString());
        new b().execute("SAU");
    }
}
