package com.heytap.health.operation.courses.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.seekbar.COUISectionSeekBar;
import com.coui.appcompat.seekbar.COUISeekBar;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.courses.constant.CourseEnum$DifficultyCloud;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class SectionSeekBarView extends FrameLayout {
    public COUISectionSeekBar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f5162j;
    public Context k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CourseEnum$DifficultyCloud f5163l;
    public View m;

    public class a implements COUISeekBar.l {
        public a() {
        }

        @Override // com.coui.appcompat.seekbar.COUISeekBar.l
        public void J6(@NotNull COUISeekBar cOUISeekBar) {
        }

        @Override // com.coui.appcompat.seekbar.COUISeekBar.l
        public void N4(@NotNull COUISeekBar cOUISeekBar, int i, boolean z) {
            SectionSeekBarView.b(SectionSeekBarView.this);
            SectionSeekBarView.this.setSeekBarIndex(i);
        }

        @Override // com.coui.appcompat.seekbar.COUISeekBar.l
        public void u4(@NotNull COUISeekBar cOUISeekBar) {
        }
    }

    public interface b {
    }

    public interface c {
    }

    public SectionSeekBarView(@NonNull Context context) {
        super(context);
        this.f5163l = CourseEnum$DifficultyCloud.PRIMARY;
        c(context);
    }

    public static /* bridge */ /* synthetic */ c b(SectionSeekBarView sectionSeekBarView) {
        sectionSeekBarView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
    }

    public final void c(Context context) {
        this.k = context;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.operation_all_courses_section_seek_bar_view, this);
        this.i = (COUISectionSeekBar) viewInflate.findViewById(R$id.color_section_seek_bar);
        this.f5162j = (TextView) viewInflate.findViewById(R$id.difficulty_tip);
        View viewFindViewById = viewInflate.findViewById(R$id.touchable_placeholder);
        this.m = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.upg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.d(view);
            }
        });
        this.i.setMax(3);
        this.i.setProgress(1);
        this.i.setOnSeekBarChangeListener(new a());
        this.f5162j.setText(context.getString(CourseEnum$DifficultyCloud.PRIMARY.tipResourceId));
    }

    public CourseEnum$DifficultyCloud getDifficultyCloud() {
        return this.f5163l;
    }

    public void setOnClickEmptyPlaceHolderListener(b bVar) {
    }

    public void setSeekBarIndex(int i) {
        if (i > 3 || i < 0) {
            return;
        }
        for (CourseEnum$DifficultyCloud courseEnum$DifficultyCloud : CourseEnum$DifficultyCloud.values()) {
            if (courseEnum$DifficultyCloud.cloudIndex == i) {
                this.f5163l = courseEnum$DifficultyCloud;
                this.f5162j.setText(this.k.getString(courseEnum$DifficultyCloud.tipResourceId));
                return;
            }
        }
    }

    public void setSeekBarIndexChangedListener(c cVar) {
    }

    public SectionSeekBarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5163l = CourseEnum$DifficultyCloud.PRIMARY;
        c(context);
    }

    public SectionSeekBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5163l = CourseEnum$DifficultyCloud.PRIMARY;
        c(context);
    }
}
