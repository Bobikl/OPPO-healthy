package com.coui.appcompat.dialog.adapter;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cursoradapter.widget.CursorAdapter;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.support.dialog.R$id;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class ChoiceListCursorAdapter extends CursorAdapter {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1695j;
    public HashSet<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1696l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f1697n;

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        TextView textView = (TextView) view.findViewById(R.id.text1);
        TextView textView2 = (TextView) view.findViewById(R$id.summary_text2);
        int i = this.k.contains(Integer.valueOf(cursor.getPosition())) ? 2 : 0;
        if (this.f1695j) {
            ((COUICheckBox) view.findViewById(R$id.checkbox)).setState(i);
        }
        textView.setText(cursor.getString(this.f1696l));
        if (this.f1697n == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(cursor.getString(this.m));
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.i, viewGroup, false);
    }
}
