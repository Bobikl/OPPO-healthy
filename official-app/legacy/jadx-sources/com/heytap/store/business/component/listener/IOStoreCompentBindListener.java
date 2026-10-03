package com.heytap.store.business.component.listener;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H&¨\u0006\f"}, d2 = {"Lcom/heytap/store/business/component/listener/IOStoreCompentBindListener;", "", "onBindView", "", "itemView", "Landroid/view/View;", "type", "", "position", "id", "", "data", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IOStoreCompentBindListener {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onBindView$default(IOStoreCompentBindListener iOStoreCompentBindListener, View view, int i, int i2, long j2, Object obj, int i3, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBindView");
            }
            if ((i3 & 16) != 0) {
                obj = null;
            }
            iOStoreCompentBindListener.onBindView(view, i, i2, j2, obj);
        }
    }

    void onBindView(@NotNull View itemView, int type, int position, long id, @Nullable Object data);
}
