package com.heytap.nearx.uikit.widget.poplist;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearClickSelectMenu {
    private PreciseClickHelper mHelper;
    private final NearPopupListWindow mPopup;

    public NearClickSelectMenu(Context context) {
        this(context, null);
    }

    public void dismiss() {
        if (this.mPopup.isShowing()) {
            this.mPopup.dismiss();
        } else if (this.mPopup.getAnchorView() == null) {
            this.mPopup.superDismiss();
        }
    }

    public void registerForClickSelectItems(@NonNull View view, ArrayList<PopupListItem> arrayList) {
        if (arrayList.size() <= 0) {
            return;
        }
        this.mPopup.setItemList(arrayList);
        this.mPopup.setDismissTouchOutside(true);
        view.setClickable(true);
        view.setLongClickable(true);
        this.mHelper = new PreciseClickHelper(view, new PreciseClickHelper.OnPreciseClickListener() { // from class: com.heytap.nearx.uikit.widget.poplist.NearClickSelectMenu.1
            @Override // com.heytap.nearx.uikit.widget.poplist.PreciseClickHelper.OnPreciseClickListener
            public void onClick(View view2, int i, int i2) {
                NearClickSelectMenu.this.mPopup.setOffset(i, -i2, 0, 0);
                NearClickSelectMenu.this.mPopup.show(view2);
            }
        });
    }

    public void setHelperEnabled(boolean z) {
        PreciseClickHelper preciseClickHelper = this.mHelper;
        if (preciseClickHelper != null) {
            if (z) {
                preciseClickHelper.setup();
            } else {
                preciseClickHelper.unSet();
            }
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mPopup.setOnItemClickListener(onItemClickListener);
    }

    public NearClickSelectMenu(Context context, View view) {
        NearPopupListWindow nearPopupListWindow = new NearPopupListWindow(context);
        this.mPopup = nearPopupListWindow;
        if (view != null) {
            nearPopupListWindow.setAnchorView(view);
        }
    }
}
