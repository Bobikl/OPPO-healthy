package com.heytap.nearx.uikit.widget.poplist;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.oplus.aiunit.vision.ugc;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class DefaultAdapter extends BaseAdapter {
    private View.AccessibilityDelegate mAccessibilityDelegate;
    private Context mContext;
    private List<PopupListItem> mItemList;
    private ColorStateList mItemTextColor;
    private int mMinWidthWithCheckbox;
    private int mPopupListItemMinHeight;
    private int mPopupListItemPaddingVertical;
    private int mPopupListPaddingVertical;
    private int mSelectedTextColor;
    private ColorStateList mTextColor;
    private float mTextScale;
    private float mTextSize;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginWithNoIcon;

    public static class ViewHolder {
        CheckBox mCheckBox;
        LinearLayout mContent;
        ImageView mIcon;
        NearHintRedDot mRedDotView;
        TextView mTitle;
    }

    public DefaultAdapter(Context context, List<PopupListItem> list) {
        this.mContext = context;
        this.mItemList = list;
        Resources resources = context.getResources();
        this.mPopupListPaddingVertical = resources.getDimensionPixelSize(R$dimen.nx_popup_list_padding_vertical);
        this.mPopupListItemPaddingVertical = resources.getDimensionPixelSize(R$dimen.nx_popup_list_window_item_padding_top_and_bottom);
        this.mPopupListItemMinHeight = resources.getDimensionPixelSize(R$dimen.nx_popup_list_window_item_min_height);
        this.mMinWidthWithCheckbox = resources.getDimensionPixelOffset(R$dimen.nx_popup_list_window_content_min_width_with_checkbox);
        this.mTitleMarginWithNoIcon = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_popup_list_window_item_title_margin_with_no_icon);
        this.mTitleMarginStart = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_popup_list_window_item_title_margin_left);
        this.mTitleMarginEnd = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_popup_list_window_item_title_margin_right);
        this.mTextSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_popup_list_window_item_title_text_size);
        this.mTextScale = this.mContext.getResources().getConfiguration().fontScale;
        this.mAccessibilityDelegate = new View.AccessibilityDelegate() { // from class: com.heytap.nearx.uikit.widget.poplist.DefaultAdapter.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("");
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R$attr.nxPopupListWindowTextColor, R$attr.nxColorPrimaryTextOnPopup});
        this.mSelectedTextColor = typedArrayObtainStyledAttributes.getColor(1, this.mContext.getResources().getColor(R$color.nx_popup_list_selected_text_color));
        if (this.mTextColor == null) {
            this.mTextColor = this.mContext.getResources().getColorStateList(R$color.nx_popup_list_window_text_color_light);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setChecked(LinearLayout linearLayout, CheckBox checkBox, TextView textView, PopupListItem popupListItem, boolean z) {
        if (!popupListItem.isCheckable()) {
            if (linearLayout.getMinimumWidth() == this.mMinWidthWithCheckbox) {
                linearLayout.setMinimumWidth(0);
            }
            checkBox.setVisibility(8);
            return;
        }
        int minimumWidth = linearLayout.getMinimumWidth();
        int i = this.mMinWidthWithCheckbox;
        if (minimumWidth != i) {
            linearLayout.setMinimumWidth(i);
        }
        checkBox.setVisibility(0);
        checkBox.setChecked(popupListItem.isChecked());
        checkBox.setEnabled(z);
        if (popupListItem.isChecked()) {
            textView.setTextColor(this.mSelectedTextColor);
        }
    }

    private void setIcon(ImageView imageView, TextView textView, PopupListItem popupListItem, boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (popupListItem.getIconId() == 0 && popupListItem.getIcon() == null) {
            imageView.setVisibility(8);
            layoutParams.setMarginStart(this.mTitleMarginWithNoIcon);
            if (popupListItem.getRedDotAmount() != -1 || popupListItem.isCheckable()) {
                layoutParams.setMarginEnd(0);
            } else {
                layoutParams.setMarginEnd(this.mTitleMarginWithNoIcon);
            }
        } else {
            imageView.setVisibility(0);
            layoutParams.setMarginStart(this.mTitleMarginStart);
            if (popupListItem.getRedDotAmount() != -1 || popupListItem.isCheckable()) {
                layoutParams.setMarginEnd(0);
            } else {
                layoutParams.setMarginEnd(this.mTitleMarginEnd);
            }
            imageView.setImageDrawable(popupListItem.getIcon() == null ? this.mContext.getResources().getDrawable(popupListItem.getIconId()) : popupListItem.getIcon());
        }
        textView.setLayoutParams(layoutParams);
    }

    private void setRedDot(PopupListItem popupListItem, NearHintRedDot nearHintRedDot) {
        nearHintRedDot.setPointNumber(popupListItem.getRedDotAmount());
        int redDotAmount = popupListItem.getRedDotAmount();
        if (redDotAmount == -1) {
            nearHintRedDot.setPointMode(0);
        } else if (redDotAmount != 0) {
            nearHintRedDot.setPointMode(2);
            nearHintRedDot.setVisibility(0);
        } else {
            nearHintRedDot.setPointMode(1);
            nearHintRedDot.setVisibility(0);
        }
    }

    private void setTitle(TextView textView, PopupListItem popupListItem, boolean z) {
        textView.setEnabled(z);
        textView.setTextAppearance(R$style.nxTextAppearanceHeadline6);
        textView.setText(popupListItem.getTitle());
        textView.setTextColor(this.mTextColor);
        ColorStateList colorStateList = this.mItemTextColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        } else if (popupListItem.getTitleColorList() != null) {
            textView.setTextColor(popupListItem.getTitleColorList());
        } else if (popupListItem.getTitleColorInt() >= 0) {
            textView.setTextColor(popupListItem.getTitleColorInt());
        }
        textView.setTextSize(0, ugc.d(this.mTextSize, this.mTextScale, 5));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mItemList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.mItemList.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            ViewHolder viewHolder2 = new ViewHolder();
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.nx_popup_list_window_item, viewGroup, false);
            viewHolder2.mIcon = (ImageView) viewInflate.findViewById(R$id.popup_list_window_item_icon);
            viewHolder2.mTitle = (TextView) viewInflate.findViewById(R$id.popup_list_window_item_title);
            viewHolder2.mContent = (LinearLayout) viewInflate.findViewById(R$id.content);
            viewHolder2.mRedDotView = (NearHintRedDot) viewInflate.findViewById(R$id.red_dot);
            CheckBox checkBox = (CheckBox) viewInflate.findViewById(R$id.checkbox);
            viewHolder2.mCheckBox = checkBox;
            if (checkBox != null) {
                checkBox.setAccessibilityDelegate(this.mAccessibilityDelegate);
            }
            viewInflate.setTag(viewHolder2);
            viewHolder = viewHolder2;
            view = viewInflate;
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (getCount() == 1) {
            view.setMinimumHeight(this.mPopupListItemMinHeight + (this.mPopupListPaddingVertical * 2));
            int i2 = this.mPopupListItemPaddingVertical;
            int i3 = this.mPopupListPaddingVertical;
            view.setPadding(0, i2 + i3, 0, i2 + i3);
        } else if (i == 0) {
            view.setMinimumHeight(this.mPopupListItemMinHeight + this.mPopupListPaddingVertical);
            int i4 = this.mPopupListItemPaddingVertical;
            view.setPadding(0, this.mPopupListPaddingVertical + i4, 0, i4);
        } else if (i == getCount() - 1) {
            view.setMinimumHeight(this.mPopupListItemMinHeight + this.mPopupListPaddingVertical);
            int i5 = this.mPopupListItemPaddingVertical;
            view.setPadding(0, i5, 0, this.mPopupListPaddingVertical + i5);
        } else {
            view.setMinimumHeight(this.mPopupListItemMinHeight);
            int i6 = this.mPopupListItemPaddingVertical;
            view.setPadding(0, i6, 0, i6);
        }
        boolean zIsEnable = this.mItemList.get(i).isEnable();
        view.setEnabled(zIsEnable);
        setRedDot(this.mItemList.get(i), viewHolder.mRedDotView);
        setIcon(viewHolder.mIcon, viewHolder.mTitle, this.mItemList.get(i), zIsEnable);
        setTitle(viewHolder.mTitle, this.mItemList.get(i), zIsEnable);
        setChecked((LinearLayout) view, viewHolder.mCheckBox, viewHolder.mTitle, this.mItemList.get(i), zIsEnable);
        return view;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        this.mItemTextColor = colorStateList;
    }
}
