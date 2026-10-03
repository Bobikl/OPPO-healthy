package com.heytap.udeviceui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.udeviceui.model.ModeItem;
import com.oplus.aiunit.vision.f2c;
import com.oplus.aiunit.vision.fid;
import com.oplus.aiunit.vision.qek;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00017B\u0011\b\u0016\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b1\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0015R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00068"}, d2 = {"Lcom/heytap/udeviceui/UDeviceModeAction;", "Landroid/widget/FrameLayout;", "", "onFinishInflate", "", "resId", "setTitle", "", "title", "", "Lcom/heytap/udeviceui/model/ModeItem;", "list", "setModeList", "getModeList", "position", "setButtonLoading", "type", "setBackgroundType", "Lcom/oplus/aiunit/vision/fid;", "listener", "setOnModeActionClickListener", "", "selected", "b", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "disabled", "setDisabled", "isSingle", "setSingleChooseMode", "i", "Ljava/util/List;", "mModeList", "j", "Ljava/lang/String;", "mTitle", MapSchema.FIELD_NAME_KEY, "Z", "mDisabled", "Lcom/oplus/aiunit/vision/f2c;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/f2c;", "mModeItemViewHelper", LogFieldKey.MESSAGE_KEY, "I", "mBackgroundType", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class UDeviceModeAction extends FrameLayout {
    public static final int o = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public List<ModeItem> mModeList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String mTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mDisabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final f2c mModeItemViewHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mBackgroundType;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f8328n;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/udeviceui/UDeviceModeAction$b", "Lcom/oplus/aiunit/vision/f2c$a;", "", "Lcom/heytap/udeviceui/model/ModeItem;", "list", "", "position", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class b implements f2c.a {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.f2c.a
        public void a(@NotNull List<ModeItem> list, int position) {
            Intrinsics.checkNotNullParameter(list, "list");
            qek qekVar = qek.INSTANCE;
            String simpleName = b.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
            qekVar.a(simpleName, "onSingleChoose " + position);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getSelected() && i != position) {
                    UDeviceModeAction.this.b(i, false);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDeviceModeAction(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mModeList = new ArrayList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.mModeItemViewHelper = new f2c(context2, this.mModeList);
        View.inflate(getContext(), R$layout.mode_action, this);
    }

    public View a(int i) {
        if (this.f8328n == null) {
            this.f8328n = new HashMap();
        }
        View view = (View) this.f8328n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f8328n.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void b(int position, boolean selected) {
        this.mModeList.get(position).setSelected(selected);
        f2c f2cVar = this.mModeItemViewHelper;
        LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
        f2cVar.d(position, selected, mListModeAction);
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
        setBackgroundType(this.mBackgroundType);
    }

    public final void setBackgroundType(int type) {
        if (type == p) {
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_up_radius));
            return;
        }
        if (type == q) {
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_down_radius));
        } else if (type == r) {
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_no_radius));
        } else {
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_all_radius));
        }
    }

    public final void setButtonLoading(int position) {
        f2c f2cVar = this.mModeItemViewHelper;
        LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
        f2cVar.e(position, mListModeAction);
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
            qek qekVar = qek.INSTANCE;
            String simpleName = UDeviceModeAction.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
            qekVar.a(simpleName, "setModeList " + modeItem.toString());
        }
        this.mModeList = list;
        f2c f2cVar = this.mModeItemViewHelper;
        LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
        f2cVar.i(list, mListModeAction);
    }

    public final void setOnModeActionClickListener(@NotNull fid listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mModeItemViewHelper.setOnModeActionClickListener(listener);
    }

    public final void setSingleChooseMode(boolean isSingle) {
        if (!isSingle) {
            f2c f2cVar = this.mModeItemViewHelper;
            LinearLayout mListModeAction = (LinearLayout) a(R$id.mListModeAction);
            Intrinsics.checkNotNullExpressionValue(mListModeAction, "mListModeAction");
            f2cVar.j(null, mListModeAction);
            return;
        }
        f2c f2cVar2 = this.mModeItemViewHelper;
        b bVar = new b();
        LinearLayout mListModeAction2 = (LinearLayout) a(R$id.mListModeAction);
        Intrinsics.checkNotNullExpressionValue(mListModeAction2, "mListModeAction");
        f2cVar2.j(bVar, mListModeAction2);
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
    public UDeviceModeAction(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mModeList = new ArrayList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.mModeItemViewHelper = new f2c(context2, this.mModeList);
        View.inflate(getContext(), R$layout.mode_action, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UDeviceModeAction);
        this.mTitle = typedArrayObtainStyledAttributes.getString(R$styleable.UDeviceModeAction_title);
        this.mBackgroundType = typedArrayObtainStyledAttributes.getInt(R$styleable.UDeviceModeAction_action_bg_type, o);
        typedArrayObtainStyledAttributes.recycle();
    }
}
