package com.heytap.health.watch.notification.impl.ui;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.heytap.health.base.R$color;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/a;", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", ParserTag.TAG_ONCLICK, "Landroid/text/TextPaint;", "ds", "updateDrawState", "", "i", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "action", "j", "getPackageName", "packageName", MapSchema.FIELD_NAME_KEY, "getArgsKey", "argsKey", LogFieldKey.LEVEL_KEY, "getArgsValue", "argsValue", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String action = "oplus.intent.action.adviceSetting";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String packageName = "com.coloros.assistantscreen";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String argsKey = ":settings:fragment_args_key";

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String argsValue = "context_aware_navigation";

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        try {
            Intent intent = new Intent(this.action);
            intent.setPackage(this.packageName);
            intent.putExtra(this.argsKey, this.argsValue);
            intent.addFlags(268435456);
            b78.a().startActivity(intent);
        } catch (Exception e2) {
            a7b.b(FlashbackAssistantVm.INSTANCE.a(), "intent to flashback setting activity fail! " + e2);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setColor(b78.a().getColor(R$color.lib_base_color_green_378));
    }
}
