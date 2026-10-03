package com.oplus.aiunit.vision;

import java.util.List;
import org.commonmark.internal.LinkReferenceDefinitionParser;

/* JADX INFO: loaded from: classes11.dex */
public class b7e extends w5 {
    public final a7e a = new a7e();
    public LinkReferenceDefinitionParser b = new LinkReferenceDefinitionParser();

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean c() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void e(CharSequence charSequence) {
        this.b.f(charSequence);
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void f(h8a h8aVar) {
        CharSequence charSequenceD = this.b.d();
        if (charSequenceD.length() > 0) {
            h8aVar.e(charSequenceD.toString(), this.a);
        }
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void g() {
        if (this.b.d().length() == 0) {
            this.a.l();
        }
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        return !l8eVar.a() ? th1.b(l8eVar.getIndex()) : th1.d();
    }

    public CharSequence i() {
        return this.b.d();
    }

    public List<oxa> j() {
        return this.b.c();
    }
}
