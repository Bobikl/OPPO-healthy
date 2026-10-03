package com.coui.appcompat.searchview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.WindowInsets;
import androidx.appcompat.widget.SearchView;
import com.support.toolbar.R$id;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes13.dex */
public class COUISearchView extends SearchView {
    public SearchView.SearchAutoComplete i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2034j;
    public COUIHintAnimationLayout k;

    public COUISearchView(Context context) {
        super(context);
        this.f2034j = true;
    }

    public COUIHintAnimationLayout getHintAnimationLayout() {
        return this.k;
    }

    public SearchView.SearchAutoComplete getSearchAutoComplete() {
        SearchView.SearchAutoComplete searchAutoComplete = this.i;
        if (searchAutoComplete != null) {
            return searchAutoComplete;
        }
        try {
            Field declaredField = SearchView.class.getDeclaredField("mSearchSrcTextView");
            declaredField.setAccessible(true);
            SearchView.SearchAutoComplete searchAutoComplete2 = (SearchView.SearchAutoComplete) declaredField.get(this);
            this.i = searchAutoComplete2;
            return searchAutoComplete2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static class COUISearchAutoComplete extends SearchView.SearchAutoComplete {
        public boolean i;

        public COUISearchAutoComplete(Context context) {
            super(context);
            this.i = false;
        }

        @Override // androidx.appcompat.widget.SearchView.SearchAutoComplete, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            WindowInsets rootWindowInsets;
            boolean zOnKeyPreIme = super.onKeyPreIme(i, keyEvent);
            if (Build.VERSION.SDK_INT < 34 || this.i || (rootWindowInsets = getRootView().getRootWindowInsets()) == null || rootWindowInsets.isVisible(WindowInsets.Type.ime()) || i != 4) {
                return zOnKeyPreIme;
            }
            return false;
        }

        public void setEnableNativeKeyPreIme(boolean z) {
            this.i = z;
        }

        public COUISearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.i = false;
        }

        public COUISearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.i = false;
        }
    }

    public COUISearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2034j = true;
    }

    public COUISearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2034j = true;
        this.k = (COUIHintAnimationLayout) findViewById(R$id.search_animation_layout);
    }
}
