package com.heytap.nearx.uikit.widget.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.IntegerRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearRecyclerView;

/* JADX INFO: loaded from: classes18.dex */
public class NearPercentWidthRecyclerView extends NearRecyclerView {
    private int mFlag;
    private int mInitPaddingEnd;
    private int mInitPaddingStart;
    private boolean mPercentEnabled;
    public int mPercentWidthResourceId;

    public NearPercentWidthRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void initAttr(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.NearPercentWidthRecyclerView);
            this.mPercentWidthResourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearPercentWidthRecyclerView_nxRecyclerGridNumber, 0);
            this.mFlag = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearPercentWidthRecyclerView_specialRecyclerFlag, 1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getFlag() {
        return this.mFlag;
    }

    public int getPercentWidthResourceId() {
        return this.mPercentWidthResourceId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mPercentEnabled) {
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
        } else {
            setPadding(this.mInitPaddingStart, getPaddingTop(), this.mInitPaddingEnd, getPaddingBottom());
        }
        super.onMeasure(i, i2);
    }

    public void setFlag(int i) {
        this.mFlag = i;
    }

    public void setPercentIndentEnabled(boolean z) {
        this.mPercentEnabled = z;
        requestLayout();
    }

    public void setPercentWidthResourceId(@IntegerRes int i) {
        this.mPercentWidthResourceId = i;
    }

    public NearPercentWidthRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPercentWidthRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPercentEnabled = true;
        initAttr(attributeSet);
        this.mInitPaddingStart = getPaddingStart();
        this.mInitPaddingEnd = getPaddingEnd();
        setScrollBarStyle(33554432);
    }
}
