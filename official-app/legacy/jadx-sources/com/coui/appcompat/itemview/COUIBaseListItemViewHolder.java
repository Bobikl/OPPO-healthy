package com.coui.appcompat.itemview;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBaseListItemViewHolder extends RecyclerView.ViewHolder implements COUIRecyclerView.ICOUIDividerDecorationInterface {
    public static final int BOTH_RIGHT_ANGLE = 2;
    public static final int BOTH_ROUNDED_CORNER = 4;
    public static final int BOTTOM_ROUNDED_CORNER = 3;
    public static final int TOP_ROUNDED_CORNER = 1;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1816j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f1817l;

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public boolean drawDivider() {
        View view = this.k;
        if (view == null || !(view instanceof COUICardListSelectedItemLayout)) {
            return false;
        }
        int i = this.i;
        return i == 1 || i == 2;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerEndAlignView() {
        return null;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerEndInset() {
        return this.f1816j;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerStartAlignView() {
        return this.f1817l;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerStartInset() {
        return this.f1816j;
    }
}
