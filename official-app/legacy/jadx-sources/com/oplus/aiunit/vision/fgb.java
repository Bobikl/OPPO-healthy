package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fgb {

    public interface a {
        @NonNull
        a a(@NonNull mgb mgbVar);

        @NonNull
        fgb build();
    }

    public interface b {
    }

    @NonNull
    public static a a(@NonNull Context context) {
        return new ggb(context).a(io.noties.markwon.core.a.r());
    }

    public abstract void b(@NonNull TextView textView, @NonNull String str);

    @NonNull
    public abstract Spanned c(@NonNull String str);
}
