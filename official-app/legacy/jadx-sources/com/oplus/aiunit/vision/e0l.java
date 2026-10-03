package com.oplus.aiunit.vision;

import android.view.View;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "", "a", "lib_base_release"}, k = 2, mv = {1, 8, 0})
public final class e0l {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"com/oplus/aiunit/vision/e0l$a", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", ParserTag.TAG_ONCLICK, "", "i", "J", "getMinTime", "()J", "minTime", "j", "getLastTime", "setLastTime", "(J)V", "lastTime", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final long minTime = 1000;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public long lastTime;
        public final /* synthetic */ View.OnClickListener k;

        public a(View.OnClickListener onClickListener) {
            this.k = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastTime > this.minTime) {
                this.lastTime = jCurrentTimeMillis;
                this.k.onClick(v);
            } else {
                a7b.m("ViewExt", "频繁点击 view:" + v);
            }
        }
    }

    public static final void a(@NotNull View view, @NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        view.setOnClickListener(new a(listener));
    }
}
