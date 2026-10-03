package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.udeviceui.R;
import com.oplus.deviceui.ModeButton;
import com.oplus.deviceui.model.ModeItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\"B\u001d\u0012\u0006\u0010'\u001a\u00020!\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/v3c;", "", "", "position", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "h", "", "Lcom/oplus/deviceui/model/ModeItem;", "modeList", "", "i", "Lcom/oplus/aiunit/vision/xjd;", "listener", "setOnModeActionClickListener", "Lcom/oplus/aiunit/vision/v3c$b;", "j", "e", "", "selected", "d", "convertView", "f", "modeItem", "g", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setMList", "(Ljava/util/List;)V", "mList", "Landroid/content/Context;", "b", "Landroid/content/Context;", "mContext", "Lcom/oplus/aiunit/vision/v3c$b;", "mSingleChooseListener", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class v3c {

    @NotNull
    public List<ModeItem> a;
    public final Context b;
    public b c;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/v3c$a", "Lcom/oplus/deviceui/ModeButton$b;", "", "selected", "isLoading", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class a implements ModeButton.b {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        public void a(boolean selected, boolean isLoading) {
            b bVar = v3c.this.c;
            if (bVar != null) {
                bVar.a(v3c.this.c(), this.b);
            }
            v3c.this.c().get(this.b).setSelected(selected);
            v3c.this.c().get(this.b).setLoading(isLoading);
            v3c.a(v3c.this);
            Log.d(a.class.getSimpleName(), "onButtonClick " + this.b + ' ' + selected + ' ' + isLoading);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/v3c$b;", "", "", "Lcom/oplus/deviceui/model/ModeItem;", "list", "", "position", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public interface b {
        void a(@NotNull List<ModeItem> list, int position);
    }

    public v3c(@NotNull Context context, @NotNull List<ModeItem> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "modeList");
        this.a = list;
        this.b = context;
    }

    public static final /* synthetic */ xjd a(v3c v3cVar) {
        v3cVar.getClass();
        return null;
    }

    @NotNull
    public final List<ModeItem> c() {
        return this.a;
    }

    public final void d(int position, boolean selected, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.a.get(position).setSelected(selected);
        View childAt = parent.getChildAt(position);
        Intrinsics.checkNotNullExpressionValue(childAt, "childView");
        childAt.findViewById(R.id.mModeButton).setButtonSelectedWithAnimation(selected);
    }

    public final void e(int position, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View childAt = parent.getChildAt(position);
        Intrinsics.checkNotNullExpressionValue(childAt, "childView");
        childAt.findViewById(R.id.mModeButton).m();
    }

    public final void f(int position, View convertView) {
        ModeItem modeItem = this.a.get(position);
        g(modeItem, convertView);
        int i = R.id.mModeButton;
        convertView.findViewById(i).setButtonSelected(modeItem.getSelected());
        if (modeItem.isLoading()) {
            convertView.findViewById(i).m();
        }
        convertView.findViewById(i).setOnButtonClickListener(new a(position));
    }

    public final void g(ModeItem modeItem, View convertView) {
        Drawable icon = modeItem.getIcon();
        if (icon != null) {
            convertView.findViewById(R.id.mModeButton).setIcon(icon);
        }
        String name = modeItem.getName();
        if (name != null) {
            TextView textView = (TextView) convertView.findViewById(R.id.mModeText);
            Intrinsics.checkNotNullExpressionValue(textView, "convertView.mModeText");
            textView.setText(name);
        }
        int i = R.id.mModeText;
        TextView textView2 = (TextView) convertView.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(textView2, "convertView.mModeText");
        textView2.setTextSize(sx7.INSTANCE.a(this.b));
        int i2 = R.id.mModeButton;
        ModeButton modeButtonFindViewById = convertView.findViewById(i2);
        Intrinsics.checkNotNullExpressionValue(modeButtonFindViewById, "convertView.mModeButton");
        TextView textView3 = (TextView) convertView.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(textView3, "convertView.mModeText");
        modeButtonFindViewById.setContentDescription(textView3.getText());
        convertView.findViewById(i2).setWithProgress(modeItem.getNeedLoading());
        convertView.findViewById(i2).setSinglePress(modeItem.getSinglePress());
        convertView.findViewById(i2).setSingleChoose(this.c != null);
        Integer color = modeItem.getColor();
        if (color != null) {
            convertView.findViewById(i2).setbackgroundTint(color.intValue());
        }
        convertView.findViewById(i2).setButtonEnabled(modeItem.getEnabled());
        if (modeItem.getEnabled()) {
            TextView textView4 = (TextView) convertView.findViewById(i);
            Intrinsics.checkNotNullExpressionValue(textView4, "convertView.mModeText");
            textView4.setAlpha(1.0f);
        } else {
            TextView textView5 = (TextView) convertView.findViewById(i);
            Intrinsics.checkNotNullExpressionValue(textView5, "convertView.mModeText");
            textView5.setAlpha(0.3f);
        }
    }

    @NotNull
    public final View h(int position, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.b).inflate(R.layout.mode_item_layout, (ViewGroup) parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "convertView");
        f(position, viewInflate);
        return viewInflate;
    }

    public final void i(@NotNull List<ModeItem> modeList, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(modeList, "modeList");
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = 0;
        if (this.a.size() != modeList.size()) {
            try {
                modeList = v0b.INSTANCE.a(modeList);
            } catch (Exception unused) {
            }
            this.a = modeList;
            parent.removeAllViews();
            int size = this.a.size();
            while (i < size) {
                parent.addView(h(i, parent));
                i++;
            }
            return;
        }
        Log.d(v3c.class.getSimpleName(), "setList change " + this.a + ' ' + modeList);
        int size2 = this.a.size();
        while (i < size2) {
            ModeItem modeItem = this.a.get(i);
            ModeItem modeItem2 = modeList.get(i);
            if (!Intrinsics.areEqual(modeItem, modeItem2)) {
                Log.d(v3c.class.getSimpleName(), "setList change " + i + ' ' + modeItem2.getSelected());
                View childAt = parent.getChildAt(i);
                modeItem.setIcon(modeItem2.getIcon());
                modeItem.setName(modeItem2.getName());
                modeItem.setSelected(modeItem2.getSelected());
                modeItem.setSinglePress(modeItem2.getSinglePress());
                modeItem.setNeedLoading(modeItem2.getNeedLoading());
                modeItem.setLoading(modeItem2.isLoading());
                modeItem.setEnabled(modeItem2.getEnabled());
                modeItem.setColor(modeItem2.getColor());
                Intrinsics.checkNotNullExpressionValue(childAt, "childView");
                g(modeItem, childAt);
                if (modeItem.isLoading()) {
                    childAt.findViewById(R.id.mModeButton).m();
                } else {
                    if (!modeItem.getNeedLoading()) {
                        childAt.findViewById(R.id.mModeButton).g(modeItem.getSelected());
                    }
                    if (modeItem.getEnabled()) {
                        childAt.findViewById(R.id.mModeButton).setButtonSelectedWithAnimation(modeItem.getSelected());
                    } else {
                        childAt.findViewById(R.id.mModeButton).setButtonSelected(modeItem.getSelected());
                    }
                }
            }
            i++;
        }
    }

    public final void j(@Nullable b listener, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.c = listener;
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "childView");
            childAt.findViewById(R.id.mModeButton).setSingleChoose(this.c != null);
        }
    }

    public final void setOnModeActionClickListener(@NotNull xjd listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
