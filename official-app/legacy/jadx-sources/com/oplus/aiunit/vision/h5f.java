package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watchface.business.legacy.creation.album.helper.AlbumImageSource;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes11.dex */
public class h5f<T> {
    public static boolean LOG_SQL;
    public static boolean LOG_VALUES;
    public final jvl<T> a;
    public StringBuilder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Object> f12009c;
    public final List<uia<T, ?>> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a6<T, ?> f12010e;
    public final String f;
    public Integer g;
    public Integer h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f12011j;

    public h5f(a6<T, ?> a6Var) {
        this(a6Var, ExifInterface.GPS_DIRECTION_TRUE);
    }

    public static <T2> h5f<T2> j(a6<T2, ?> a6Var) {
        return new h5f<>(a6Var);
    }

    public StringBuilder a(StringBuilder sb, yye yyeVar) {
        this.a.d(yyeVar);
        sb.append(this.f);
        sb.append('.');
        sb.append('\'');
        sb.append(yyeVar.f19199e);
        sb.append('\'');
        return sb;
    }

    public final void b(StringBuilder sb, String str) {
        this.f12009c.clear();
        for (uia<T, ?> uiaVar : this.d) {
            sb.append(" JOIN ");
            sb.append(uiaVar.b.getTablename());
            sb.append(StringUtil.SPACE);
            sb.append(uiaVar.f17478e);
            sb.append(" ON ");
            bli.h(sb, uiaVar.a, uiaVar.f17477c).append(kam.h);
            bli.h(sb, uiaVar.f17478e, uiaVar.d);
        }
        boolean z = !this.a.e();
        if (z) {
            sb.append(" WHERE ");
            this.a.b(sb, str, this.f12009c);
        }
        for (uia<T, ?> uiaVar2 : this.d) {
            if (!uiaVar2.f.e()) {
                if (z) {
                    sb.append(" AND ");
                } else {
                    sb.append(" WHERE ");
                    z = true;
                }
                uiaVar2.f.b(sb, uiaVar2.f17478e, this.f12009c);
            }
        }
    }

    public f5f<T> c() {
        StringBuilder sbI = i();
        int iE = e(sbI);
        int iF = f(sbI);
        String string = sbI.toString();
        g(string);
        return f5f.c(this.f12010e, string, this.f12009c.toArray(), iE, iF);
    }

    public x85<T> d() {
        if (!this.d.isEmpty()) {
            throw new DaoException("JOINs are not supported for DELETE queries");
        }
        String tablename = this.f12010e.getTablename();
        StringBuilder sb = new StringBuilder(bli.j(tablename, null));
        b(sb, this.f);
        String strReplace = sb.toString().replace(this.f + ".\"", '\"' + tablename + "\".\"");
        g(strReplace);
        return x85.c(this.f12010e, strReplace, this.f12009c.toArray());
    }

    public final int e(StringBuilder sb) {
        if (this.g == null) {
            return -1;
        }
        sb.append(" LIMIT ?");
        this.f12009c.add(this.g);
        return this.f12009c.size() - 1;
    }

    public final int f(StringBuilder sb) {
        if (this.h == null) {
            return -1;
        }
        if (this.g == null) {
            throw new IllegalStateException("Offset cannot be set without limit");
        }
        sb.append(" OFFSET ?");
        this.f12009c.add(this.h);
        return this.f12009c.size() - 1;
    }

    public final void g(String str) {
        if (LOG_SQL) {
            ds4.a("Built SQL for query: " + str);
        }
        if (LOG_VALUES) {
            ds4.a("Values for query: " + this.f12009c);
        }
    }

    public final void h() {
        StringBuilder sb = this.b;
        if (sb == null) {
            this.b = new StringBuilder();
        } else if (sb.length() > 0) {
            this.b.append(",");
        }
    }

    public final StringBuilder i() {
        StringBuilder sb = new StringBuilder(bli.l(this.f12010e.getTablename(), this.f, this.f12010e.getAllColumns(), this.i));
        b(sb, this.f);
        StringBuilder sb2 = this.b;
        if (sb2 != null && sb2.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append((CharSequence) this.b);
        }
        return sb;
    }

    public h5f<T> k(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public List<T> l() {
        return c().f();
    }

    public final void m(String str, yye... yyeVarArr) {
        String str2;
        for (yye yyeVar : yyeVarArr) {
            h();
            a(this.b, yyeVar);
            if (String.class.equals(yyeVar.b) && (str2 = this.f12011j) != null) {
                this.b.append(str2);
            }
            this.b.append(str);
        }
    }

    public h5f<T> n(yye... yyeVarArr) {
        m(AlbumImageSource.DESC, yyeVarArr);
        return this;
    }

    public h5f<T> o(kvl kvlVar, kvl... kvlVarArr) {
        this.a.a(kvlVar, kvlVarArr);
        return this;
    }

    public h5f(a6<T, ?> a6Var, String str) {
        this.f12010e = a6Var;
        this.f = str;
        this.f12009c = new ArrayList();
        this.d = new ArrayList();
        this.a = new jvl<>(a6Var, str);
        this.f12011j = " COLLATE NOCASE";
    }
}
