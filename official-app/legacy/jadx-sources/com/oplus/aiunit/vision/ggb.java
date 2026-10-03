package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ggb implements fgb.a {
    public final Context a;
    public final List<mgb> b = new ArrayList(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView.BufferType f11758c = TextView.BufferType.SPANNABLE;
    public boolean d = true;

    public ggb(@NonNull Context context) {
        this.a = context;
    }

    @NonNull
    public static List<mgb> b(@NonNull List<mgb> list) {
        return new clf(list).e();
    }

    @Override // com.oplus.aiunit.vision.fgb.a
    @NonNull
    public fgb.a a(@NonNull mgb mgbVar) {
        this.b.add(mgbVar);
        return this;
    }

    @Override // com.oplus.aiunit.vision.fgb.a
    @NonNull
    public fgb build() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<mgb> listB = b(this.b);
        i8e.b bVar = new i8e.b();
        pgb.a aVarJ = pgb.j(this.a);
        hgb.b bVar2 = new hgb.b();
        sgb.a aVar = new sgb.a();
        ogb.a aVar2 = new ogb.a();
        for (mgb mgbVar : listB) {
            mgbVar.j(bVar);
            mgbVar.e(aVarJ);
            mgbVar.c(bVar2);
            mgbVar.d(aVar);
            mgbVar.f(aVar2);
        }
        hgb hgbVarH = bVar2.h(aVarJ.z(), aVar2.build());
        return new igb(this.f11758c, null, bVar.f(), rgb.b(aVar, hgbVarH), hgbVarH, Collections.unmodifiableList(listB), this.d);
    }
}
