package com.heytap.nearx.uikit.widget.poplist;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.MenuRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.heytap.nearx.uikit.R$attr;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class NearPopupMenu {
    private final Context mContext;
    private final MenuBuilder mMenu;
    private OnMenuItemClickListener mMenuItemClickListener;
    private OnDismissListener mOnDismissListener;
    private NearPopupListWindow mPopup;
    private HashMap<Integer, Integer> mRedDotMap;

    public interface OnDismissListener {
        void onDismiss();
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public NearPopupMenu(Context context) {
        this(context, null);
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public MenuInflater getMenuInflater() {
        return new MenuInflater(this.mContext);
    }

    public NearPopupListWindow getPopup() {
        return this.mPopup;
    }

    public void inflate(@MenuRes int i) {
        getMenuInflater().inflate(i, this.mMenu);
        if (this.mMenu.getNonActionItems().size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.mMenu.getNonActionItems().size(); i2++) {
            MenuItemImpl menuItemImpl = this.mMenu.getNonActionItems().get(i2);
            arrayList.add(new PopupListItem(menuItemImpl.getIcon(), menuItemImpl.getTitle().toString(), menuItemImpl.isCheckable(), menuItemImpl.isChecked(), this.mRedDotMap.containsKey(Integer.valueOf(menuItemImpl.getItemId())) ? this.mRedDotMap.get(Integer.valueOf(menuItemImpl.getItemId())).intValue() : -1, menuItemImpl.isEnabled()));
        }
        this.mPopup.setItemList(arrayList);
    }

    public boolean isShowing() {
        NearPopupListWindow nearPopupListWindow = this.mPopup;
        if (nearPopupListWindow != null) {
            return nearPopupListWindow.isShowing();
        }
        return false;
    }

    public void setAnchorView(View view) {
        this.mPopup.setAnchorView(view);
    }

    public void setMenuRedDot(int i, int i2) {
        if (this.mPopup.getItemList().size() <= 0 || this.mMenu.findItem(i) == null) {
            if (i2 == -1) {
                this.mRedDotMap.remove(Integer.valueOf(i));
                return;
            } else {
                this.mRedDotMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
        }
        int iIndexOf = this.mMenu.getNonActionItems().indexOf(this.mMenu.findItem(i));
        if (iIndexOf >= 0) {
            this.mPopup.getItemList().get(iIndexOf).setRedDotAmount(i2);
        }
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
        this.mPopup.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.heytap.nearx.uikit.widget.poplist.NearPopupMenu.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (NearPopupMenu.this.mOnDismissListener != null) {
                    NearPopupMenu.this.mOnDismissListener.onDismiss();
                }
            }
        });
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
        this.mMenu.setCallback(new MenuBuilder.Callback() { // from class: com.heytap.nearx.uikit.widget.poplist.NearPopupMenu.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                if (NearPopupMenu.this.mMenuItemClickListener != null) {
                    return NearPopupMenu.this.mMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
    }

    public void show() {
        this.mPopup.show();
    }

    public NearPopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public void show(View view) {
        setAnchorView(view);
        show();
    }

    public NearPopupMenu(Context context, View view, int i) {
        this(context, view, i, R$attr.popupMenuStyle, 0);
    }

    public NearPopupMenu(Context context, View view, int i, int i2, int i3) {
        this.mRedDotMap = new HashMap<>();
        this.mContext = context;
        this.mMenu = new MenuBuilder(context);
        NearPopupListWindow nearPopupListWindow = new NearPopupListWindow(context);
        this.mPopup = nearPopupListWindow;
        if (view != null) {
            nearPopupListWindow.setAnchorView(view);
        }
    }
}
