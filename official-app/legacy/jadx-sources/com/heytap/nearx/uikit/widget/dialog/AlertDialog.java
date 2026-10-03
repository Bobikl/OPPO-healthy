package com.heytap.nearx.uikit.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatDialog;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$style;
import com.oplus.aiunit.vision.gjc;
import com.oplus.aiunit.vision.xhc;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public static final int DEFAULT_BUTTON = 0;
    public static final int DELETE_ALERT_DIALOG_FIVE = 5;
    public static final int DELETE_ALERT_DIALOG_FOUR = 4;

    @Deprecated
    public static final int DELETE_ALERT_DIALOG_ONE = 1;
    public static final int DELETE_ALERT_DIALOG_SIX = 6;
    public static final int DELETE_ALERT_DIALOG_THREE = 3;
    public static final int DELETE_ALERT_DIALOG_TWO = 2;
    public static final int ITEM_HORIZONTAL = 1;
    public static final int ITEM_VERTICAL = 0;
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    public static final int LIST_TEXTCOLOR_ONE = 0;
    public static final int LIST_TEXTCOLOR_TWO = 1;
    public static final int[] LIST_TEXT_COLOR = {0, 1};
    public static final int TYPE_BOTTOM = 1;
    public static final int TYPE_CENTER = 0;
    public AlertController mAlert;

    public static class Builder {
        public final AlertController.AlertParams P;
        protected int mDeleteDialogOption;
        protected int mTheme;

        public Builder(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        private Drawable[] getDrawableFromRes(@ArrayRes int i) {
            TypedArray typedArrayObtainTypedArray = this.P.mContext.getResources().obtainTypedArray(i);
            if (typedArrayObtainTypedArray.length() == 0) {
                return null;
            }
            Drawable[] drawableArr = new Drawable[typedArrayObtainTypedArray.length()];
            for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                xhc xhcVar = xhc.INSTANCE;
                drawableArr[i2] = xhc.a(this.P.mContext, typedArrayObtainTypedArray.getResourceId(i2, -1));
            }
            typedArrayObtainTypedArray.recycle();
            return drawableArr;
        }

        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.P.mContext, this.mTheme, false, this.mDeleteDialogOption);
            this.P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.P.mCancelable);
            alertDialog.setOnCancelListener(this.P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.P.mOnDismissListener);
            DialogInterface.OnKeyListener onKeyListener = this.P.mOnKeyListener;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        public Context getContext() {
            return this.P.mContext;
        }

        public int getDeleteDialogOption() {
            return this.mDeleteDialogOption;
        }

        public Builder isMessageNeedScroll(boolean z) {
            this.P.mMessageIsScroll = z;
            return this;
        }

        public Builder isNeedScroll(boolean z) {
            this.P.mIsScroll = z;
            return this;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.P.mCancelable = z;
            return this;
        }

        public Builder setChangeable(boolean z) {
            this.P.mChangeable = z;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mCursor = cursor;
            alertParams.mLabelColumn = str;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCustomBackgroundColor(int i) {
            this.P.mBackgroundColor = i;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.P.mCustomTitleView = view;
            return this;
        }

        public Builder setDeleteDialogOption(int i) {
            this.mDeleteDialogOption = i;
            return this;
        }

        public Builder setDialogDismissIfClick(boolean z) {
            this.P.isDismiss = z;
            return this;
        }

        public Builder setIcon(int i) {
            this.P.mIconId = i;
            return this;
        }

        public Builder setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.P.mContext.getTheme().resolveAttribute(i, typedValue, true);
            this.P.mIconId = typedValue.resourceId;
            return this;
        }

        public Builder setImgContent(int i) {
            this.P.mImgResId = i;
            return this;
        }

        public Builder setInverseBackgroundForced(boolean z) {
            this.P.mForceInverseBackground = z;
            return this;
        }

        public Builder setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setListItemLayout(int i) {
            this.P.mListItemLayoutId = i;
            return this;
        }

        public Builder setMessage(int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mMessage = alertParams.mContext.getText(i);
            return this;
        }

        public Builder setMessageMaxLines(int i) {
            this.P.messageMaxLines = i;
            return this;
        }

        public Builder setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams2.mCheckedItems = zArr;
            alertParams2.mIsMultiChoice = true;
            return this;
        }

        public Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i);
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeTextColor(@ColorInt int i) {
            this.P.mNegativeTextColor = i;
            return this;
        }

        public Builder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i);
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralTextColor(@ColorInt int i) {
            this.P.mNeutralTextColor = i;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setPosition(int i) {
            this.P.mPosition = i;
            return this;
        }

        public Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i);
            this.P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveTextColor(@ColorInt int i) {
            this.P.mPositiveTextColor = i;
            return this;
        }

        public Builder setRecycleOnMeasureEnabled(boolean z) {
            this.P.mRecycleOnMeasure = z;
            return this;
        }

        public Builder setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.mOnClickListener = onClickListener;
            alertParams2.mCheckedItem = i2;
            alertParams2.mIsSingleChoice = true;
            return this;
        }

        public Builder setTitle(int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mTitle = alertParams.mContext.getText(i);
            return this;
        }

        public Builder setTitleMaxline(int i) {
            this.P.titleMaxline = i;
            return this;
        }

        public Builder setView(int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = null;
            alertParams.mViewLayoutResId = i;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setWindowGravity(int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.windowGraity = i;
            if (i == 80) {
                alertParams.mDialogType = 1;
            } else {
                alertParams.mDialogType = 0;
            }
            return this;
        }

        public AlertDialog show() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.mAlert.setDeleteDialogOption(this.mDeleteDialogOption);
            alertDialogCreate.show();
            return alertDialogCreate;
        }

        public Builder(Context context, int i) {
            this.mDeleteDialogOption = 0;
            this.P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public Builder setIcon(Drawable drawable) {
            this.P.mIcon = drawable;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.P.mMessage = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.P.mTitle = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNeutralButtonText = charSequence;
            alertParams.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener, int[] iArr) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.textColor = iArr;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mCursor = cursor;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mLabelColumn = str;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setView(View view, int i, int i2, int i3, int i4) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = true;
            alertParams.mViewSpacingLeft = i;
            alertParams.mViewSpacingTop = i2;
            alertParams.mViewSpacingRight = i3;
            alertParams.mViewSpacingBottom = i4;
            return this;
        }

        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener, int[] iArr) {
            return setItems(this.P.mContext.getResources().getTextArray(i), onClickListener, iArr);
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener, int[] iArr, Drawable[] drawableArr, int i) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.itemOrientation = i;
            alertParams.mItems = charSequenceArr;
            alertParams.mIcons = drawableArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.textColor = iArr;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mCursor = cursor;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mIsCheckedColumn = str;
            alertParams.mLabelColumn = str2;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener, int[] iArr, Drawable[] drawableArr) {
            return setItems(charSequenceArr, onClickListener, iArr, drawableArr, 0);
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setView(View view, View view2) {
            if (gjc.c()) {
                this.P.mView = view2;
            } else {
                this.P.mView = view;
            }
            AlertController.AlertParams alertParams = this.P;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener, int[] iArr, @ArrayRes int i2, int i3) {
            return setItems(this.P.mContext.getResources().getTextArray(i), onClickListener, iArr, getDrawableFromRes(i2), i3);
        }

        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener, int[] iArr, @ArrayRes int i2) {
            return setItems(i, onClickListener, iArr, i2, 0);
        }

        public Builder setItems(CharSequence[] charSequenceArr, Drawable[] drawableArr, DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr2, Drawable[] drawableArr2, DialogInterface.OnClickListener onClickListener2, int[] iArr) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.itemOrientation = 1;
            alertParams.mItems = charSequenceArr;
            alertParams.mIcons = drawableArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mSubItems = charSequenceArr2;
            alertParams.mSubIcons = drawableArr2;
            alertParams.mOnSubClickListener = onClickListener2;
            alertParams.textColor = iArr;
            return this;
        }

        public Builder setView(int i, int i2) {
            if (gjc.c()) {
                this.P.mViewLayoutResId = i2;
            } else {
                this.P.mViewLayoutResId = i;
            }
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = null;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setItems(@ArrayRes int i, @ArrayRes int i2, DialogInterface.OnClickListener onClickListener, @ArrayRes int i3, @ArrayRes int i4, DialogInterface.OnClickListener onClickListener2, int[] iArr) {
            return setItems(this.P.mContext.getResources().getTextArray(i), getDrawableFromRes(i2), onClickListener, this.P.mContext.getResources().getTextArray(i3), getDrawableFromRes(i4), onClickListener2, iArr);
        }

        public Builder setItems(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, DialogInterface.OnClickListener onClickListener, int[] iArr) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mSummaryItems = charSequenceArr2;
            alertParams.mOnClickListener = onClickListener;
            alertParams.textColor = iArr;
            return this;
        }

        public Builder setItems(int i, int i2, DialogInterface.OnClickListener onClickListener, int[] iArr) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.mSummaryItems = alertParams2.mContext.getResources().getTextArray(i2);
            AlertController.AlertParams alertParams3 = this.P;
            alertParams3.mOnClickListener = onClickListener;
            alertParams3.textColor = iArr;
            return this;
        }
    }

    public AlertDialog(Context context) {
        this(context, resolveDialogTheme(context, 0), true);
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void boldAllButtonText() {
        this.mAlert.boldAllButtonText();
    }

    public void createDialog(int i) {
        if (i > 0) {
            this.mAlert = new AlertController(getContext(), this, getWindow(), i);
            setCanceledOnTouchOutside(true);
        } else {
            this.mAlert = new AlertController(getContext(), this, getWindow());
            setCanceledOnTouchOutside(false);
        }
        getWindow().setWindowAnimations(R$style.NXColorDialogAnimation);
        getWindow().getAttributes().gravity = 87;
    }

    public Button getButton(int i) {
        return this.mAlert.getButton(i);
    }

    public EditText getEditText() {
        return this.mAlert.getEditText();
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.setButton(i, charSequence, null, message);
    }

    public void setButtonIsBold(int i, int i2, int i3) {
        this.mAlert.setButtonIsBold(i, i2, i3);
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.setButtonPanelLayoutHint(i);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        AlertController alertController = this.mAlert;
        if (alertController instanceof AlertController) {
            alertController.setCancelOnTouchOutside(z);
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        AlertController alertController = this.mAlert;
        if (alertController instanceof AlertController) {
            alertController.setCancelOnTouchOutside(z);
        }
    }

    public void setCustomBackgroundColor(int i) {
        this.mAlert.setCustomBackgroundColor(i);
    }

    public void setCustomTitle(View view) {
        this.mAlert.setCustomTitle(view);
    }

    public void setIcon(int i) {
        this.mAlert.setIcon(i);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    public int setPosition(int i) {
        this.mAlert.setPosition(i);
        return i;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    public AlertDialog(Context context, int i) {
        this(context, i, true);
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i, charSequence, onClickListener, null);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mAlert.setView(view, i, i2, i3, i4);
    }

    public AlertDialog(Context context, int i, boolean z) {
        super(context, resolveDialogTheme(context, i));
        createDialog(0);
    }

    public AlertDialog(Context context, int i, boolean z, int i2) {
        super(context, resolveDialogTheme(context, i));
        createDialog(i2);
    }

    public AlertDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, resolveDialogTheme(context, 0));
        setCancelable(z);
        setOnCancelListener(onCancelListener);
        this.mAlert = new AlertController(context, this, getWindow());
    }
}
