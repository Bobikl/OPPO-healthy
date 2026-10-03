package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coui.appcompat.button.COUIButton;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.view.FixedLineCopyTextView;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesAiInterpretCardBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final COUIButton f4378j;

    @NonNull
    public final COUIButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f4379l;

    @NonNull
    public final Group m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Group f4380n;

    @NonNull
    public final TextView o;

    @NonNull
    public final TextView p;

    @NonNull
    public final TextView q;

    @NonNull
    public final TextView r;

    @NonNull
    public final AppCompatTextView s;

    @NonNull
    public final AppCompatTextView t;

    @NonNull
    public final FixedLineCopyTextView u;

    public HealthArchivesAiInterpretCardBinding(@NonNull View view, @NonNull COUIButton cOUIButton, @NonNull COUIButton cOUIButton2, @NonNull LinearLayout linearLayout, @NonNull Group group, @NonNull Group group2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull FixedLineCopyTextView fixedLineCopyTextView) {
        this.i = view;
        this.f4378j = cOUIButton;
        this.k = cOUIButton2;
        this.f4379l = linearLayout;
        this.m = group;
        this.f4380n = group2;
        this.o = textView;
        this.p = textView2;
        this.q = textView3;
        this.r = textView4;
        this.s = appCompatTextView;
        this.t = appCompatTextView2;
        this.u = fixedLineCopyTextView;
    }

    @NonNull
    public static HealthArchivesAiInterpretCardBinding a(@NonNull View view) {
        int i = R$id.btn_interpret_again;
        COUIButton cOUIButton = (COUIButton) ViewBindings.findChildViewById(view, i);
        if (cOUIButton != null) {
            i = R$id.btn_interpret_now;
            COUIButton cOUIButton2 = (COUIButton) ViewBindings.findChildViewById(view, i);
            if (cOUIButton2 != null) {
                i = R$id.cl_ai_explain;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R$id.group_interpreted;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = R$id.group_not_interpreted;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = R$id.tv_ai_interpret_desc;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R$id.tv_ai_interpret_time;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R$id.tv_ai_interpret_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R$id.tv_ai_interpreting;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R$id.tv_aigc_tips;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = R$id.tv_expand_more;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = R$id.tv_explain_content;
                                                    FixedLineCopyTextView fixedLineCopyTextView = (FixedLineCopyTextView) ViewBindings.findChildViewById(view, i);
                                                    if (fixedLineCopyTextView != null) {
                                                        return new HealthArchivesAiInterpretCardBinding(view, cOUIButton, cOUIButton2, linearLayout, group, group2, textView, textView2, textView3, textView4, appCompatTextView, appCompatTextView2, fixedLineCopyTextView);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesAiInterpretCardBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_ai_interpret_card, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
