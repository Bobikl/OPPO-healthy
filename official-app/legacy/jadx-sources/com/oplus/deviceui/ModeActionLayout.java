package com.oplus.deviceui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.heytap.udeviceui.R$styleable;
import com.oplus.aiunit.vision.eid;
import com.oplus.aiunit.vision.g2c;
import com.oplus.deviceui.model.ModeItem;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b,\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0013R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u00061"}, d2 = {"Lcom/oplus/deviceui/ModeActionLayout;", "Landroid/widget/FrameLayout;", "", "onFinishInflate", "", "resId", "setTitle", "", "title", "", "Lcom/oplus/deviceui/model/ModeItem;", "list", "setModeList", "getModeList", "position", "setButtonLoading", "Lcom/oplus/aiunit/vision/eid;", "listener", "setOnModeActionClickListener", "", "selected", "b", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "disabled", "setDisabled", "isSingle", "setSingleChooseMode", "i", "Ljava/util/List;", "mModeList", "j", "Ljava/lang/String;", "mTitle", MapSchema.FIELD_NAME_KEY, "Z", "mDisabled", "Lcom/oplus/aiunit/vision/g2c;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/g2c;", "mModeItemViewHelper", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class ModeActionLayout extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public List<ModeItem> mModeList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String mTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mDisabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final g2c mModeItemViewHelper;
    public HashMap m;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/oplus/deviceui/ModeActionLayout$a", "Lcom/oplus/aiunit/vision/g2c$b;", "", "Lcom/oplus/deviceui/model/ModeItem;", "list", "", "position", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class a implements g2c.b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.g2c.b
        public void a(@NotNull List<ModeItem> list, int position) {
            Intrinsics.checkNotNullParameter(list, "list");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getSelected() && i != position) {
                    ModeActionLayout.this.b(i, false);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeActionLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mModeList = new ArrayList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.mModeItemViewHelper = new g2c(context2, this.mModeList);
        View.inflate(getContext(), R$layout.mode_action_layout, this);
    }

    public View a(int i) {
        if (this.m == null) {
            this.m = new HashMap();
        }
        View view = (View) this.m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.m.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void b(int position, boolean selected) {
        this.mModeList.get(position).setSelected(selected);
        g2c g2cVar = this.mModeItemViewHelper;
        LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
        g2cVar.d(position, selected, mListModeAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (this.mDisabled) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @NotNull
    public final List<ModeItem> getModeList() {
        return this.mModeList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView mTextModeTitle = (TextView) a(R$id.mTextModeTitle);
        Intrinsics.checkNotNullExpressionValue(mTextModeTitle, "mTextModeTitle");
        mTextModeTitle.setText(this.mTitle);
    }

    public final void setButtonLoading(int position) {
        g2c g2cVar = this.mModeItemViewHelper;
        LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
        g2cVar.e(position, mListModeAction);
    }

    public final void setDisabled(boolean disabled) {
        this.mDisabled = disabled;
        if (disabled) {
            TextView mTextModeTitle = (TextView) a(R$id.mTextModeTitle);
            Intrinsics.checkNotNullExpressionValue(mTextModeTitle, "mTextModeTitle");
            mTextModeTitle.setAlpha(0.3f);
            LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
            Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
            mListModeAction.setAlpha(0.3f);
            return;
        }
        TextView mTextModeTitle2 = (TextView) a(R$id.mTextModeTitle);
        Intrinsics.checkNotNullExpressionValue(mTextModeTitle2, "mTextModeTitle");
        mTextModeTitle2.setAlpha(1.0f);
        LinearLayout mListModeAction2 = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction2, "mListModeAction");
        mListModeAction2.setAlpha(1.0f);
    }

    public final void setModeList(@NotNull List<ModeItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        for (ModeItem modeItem : list) {
            Log.d(ModeActionLayout.class.getSimpleName(), "setModeList " + modeItem.toString());
        }
        this.mModeList = list;
        g2c g2cVar = this.mModeItemViewHelper;
        LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
        g2cVar.i(list, mListModeAction);
    }

    public final void setOnModeActionClickListener(@NotNull eid listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mModeItemViewHelper.setOnModeActionClickListener(listener);
    }

    public final void setSingleChooseMode(boolean isSingle) {
        if (!isSingle) {
            g2c g2cVar = this.mModeItemViewHelper;
            LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
            Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
            g2cVar.j(null, mListModeAction);
            return;
        }
        g2c g2cVar2 = this.mModeItemViewHelper;
        a aVar = new a();
        LinearLayout mListModeAction2 = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction2, "mListModeAction");
        g2cVar2.j(aVar, mListModeAction2);
    }

    public final void setTitle(int resId) {
        int i = R$id.mTextModeTitle;
        TextView mTextModeTitle = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextModeTitle, "mTextModeTitle");
        mTextModeTitle.setVisibility(0);
        ((TextView) a(i)).setText(resId);
        setContentDescription(getContext().getString(resId));
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        int i = R$id.mTextModeTitle;
        TextView mTextModeTitle = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextModeTitle, "mTextModeTitle");
        mTextModeTitle.setVisibility(0);
        TextView mTextModeTitle2 = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextModeTitle2, "mTextModeTitle");
        mTextModeTitle2.setText(title);
        setContentDescription(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeActionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mModeList = new ArrayList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.mModeItemViewHelper = new g2c(context2, this.mModeList);
        View.inflate(getContext(), R$layout.mode_action_layout, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UDeviceModeAction);
        this.mTitle = typedArrayObtainStyledAttributes.getString(R$styleable.UDeviceModeAction_title);
        typedArrayObtainStyledAttributes.recycle();
    }
}
