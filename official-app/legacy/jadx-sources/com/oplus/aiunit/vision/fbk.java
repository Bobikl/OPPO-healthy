package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class fbk implements nt4 {
    @Override // com.oplus.aiunit.vision.nt4
    public boolean a(is4 is4Var, byte[] bArr, int i) {
        if (i == 0) {
            is4Var.b(bArr);
        } else {
            is4Var.c(bArr, 2, bArr.length - 2);
        }
        return (bArr[0] & 1) == 0;
    }
}
