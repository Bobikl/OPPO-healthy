package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coui.appcompat.textview.COUITextView;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesEditTableItemBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final COUITextView f4402j;

    @NonNull
    public final COUITextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final COUITextView f4403l;

    @NonNull
    public final COUITextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final COUITextView f4404n;

    @NonNull
    public final AppCompatEditText o;

    @NonNull
    public final AppCompatEditText p;

    @NonNull
    public final AppCompatEditText q;

    @NonNull
    public final AppCompatEditText r;

    @NonNull
    public final AppCompatEditText s;

    public HealthArchivesEditTableItemBinding(@NonNull View view, @NonNull COUITextView cOUITextView, @NonNull COUITextView cOUITextView2, @NonNull COUITextView cOUITextView3, @NonNull COUITextView cOUITextView4, @NonNull COUITextView cOUITextView5, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatEditText appCompatEditText2, @NonNull AppCompatEditText appCompatEditText3, @NonNull AppCompatEditText appCompatEditText4, @NonNull AppCompatEditText appCompatEditText5) {
        this.i = view;
        this.f4402j = cOUITextView;
        this.k = cOUITextView2;
        this.f4403l = cOUITextView3;
        this.m = cOUITextView4;
        this.f4404n = cOUITextView5;
        this.o = appCompatEditText;
        this.p = appCompatEditText2;
        this.q = appCompatEditText3;
        this.r = appCompatEditText4;
        this.s = appCompatEditText5;
    }

    @NonNull
    public static HealthArchivesEditTableItemBinding a(@NonNull View view) {
        int i = R$id.table_column_1;
        COUITextView cOUITextView = (COUITextView) ViewBindings.findChildViewById(view, i);
        if (cOUITextView != null) {
            i = R$id.table_column_2;
            COUITextView cOUITextView2 = (COUITextView) ViewBindings.findChildViewById(view, i);
            if (cOUITextView2 != null) {
                i = R$id.table_column_3;
                COUITextView cOUITextView3 = (COUITextView) ViewBindings.findChildViewById(view, i);
                if (cOUITextView3 != null) {
                    i = R$id.table_column_4;
                    COUITextView cOUITextView4 = (COUITextView) ViewBindings.findChildViewById(view, i);
                    if (cOUITextView4 != null) {
                        i = R$id.table_column_5;
                        COUITextView cOUITextView5 = (COUITextView) ViewBindings.findChildViewById(view, i);
                        if (cOUITextView5 != null) {
                            i = R$id.table_edit_column_1;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                            if (appCompatEditText != null) {
                                i = R$id.table_edit_column_2;
                                AppCompatEditText appCompatEditText2 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                                if (appCompatEditText2 != null) {
                                    i = R$id.table_edit_column_3;
                                    AppCompatEditText appCompatEditText3 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                                    if (appCompatEditText3 != null) {
                                        i = R$id.table_edit_column_4;
                                        AppCompatEditText appCompatEditText4 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                                        if (appCompatEditText4 != null) {
                                            i = R$id.table_edit_column_5;
                                            AppCompatEditText appCompatEditText5 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                                            if (appCompatEditText5 != null) {
                                                return new HealthArchivesEditTableItemBinding(view, cOUITextView, cOUITextView2, cOUITextView3, cOUITextView4, cOUITextView5, appCompatEditText, appCompatEditText2, appCompatEditText3, appCompatEditText4, appCompatEditText5);
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
    public static HealthArchivesEditTableItemBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_edit_table_item, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
