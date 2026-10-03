package com.badlogic.gdx.utils;

import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.nwi;
import com.oplus.aiunit.vision.rsj;
import com.oplus.aiunit.vision.t0j;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Locale f1292e = new Locale("", "", "");
    public static boolean f = false;
    public static boolean g = true;
    public b a;
    public Locale b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i<String, String> f1293c;
    public rsj d;

    public static boolean a(kb7 kb7Var) {
        try {
            kb7Var.m().close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static b b(kb7 kb7Var, Locale locale) {
        return d(kb7Var, locale, "UTF-8");
    }

    public static b c(kb7 kb7Var, Locale locale, String str) {
        return d(kb7Var, locale, str);
    }

    public static b d(kb7 kb7Var, Locale locale, String str) {
        b bVarJ;
        b bVar = null;
        if (kb7Var == null || locale == null || str == null) {
            throw null;
        }
        Locale localeF = locale;
        do {
            List<Locale> listE = e(localeF);
            bVarJ = j(kb7Var, str, listE, 0, bVar);
            if (bVarJ == null) {
                localeF = f(localeF);
            } else {
                Locale localeG = bVarJ.g();
                boolean zEquals = localeG.equals(f1292e);
                if (!zEquals || localeG.equals(locale) || (listE.size() == 1 && localeG.equals(listE.get(0)))) {
                    break;
                }
                if (zEquals && bVar == null) {
                    bVar = bVarJ;
                }
                localeF = f(localeF);
            }
        } while (localeF != null);
        if (bVarJ != null) {
            return bVarJ;
        }
        if (bVar != null) {
            return bVar;
        }
        throw new MissingResourceException("Can't find bundle for base file handle " + kb7Var.j() + ", locale " + locale, kb7Var + "_" + locale, "");
    }

    public static List<Locale> e(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        ArrayList arrayList = new ArrayList(4);
        if (variant.length() > 0) {
            arrayList.add(locale);
        }
        if (country.length() > 0) {
            arrayList.add(arrayList.isEmpty() ? locale : new Locale(language, country));
        }
        if (language.length() > 0) {
            if (!arrayList.isEmpty()) {
                locale = new Locale(language);
            }
            arrayList.add(locale);
        }
        arrayList.add(f1292e);
        return arrayList;
    }

    public static Locale f(Locale locale) {
        Locale locale2 = Locale.getDefault();
        if (locale.equals(locale2)) {
            return null;
        }
        return locale2;
    }

    public static b i(kb7 kb7Var, String str, Locale locale) {
        b bVar;
        Reader readerR = null;
        try {
            try {
                kb7 kb7VarL = l(kb7Var, locale);
                if (a(kb7VarL)) {
                    bVar = new b();
                    readerR = kb7VarL.r(str);
                    bVar.h(readerR);
                } else {
                    bVar = null;
                }
                nwi.a(readerR);
                if (bVar != null) {
                    bVar.k(locale);
                }
                return bVar;
            } catch (IOException e2) {
                throw new GdxRuntimeException(e2);
            }
        } catch (Throwable th) {
            nwi.a(readerR);
            throw th;
        }
    }

    public static b j(kb7 kb7Var, String str, List<Locale> list, int i, b bVar) {
        b bVarJ;
        Locale locale = list.get(i);
        if (i != list.size() - 1) {
            bVarJ = j(kb7Var, str, list, i + 1, bVar);
        } else {
            if (bVar != null && locale.equals(f1292e)) {
                return bVar;
            }
            bVarJ = null;
        }
        b bVarI = i(kb7Var, str, locale);
        if (bVarI == null) {
            return bVarJ;
        }
        bVarI.a = bVarJ;
        return bVarI;
    }

    public static kb7 l(kb7 kb7Var, Locale locale) {
        t0j t0jVar = new t0j(kb7Var.g());
        if (!locale.equals(f1292e)) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String variant = locale.getVariant();
            boolean zEquals = "".equals(language);
            boolean zEquals2 = "".equals(country);
            boolean zEquals3 = "".equals(variant);
            if (!zEquals || !zEquals2 || !zEquals3) {
                t0jVar.append('_');
                if (!zEquals3) {
                    t0jVar.n(language).append('_').n(country).append('_').n(variant);
                } else if (zEquals2) {
                    t0jVar.n(language);
                } else {
                    t0jVar.n(language).append('_').n(country);
                }
            }
        }
        return kb7Var.s(t0jVar.n(".properties").toString());
    }

    public Locale g() {
        return this.b;
    }

    public void h(Reader reader) throws IOException {
        i<String, String> iVar = new i<>();
        this.f1293c = iVar;
        l.a(iVar, reader);
    }

    public final void k(Locale locale) {
        this.b = locale;
        this.d = new rsj(locale, !f);
    }
}
