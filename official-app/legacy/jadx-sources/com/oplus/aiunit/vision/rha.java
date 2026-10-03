package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import io.netty.util.internal.StringUtil;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class rha extends w5 {
    public final qha a = new qha();
    public final StringBuilder b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16204c;

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            if (l8eVar.d() >= m8e.CODE_BLOCK_INDENT) {
                return di1.c();
            }
            int iC = l8eVar.c();
            CharSequence charSequenceB = l8eVar.b();
            int length = charSequenceB.length();
            int iJ = rha.j(Typography.dollar, charSequenceB, iC, length);
            if (iJ >= 2 && m8e.k(StringUtil.SPACE, charSequenceB, iC + iJ, length) == length) {
                return di1.d(new rha(iJ)).b(length + 1);
            }
            return di1.c();
        }
    }

    public rha(int i) {
        this.f16204c = i;
    }

    public static int j(char c2, @NonNull CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (c2 != charSequence.charAt(i3)) {
                return i3 - i;
            }
        }
        return i2 - i;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void e(CharSequence charSequence) {
        this.b.append(charSequence);
        this.b.append('\n');
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void g() {
        this.a.o(this.b.toString());
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        int iC = l8eVar.c();
        CharSequence charSequenceB = l8eVar.b();
        int length = charSequenceB.length();
        if (l8eVar.d() < m8e.CODE_BLOCK_INDENT) {
            int iJ = j(Typography.dollar, charSequenceB, iC, length);
            int i = this.f16204c;
            if (iJ == i && m8e.k(StringUtil.SPACE, charSequenceB, iC + i, length) == length) {
                return th1.c();
            }
        }
        return th1.b(l8eVar.getIndex());
    }
}
