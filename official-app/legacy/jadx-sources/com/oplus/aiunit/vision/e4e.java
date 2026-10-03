package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class e4e implements hid {
    public List<hid> a = new ArrayList();

    @Override // com.oplus.aiunit.vision.hid
    public void a(z62 z62Var, int i) {
        Iterator<hid> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(z62Var, i);
        }
    }

    public void addOnPageLoadListener(hid hidVar) {
        if (this.a.contains(hidVar)) {
            return;
        }
        this.a.add(hidVar);
    }

    @Override // com.oplus.aiunit.vision.hid
    public void b(z62 z62Var, String str) {
        Iterator<hid> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(z62Var, str);
        }
    }

    @Override // com.oplus.aiunit.vision.hid
    public void c(z62 z62Var, String str, int i, String str2) {
        Iterator<hid> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(z62Var, str, i, str2);
        }
    }

    @Override // com.oplus.aiunit.vision.hid
    public void d(z62 z62Var) {
        Iterator<hid> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(z62Var);
        }
    }

    @Override // com.oplus.aiunit.vision.hid
    public void e(z62 z62Var, String str) {
        Iterator<hid> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e(z62Var, str);
        }
    }

    @Override // com.oplus.aiunit.vision.hid
    public void f(z62 z62Var, String str, Bitmap bitmap) {
        Iterator<hid> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().f(z62Var, str, bitmap);
        }
    }

    public void removeOnPageLoadListener(hid hidVar) {
        if (this.a.contains(hidVar)) {
            this.a.remove(hidVar);
        }
    }
}
