package com.heytap.nearx.uikit.widget.keyboard;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.keyboard.util.ScreenConfigUtil;

/* JADX INFO: loaded from: classes18.dex */
public class NearKeyboardView extends LinearLayout implements View.OnClickListener {
    private static final String TAG = "NearKeyBoardView";
    private String mAccessClose;
    private String mAccessDetail;
    private ImageView mCloseButton;
    private Context mContext;
    private int mDefaultType;
    private ImageView mDetailButton;
    private NearKeyboardHelper mHelper;
    private SecurityKeyboardView mKeyboardView;
    private ImageView mLogoView;
    private OnClickButtonListener mOnClickButtonListener;
    private OnClickSwitchListener mOnClickSwitchListener;
    private int mPadWidthOffset;
    private boolean mSecureType;
    private String mTitleName;
    private TextView mTitleNameTextView;
    private RelativeLayout mTopView;
    private int mWidthOffset;

    public interface OnClickButtonListener {
        void onClickButton();
    }

    public interface OnClickSwitchListener {
        void onClickSwitch();
    }

    public NearKeyboardView(Context context) {
        this(context, null);
    }

    public void adjustSizeChange(int i) {
        if (getKeyboardView() == null || getKeyboardView().getKeyboard() == null) {
            return;
        }
        int minWidth = (i - getKeyboardView().getKeyboard().getMinWidth()) / 2;
        SecurityKeyboardView securityKeyboardView = this.mKeyboardView;
        securityKeyboardView.setPadding(minWidth, securityKeyboardView.getPaddingTop(), minWidth, this.mKeyboardView.getPaddingBottom());
        ImageView imageView = this.mCloseButton;
        imageView.setPaddingRelative(imageView.getPaddingStart(), this.mCloseButton.getPaddingTop(), this.mWidthOffset + minWidth + this.mPadWidthOffset, this.mCloseButton.getPaddingBottom());
        ImageView imageView2 = this.mDetailButton;
        imageView2.setPaddingRelative(minWidth + this.mWidthOffset, imageView2.getPaddingTop(), this.mDetailButton.getPaddingEnd(), this.mDetailButton.getPaddingBottom());
        this.mKeyboardView.invalidateAllKeys();
    }

    public NearKeyboardHelper getKeyboardHelper() {
        return this.mHelper;
    }

    public SecurityKeyboardView getKeyboardView() {
        SecurityKeyboardView securityKeyboardView = this.mKeyboardView;
        if (securityKeyboardView != null) {
            return securityKeyboardView;
        }
        return null;
    }

    public View getTopView() {
        return this.mTopView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OnClickSwitchListener onClickSwitchListener;
        OnClickButtonListener onClickButtonListener;
        if (view.getId() == R$id.nx_keyboard_view_close && (onClickButtonListener = this.mOnClickButtonListener) != null) {
            onClickButtonListener.onClickButton();
        }
        if (view.getId() != R$id.nx_keyboard_view_detail || (onClickSwitchListener = this.mOnClickSwitchListener) == null) {
            return;
        }
        onClickSwitchListener.onClickSwitch();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        adjustSizeChange(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    public void setKeyBoardType(int i) {
        this.mDefaultType = i;
    }

    public void setKeyboardHelper(NearKeyboardHelper nearKeyboardHelper) {
        this.mHelper = nearKeyboardHelper;
    }

    public void setLogoViewGone() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void setOnClickButtonListener(OnClickButtonListener onClickButtonListener) {
        this.mOnClickButtonListener = onClickButtonListener;
    }

    public void setOnClickSwitchListener(OnClickSwitchListener onClickSwitchListener) {
        this.mOnClickSwitchListener = onClickSwitchListener;
    }

    public NearKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDefaultType = 0;
        this.mOnClickButtonListener = null;
        this.mOnClickSwitchListener = null;
        this.mPadWidthOffset = 0;
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearKeyboardView, i, R$style.NearKeyBoardView);
        this.mSecureType = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearKeyboardView_nxKeyboardViewType, true);
        this.mWidthOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearKeyboardView_nxWidthOffset, 0);
        this.mTitleName = typedArrayObtainStyledAttributes.getString(R$styleable.NearKeyboardView_nxTitleName);
        LayoutInflater.from(context).inflate(this.mSecureType ? R$layout.nx_security_keybord_view : R$layout.nx_unlock_keybord_view, (ViewGroup) this, true);
        this.mCloseButton = (ImageView) findViewById(R$id.nx_keyboard_view_close);
        this.mDetailButton = (ImageView) findViewById(R$id.nx_keyboard_view_detail);
        this.mKeyboardView = (SecurityKeyboardView) findViewById(R$id.keyboardview);
        this.mTopView = (RelativeLayout) findViewById(R$id.nx_keyboard_view_top);
        this.mTitleNameTextView = (TextView) findViewById(R$id.nx_keyboard_view_text);
        this.mLogoView = (ImageView) findViewById(R$id.keyboard_logo);
        this.mCloseButton.setVisibility(this.mSecureType ? 0 : 8);
        this.mCloseButton.setOnClickListener(this);
        this.mDetailButton.setOnClickListener(this);
        this.mKeyboardView.setProximityCorrectionEnabled(true);
        this.mTitleNameTextView.setText(this.mTitleName);
        this.mAccessClose = context.getResources().getString(R$string.nx_keyboard_view_access_close_button);
        this.mAccessDetail = context.getResources().getString(R$string.nx_keyboard_view_access_detail_button);
        ImageView imageView = this.mCloseButton;
        if (imageView != null) {
            imageView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.heytap.nearx.uikit.widget.keyboard.NearKeyboardView.1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    if (NearKeyboardView.this.mAccessClose != null) {
                        accessibilityNodeInfo.setContentDescription(NearKeyboardView.this.mAccessClose);
                    }
                    accessibilityNodeInfo.setClassName(Button.class.getName());
                }
            });
        }
        ImageView imageView2 = this.mDetailButton;
        if (imageView2 != null) {
            imageView2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.heytap.nearx.uikit.widget.keyboard.NearKeyboardView.2
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    if (NearKeyboardView.this.mAccessDetail != null) {
                        accessibilityNodeInfo.setContentDescription(NearKeyboardView.this.mAccessDetail);
                    }
                    accessibilityNodeInfo.setClassName(Button.class.getName());
                }
            });
        }
        if (ScreenConfigUtil.isPad(context)) {
            this.mPadWidthOffset = getResources().getDimensionPixelOffset(R$dimen.nx_pad_keyboard_view_width_offset);
            this.mKeyboardView.setProximityCorrectionEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
