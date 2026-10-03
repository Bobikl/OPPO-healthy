package com.heytap.nearx.uikit.widget.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.IntegerRes;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.list.NearListView;

/* JADX INFO: loaded from: classes18.dex */
public class NearPercentWidthListView extends NearListView {
    private int mFlag;
    private int mInitPaddingEnd;
    private int mInitPaddingStart;
    private int mPercentWidthResourceId;

    public NearPercentWidthListView(Context context) {
        super(context);
    }

    private void initAttr(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.NearPercentWidthListView);
            this.mPercentWidthResourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearPercentWidthListView_nxListGridNumber, 0);
            this.mFlag = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearPercentWidthListView_specialListFlag, 1);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mInitPaddingStart = getPaddingStart();
        this.mInitPaddingEnd = getPaddingEnd();
        setScrollBarStyle(33554432);
    }

    private void initView() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        int integer = this.mPercentWidthResourceId > 0 ? getResources().getInteger(this.mPercentWidthResourceId) : 0;
        int totalGridSize = NearPercentUtils.getTotalGridSize(getContext());
        if (integer <= 0 || rect.width() <= 0 || integer >= totalGridSize) {
            setPadding(this.mInitPaddingStart, getPaddingTop(), this.mInitPaddingEnd, getPaddingBottom());
        } else {
            int iWidth = (rect.width() - ((int) NearPercentUtils.calculateWidth(rect.width(), integer, totalGridSize, this.mFlag, getContext()))) / 2;
            setPadding(iWidth, getPaddingTop(), iWidth, getPaddingBottom());
        }
    }

    public int getFlag() {
        return this.mFlag;
    }

    public int getPercentWidthResourceId() {
        return this.mPercentWidthResourceId;
    }

    public void setFlag(int i) {
        this.mFlag = i;
    }

    public void setPercentWidthResourceId(@IntegerRes int i) {
        this.mPercentWidthResourceId = i;
    }

    public NearPercentWidthListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initAttr(attributeSet);
        initView();
    }

    public NearPercentWidthListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initAttr(attributeSet);
        initView();
    }
}
