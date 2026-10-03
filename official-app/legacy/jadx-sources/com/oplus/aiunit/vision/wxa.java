package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.heytap.health.base.task.ThreadUtils;

/* JADX INFO: loaded from: classes16.dex */
public class wxa implements cm9<IInterface> {

    public static class a implements uo5 {
        @Override // com.oplus.aiunit.vision.c01
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(com.heytap.health.device_manager_base.b bVar) {
            return yxa.d() && bVar.o2();
        }
    }

    public static /* synthetic */ void h(final Context context) {
        a7b.f("LA.LinkageApi", "LinkageApi create controlDeviceCenterComponent success");
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.vxa
            @Override // java.lang.Runnable
            public final void run() {
                yxa.c(context);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NonNull Context context) {
        a7b.f("LA.LinkageApi", "onDestroy");
        if (x94.b.a(context)) {
            jya.a().b().p();
        }
        x94.a.a(context, false, null);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NonNull final Context context) {
        a7b.f("LA.LinkageApi", "onCreate");
        try {
            x94.a.a(context, true, new Runnable() { // from class: com.oplus.aiunit.vision.uxa
                @Override // java.lang.Runnable
                public final void run() {
                    wxa.h(context);
                }
            });
        } catch (Exception e2) {
            a7b.b("LA.LinkageApi", "LinkageApi create error " + e2.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NonNull
    public IInterface d() {
        return null;
    }
}
