package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class g6a extends w5 {
    public final f6a a = new f6a();
    public final List<CharSequence> b = new ArrayList();

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            return (l8eVar.d() < m8e.CODE_BLOCK_INDENT || l8eVar.a() || (l8eVar.e().d() instanceof a7e)) ? di1.c() : di1.d(new g6a()).a(l8eVar.getColumn() + m8e.CODE_BLOCK_INDENT);
        }
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void e(CharSequence charSequence) {
        this.b.add(charSequence);
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void g() {
        int size = this.b.size() - 1;
        while (size >= 0 && m8e.f(this.b.get(size))) {
            size--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size + 1; i++) {
            sb.append(this.b.get(i));
            sb.append('\n');
        }
        this.a.o(sb.toString());
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        if (l8eVar.d() >= m8e.CODE_BLOCK_INDENT) {
            return th1.a(l8eVar.getColumn() + m8e.CODE_BLOCK_INDENT);
        }
        return l8eVar.a() ? th1.b(l8eVar.c()) : th1.d();
    }
}
