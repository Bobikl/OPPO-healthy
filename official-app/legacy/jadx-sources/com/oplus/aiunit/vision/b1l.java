package com.oplus.aiunit.vision;

import android.view.View;
import android.view.WindowManager;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\u001a$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005\"#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "tag", "Lkotlin/Function0;", "Landroid/view/View;", "view", "", CardAction.LIFE_CIRCLE_VALUE_SHOW, "", "a", "", "Ljava/util/Map;", "getViewCache", "()Ljava/util/Map;", "viewCache", "lib_ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewSuspendHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSuspendHelper.kt\ncom/heytap/sporthealth/blib/helper/ViewSuspendHelperKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,31:1\n372#2,7:32\n*S KotlinDebug\n*F\n+ 1 ViewSuspendHelper.kt\ncom/heytap/sporthealth/blib/helper/ViewSuspendHelperKt\n*L\n19#1:32,7\n*E\n"})
public final class b1l {

    @NotNull
    public static final Map<String, View> a = new LinkedHashMap();

    public static final void a(@NotNull String tag, @NotNull Function0<? extends View> view, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(view, "view");
        Object systemService = b78.a().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (!z) {
            windowManager.removeView(a.remove(tag));
            return;
        }
        Map<String, View> map = a;
        View viewInvoke = map.get(tag);
        if (viewInvoke == null) {
            viewInvoke = view.invoke();
            map.put(tag, viewInvoke);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        layoutParams.type = 2038;
        layoutParams.format = -2;
        layoutParams.flags = 40;
        layoutParams.height = -2;
        layoutParams.width = -2;
        Unit unit = Unit.INSTANCE;
        windowManager.addView(viewInvoke, layoutParams);
    }
}
