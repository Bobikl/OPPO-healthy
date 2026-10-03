package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes11.dex */
public class anj {
    public final wz4 a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f9437c;
    public final String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d05 f9438e;
    public d05 f;
    public d05 g;
    public d05 h;
    public d05 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile String f9439j;
    public volatile String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile String f9440l;

    public anj(wz4 wz4Var, String str, String[] strArr, String[] strArr2) {
        this.a = wz4Var;
        this.b = str;
        this.f9437c = strArr;
        this.d = strArr2;
    }

    public d05 a() {
        if (this.i == null) {
            this.i = this.a.compileStatement(bli.i(this.b));
        }
        return this.i;
    }

    public d05 b() {
        if (this.h == null) {
            d05 d05VarCompileStatement = this.a.compileStatement(bli.j(this.b, this.d));
            synchronized (this) {
                if (this.h == null) {
                    this.h = d05VarCompileStatement;
                }
            }
            if (this.h != d05VarCompileStatement) {
                d05VarCompileStatement.close();
            }
        }
        return this.h;
    }

    public d05 c() {
        if (this.f == null) {
            d05 d05VarCompileStatement = this.a.compileStatement(bli.k("INSERT OR REPLACE INTO ", this.b, this.f9437c));
            synchronized (this) {
                if (this.f == null) {
                    this.f = d05VarCompileStatement;
                }
            }
            if (this.f != d05VarCompileStatement) {
                d05VarCompileStatement.close();
            }
        }
        return this.f;
    }

    public d05 d() {
        if (this.f9438e == null) {
            d05 d05VarCompileStatement = this.a.compileStatement(bli.k("INSERT INTO ", this.b, this.f9437c));
            synchronized (this) {
                if (this.f9438e == null) {
                    this.f9438e = d05VarCompileStatement;
                }
            }
            if (this.f9438e != d05VarCompileStatement) {
                d05VarCompileStatement.close();
            }
        }
        return this.f9438e;
    }

    public String e() {
        if (this.f9439j == null) {
            this.f9439j = bli.l(this.b, ExifInterface.GPS_DIRECTION_TRUE, this.f9437c, false);
        }
        return this.f9439j;
    }

    public String f() {
        if (this.k == null) {
            StringBuilder sb = new StringBuilder(e());
            sb.append("WHERE ");
            bli.e(sb, ExifInterface.GPS_DIRECTION_TRUE, this.d);
            this.k = sb.toString();
        }
        return this.k;
    }

    public String g() {
        if (this.f9440l == null) {
            this.f9440l = e() + "WHERE ROWID=?";
        }
        return this.f9440l;
    }

    public d05 h() {
        if (this.g == null) {
            d05 d05VarCompileStatement = this.a.compileStatement(bli.m(this.b, this.f9437c, this.d));
            synchronized (this) {
                if (this.g == null) {
                    this.g = d05VarCompileStatement;
                }
            }
            if (this.g != d05VarCompileStatement) {
                d05VarCompileStatement.close();
            }
        }
        return this.g;
    }
}
