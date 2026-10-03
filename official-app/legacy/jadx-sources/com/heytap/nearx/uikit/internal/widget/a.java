package com.heytap.nearx.uikit.internal.widget;

import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import com.heytap.nearx.uikit.widget.NearExpandableListView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/a;", "", "Landroid/widget/ExpandableListAdapter;", "adapter", "Lcom/heytap/nearx/uikit/widget/NearExpandableListView;", "listView", "Lcom/heytap/nearx/uikit/internal/widget/a$a;", "a", "nearx_release"}, k = 1, mv = {1, 6, 0})
public interface a {

    /* JADX INFO: renamed from: com.heytap.nearx.uikit.internal.widget.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/a$a;", "Landroid/widget/BaseExpandableListAdapter;", "", "groupPosition", "", "b", "a", "", "c", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static abstract class AbstractC0726a extends BaseExpandableListAdapter {
        public abstract boolean a(int groupPosition);

        public abstract boolean b(int groupPosition);

        public abstract void c(int groupPosition);
    }

    @NotNull
    AbstractC0726a a(@NotNull ExpandableListAdapter adapter, @NotNull NearExpandableListView listView);
}
