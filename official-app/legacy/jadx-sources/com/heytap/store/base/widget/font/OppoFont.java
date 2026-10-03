package com.heytap.store.base.widget.font;

import android.util.Pair;
import com.heytap.store.base.widget.R;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/heytap/store/base/widget/font/OppoFont;", "", "value", "Landroid/util/Pair;", "", "", "(Ljava/lang/String;ILandroid/util/Pair;)V", "getValue", "()Landroid/util/Pair;", "setValue", "(Landroid/util/Pair;)V", "SANS_TEXT_REGULAR_NORMAL", "SANS_TEXT_MEDIUM_500", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum OppoFont {
    SANS_TEXT_REGULAR_NORMAL(new Pair("oppo_sans_en_regular.ttf", Integer.valueOf(R.font.oppo_sans_en_regular))),
    SANS_TEXT_MEDIUM_500(new Pair("oppo_sans_en_medium.ttf", Integer.valueOf(R.font.oppo_sans_en_medium)));


    @NotNull
    private Pair<String, Integer> value;

    OppoFont(Pair pair) {
        this.value = pair;
    }

    @NotNull
    public final Pair<String, Integer> getValue() {
        return this.value;
    }

    public final void setValue(@NotNull Pair<String, Integer> pair) {
        Intrinsics.checkNotNullParameter(pair, "<set-?>");
        this.value = pair;
    }
}
