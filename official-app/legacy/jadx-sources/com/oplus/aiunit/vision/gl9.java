package com.oplus.aiunit.vision;

import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class gl9 extends fj0<com.badlogic.gdx.utils.b, a> {
    public com.badlogic.gdx.utils.b b;

    public static class a extends bi0<com.badlogic.gdx.utils.b> {
        public final Locale b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11807c;

        public a() {
            this(null, null);
        }

        public a(Locale locale, String str) {
            this.b = locale;
            this.f11807c = str;
        }
    }

    public gl9(mb7 mb7Var) {
        super(mb7Var);
    }

    @Override // com.oplus.aiunit.vision.ai0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public wg0<yh0> a(String str, kb7 kb7Var, a aVar) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.fj0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(di0 di0Var, String str, kb7 kb7Var, a aVar) {
        Locale locale;
        String str2 = null;
        this.b = null;
        if (aVar == null) {
            locale = Locale.getDefault();
        } else {
            Locale locale2 = aVar.b;
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            locale = locale2;
            str2 = aVar.f11807c;
        }
        if (str2 == null) {
            this.b = com.badlogic.gdx.utils.b.b(kb7Var, locale);
        } else {
            this.b = com.badlogic.gdx.utils.b.c(kb7Var, locale, str2);
        }
    }

    @Override // com.oplus.aiunit.vision.fj0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.b d(di0 di0Var, String str, kb7 kb7Var, a aVar) {
        com.badlogic.gdx.utils.b bVar = this.b;
        this.b = null;
        return bVar;
    }
}
