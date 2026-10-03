package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a45 implements wz3 {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wz3.a f9186j;

    public a45(@NonNull Context context, @NonNull wz3.a aVar) {
        this.i = context.getApplicationContext();
        this.f9186j = aVar;
    }

    public final void a() {
        h7h.a(this.i).d(this.f9186j);
    }

    public final void b() {
        h7h.a(this.i).e(this.f9186j);
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onDestroy() {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStart() {
        a();
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStop() {
        b();
    }
}
