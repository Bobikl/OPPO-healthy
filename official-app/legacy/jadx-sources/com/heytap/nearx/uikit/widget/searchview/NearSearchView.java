package com.heytap.nearx.uikit.widget.searchview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.SearchView;
import com.heytap.nearx.uikit.R$dimen;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes18.dex */
public class NearSearchView extends SearchView {
    private boolean mIsHintTextSize;
    private SearchView.SearchAutoComplete mSearchSrcTextView;

    public NearSearchView(Context context) {
        super(context);
        this.mIsHintTextSize = true;
    }

    private void changeTextSize(String str) {
        if (this.mSearchSrcTextView == null) {
            this.mSearchSrcTextView = getSearchAutoComplete();
        }
        if (str.isEmpty()) {
            this.mSearchSrcTextView.setTextSize(0, getContext().getResources().getDimensionPixelSize(R$dimen.nx_searchview_text_hint_size));
            this.mIsHintTextSize = true;
        } else if (this.mIsHintTextSize) {
            this.mSearchSrcTextView.setTextSize(0, getContext().getResources().getDimensionPixelSize(R$dimen.nx_searchview_text_size));
            this.mIsHintTextSize = false;
        }
    }

    public SearchView.SearchAutoComplete getSearchAutoComplete() {
        SearchView.SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (searchAutoComplete != null) {
            return searchAutoComplete;
        }
        try {
            Field declaredField = SearchView.class.getDeclaredField("mSearchSrcTextView");
            declaredField.setAccessible(true);
            SearchView.SearchAutoComplete searchAutoComplete2 = (SearchView.SearchAutoComplete) declaredField.get(this);
            this.mSearchSrcTextView = searchAutoComplete2;
            return searchAutoComplete2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public NearSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsHintTextSize = true;
    }

    public NearSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsHintTextSize = true;
    }
}
