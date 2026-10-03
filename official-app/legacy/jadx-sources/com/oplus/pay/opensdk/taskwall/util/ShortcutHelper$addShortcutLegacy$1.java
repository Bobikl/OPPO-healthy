package com.oplus.pay.opensdk.taskwall.util;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ShortcutHelper$addShortcutLegacy$1 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ShortcutHelper.a $callback;
    final /* synthetic */ String $shortLabel;
    final /* synthetic */ Intent $shortcutIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutHelper$addShortcutLegacy$1(Activity activity, ShortcutHelper.a aVar, Intent intent, String str) {
        super(1);
        this.$activity = activity;
        this.$callback = aVar;
        this.$shortcutIntent = intent;
        this.$shortLabel = str;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            Intent intent = new Intent();
            Intent intent2 = this.$shortcutIntent;
            String str = this.$shortLabel;
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            intent.putExtra("android.intent.extra.shortcut.NAME", str);
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            this.$activity.sendBroadcast(intent);
            ShortcutHelper.a aVar = this.$callback;
            if (aVar != null) {
                aVar.onSuccess("unity_shortId");
            }
        } catch (Exception e2) {
            ShortcutHelper.a aVar2 = this.$callback;
            if (aVar2 != null) {
                aVar2.onFailure("创建快捷方式失败: " + e2.getMessage());
            }
        }
    }
}
