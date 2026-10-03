package com.oplus.aiunit.vision;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public interface mgb {

    public interface a {
        @NonNull
        <P extends mgb> P a(@NonNull Class<P> cls);
    }

    void a(@NonNull ltc ltcVar);

    void b(@NonNull TextView textView);

    void c(@NonNull hgb.b bVar);

    void d(@NonNull qgb.b bVar);

    void e(@NonNull pgb.a aVar);

    void f(@NonNull ngb.a aVar);

    void g(@NonNull a aVar);

    void h(@NonNull ltc ltcVar, @NonNull qgb qgbVar);

    @NonNull
    String i(@NonNull String str);

    void j(@NonNull i8e.b bVar);

    void k(@NonNull TextView textView, @NonNull Spanned spanned);
}
