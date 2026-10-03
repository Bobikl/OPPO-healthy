package com.heytap.nearx.uikit.widget.poplist;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearContextMenu {
    private final NearPopupListWindow mPopup;

    public NearContextMenu(Context context) {
        this(context, null);
    }

    public void dismiss() {
        if (this.mPopup.isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public void registerForContextMenu(@NonNull View view, MenuBuilder menuBuilder) {
        if (menuBuilder.getNonActionItems().size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < menuBuilder.getNonActionItems().size(); i++) {
            MenuItemImpl menuItemImpl = menuBuilder.getNonActionItems().get(i);
            arrayList.add(new PopupListItem(menuItemImpl.getIcon(), menuItemImpl.getTitle().toString(), menuItemImpl.isCheckable(), menuItemImpl.isChecked(), -1, menuItemImpl.isEnabled()));
        }
        this.mPopup.setItemList(arrayList);
        this.mPopup.setDismissTouchOutside(true);
        view.setLongClickable(true);
        new PreciseLongPressHelper(view, new PreciseLongPressHelper.OnPreciseLongClickListener() { // from class: com.heytap.nearx.uikit.widget.poplist.NearContextMenu.1
            @Override // com.heytap.nearx.uikit.widget.poplist.PreciseLongPressHelper.OnPreciseLongClickListener
            public void onLongClick(View view2, int i2, int i3) {
                NearContextMenu.this.mPopup.setOffset(-i2, -i3, i2 - view2.getWidth(), i3 - view2.getHeight());
                NearContextMenu.this.mPopup.show(view2);
            }
        }).setup();
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mPopup.setOnItemClickListener(onItemClickListener);
    }

    public NearContextMenu(Context context, View view) {
        NearPopupListWindow nearPopupListWindow = new NearPopupListWindow(context);
        this.mPopup = nearPopupListWindow;
        if (view != null) {
            nearPopupListWindow.setAnchorView(view);
        }
    }
}
