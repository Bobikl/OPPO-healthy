package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public class sha extends w5 {
    public final qha a = new qha();
    public final StringBuilder b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16591c;

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            CharSequence charSequenceB = l8eVar.b();
            return ((charSequenceB != null ? charSequenceB.length() : 0) > 1 && '$' == charSequenceB.charAt(0) && '$' == charSequenceB.charAt(1)) ? di1.d(new sha()).b(l8eVar.getIndex() + 2) : di1.c();
        }
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void e(CharSequence charSequence) {
        if (this.b.length() > 0) {
            this.b.append('\n');
        }
        this.b.append(charSequence);
        int length = this.b.length();
        if (length > 1) {
            boolean z = '$' == this.b.charAt(length + (-1)) && '$' == this.b.charAt(length + (-2));
            this.f16591c = z;
            if (z) {
                this.b.replace(length - 2, length, "");
            }
        }
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void g() {
        this.a.o(this.b.toString());
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        return this.f16591c ? th1.c() : th1.b(l8eVar.getIndex());
    }
}
