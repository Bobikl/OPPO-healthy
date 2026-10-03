package com.heytap.nearx.uikit.widget.dialogview.adapter;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.cursoradapter.widget.CursorAdapter;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.internal.widget.InnerCheckBox;
import com.heytap.nearx.uikit.widget.NearCheckBox;
import java.util.HashSet;

/* JADX INFO: loaded from: classes18.dex */
public class ChoiceListCursorAdapter extends CursorAdapter {
    private HashSet<Integer> mCheckBoxStates;
    private String mIsCheckedColumn;
    private int mIsCheckedIndex;
    private boolean mIsMultiChoice;
    private String mLabelColumn;
    private int mLabelIndex;
    private int mLayoutResId;
    private String mSummaryColumn;
    private int mSummaryIndex;

    public ChoiceListCursorAdapter(Context context, Cursor cursor, int i, String str, String str2) {
        this(context, cursor, i, str, null, str2, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        TextView textView = (TextView) view.findViewById(R.id.text1);
        TextView textView2 = (TextView) view.findViewById(R$id.summary_text2);
        int iA = this.mCheckBoxStates.contains(Integer.valueOf(cursor.getPosition())) ? InnerCheckBox.INSTANCE.a() : InnerCheckBox.INSTANCE.b();
        if (this.mIsMultiChoice) {
            ((NearCheckBox) view.findViewById(R$id.checkbox)).setState(iA);
        }
        textView.setText(cursor.getString(this.mLabelIndex));
        if (this.mSummaryColumn == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(cursor.getString(this.mSummaryIndex));
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.mLayoutResId, viewGroup, false);
    }

    public void setCheckboxState(int i, int i2, ListView listView) {
        int firstVisiblePosition = i2 - listView.getFirstVisiblePosition();
        if (firstVisiblePosition >= 0) {
            ((NearCheckBox) listView.getChildAt(firstVisiblePosition).findViewById(R$id.checkbox)).setState(i);
            if (i == InnerCheckBox.INSTANCE.a()) {
                this.mCheckBoxStates.add(Integer.valueOf(i2));
            } else {
                this.mCheckBoxStates.remove(Integer.valueOf(i2));
            }
        }
    }

    public ChoiceListCursorAdapter(Context context, Cursor cursor, int i, String str, String str2, String str3, boolean z) {
        this(context, cursor);
        this.mIsMultiChoice = z;
        this.mLabelColumn = str;
        this.mSummaryColumn = str3;
        this.mIsCheckedColumn = str2;
        this.mLayoutResId = i;
        this.mCheckBoxStates = new HashSet<>();
        this.mLabelIndex = cursor.getColumnIndexOrThrow(this.mLabelColumn);
        String str4 = this.mSummaryColumn;
        if (str4 != null) {
            this.mSummaryIndex = cursor.getColumnIndexOrThrow(str4);
        }
        if (z) {
            this.mIsCheckedIndex = cursor.getColumnIndexOrThrow(this.mIsCheckedColumn);
            if (cursor.moveToFirst()) {
                do {
                    if (cursor.getInt(this.mIsCheckedIndex) == 1) {
                        this.mCheckBoxStates.add(Integer.valueOf(cursor.getPosition()));
                    }
                } while (cursor.moveToNext());
            }
            cursor.moveToFirst();
        }
    }

    public ChoiceListCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor);
        this.mIsMultiChoice = false;
        this.mIsCheckedIndex = 0;
    }
}
