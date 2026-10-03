package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class sbb extends pbb<ona, usf<?>> implements hsb {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hsb.a f16537e;

    public sbb(long j2) {
        super(j2);
    }

    @Override // com.oplus.aiunit.vision.hsb
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            l(g() / 2);
        }
    }

    @Override // com.oplus.aiunit.vision.hsb
    @Nullable
    public /* bridge */ /* synthetic */ usf b(@NonNull ona onaVar, @Nullable usf usfVar) {
        return (usf) super.j(onaVar, usfVar);
    }

    @Override // com.oplus.aiunit.vision.hsb
    public void c(@NonNull hsb.a aVar) {
        this.f16537e = aVar;
    }

    @Override // com.oplus.aiunit.vision.hsb
    @Nullable
    public /* bridge */ /* synthetic */ usf d(@NonNull ona onaVar) {
        return (usf) super.k(onaVar);
    }

    @Override // com.oplus.aiunit.vision.pbb
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int h(@Nullable usf<?> usfVar) {
        return usfVar == null ? super.h(null) : usfVar.getSize();
    }

    @Override // com.oplus.aiunit.vision.pbb
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(@NonNull ona onaVar, @Nullable usf<?> usfVar) {
        hsb.a aVar = this.f16537e;
        if (aVar == null || usfVar == null) {
            return;
        }
        aVar.a(usfVar);
    }
}
