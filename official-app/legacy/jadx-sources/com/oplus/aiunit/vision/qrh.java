package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B9\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\"\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/qrh;", "Landroid/widget/ArrayAdapter;", "", "", "position", "", "getItemId", "", "hasStableIds", "getCount", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Landroid/content/Context;", "i", "Landroid/content/Context;", "mContext", "", "j", "Ljava/util/List;", "itemList", MapSchema.FIELD_NAME_KEY, "I", "a", "()I", "c", "(I)V", "itemHeight", LogFieldKey.LEVEL_KEY, "b", "setItemTextSize", "itemTextSize", "textViewResourceId", "<init>", "(Landroid/content/Context;ILjava/util/List;II)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class qrh extends ArrayAdapter<String> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> itemList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int itemHeight;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int itemTextSize;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/qrh$a;", "", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "b", "(Landroid/widget/TextView;)V", "text", "<init>", "(Lcom/oplus/aiunit/vision/qrh;)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public TextView text;
        public final /* synthetic */ qrh b;

        public a(qrh this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.b = this$0;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getText() {
            return this.text;
        }

        public final void b(@Nullable TextView textView) {
            this.text = textView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrh(@NotNull Context mContext, int i, @NotNull List<String> itemList, int i2, int i3) {
        super(mContext, i, itemList);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        this.mContext = mContext;
        this.itemList = itemList;
        this.itemHeight = i2;
        this.itemTextSize = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getItemHeight() {
        return this.itemHeight;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getItemTextSize() {
        return this.itemTextSize;
    }

    public final void c(int i) {
        this.itemHeight = i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.itemList.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        TextView text;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (convertView == null) {
            Object systemService = this.mContext.getSystemService("layout_inflater");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
            }
            convertView = ((LayoutInflater) systemService).inflate(R$layout.nx_secletor_list_item, parent, false);
            a aVar = new a(this);
            aVar.b((TextView) convertView.findViewById(R$id.selection_item));
            convertView.setTag(aVar);
        }
        Object tag = convertView.getTag();
        if (tag == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.internal.widget.slideselect.SlideSelectorAdapter.ViewHolder");
        }
        a aVar2 = (a) tag;
        TextView text2 = aVar2.getText();
        if (text2 != null) {
            text2.setText(this.itemList.get(position));
        }
        if (getItemHeight() > 0) {
            convertView.setMinimumHeight(getItemHeight());
        }
        if (getItemTextSize() > 0 && (text = aVar2.getText()) != null) {
            text.setTextSize(getItemTextSize());
        }
        return convertView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
