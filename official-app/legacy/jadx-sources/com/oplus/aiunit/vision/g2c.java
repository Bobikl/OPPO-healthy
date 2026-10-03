package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.oplus.deviceui.ModeButton;
import com.oplus.deviceui.model.ModeItem;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\"B\u001d\u0012\u0006\u0010'\u001a\u00020!\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/g2c;", "", "", "position", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", b2n.g, "", "Lcom/oplus/deviceui/model/ModeItem;", "modeList", "", "i", "Lcom/oplus/aiunit/vision/eid;", "listener", "setOnModeActionClickListener", "Lcom/oplus/aiunit/vision/g2c$b;", "j", MapSchema.FIELD_NAME_ENTRY, "", "selected", "d", "convertView", "f", "modeItem", b2n.f, "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setMList", "(Ljava/util/List;)V", "mList", "Landroid/content/Context;", "b", "Landroid/content/Context;", "mContext", "Lcom/oplus/aiunit/vision/g2c$b;", "mSingleChooseListener", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class g2c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<ModeItem> mList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Context mContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public b mSingleChooseListener;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/g2c$a", "Lcom/oplus/deviceui/ModeButton$b;", "", "selected", "isLoading", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class a implements ModeButton.b {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // com.oplus.deviceui.ModeButton.b
        public void a(boolean selected, boolean isLoading) {
            b bVar = g2c.this.mSingleChooseListener;
            if (bVar != null) {
                bVar.a(g2c.this.c(), this.b);
            }
            g2c.this.c().get(this.b).setSelected(selected);
            g2c.this.c().get(this.b).setLoading(isLoading);
            g2c.a(g2c.this);
            Log.d(a.class.getSimpleName(), "onButtonClick " + this.b + StringUtil.SPACE + selected + StringUtil.SPACE + isLoading);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/g2c$b;", "", "", "Lcom/oplus/deviceui/model/ModeItem;", "list", "", "position", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public interface b {
        void a(@NotNull List<ModeItem> list, int position);
    }

    public g2c(@NotNull Context context, @NotNull List<ModeItem> modeList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modeList, "modeList");
        this.mList = modeList;
        this.mContext = context;
    }

    public static final /* synthetic */ eid a(g2c g2cVar) {
        g2cVar.getClass();
        return null;
    }

    @NotNull
    public final List<ModeItem> c() {
        return this.mList;
    }

    public final void d(int position, boolean selected, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.mList.get(position).setSelected(selected);
        View childView = parent.getChildAt(position);
        Intrinsics.checkNotNullExpressionValue(childView, "childView");
        ((ModeButton) childView.findViewById(R$id.mModeButton)).setButtonSelectedWithAnimation(selected);
    }

    public final void e(int position, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View childView = parent.getChildAt(position);
        Intrinsics.checkNotNullExpressionValue(childView, "childView");
        ((ModeButton) childView.findViewById(R$id.mModeButton)).m();
    }

    public final void f(int position, View convertView) {
        ModeItem modeItem = this.mList.get(position);
        g(modeItem, convertView);
        int i = R$id.mModeButton;
        ((ModeButton) convertView.findViewById(i)).setButtonSelected(modeItem.getSelected());
        if (modeItem.getIsLoading()) {
            ((ModeButton) convertView.findViewById(i)).m();
        }
        ((ModeButton) convertView.findViewById(i)).setOnButtonClickListener(new a(position));
    }

    public final void g(ModeItem modeItem, View convertView) {
        Drawable icon = modeItem.getIcon();
        if (icon != null) {
            ((ModeButton) convertView.findViewById(R$id.mModeButton)).setIcon(icon);
        }
        String name = modeItem.getName();
        if (name != null) {
            TextView textView = (TextView) convertView.findViewById(R$id.mModeText);
            Intrinsics.checkNotNullExpressionValue(textView, "convertView.mModeText");
            textView.setText(name);
        }
        int i = R$id.mModeText;
        TextView textView2 = (TextView) convertView.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(textView2, "convertView.mModeText");
        textView2.setTextSize(pw7.INSTANCE.a(this.mContext));
        int i2 = R$id.mModeButton;
        ModeButton modeButton = (ModeButton) convertView.findViewById(i2);
        Intrinsics.checkNotNullExpressionValue(modeButton, "convertView.mModeButton");
        TextView textView3 = (TextView) convertView.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(textView3, "convertView.mModeText");
        modeButton.setContentDescription(textView3.getText());
        ((ModeButton) convertView.findViewById(i2)).setWithProgress(modeItem.getNeedLoading());
        ((ModeButton) convertView.findViewById(i2)).setSinglePress(modeItem.getSinglePress());
        ((ModeButton) convertView.findViewById(i2)).setSingleChoose(this.mSingleChooseListener != null);
        Integer color = modeItem.getColor();
        if (color != null) {
            ((ModeButton) convertView.findViewById(i2)).setbackgroundTint(color.intValue());
        }
        ((ModeButton) convertView.findViewById(i2)).setButtonEnabled(modeItem.getEnabled());
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
        View convertView = LayoutInflater.from(this.mContext).inflate(R$layout.mode_item_layout, (ViewGroup) parent, false);
        Intrinsics.checkNotNullExpressionValue(convertView, "convertView");
        f(position, convertView);
        return convertView;
    }

    public final void i(@NotNull List<ModeItem> modeList, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(modeList, "modeList");
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = 0;
        if (this.mList.size() != modeList.size()) {
            try {
                modeList = kza.INSTANCE.a(modeList);
            } catch (Exception unused) {
            }
            this.mList = modeList;
            parent.removeAllViews();
            int size = this.mList.size();
            while (i < size) {
                parent.addView(h(i, parent));
                i++;
            }
            return;
        }
        Log.d(g2c.class.getSimpleName(), "setList change " + this.mList + StringUtil.SPACE + modeList);
        int size2 = this.mList.size();
        while (i < size2) {
            ModeItem modeItem = this.mList.get(i);
            ModeItem modeItem2 = modeList.get(i);
            if (!Intrinsics.areEqual(modeItem, modeItem2)) {
                Log.d(g2c.class.getSimpleName(), "setList change " + i + StringUtil.SPACE + modeItem2.getSelected());
                View childView = parent.getChildAt(i);
                modeItem.setIcon(modeItem2.getIcon());
                modeItem.setName(modeItem2.getName());
                modeItem.setSelected(modeItem2.getSelected());
                modeItem.setSinglePress(modeItem2.getSinglePress());
                modeItem.setNeedLoading(modeItem2.getNeedLoading());
                modeItem.setLoading(modeItem2.getIsLoading());
                modeItem.setEnabled(modeItem2.getEnabled());
                modeItem.setColor(modeItem2.getColor());
                Intrinsics.checkNotNullExpressionValue(childView, "childView");
                g(modeItem, childView);
                if (modeItem.getIsLoading()) {
                    ((ModeButton) childView.findViewById(R$id.mModeButton)).m();
                } else {
                    if (!modeItem.getNeedLoading()) {
                        ((ModeButton) childView.findViewById(R$id.mModeButton)).g(modeItem.getSelected());
                    }
                    if (modeItem.getEnabled()) {
                        ((ModeButton) childView.findViewById(R$id.mModeButton)).setButtonSelectedWithAnimation(modeItem.getSelected());
                    } else {
                        ((ModeButton) childView.findViewById(R$id.mModeButton)).setButtonSelected(modeItem.getSelected());
                    }
                }
            }
            i++;
        }
    }

    public final void j(@Nullable b listener, @NotNull LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.mSingleChooseListener = listener;
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childView = parent.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childView, "childView");
            ((ModeButton) childView.findViewById(R$id.mModeButton)).setSingleChoose(this.mSingleChooseListener != null);
        }
    }

    public final void setOnModeActionClickListener(@NotNull eid listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
