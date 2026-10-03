package com.heytap.health.step.card.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.step.R$array;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public class CalendarHeaderView extends FrameLayout {
    public String[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f5955j;

    public class a extends GridLayoutManager {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            return false;
        }
    }

    public CalendarHeaderView(@NonNull Context context) {
        this(context, null);
    }

    public final void a(Context context) {
        View.inflate(getContext(), R$layout.step_fragment_step_card_calendar_header, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.header_recycle_view);
        this.f5955j = recyclerView;
        recyclerView.setLayoutManager(new a(getContext(), 7));
        this.f5955j.setAdapter(new CalendarHeaderAdapter(context, this.i));
    }

    public RecyclerView getRecyclerView() {
        return this.f5955j;
    }

    public CalendarHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CalendarHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = null;
        this.i = getResources().getStringArray(R$array.step_calendar_header_title);
        a(context);
    }
}
