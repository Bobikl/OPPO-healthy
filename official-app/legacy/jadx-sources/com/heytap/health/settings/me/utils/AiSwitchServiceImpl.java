package com.heytap.health.settings.me.utils;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.base.R$string;
import com.heytap.health.health.AiPermissionSwitchService;
import com.heytap.health.settings.R$color;
import com.heytap.health.settings.me.setting.NetWorkOfficeWebViewActivity;
import com.heytap.health.settings.me.utils.AiSwitchServiceImpl;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c0;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.zv8;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/ai_switch/switch_service")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\bH\u0016J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/settings/me/utils/AiSwitchServiceImpl;", "Lcom/heytap/health/health/AiPermissionSwitchService;", "Landroid/content/Context;", "context", "", "init", "", "i8", "Lkotlin/Function1;", "resultCallBack", "R5", "h3", "j6", "", "content", "highlightText", "Landroid/text/SpannableStringBuilder;", "q6", "<init>", "()V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AiSwitchServiceImpl implements AiPermissionSwitchService {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/settings/me/utils/AiSwitchServiceImpl$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", ParserTag.TAG_ONCLICK, "Landroid/text/TextPaint;", "ds", "updateDrawState", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ClickableSpan {
        public final /* synthetic */ Context i;

        public a(Context context) {
            this.i = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Intent intent = new Intent(this.i, (Class<?>) NetWorkOfficeWebViewActivity.class);
            intent.putExtra(NetWorkOfficeWebViewActivity.EXTRA_WEBSITE, zv8.b.PRIVACY_STATEMENT_URL);
            intent.putExtra("title", qtf.l(R$string.settings_privacy_statement2));
            this.i.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(qtf.f(R$color.settings_blue_privacy));
            ds.setUnderlineText(false);
        }
    }

    public static final void Q6(Function1 resultCallBack, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(resultCallBack, "$resultCallBack");
        v9g.x(c0.SPNAME).W(c0.DIALOG_AI_SWITCH_IS_SHOW, true);
        v9g.x(c0.SPNAME).W(c0.SPORT_ANALYZE_STATE, true);
        v9g.x(c0.SPNAME).W(c0.SPORT_RECOMMEND_STATE, true);
        resultCallBack.invoke(Boolean.TRUE);
        dialogInterface.dismiss();
    }

    public static final void db(Function1 resultCallBack, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(resultCallBack, "$resultCallBack");
        v9g.x(c0.SPNAME).W(c0.DIALOG_AI_SWITCH_IS_SHOW, true);
        v9g.x(c0.SPNAME).W(c0.SPORT_ANALYZE_STATE, false);
        v9g.x(c0.SPNAME).W(c0.SPORT_RECOMMEND_STATE, false);
        resultCallBack.invoke(Boolean.FALSE);
        dialogInterface.dismiss();
    }

    public static final void eb(Function1 resultCallBack, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(resultCallBack, "$resultCallBack");
        v9g.x(c0.SPNAME).W(c0.DIALOG_AI_SWITCH_IS_SHOW_V2, true);
        v9g.x(c0.SPNAME).W(c0.HEALTH_60S_RECOMMEND_STATE, true);
        resultCallBack.invoke(Boolean.TRUE);
        dialogInterface.dismiss();
    }

    public static final void fb(Function1 resultCallBack, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(resultCallBack, "$resultCallBack");
        v9g.x(c0.SPNAME).W(c0.DIALOG_AI_SWITCH_IS_SHOW_V2, true);
        v9g.x(c0.SPNAME).W(c0.HEALTH_60S_RECOMMEND_STATE, false);
        resultCallBack.invoke(Boolean.FALSE);
        dialogInterface.dismiss();
    }

    @Override // com.heytap.health.health.AiPermissionSwitchService
    public void R5(@NotNull Context context, @NotNull final Function1<? super Boolean, Unit> resultCallBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        String string = context.getString(com.heytap.health.settings.R$string.settings_ai_permission_dialog_link);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…i_permission_dialog_link)");
        String string2 = context.getString(com.heytap.health.settings.R$string.settings_ai_permission_dialog_content);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ermission_dialog_content)");
        TextView textView = (TextView) new COUIAlertDialogBuilder(context).setTitle(com.heytap.health.settings.R$string.settings_sense_personal_info_protocol).setMessage(q6(string2, string, context)).setPositiveButton(R$string.lib_base_agree_and_continue, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.as
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AiSwitchServiceImpl.Q6(resultCallBack, dialogInterface, i);
            }
        }).setNegativeButton(com.heytap.health.settings.R$string.settings_unagree, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.bs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AiSwitchServiceImpl.db(resultCallBack, dialogInterface, i);
            }
        }).X(80).setCancelable(false).show().findViewById(R.id.message);
        if (textView != null) {
            textView.setClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // com.heytap.health.health.AiPermissionSwitchService
    public boolean h3() {
        return !v9g.x(c0.SPNAME).r(c0.DIALOG_AI_SWITCH_IS_SHOW_V2, false);
    }

    @Override // com.heytap.health.health.AiPermissionSwitchService
    public boolean i8() {
        boolean zR = v9g.x(c0.SPNAME).r(c0.DIALOG_AI_SWITCH_IS_SHOW, false);
        StringBuilder sb = new StringBuilder();
        sb.append("needShowAiDialog = ");
        sb.append(!zR);
        return !zR;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.health.AiPermissionSwitchService
    public void j6(@NotNull Context context, @NotNull final Function1<? super Boolean, Unit> resultCallBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        String string = context.getString(com.heytap.health.settings.R$string.settings_ai_permission_dialog_link);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…i_permission_dialog_link)");
        String string2 = context.getString(com.heytap.health.settings.R$string.settings_ai_permission_dialog_content_v2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ission_dialog_content_v2)");
        TextView textView = (TextView) new COUIAlertDialogBuilder(context).setTitle(com.heytap.health.settings.R$string.settings_sense_personal_info_protocol).setMessage(q6(string2, string, context)).setPositiveButton(R$string.lib_base_agree_and_continue, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.cs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AiSwitchServiceImpl.eb(resultCallBack, dialogInterface, i);
            }
        }).setNegativeButton(com.heytap.health.settings.R$string.settings_unagree, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ds
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AiSwitchServiceImpl.fb(resultCallBack, dialogInterface, i);
            }
        }).X(80).setCancelable(false).show().findViewById(R.id.message);
        if (textView != null) {
            textView.setClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final SpannableStringBuilder q6(String content, String highlightText, Context context) {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) content, highlightText, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
        try {
            spannableStringBuilder.setSpan(new a(context), iIndexOf$default, highlightText.length() + iIndexOf$default, 33);
            return spannableStringBuilder;
        } catch (Exception e2) {
            a7b.b("AiSwitchServiceImpl", "buildSpannableString error: " + e2);
            return new SpannableStringBuilder(content);
        }
    }
}
