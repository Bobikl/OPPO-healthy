package com.heytap.nearx.uikit.widget.dialog;

import android.R;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.internal.widget.NearMaxLinearLayout;
import com.heytap.nearx.uikit.internal.widget.dialog.AutoImageView;
import com.heytap.nearx.uikit.internal.widget.dialog.ColorGradientLinearLayout;
import com.heytap.nearx.uikit.utils.NearDeviceUtil;
import com.heytap.nearx.uikit.widget.NearButtonBarLayout;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.gjc;
import com.oplus.aiunit.vision.plc;
import com.oplus.aiunit.vision.xhc;
import com.oplus.aiunit.vision.yqk;
import com.oplus.aiunit.vision.z63;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated
class AlertController {
    private static int BIT_BUTTON_NEGATIVE = 2;
    private static int BIT_BUTTON_NEUTRAL = 4;
    private static int BIT_BUTTON_POSITIVE = 1;
    private static final int CLOSE_BUTTON_MESSAGE_WHAT = 100;
    private static final int DIALOG_OPTIONS_FIVE_NUM = 5;
    private static final int DIALOG_OPTIONS_SIX_NUM = 6;
    private static final int DOCKED_INVALID = -1;
    private static final int PRIVATE_FLAG_BOTTOM_ALERT_DIALOG = 16777216;
    private static final int PRIVATE_FLAG_NO_MOVE_ANIMATION = 64;
    private static final String SANS_MEDIUM = "sans-serif-medium";
    private static final String SANS_REGULAR = "sans-serif-regular";
    private static final String TAG = "AlertController";
    private static final float TEXT_SIZE_SCALE = 0.88f;
    private static final int TYPE_SYSTEM_LONG_SHOT = 2303;
    public static boolean isDismiss = false;
    private static boolean mScroll = false;
    private boolean isCancelOnTouchOutside;
    private boolean isPortrait;
    private ListAdapter mAdapter;
    protected int mAlertDialogLayout;
    protected int mBackgroundBottomRadius;
    protected int mBackgroundCenterRadius;
    private int mBackgroundColor;
    private int mBottomSpaceHeight;
    private int mBtnNegativeTextColor;
    private int mBtnNeutralTextColor;
    private int mBtnPositiveTextColor;
    private int mButtonColor;
    private final View.OnClickListener mButtonHandler;
    protected Button mButtonNegative;
    private Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    protected Button mButtonNeutral;
    private Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    protected int mButtonPanelSideLayout;
    public Button mButtonPositive;
    private Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    private boolean mChangeable;
    private int mCheckedItem;
    private Message mCloseButtonMessage;
    private AppCompatImageView mCloseDialog;
    protected Drawable mColorDeleteDialogBottom;
    protected Drawable mColorDeleteDialogDefault;
    protected Drawable mColorDeleteDialogListBottom;
    protected Drawable mColorDeleteDialogListMiddle;
    protected Drawable mColorDeleteDialogListTop;
    protected Drawable mColorDeleteDialogMiddle;
    protected Drawable mColorDeleteDialogTop;
    protected Drawable mColorDeleteDialogTopNoDivider;
    protected Drawable mColorDialogBtnLeft;
    protected Drawable mColorDialogBtnRight;
    protected Drawable mColorDialogVerticalBottom;
    protected Drawable mColorDialogVerticalMiddle;
    private ComponentCallbacks mComponentCallbacks;
    public final Context mContext;
    private View mCustomTitleView;
    private int mDeleteDialogOption;
    protected final AppCompatDialog mDialog;
    private int mDialogType;
    protected Handler mHandler;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mIconView;
    private AutoImageView mImgContent;
    private int mImgResourceId;
    private ImageView mIvButtonDividerOne;
    private ImageView mIvButtonDividerTwo;
    protected int mLayoutBackgroundTint;
    private int mLayoutWidth;
    protected int mListItemLayout;
    protected int mListLayout;
    private ListView mListView;
    protected CharSequence mMessage;
    private int mMessageMaxLines;
    private boolean mMessageScroll;
    private TextView mMessageView;
    protected int mMultiButtonPadding;
    protected int mMultiChoiceItemLayout;
    private NavigationBarContentObserver mNavigationBarContentObserver;
    private int mPosition;
    private RecyclerView mRecyclerView;
    private NestedScrollView mScrollView;
    protected int mSingleButtonPadding;
    protected int mSingleChoiceItemLayout;
    private RecyclerView mSubRecyclerView;
    CharSequence[] mSummaryList;
    protected CharSequence mTitle;
    private TextView mTitleView;
    protected View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    public final Window mWindow;
    private int mWindowGravity;
    private int titleMaxline;

    public static class AlertParams {
        public ListAdapter mAdapter;
        public int mBackgroundColor;
        public boolean mChangeable;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public int mDialogType;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public Drawable[] mIcons;
        public int mImgResId;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsScroll;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public boolean mMessageIsScroll;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public int mNegativeTextColor;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public int mNeutralTextColor;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public DialogInterface.OnClickListener mOnSubClickListener;
        public int mPosition;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public int mPositiveTextColor;
        public Drawable[] mSubIcons;
        public CharSequence[] mSubItems;
        public CharSequence[] mSummaryItems;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public int mViewSpacingTop;
        public int[] textColor;
        public int mIconId = 0;
        public int mIconAttrId = 0;
        public int titleMaxline = -1;
        public boolean mViewSpacingSpecified = false;
        public int mCheckedItem = -1;
        public boolean mRecycleOnMeasure = true;
        public boolean mIsTitle = false;
        public boolean mHasMessage = false;
        protected int windowGraity = 17;
        protected int itemOrientation = 0;
        protected int mListItemLayoutId = 0;
        public int messageMaxLines = 0;
        public boolean isDismiss = false;
        public boolean mCancelable = true;

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001f  */
        /* JADX WARN: Code duplicated, block: B:64:0x015b  */
        /* JADX WARN: Code duplicated, block: B:67:0x016a  */
        /* JADX WARN: Code duplicated, block: B:68:0x0173  */
        /* JADX WARN: Code duplicated, block: B:70:0x0177  */
        /* JADX WARN: Code duplicated, block: B:73:0x0183  */
        /* JADX WARN: Code duplicated, block: B:76:0x018a  */
        /* JADX WARN: Code duplicated, block: B:77:0x018f  */
        /* JADX WARN: Code duplicated, block: B:79:0x0193  */
        private void createListView(final AlertController alertController) {
            final ListAdapter checkedTextItemAdapter;
            final ListView listView;
            int i;
            final AlertController alertController2;
            OnPrepareListViewListener onPrepareListViewListener;
            AdapterView.OnItemSelectedListener onItemSelectedListener;
            int deleteDialogOption = alertController.getDeleteDialogOption();
            if (deleteDialogOption == 2) {
                alertController.mListLayout = R$layout.nx_color_select_dialog_list_view;
            } else if (deleteDialogOption == 3) {
                alertController.mListLayout = R$layout.nx_color_select_dialog_delete_button;
            } else if (deleteDialogOption == 5) {
                alertController.mListLayout = R$layout.nx_color_select_dialog_list_view;
            } else if (deleteDialogOption == 6) {
                alertController.mListLayout = R$layout.nx_color_select_dialog_list_view_six;
            }
            final ListView listView2 = (ListView) this.mInflater.inflate(alertController.mListLayout, (ViewGroup) null);
            if (alertController.getDeleteDialogOption() == 2 || alertController.getDeleteDialogOption() == 3 || alertController.getDeleteDialogOption() == 5 || alertController.getDeleteDialogOption() == 6) {
                listView2.setDrawSelectorOnTop(true);
                boolean unused = AlertController.mScroll = this.mIsScroll;
                alertController.mMessageScroll = this.mMessageIsScroll;
                if (this.mIsScroll) {
                    listView2.setOverScrollMode(0);
                } else {
                    listView2.setOverScrollMode(2);
                }
                this.mIsTitle = !TextUtils.isEmpty(this.mTitle);
            }
            if (!this.mIsMultiChoice) {
                int i2 = this.mIsSingleChoice ? alertController.mSingleChoiceItemLayout : alertController.mListItemLayout;
                if (alertController.getDeleteDialogOption() == 3) {
                    i2 = R$layout.nx_color_select_dialog_delete_item;
                }
                if (alertController.getDeleteDialogOption() == 5) {
                    i2 = R$layout.nx_color_select_dialog_new_item;
                }
                if (alertController.getDeleteDialogOption() == 6) {
                    i2 = R$layout.nx_color_select_dialog_checkbox_sumary_item;
                }
                int i3 = i2;
                if (this.mCursor != null) {
                    listView = listView2;
                    i = 2;
                    alertController2 = alertController;
                    checkedTextItemAdapter = new SimpleCursorAdapter(this.mContext, i3, this.mCursor, new String[]{this.mLabelColumn}, new int[]{R.id.text1}) { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.4
                        @Override // android.widget.CursorAdapter, android.widget.Adapter
                        public View getView(int i4, View view, ViewGroup viewGroup) {
                            View view2 = super.getView(i4, view, viewGroup);
                            if (view2 != null) {
                                AlertController.changeTextSize(AlertParams.this.mContext, (TextView) view2.findViewById(R.id.text1), R$dimen.NXtheme1_dialog_button_text_size);
                            }
                            return view2;
                        }
                    };
                } else if (alertController.getDeleteDialogOption() == 3 || alertController.getDeleteDialogOption() == 2) {
                    ListAdapter listAdapter = this.mAdapter;
                    checkedTextItemAdapter = listAdapter != null ? listAdapter : new CheckedTextItemAdapter(alertController, this.mContext, i3, R.id.text1, R$id.summary_text2, this.mItems, this.mSummaryItems, this.mIsTitle, alertController.getDeleteDialogOption(), this.textColor, AlertDialog.LIST_TEXT_COLOR, this.mHasMessage);
                    listView = listView2;
                    i = 2;
                    alertController2 = alertController;
                } else {
                    ListAdapter checkedItemAdapter = this.mAdapter;
                    if (checkedItemAdapter == null) {
                        checkedItemAdapter = new CheckedItemAdapter(this.mContext, i3, R.id.text1, this.mItems, this.mSummaryItems, alertController.getDeleteDialogOption(), this.mPosition, this.mIsTitle);
                    }
                    checkedTextItemAdapter = checkedItemAdapter;
                }
                onPrepareListViewListener = this.mOnPrepareListViewListener;
                if (onPrepareListViewListener != null) {
                    onPrepareListViewListener.onPrepareListView(listView);
                }
                alertController2.mAdapter = checkedTextItemAdapter;
                alertController2.mCheckedItem = this.mCheckedItem;
                if (this.mOnClickListener != null) {
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.5
                        @Override // android.widget.AdapterView.OnItemClickListener
                        @SensorsDataInstrumented
                        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j2) {
                            if (alertController2.getDeleteDialogOption() == 5 || alertController2.getDeleteDialogOption() == 6) {
                                ListAdapter listAdapter2 = checkedTextItemAdapter;
                                if (listAdapter2 instanceof CheckedItemAdapter) {
                                    ((CheckedItemAdapter) listAdapter2).setData(i4);
                                }
                            }
                            AlertParams.this.mOnClickListener.onClick(alertController2.mDialog, i4);
                            SensorsDataAutoTrackHelper.trackListView(adapterView, view, i4);
                        }
                    });
                } else if (this.mOnCheckboxClickListener != null) {
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.6
                        @Override // android.widget.AdapterView.OnItemClickListener
                        @SensorsDataInstrumented
                        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j2) {
                            boolean[] zArr = AlertParams.this.mCheckedItems;
                            if (zArr != null) {
                                zArr[i4] = listView.isItemChecked(i4);
                            }
                            ListAdapter listAdapter2 = checkedTextItemAdapter;
                            if (listAdapter2 instanceof ArrayAdapter) {
                                ((ArrayAdapter) listAdapter2).notifyDataSetChanged();
                            }
                            AlertParams.this.mOnCheckboxClickListener.onClick(alertController2.mDialog, i4, listView.isItemChecked(i4));
                            SensorsDataAutoTrackHelper.trackListView(adapterView, view, i4);
                        }
                    });
                }
                onItemSelectedListener = this.mOnItemSelectedListener;
                if (onItemSelectedListener != null) {
                    listView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (this.mIsSingleChoice) {
                    listView.setChoiceMode(1);
                } else if (this.mIsMultiChoice) {
                    listView.setChoiceMode(i);
                }
                alertController2.mListView = listView;
            }
            checkedTextItemAdapter = this.mCursor == null ? new ArrayAdapter<CharSequence>(this.mContext, alertController.mMultiChoiceItemLayout, R.id.text1, this.mItems) { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.2
                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                public View getView(int i4, View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i4, view, viewGroup);
                    boolean[] zArr = AlertParams.this.mCheckedItems;
                    if (zArr != null && zArr[i4]) {
                        listView2.setItemChecked(i4, true);
                    }
                    if (view2 != null) {
                        TextView textView = (TextView) view2.findViewById(R.id.text1);
                        AlertController.changeTextSize(AlertParams.this.mContext, textView, R$dimen.NXtheme1_dialog_button_text_size);
                        if (textView instanceof CheckedTextView) {
                            ((CheckedTextView) textView).setChecked(listView2.isItemChecked(i4));
                        }
                    }
                    return view2;
                }
            } : new CursorAdapter(this.mContext, this.mCursor, false) { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.3
                private final int mIsCheckedIndex;
                private final int mLabelIndex;

                {
                    Cursor cursor = getCursor();
                    this.mLabelIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                    this.mIsCheckedIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mIsCheckedColumn);
                }

                @Override // android.widget.CursorAdapter
                public void bindView(View view, Context context, Cursor cursor) {
                    CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.text1);
                    checkedTextView.setText(cursor.getString(this.mLabelIndex));
                    AlertController.changeTextSize(AlertParams.this.mContext, checkedTextView, R$dimen.NXtheme1_dialog_button_text_size);
                    listView2.setItemChecked(cursor.getPosition(), cursor.getInt(this.mIsCheckedIndex) == 1);
                }

                @Override // android.widget.CursorAdapter
                public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                    return AlertParams.this.mInflater.inflate(alertController.mMultiChoiceItemLayout, viewGroup, false);
                }
            };
            listView = listView2;
            i = 2;
            alertController2 = alertController;
            onPrepareListViewListener = this.mOnPrepareListViewListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(listView);
            }
            alertController2.mAdapter = checkedTextItemAdapter;
            alertController2.mCheckedItem = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.5
                    @Override // android.widget.AdapterView.OnItemClickListener
                    @SensorsDataInstrumented
                    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j2) {
                        if (alertController2.getDeleteDialogOption() == 5 || alertController2.getDeleteDialogOption() == 6) {
                            ListAdapter listAdapter2 = checkedTextItemAdapter;
                            if (listAdapter2 instanceof CheckedItemAdapter) {
                                ((CheckedItemAdapter) listAdapter2).setData(i4);
                            }
                        }
                        AlertParams.this.mOnClickListener.onClick(alertController2.mDialog, i4);
                        SensorsDataAutoTrackHelper.trackListView(adapterView, view, i4);
                    }
                });
            } else if (this.mOnCheckboxClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.6
                    @Override // android.widget.AdapterView.OnItemClickListener
                    @SensorsDataInstrumented
                    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j2) {
                        boolean[] zArr = AlertParams.this.mCheckedItems;
                        if (zArr != null) {
                            zArr[i4] = listView.isItemChecked(i4);
                        }
                        ListAdapter listAdapter2 = checkedTextItemAdapter;
                        if (listAdapter2 instanceof ArrayAdapter) {
                            ((ArrayAdapter) listAdapter2).notifyDataSetChanged();
                        }
                        AlertParams.this.mOnCheckboxClickListener.onClick(alertController2.mDialog, i4, listView.isItemChecked(i4));
                        SensorsDataAutoTrackHelper.trackListView(adapterView, view, i4);
                    }
                });
            }
            onItemSelectedListener = this.mOnItemSelectedListener;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                listView.setChoiceMode(1);
            } else if (this.mIsMultiChoice) {
                listView.setChoiceMode(i);
            }
            alertController2.mListView = listView;
        }

        private void createScrollView(AlertController alertController) {
            if (this.itemOrientation != 1) {
                alertController.mRecyclerView = createSingleScroll(alertController, this.mItems, this.mIcons, this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_scroll_item_padding_wide), this.mOnClickListener, 0);
            } else {
                alertController.mRecyclerView = createSingleScroll(alertController, this.mItems, this.mIcons, this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_scroll_item_padding_horizontal), this.mOnClickListener, 1);
                alertController.mSubRecyclerView = createSingleScroll(alertController, this.mSubItems, this.mSubIcons, this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_scroll_item_padding_normal), this.mOnSubClickListener, 1);
            }
        }

        private RecyclerView createSingleScroll(final AlertController alertController, CharSequence[] charSequenceArr, Drawable[] drawableArr, int i, final DialogInterface.OnClickListener onClickListener, int i2) {
            RecyclerView recyclerView = null;
            if (charSequenceArr != null && drawableArr != null) {
                recyclerView = (RecyclerView) this.mInflater.inflate(R$layout.nx_support_abc_select_dialog_scroll, (ViewGroup) null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
                if (i2 == 1) {
                    linearLayoutManager.setOrientation(0);
                } else {
                    linearLayoutManager.setOrientation(1);
                }
                recyclerView.setLayoutManager(linearLayoutManager);
                ArrayList arrayList = new ArrayList(drawableArr.length);
                for (int i3 = 0; i3 < drawableArr.length; i3++) {
                    arrayList.add(new ScrollItem(drawableArr[i3], charSequenceArr[i3]));
                }
                ScrollItemAdapter scrollItemAdapter = new ScrollItemAdapter(this.mContext, arrayList, i, i2);
                if (onClickListener != null) {
                    scrollItemAdapter.setOnClickListener(new OnScrollItemClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.AlertParams.1
                        @Override // com.heytap.nearx.uikit.widget.dialog.AlertController.OnScrollItemClickListener
                        public void onItemClick(int i4) {
                            onClickListener.onClick(alertController.mDialog, i4);
                        }
                    });
                }
                recyclerView.setAdapter(scrollItemAdapter);
            }
            return recyclerView;
        }

        public void apply(AlertController alertController) {
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.setCustomTitle(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.setTitle(charSequence);
                }
                int i = this.titleMaxline;
                if (i > 0) {
                    alertController.setTitleMaxline(i);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.setIcon(drawable);
                }
                int i2 = this.mIconId;
                if (i2 != 0) {
                    alertController.setIcon(i2);
                }
                int i3 = this.mIconAttrId;
                if (i3 != 0) {
                    alertController.setIcon(alertController.getIconAttributeResId(i3));
                }
            }
            alertController.setMessageMaxLines(this.messageMaxLines);
            int i4 = this.mListItemLayoutId;
            if (i4 != 0) {
                if (this.mIsMultiChoice) {
                    alertController.setMultiChoiceItemLayout(i4);
                } else {
                    alertController.setSingleChoiceItemLayout(i4);
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                this.mHasMessage = true;
                alertController.setMessage(charSequence2);
            }
            CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null) {
                alertController.setButton(-1, charSequence3, this.mPositiveButtonListener, null);
            }
            CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null) {
                alertController.setButton(-2, charSequence4, this.mNegativeButtonListener, null);
                alertController.getButton(-2);
            }
            CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null) {
                alertController.setButton(-3, charSequence5, this.mNeutralButtonListener, null);
            }
            alertController.mSummaryList = this.mSummaryItems;
            CharSequence[] charSequenceArr = this.mItems;
            if (charSequenceArr != null && this.mIcons != null) {
                createScrollView(alertController);
            } else if (charSequenceArr != null || this.mCursor != null || this.mAdapter != null) {
                createListView(alertController);
            }
            View view2 = this.mView;
            if (view2 == null) {
                int i5 = this.mViewLayoutResId;
                if (i5 != 0) {
                    alertController.setView(i5);
                }
            } else if (this.mViewSpacingSpecified) {
                alertController.setView(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
            } else {
                alertController.setView(view2);
            }
            int i6 = this.mImgResId;
            if (i6 != 0) {
                alertController.setImgContent(i6);
            }
            int i7 = this.mPosition;
            if (i7 != 0) {
                alertController.setPosition(i7);
            }
            alertController.setCustomBackgroundColor(this.mBackgroundColor);
            alertController.setBtnNegativeTextColor(this.mNegativeTextColor);
            alertController.setBtnNeutralTextColor(this.mNeutralTextColor);
            alertController.setBtnPositiveTextColor(this.mPositiveTextColor);
            alertController.setWindowGravity(this.windowGraity);
            alertController.setDialogDismissIfClick(this.isDismiss);
            alertController.mChangeable = this.mChangeable;
            alertController.setDialogType(this.mDialogType);
        }
    }

    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        private boolean haveTitle;
        private Context mContext;
        private int mDialogOption;
        private ColorStateList mNormalColor;
        private int mPosition;
        private int mSelectedColor;
        private int mSummarySize;
        private CharSequence[] summaryItems;

        public CheckedItemAdapter(Context context, int i, int i2, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int i3, int i4, boolean z) {
            super(context, i, i2, charSequenceArr);
            this.mSummarySize = 0;
            this.summaryItems = null;
            this.mDialogOption = i3;
            this.mContext = context;
            this.mPosition = i4;
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.mContext.getTheme();
            int i5 = R$attr.nxColorPrimary;
            theme.resolveAttribute(i5, typedValue, true);
            this.summaryItems = charSequenceArr2;
            this.mSummarySize = charSequenceArr2 != null ? charSequenceArr2.length : 0;
            this.mNormalColor = context.getResources().getColorStateList(R$color.nx_dialog_button_text_color_bottom);
            this.mSelectedColor = plc.a(context, i5);
            this.haveTitle = z;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 != null) {
                TextView textView = (TextView) view2.findViewById(R.id.text1);
                AlertController.changeTextSize(textView.getContext(), textView, R$dimen.NXtheme1_dialog_button_text_size);
                int i2 = this.mDialogOption;
                if (i2 == 5) {
                    ImageView imageView = (ImageView) view2.findViewById(R$id.select_icon);
                    xhc.d(imageView.getDrawable(), plc.a(this.mContext, R$attr.nxColorPrimary));
                    if (this.mPosition == i) {
                        imageView.setVisibility(0);
                        textView.setTextColor(this.mSelectedColor);
                    } else {
                        imageView.setVisibility(4);
                        textView.setTextColor(this.mNormalColor);
                    }
                } else if (i2 == 6) {
                    if (textView instanceof CheckedTextView) {
                        ((CheckedTextView) textView).setChecked(this.mPosition == i);
                    }
                    CharSequence charSequence = i >= this.mSummarySize ? null : this.summaryItems[i];
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    TextView textView2 = (TextView) view2.findViewById(R$id.summary_text2);
                    if (TextUtils.isEmpty(charSequence)) {
                        textView2.setVisibility(8);
                        layoutParams.height = yqk.a(52.0f, this.mContext.getResources());
                    } else {
                        textView.setPadding(0, 0, 0, yqk.a(15.0f, this.mContext.getResources()));
                        layoutParams.height = yqk.a(65.0f, this.mContext.getResources());
                    }
                    view2.setLayoutParams(layoutParams);
                    textView2.setText(charSequence);
                }
                if (i == 0) {
                    if (this.mDialogOption == 5) {
                        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_dialog_button_height);
                        int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_item_padding_top);
                        int dimensionPixelSize3 = this.mContext.getResources().getDimensionPixelSize(R$dimen.NXM10);
                        view2.setPadding(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3, 0);
                        view2.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2);
                    }
                    if (this.mDialogOption != 6) {
                        view2.setBackgroundResource(this.haveTitle ? R$drawable.nx_color_delete_alert_dialog_middle : R$drawable.nx_color_delete_alert_dialog_top);
                    }
                } else {
                    if (this.mDialogOption == 5) {
                        int dimensionPixelSize4 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_dialog_button_height);
                        int dimensionPixelSize5 = this.mContext.getResources().getDimensionPixelSize(R$dimen.NXM10);
                        view2.setPadding(dimensionPixelSize5, 0, dimensionPixelSize5, 0);
                        view2.setMinimumHeight(dimensionPixelSize4);
                    }
                    if (this.mDialogOption != 6) {
                        view2.setBackgroundResource(R$drawable.nx_color_delete_alert_dialog_middle);
                    }
                }
            }
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public void setData(int i) {
            this.mPosition = i;
            notifyDataSetChanged();
        }
    }

    public static class CheckedTextItemAdapter extends BaseAdapter {
        private int ListItemWidth;
        private CharSequence[] items;
        private Context mContext;
        private boolean mHasMessage;
        private boolean mIsTitle;
        private int[] mListColor;
        private int mOption;
        private int mResource;
        private int[] mTextColor;
        private int mTextId1;
        private int mTextId2;
        private CharSequence[] summaryItems;

        public CheckedTextItemAdapter(AlertController alertController, Context context, int i, int i2, int i3, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean z, int i4, int[] iArr, int[] iArr2, boolean z2) {
            this.mContext = context;
            this.mIsTitle = z;
            this.mOption = i4;
            this.mTextId1 = i2;
            this.mTextId2 = i3;
            this.mTextColor = iArr;
            this.mListColor = iArr2;
            this.items = charSequenceArr;
            this.summaryItems = charSequenceArr2;
            this.mResource = i;
            this.mHasMessage = z2;
            this.ListItemWidth = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - (context.getResources().getDimensionPixelSize(R$dimen.nx_option_dialog_list_view_padding) * 2);
        }

        private void setCheckedItemView(BaseAdapter baseAdapter, View view, Context context, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, boolean z, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
            TextView textView;
            TextView textView2;
            if (i2 == 2 || i2 == 3) {
                if (view != null) {
                    textView = (TextView) view.findViewById(i3);
                    textView2 = (TextView) view.findViewById(i4);
                    AlertController.changeTextSize(this.mContext, textView, R$dimen.NXtheme1_dialog_button_text_size);
                    AlertController.changeTextSize(this.mContext, textView2, R$dimen.nx_font_size_12);
                } else {
                    textView = null;
                    textView2 = null;
                }
                if (charSequenceArr != null && textView != null && i < charSequenceArr.length) {
                    textView.setText(charSequenceArr[i]);
                }
                if (charSequenceArr2 != null && textView2 != null && i < charSequenceArr2.length) {
                    CharSequence charSequence = charSequenceArr2[i];
                    if (TextUtils.isEmpty(charSequence)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(0);
                        textView2.setText(charSequence);
                    }
                } else if ((charSequenceArr2 != null && textView2 != null && i >= charSequenceArr2.length) || textView2 != null) {
                    textView2.setVisibility(8);
                }
                if (textView != null && textView2 != null && textView.getVisibility() == 0 && textView2.getVisibility() == 0) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.height = yqk.a(65.0f, this.mContext.getResources());
                    view.setLayoutParams(layoutParams);
                }
                if (iArr != null && i >= 0 && i < iArr.length && iArr2 != null) {
                    int i5 = iArr[i];
                    if (i5 == iArr2[0]) {
                        textView.setTextColor(context.getResources().getColorStateList(R$color.nx_dialog_button_text_color_bottom));
                    } else if (i5 == iArr2[1]) {
                        textView.setTextColor(context.getResources().getColorStateList(R$color.nx_delete_dialog_button_warning_color));
                    } else {
                        textView.setTextColor(i5);
                    }
                }
                int count = getCount();
                if (i == 0) {
                    if (!z && !this.mHasMessage) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.nx_dialog_item_padding_top);
                        if (view != null) {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom());
                            view.setMinimumHeight(view.getMinimumHeight() + dimensionPixelSize);
                            view.setBackgroundResource(R$drawable.nx_color_delete_alert_dialog_list_top);
                        }
                    } else if (view != null) {
                        view.setBackground(this.mContext.getResources().getDrawable(R$drawable.nx_color_delete_alert_dialog_default));
                    }
                } else if (view != null) {
                    view.setBackground(this.mContext.getResources().getDrawable(R$drawable.nx_color_delete_alert_dialog_default));
                }
                if (i == count - 1) {
                    int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.nx_dialog_item_padding_top);
                    if (view != null) {
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + dimensionPixelSize2);
                        view.setMinimumHeight(view.getMinimumHeight() + dimensionPixelSize2);
                    }
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            CharSequence[] charSequenceArr = this.items;
            if (charSequenceArr != null) {
                return charSequenceArr.length;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate = LayoutInflater.from(this.mContext).inflate(this.mResource, (ViewGroup) null);
            setCheckedItemView(this, viewInflate, this.mContext, i, this.mOption, this.mTextId1, this.mTextId2, this.mTextColor, this.mListColor, this.mIsTitle, this.items, this.summaryItems);
            return viewInflate;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public static class ControllerComponentCallbacks implements ComponentCallbacks {
        private WeakReference<AlertController> controllerWeakReference;

        public ControllerComponentCallbacks(AlertController alertController) {
            this.controllerWeakReference = new WeakReference<>(alertController);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NonNull Configuration configuration) {
            AlertController alertController = this.controllerWeakReference.get();
            if (alertController == null || Looper.getMainLooper() != Looper.myLooper()) {
                return;
            }
            try {
                alertController.handleComponentCallbacksConfigurationChanged(configuration);
            } catch (Exception e2) {
                fjc.b(AlertController.TAG, "onConfigurationChanged error:" + e2.getMessage());
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static class NavigationBarContentObserver extends ContentObserver {
        private WeakReference<AlertController> controllerWeakReference;

        public NavigationBarContentObserver(Handler handler, AlertController alertController) {
            super(handler);
            this.controllerWeakReference = new WeakReference<>(alertController);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            if (this.controllerWeakReference.get() != null) {
                this.controllerWeakReference.get().sendNavigationBarStatusMessage();
            }
        }
    }

    public static class NearRecyclerListView extends ListView {
        private Path mClipPath;
        private int mCornerRadius;
        private boolean mNeedClip;
        private final int mPaddingBottomNoButtons;
        private final int mPaddingTopNoTitle;
        private float[] mRadiusArrays;
        private RectF mRectF;

        public NearRecyclerListView(Context context) {
            this(context, null);
        }

        @Override // android.widget.AbsListView, android.view.View
        public void draw(Canvas canvas) {
            canvas.save();
            if (this.mNeedClip) {
                canvas.clipPath(this.mClipPath);
            }
            super.draw(canvas);
            canvas.restore();
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.mClipPath.reset();
            this.mRectF.set(0.0f, 0.0f, i, i2);
            this.mClipPath.addRoundRect(this.mRectF, this.mRadiusArrays, Path.Direction.CW);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.mPaddingTopNoTitle, getPaddingRight(), z2 ? getPaddingBottom() : this.mPaddingBottomNoButtons);
        }

        public void setNeedClip(boolean z) {
            this.mNeedClip = z;
        }

        public NearRecyclerListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mCornerRadius = context.getResources().getDimensionPixelOffset(R$dimen.nx_alert_dialog_bottom_corner_radius);
            this.mClipPath = new Path();
            this.mRectF = new RectF();
            int i = this.mCornerRadius;
            this.mRadiusArrays = new float[]{i, i, i, i, 0.0f, 0.0f, 0.0f, 0.0f};
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
            this.mPaddingBottomNoButtons = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.mPaddingTopNoTitle = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface OnScrollItemClickListener {
        void onItemClick(int i);
    }

    public static class RecycleListView extends ListView {
        private Path mPath1;
        private Path mPathArc;
        private int mRadius;

        public RecycleListView(Context context) {
            this(context, null);
        }

        private void clipBottomRound(Canvas canvas) {
            if (AlertController.mScroll) {
                Path path = this.mPath1;
                if (path == null) {
                    this.mPath1 = new Path();
                } else {
                    path.reset();
                }
                int scrollY = getScrollY();
                int bottom = (getBottom() - (this.mRadius / 2)) + scrollY;
                int bottom2 = getBottom() + scrollY;
                int left = getLeft();
                int i = this.mRadius / 2;
                float f = left;
                float f2 = bottom;
                this.mPath1.moveTo(f, f2);
                float f3 = bottom2;
                this.mPath1.lineTo(f, f3);
                this.mPath1.lineTo(i, f3);
                this.mPath1.close();
                canvas.clipPath(this.mPath1, Region.Op.DIFFERENCE);
                this.mPath1.reset();
                int right = getRight();
                int right2 = getRight() - (this.mRadius / 2);
                float f4 = right;
                this.mPath1.moveTo(f4, f2);
                this.mPath1.lineTo(f4, f3);
                this.mPath1.lineTo(right2, f3);
                this.mPath1.close();
                canvas.clipPath(this.mPath1, Region.Op.DIFFERENCE);
                Path path2 = this.mPathArc;
                if (path2 == null) {
                    this.mPathArc = new Path();
                } else {
                    path2.reset();
                }
                int bottom3 = getBottom();
                int i2 = this.mRadius;
                this.mPathArc.addArc(new RectF(0.0f, (bottom3 - i2) + scrollY, i2, getBottom() + scrollY), 90.0f, 180.0f);
                canvas.clipPath(this.mPathArc, Region.Op.UNION);
                this.mPathArc.reset();
                this.mPathArc.addArc(new RectF(getRight() - this.mRadius, (getBottom() - this.mRadius) + scrollY, getRight(), getBottom() + scrollY), 0.0f, 90.0f);
                canvas.clipPath(this.mPathArc, Region.Op.UNION);
            }
        }

        @Override // android.widget.AbsListView, android.view.View
        public void draw(Canvas canvas) {
            canvas.save();
            super.draw(canvas);
            canvas.restore();
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mRadius = 24;
            this.mRadius = (int) (this.mRadius * context.getResources().getDisplayMetrics().density);
        }
    }

    public static class ScrollItem {
        Drawable mDrawable;
        CharSequence mText;

        public ScrollItem(Drawable drawable, CharSequence charSequence) {
            this.mDrawable = drawable;
            this.mText = charSequence;
        }
    }

    public static class ScrollItemAdapter extends RecyclerView.Adapter<ScrollItemViewHolder> implements View.OnClickListener {
        private int mBottomPadding;
        private Context mContext;
        private List<ScrollItem> mData;
        private int mItemLayout;
        private OnScrollItemClickListener mListener = null;
        private int mNormalPadding;
        private int mOrientation;
        private int mTopPadding;

        public ScrollItemAdapter(@NonNull Context context, List<ScrollItem> list, int i, int i2) {
            this.mData = list;
            this.mTopPadding = i;
            this.mBottomPadding = context.getResources().getDimensionPixelSize(R$dimen.nx_dialog_scroll_item_padding_bottom);
            this.mNormalPadding = context.getResources().getDimensionPixelSize(R$dimen.nx_dialog_scroll_item_left_right_padding_normal);
            this.mOrientation = i2;
            this.mContext = context;
            if (i2 == 1) {
                this.mItemLayout = R$layout.nx_dialog_scroll_item;
            } else {
                this.mItemLayout = R$layout.nx_dialog_list_item;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<ScrollItem> list = this.mData;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (this.mListener != null && view.getTag() != null) {
                this.mListener.onItemClick(((Integer) view.getTag()).intValue());
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }

        public void setOnClickListener(OnScrollItemClickListener onScrollItemClickListener) {
            this.mListener = onScrollItemClickListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull ScrollItemViewHolder scrollItemViewHolder, int i) {
            scrollItemViewHolder.mImageView.setImageDrawable(this.mData.get(i).mDrawable);
            scrollItemViewHolder.mTextView.setText(this.mData.get(i).mText);
            if (i == 0 && this.mOrientation == 0) {
                scrollItemViewHolder.itemView.setBackgroundResource(R$drawable.nx_color_delete_alert_dialog_list_top);
            }
            if (this.mOrientation == 1) {
                if (i == 0) {
                    scrollItemViewHolder.itemView.setPadding(yqk.a(24.0f, this.mContext.getResources()), this.mTopPadding, this.mNormalPadding, this.mBottomPadding);
                } else {
                    View view = scrollItemViewHolder.itemView;
                    int i2 = this.mNormalPadding;
                    view.setPadding(i2, this.mTopPadding, i2, this.mBottomPadding);
                }
            }
            scrollItemViewHolder.itemView.setTag(Integer.valueOf(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public ScrollItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.mItemLayout, viewGroup, false);
            viewInflate.setOnClickListener(this);
            return new ScrollItemViewHolder(viewInflate);
        }
    }

    public static class ScrollItemViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;

        public ScrollItemViewHolder(@NonNull View view) {
            super(view);
            this.mImageView = (ImageView) view.findViewById(R$id.icon);
            this.mTextView = (TextView) view.findViewById(R$id.summary);
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.titleMaxline = -1;
        this.mViewSpacingSpecified = false;
        this.mIconId = 0;
        this.mCheckedItem = -1;
        this.mMessageScroll = true;
        this.mMessageMaxLines = 0;
        this.mComponentCallbacks = new ControllerComponentCallbacks(this);
        this.mButtonPanelLayoutHint = 0;
        this.mWindowGravity = 17;
        this.mDialogType = 0;
        this.isCancelOnTouchOutside = true;
        this.mButtonHandler = new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                Message messageObtain;
                AlertController alertController = AlertController.this;
                if (view != alertController.mButtonPositive || alertController.mButtonPositiveMessage == null) {
                    AlertController alertController2 = AlertController.this;
                    if (view != alertController2.mButtonNegative || alertController2.mButtonNegativeMessage == null) {
                        AlertController alertController3 = AlertController.this;
                        if (view != alertController3.mButtonNeutral || alertController3.mButtonNeutralMessage == null) {
                            messageObtain = (view != AlertController.this.mCloseDialog || AlertController.this.mCloseDialog == null) ? null : Message.obtain(AlertController.this.mCloseButtonMessage);
                        } else {
                            messageObtain = Message.obtain(AlertController.this.mButtonNeutralMessage);
                        }
                    } else {
                        messageObtain = Message.obtain(AlertController.this.mButtonNegativeMessage);
                    }
                } else {
                    messageObtain = Message.obtain(AlertController.this.mButtonPositiveMessage);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        };
        this.mDeleteDialogOption = 0;
        this.mContext = context;
        this.mDialog = appCompatDialog;
        this.mWindow = window;
        this.mHandler = new ButtonHandler(appCompatDialog, Looper.getMainLooper());
        this.mNavigationBarContentObserver = new NavigationBarContentObserver(this.mHandler, this);
        int[] iArr = R$styleable.AlertDialog;
        int i = R$attr.NearAlertDialogStyle;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i, 0);
        this.mAlertDialogLayout = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, R$layout.nx_alert_dialog_center_layout);
        this.mButtonPanelSideLayout = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.mListLayout = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
        this.mMultiChoiceItemLayout = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.mSingleChoiceItemLayout = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.mListItemLayout = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
        this.mSingleButtonPadding = (int) context.getResources().getDimension(R$dimen.nx_dialog_single_button_padding);
        this.mMultiButtonPadding = 0;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, R$styleable.NXColorAlertDialog, i, 0);
        xhc xhcVar = xhc.INSTANCE;
        this.mColorDeleteDialogListBottom = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxBottomItemBackground);
        this.mColorDeleteDialogListTop = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxTopItemBackground);
        this.mColorDeleteDialogListMiddle = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxItemBackground);
        this.mColorDeleteDialogDefault = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxDefaultBackground);
        this.mColorDialogBtnLeft = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxLeftBtnBackground);
        this.mColorDialogBtnRight = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxRightBtnBackground);
        this.mColorDialogVerticalMiddle = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxVerticalMiddleBtnBackground);
        this.mColorDialogVerticalBottom = xhc.b(context, typedArrayObtainStyledAttributes2, R$styleable.NXColorAlertDialog_nxVerticalBottomBtnBackground);
        int i2 = R$styleable.NXColorAlertDialog_nxAlertDialogCenterBackgroundRRadius;
        Resources resources = context.getResources();
        int i3 = R$dimen.nx_dialog_bg_radius;
        this.mBackgroundCenterRadius = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i2, (int) resources.getDimension(i3));
        this.mBackgroundBottomRadius = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.NXColorAlertDialog_nxAlertDialogBottomBackgroundRRadius, (int) context.getResources().getDimension(i3));
        this.mLayoutBackgroundTint = typedArrayObtainStyledAttributes2.getColor(R$styleable.NXColorAlertDialog_nxLayoutBackgroundTint, ContextCompat.getColor(context, R$color.nx_panel_layout_tint));
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(new int[]{R$attr.nxCenterAlertDialogButtonTextColor});
        this.mButtonColor = typedArrayObtainStyledAttributes3.getColor(0, context.getResources().getColor(R$color.nx_bottom_alert_dialog_button_text_color));
        typedArrayObtainStyledAttributes3.recycle();
        this.mBottomSpaceHeight = context.getResources().getDimensionPixelSize(R$dimen.nx_dialog_padding_bottom);
    }

    private void addBottomSpace(boolean z, boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.mWindow.findViewById(R$id.parentPanel);
        if (viewGroup == null || !needAddBottomView()) {
            return;
        }
        int spaceHeight = getSpaceHeight(z, z2);
        WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
        if (2 != NearDeviceUtil.a().intValue()) {
            View view = new View(this.mContext);
            view.setId(R$id.NXalert_dialog_bottom_space);
            view.setBackgroundColor(this.mContext.getResources().getColor(R$color.nx_dialog_bottom_space_color));
            viewGroup.addView(view, viewGroup.getChildCount(), new ViewGroup.LayoutParams(-1, spaceHeight));
        } else {
            attributes.y += spaceHeight;
        }
        updateWindowFlag(z, z2);
        addPrivateFlag(attributes);
        isSystemDialog(attributes);
        this.mWindow.setAttributes(attributes);
    }

    private void addPrivateFlag(WindowManager.LayoutParams layoutParams) {
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField("privateFlags");
            declaredField.setAccessible(true);
            declaredField.set(layoutParams, Integer.valueOf(declaredField.getInt(layoutParams) | 16777216 | 64));
        } catch (Exception e2) {
            fjc.a(TAG, "addPrivateFlag failed.Fail msg is " + e2.getMessage());
        }
    }

    private void addScrollViewToPanel(Context context, ViewGroup viewGroup, View view, View view2) {
        context.getResources().getDimensionPixelSize(R$dimen.NXM10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        if (view2 == null) {
            viewGroup.addView(view, marginLayoutParams);
            return;
        }
        marginLayoutParams.setMargins(0, yqk.a(20.0f, this.mContext.getResources()), 0, yqk.a(20.0f, this.mContext.getResources()));
        View view3 = new View(context);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, 2);
        marginLayoutParams2.setMargins(yqk.a(24.0f, this.mContext.getResources()), 0, yqk.a(24.0f, this.mContext.getResources()), 0);
        view3.setBackgroundResource(R$color.NXtheme1_dialog_button_divider_color);
        viewGroup.addView(view, marginLayoutParams);
        viewGroup.addView(view3, marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.setMargins(0, yqk.a(20.0f, this.mContext.getResources()), 0, yqk.a(20.0f, this.mContext.getResources()));
        viewGroup.addView(view2, marginLayoutParams3);
    }

    private void boldPositiveButtonText() {
        Button button = this.mButtonPositive;
        if (button != null) {
            z63.b(button, true);
        }
    }

    public static void boldText(TextView textView) {
        if (textView != null) {
            z63.b(textView, true);
        }
    }

    public static boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void centerButton(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private void changeButtonArrangeStyles(final int i) {
        this.mButtonPositive.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int iMeasureText;
                int width;
                int iMeasureText2;
                int width2;
                int width3;
                int iMeasureText3 = 0;
                if (AlertController.this.mButtonPositive.getVisibility() == 0) {
                    width = AlertController.this.mButtonPositive.getWidth() - (AlertController.this.mButtonPositive.getPaddingLeft() + AlertController.this.mButtonPositive.getPaddingRight());
                    iMeasureText = (int) AlertController.this.mButtonPositive.getPaint().measureText(AlertController.this.mButtonPositiveText.toString());
                } else {
                    iMeasureText = 0;
                    width = 0;
                }
                if (AlertController.this.mButtonNegative.getVisibility() == 0) {
                    width2 = AlertController.this.mButtonNegative.getWidth() - (AlertController.this.mButtonNegative.getPaddingLeft() + AlertController.this.mButtonNegative.getPaddingRight());
                    iMeasureText2 = (int) AlertController.this.mButtonNegative.getPaint().measureText(AlertController.this.mButtonNegativeText.toString());
                } else {
                    iMeasureText2 = 0;
                    width2 = 0;
                }
                if (AlertController.this.mButtonNeutral.getVisibility() == 0) {
                    width3 = AlertController.this.mButtonNeutral.getWidth() - (AlertController.this.mButtonNeutral.getPaddingLeft() + AlertController.this.mButtonNeutral.getPaddingRight());
                    iMeasureText3 = (int) AlertController.this.mButtonNeutral.getPaint().measureText(AlertController.this.mButtonNeutralText.toString());
                } else {
                    width3 = 0;
                }
                AlertController.this.mButtonPositive.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (AlertController.this.getDeleteDialogOption() == 0 && AlertController.this.isSetButtonPanelFromHtV(i) && (iMeasureText2 > width2 || iMeasureText > width || iMeasureText3 > width3)) {
                    AlertController.this.setButtonPanelFromHtV(i);
                } else if (i == (AlertController.BIT_BUTTON_POSITIVE | AlertController.BIT_BUTTON_NEGATIVE | AlertController.BIT_BUTTON_NEUTRAL)) {
                    AlertController.this.setButtonPanelFromHtV(i);
                }
            }
        });
    }

    public static void changeButtonTextSize(Context context, Button button) {
        if (button != null) {
            button.setTextSize(0, (int) z63.c(context.getResources().getDimensionPixelSize(R$dimen.NXtheme1_dialog_button_text_size), context.getResources().getConfiguration().fontScale, 5));
        }
    }

    public static void changeTextSize(Context context, TextView textView, int i) {
        if (textView != null) {
            textView.setTextSize(0, (int) z63.c(context.getResources().getDimensionPixelSize(i), context.getResources().getConfiguration().fontScale, 5));
        }
    }

    private void clearButtonBoldStyle() {
        Button button = this.mButtonPositive;
        if (button != null) {
            z63.b(button, false);
        }
        Button button2 = this.mButtonNegative;
        if (button2 != null) {
            z63.b(button2, false);
        }
        Button button3 = this.mButtonNeutral;
        if (button3 != null) {
            z63.b(button3, false);
        }
    }

    private int doubleLineNum(int i) {
        CharSequence[] charSequenceArr = this.mSummaryList;
        if (charSequenceArr == null) {
            return 0;
        }
        int iMin = Math.min(i, charSequenceArr.length);
        int i2 = 0;
        for (int i3 = 0; i3 < iMin; i3++) {
            if (!TextUtils.isEmpty(this.mSummaryList[i3])) {
                i2++;
            }
        }
        return i2;
    }

    private ViewGroup getClearPanel(View view, ViewGroup viewGroup, ViewGroup viewGroup2, View view2) {
        view.setVisibility(8);
        viewGroup.removeView(this.mMessageView);
        ViewGroup viewGroup3 = (ViewGroup) this.mScrollView.getParent();
        viewGroup3.removeViewAt(viewGroup3.indexOfChild(this.mScrollView));
        view2.setVisibility(8);
        viewGroup3.removeViewAt(viewGroup3.indexOfChild(view2));
        viewGroup3.removeViewAt(viewGroup3.indexOfChild(viewGroup2));
        return viewGroup3;
    }

    private Point getScreenSize() {
        Point point = new Point();
        ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    private int getSpaceHeight(boolean z, boolean z2) {
        if (z) {
            return 0;
        }
        return z2 ? navigationBarHeight() : this.mBottomSpaceHeight;
    }

    private int getThemeResId(Context context) {
        if (context instanceof ContextThemeWrapper) {
            return ((ContextThemeWrapper) context).getThemeResId();
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    private int getWindowWidth() {
        Window window = this.mWindow;
        if (!((window == null || window.getDecorView() == null || !this.mWindow.getDecorView().isAttachedToWindow()) ? false : true)) {
            return this.mContext.getResources().getDisplayMetrics().widthPixels;
        }
        Rect rect = new Rect();
        this.mWindow.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.right - rect.left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleComponentCallbacksConfigurationChanged(Configuration configuration) {
        updateLayoutWidth();
        updateWindowAttributes();
        updateForChangeableDialog();
    }

    private void initMessageView(CharSequence charSequence, int i) {
        this.mMessageView.setText(charSequence);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mScrollView.getLayoutParams();
        if (i > 0) {
            layoutParams.height = (this.mMessageView.getLineHeight() * i) + this.mScrollView.getPaddingTop() + this.mScrollView.getPaddingBottom() + yqk.a(10.0f, this.mContext.getResources());
        } else if (getDeleteDialogOption() == 3 && mScroll) {
            layoutParams.height = 0;
            layoutParams.weight = 0.98f;
        }
        int i2 = R$dimen.nx_font_size_12;
        if (this.mWindowGravity == 17) {
            i2 = gjc.c() ? R$dimen.NXTD06 : R$dimen.NXTD07;
        } else if (getDeleteDialogOption() == 4) {
            i2 = R$dimen.NXTD07;
        }
        changeTextSize(this.mContext, this.mMessageView, i2);
    }

    private boolean isCenterDialog() {
        return getDialogType() == 0;
    }

    private boolean isNavigationBarShow() {
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager.getDefaultDisplay() == null) {
            return false;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (Math.abs(i - i3) <= 10 && Math.abs(i2 - i4) <= 10) {
            return false;
        }
        int i5 = Settings.Secure.getInt(this.mContext.getContentResolver(), "hide_navigationbar_enable", 0);
        if (i5 == 0) {
            return true;
        }
        return i5 == 1 && Settings.Secure.getInt(this.mContext.getContentResolver(), "manual_hide_navigationbar", 0) == 0;
    }

    private boolean isPortrait() {
        return getScreenSize().x < getScreenSize().y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSetButtonPanelFromHtV(int i) {
        int i2 = BIT_BUTTON_POSITIVE;
        int i3 = BIT_BUTTON_NEGATIVE;
        if (i != (i2 | i3)) {
            int i4 = BIT_BUTTON_NEUTRAL;
            if (i != (i2 | i4) && i != (i3 | i4) && i != (i2 | i3 | i4)) {
                return false;
            }
        }
        return true;
    }

    private int isSupportNav() {
        try {
            Resources resources = this.mContext.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier > 0) {
                return resources.getBoolean(identifier) ? 1 : 0;
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    private boolean isSystemDialog(WindowManager.LayoutParams layoutParams) {
        int i = layoutParams.type;
        return i == 2003 || i == 2038 || i == TYPE_SYSTEM_LONG_SHOT;
    }

    private int navigationBarHeight() {
        Resources resources = this.mContext.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android"));
    }

    private boolean needAddBottomView() {
        return this.mWindowGravity != 17 && isPortrait();
    }

    private void observeHideNavigationBar() {
        this.mContext.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("manual_hide_navigationbar"), false, this.mNavigationBarContentObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNavigationBarStatusMessage() {
        if (Settings.Secure.getInt(this.mContext.getContentResolver(), "manual_hide_navigationbar", -1) == 0) {
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(Message.obtain(handler, 2, this), 200L);
        } else {
            Handler handler2 = this.mHandler;
            handler2.sendMessageDelayed(Message.obtain(handler2, 3, this), 0L);
        }
    }

    private void setButtonsTextSize(int i) {
        Button button = this.mButtonNegative;
        if (button != null) {
            changeTextSize(this.mContext, button, i);
        }
        Button button2 = this.mButtonNeutral;
        if (button2 != null) {
            changeTextSize(this.mContext, button2, i);
        }
        Button button3 = this.mButtonPositive;
        if (button3 != null) {
            changeTextSize(this.mContext, button3, i);
        }
    }

    private void setupButtons(ViewGroup viewGroup) {
        int i;
        int i2;
        int i3;
        int i4;
        Typeface typefaceCreate;
        float dimensionPixelSize;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.mButtonPositive = button;
        button.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonPositiveText)) {
            this.mButtonPositive.setVisibility(8);
            i = 0;
        } else {
            this.mButtonPositive.setText(this.mButtonPositiveText);
            this.mButtonPositive.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.mButtonNegative = button2;
        button2.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNegativeText)) {
            this.mButtonNegative.setVisibility(8);
        } else {
            this.mButtonNegative.setText(this.mButtonNegativeText);
            this.mButtonNegative.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.mButtonNeutral = button3;
        button3.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNeutralText)) {
            this.mButtonNeutral.setVisibility(8);
        } else {
            this.mButtonNeutral.setText(this.mButtonNeutralText);
            this.mButtonNeutral.setVisibility(0);
            i |= 4;
        }
        if (shouldCenterSingleButton(this.mContext)) {
            if (i == 1) {
                centerButton(this.mButtonPositive);
            } else if (i == 2) {
                centerButton(this.mButtonNegative);
            } else if (i == 4) {
                centerButton(this.mButtonNeutral);
            }
        }
        if (!(i != 0)) {
            viewGroup.setVisibility(8);
        }
        if ((viewGroup instanceof NearButtonBarLayout) && getDeleteDialogOption() != 6) {
            Button button4 = (Button) viewGroup.findViewById(R.id.button1);
            Button button5 = (Button) viewGroup.findViewById(R.id.button2);
            Button button6 = (Button) viewGroup.findViewById(R.id.button3);
            if (isCenterDialog()) {
                typefaceCreate = Typeface.create("sans-serif-medium", 0);
                dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.NXTD07);
                ((NearButtonBarLayout) viewGroup).setVerNegButVerPaddingOffset(0);
            } else {
                Typeface typefaceCreate2 = Typeface.create(SANS_REGULAR, 0);
                float dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.NXTD09);
                NearButtonBarLayout nearButtonBarLayout = (NearButtonBarLayout) viewGroup;
                nearButtonBarLayout.setVerNegButVerPaddingOffset(this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_list_last_item_padding_offset));
                nearButtonBarLayout.setForceVertical(true);
                button4.setTextColor(this.mButtonColor);
                button5.setTextColor(this.mButtonColor);
                button6.setTextColor(this.mContext.getResources().getColor(R$color.nx_bottom_alert_dialog_button_warning_color));
                typefaceCreate = typefaceCreate2;
                dimensionPixelSize = dimensionPixelSize2;
            }
            button4.setTypeface(typefaceCreate);
            button4.setTextSize(0, dimensionPixelSize);
            button5.setTypeface(typefaceCreate);
            button5.setTextSize(0, dimensionPixelSize);
            button6.setTypeface(typefaceCreate);
            button6.setTextSize(0, dimensionPixelSize);
        }
        Button button7 = this.mButtonNeutral;
        if (button7 != null && (i4 = this.mBtnNeutralTextColor) != 0) {
            button7.setTextColor(i4);
        }
        Button button8 = this.mButtonNegative;
        if (button8 != null && (i3 = this.mBtnNegativeTextColor) != 0) {
            button8.setTextColor(i3);
        }
        Button button9 = this.mButtonPositive;
        if (button9 == null || (i2 = this.mBtnPositiveTextColor) == 0) {
            return;
        }
        button9.setTextColor(i2);
    }

    private void setupContent(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView;
        TextView textView = (TextView) this.mWindow.findViewById(R.id.message);
        this.mMessageView = textView;
        if (textView == null) {
            return;
        }
        NestedScrollView nestedScrollView2 = (NestedScrollView) this.mWindow.findViewById(R$id.scrollView);
        this.mScrollView = nestedScrollView2;
        if (nestedScrollView2 == null) {
            return;
        }
        nestedScrollView2.setFocusable(false);
        initMessageView(this.mMessage, this.mMessageMaxLines);
        if (getDeleteDialogOption() == 3) {
            View viewFindViewById = viewGroup.findViewById(R$id.option_dialog_divider);
            ViewGroup viewGroup2 = (LinearLayout) viewGroup.findViewById(R$id.listPanel);
            if (mScroll) {
                if (this.mMessageScroll) {
                    NestedScrollView nestedScrollView3 = this.mScrollView;
                    if (nestedScrollView3 != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nestedScrollView3.getLayoutParams();
                        NestedScrollView nestedScrollView4 = this.mScrollView;
                        nestedScrollView4.setPadding(nestedScrollView4.getPaddingLeft(), this.mScrollView.getPaddingTop(), this.mScrollView.getPaddingRight(), this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_message_long_padding_bottom));
                        layoutParams.weight = 0.0f;
                    }
                    if (viewGroup2 != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewGroup2.getLayoutParams();
                        layoutParams2.height = 0;
                        layoutParams2.weight = 1.0f;
                    }
                } else if (viewGroup2 != null) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) viewGroup2.getLayoutParams();
                    layoutParams3.height = 0;
                    layoutParams3.weight = 1.0f;
                    viewGroup2.setPadding(0, 0, 0, 0);
                }
            }
            if (this.mRecyclerView != null) {
                ViewGroup clearPanel = getClearPanel(this.mMessageView, this.mScrollView, viewGroup2, viewFindViewById);
                if (isPortrait()) {
                    addScrollViewToPanel(this.mContext, clearPanel, this.mRecyclerView, this.mSubRecyclerView);
                } else {
                    LinearLayout linearLayout = new LinearLayout(this.mContext);
                    linearLayout.setOrientation(1);
                    addScrollViewToPanel(this.mContext, linearLayout, this.mRecyclerView, this.mSubRecyclerView);
                    ScrollView scrollView = new ScrollView(this.mContext);
                    scrollView.setPadding(0, 50, 0, 0);
                    scrollView.setOverScrollMode(2);
                    scrollView.setVerticalScrollBarEnabled(false);
                    scrollView.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                    clearPanel.addView(scrollView);
                }
            } else if (this.mListView != null) {
                if (this.mMessage == null) {
                    getClearPanel(this.mMessageView, this.mScrollView, viewGroup2, viewFindViewById).addView(this.mListView, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    if (!mScroll && (nestedScrollView = this.mScrollView) != null) {
                        ((LinearLayout.LayoutParams) nestedScrollView.getLayoutParams()).weight = 0.0f;
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(this.mListView, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
            if (this.mMessage == null && this.mListView == null && this.mRecyclerView == null) {
                viewGroup.setVisibility(8);
            }
        } else if (this.mMessage != null) {
            int deleteDialogOption = getDeleteDialogOption();
            if (deleteDialogOption == 0) {
                this.mMessageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        int lineCount = AlertController.this.mMessageView.getLineCount();
                        AlertController.this.mMessageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (lineCount > 1) {
                            AlertController.this.mMessageView.setGravity(8388627);
                        } else {
                            AlertController.this.mMessageView.setGravity(17);
                        }
                    }
                });
            } else if (deleteDialogOption == 4) {
                this.mMessageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.4
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (AlertController.this.mMessageView.getLineCount() == 1) {
                            AlertController.this.mMessageView.setGravity(17);
                        } else {
                            AlertController.this.mMessageView.setGravity(GravityCompat.START);
                        }
                        AlertController.this.mMessageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
            }
        } else {
            this.mMessageView.setVisibility(8);
            this.mScrollView.removeView(this.mMessageView);
            if (this.mListView != null) {
                ViewGroup viewGroup3 = (ViewGroup) this.mScrollView.getParent();
                int iIndexOfChild = viewGroup3.indexOfChild(this.mScrollView);
                viewGroup3.removeViewAt(iIndexOfChild);
                viewGroup3.addView(this.mListView, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroup.setVisibility(8);
            }
        }
        AutoImageView autoImageView = (AutoImageView) this.mWindow.findViewById(R$id.content_img);
        this.mImgContent = autoImageView;
        if (autoImageView == null) {
            return;
        }
        if (this.mImgResourceId != 0) {
            autoImageView.setVisibility(0);
            this.mImgContent.setImageResource(this.mImgResourceId);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.mWindow.findViewById(R$id.dialog_close);
        this.mCloseDialog = appCompatImageView;
        if (appCompatImageView != null) {
            this.mCloseButtonMessage = Message.obtain(this.mHandler, 100);
            this.mCloseDialog.setOnClickListener(this.mButtonHandler);
        }
    }

    private boolean setupTitle(ViewGroup viewGroup) {
        View viewFindViewById = this.mWindow.findViewById(R$id.title_template);
        if (this.mCustomTitleView != null) {
            viewGroup.addView(this.mCustomTitleView, 0, new ViewGroup.LayoutParams(-1, -2));
            viewGroup.setLayoutParams((LinearLayout.LayoutParams) viewGroup.getLayoutParams());
            viewFindViewById.setVisibility(8);
        } else {
            this.mIconView = (ImageView) this.mWindow.findViewById(R.id.icon);
            if (!(!TextUtils.isEmpty(this.mTitle))) {
                viewFindViewById.setVisibility(8);
                this.mIconView.setVisibility(8);
                viewGroup.setVisibility(8);
                return false;
            }
            TextView textView = (TextView) this.mWindow.findViewById(R$id.alertTitle);
            this.mTitleView = textView;
            textView.setText(this.mTitle);
            int i = this.titleMaxline;
            if (i > 0) {
                this.mTitleView.setMaxLines(i);
            }
            this.mTitleView.setTextSize(2, 16.0f);
            if (getDeleteDialogOption() == 4) {
                changeTextSize(this.mContext, this.mTitleView, R$dimen.NXTD11);
            }
            int i2 = this.mIconId;
            if (i2 != 0) {
                this.mIconView.setImageResource(i2);
                this.mIconView.setVisibility(0);
            } else {
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    this.mIconView.setImageDrawable(drawable);
                    this.mIconView.setVisibility(0);
                } else {
                    this.mIconView.setVisibility(8);
                    this.mTitleView.setPadding(this.mIconView.getPaddingLeft(), this.mIconView.getPaddingTop(), this.mIconView.getPaddingRight(), this.mIconView.getPaddingBottom());
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
                    layoutParams.setMargins(layoutParams.leftMargin, yqk.a(24.0f, this.mContext.getResources()), layoutParams.rightMargin, yqk.a(12.0f, this.mContext.getResources()));
                    viewFindViewById.setLayoutParams(layoutParams);
                }
            }
        }
        return true;
    }

    private void setupView() {
        ListAdapter listAdapter;
        setupContentLayoutListener();
        final ViewGroup viewGroup = (ViewGroup) this.mWindow.findViewById(R$id.contentPanel);
        ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(R$id.topPanel);
        ViewGroup viewGroup3 = (ViewGroup) this.mWindow.findViewById(R$id.buttonPanel);
        FrameLayout frameLayout = (FrameLayout) this.mWindow.findViewById(R$id.customPanel);
        if (frameLayout != null) {
            frameLayout.getVisibility();
        }
        if (viewGroup2 != null) {
            viewGroup2.getVisibility();
        }
        boolean z = (viewGroup3 == null || viewGroup3.getVisibility() == 8) ? false : true;
        setupTitle(viewGroup2);
        if (viewGroup3 != null) {
            setupButtons(viewGroup3);
        }
        setupContent(viewGroup);
        if (!z && viewGroup3 != null) {
            viewGroup3.setVisibility(8);
            View viewFindViewById = this.mWindow.findViewById(R$id.textSpacerNoButtons);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        }
        View viewInflate = this.mView;
        if (viewInflate == null) {
            viewInflate = this.mViewLayoutResId != 0 ? LayoutInflater.from(this.mContext).inflate(this.mViewLayoutResId, (ViewGroup) frameLayout, false) : null;
        }
        boolean z2 = viewInflate != null;
        if ((!z2 || !canTextInput(viewInflate)) && !canTextInput(this.mWindow.getDecorView())) {
            this.mWindow.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout2 = (FrameLayout) this.mWindow.findViewById(R$id.custom);
            if (viewInflate.getParent() != null) {
                ((ViewGroup) viewInflate.getParent()).removeView(viewInflate);
            }
            frameLayout2.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.mViewSpacingSpecified) {
                frameLayout2.setPadding(this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
            }
            if (this.mListView != null && frameLayout != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ListView listView = this.mListView;
        if (listView != null && (listAdapter = this.mAdapter) != null) {
            listView.setAdapter(listAdapter);
            int i = this.mCheckedItem;
            if (i > -1) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
            listView.setDivider(null);
        }
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                AlertController alertController = AlertController.this;
                alertController.mContext.registerComponentCallbacks(alertController.mComponentCallbacks);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                viewGroup.removeOnAttachStateChangeListener(this);
                if (AlertController.this.mComponentCallbacks != null) {
                    AlertController alertController = AlertController.this;
                    alertController.mContext.unregisterComponentCallbacks(alertController.mComponentCallbacks);
                    AlertController.this.mComponentCallbacks = null;
                }
                AlertController.this.mHandler.removeCallbacksAndMessages(null);
                AlertController.this.mContext.getContentResolver().unregisterContentObserver(AlertController.this.mNavigationBarContentObserver);
            }
        });
        updateBg();
    }

    private static boolean shouldCenterSingleButton(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    private void updateBg() {
        View viewFindViewById = this.mWindow.findViewById(R$id.parentPanel);
        if (viewFindViewById != null) {
            if (viewFindViewById.getBackground() != null && this.mLayoutBackgroundTint != 0) {
                viewFindViewById.getBackground().setTint(this.mLayoutBackgroundTint);
            }
            if (!(viewFindViewById instanceof ColorGradientLinearLayout)) {
                if (!(viewFindViewById instanceof LinearLayout) || viewFindViewById.getBackground() == null || this.mBackgroundColor == 0) {
                    return;
                }
                xhc.d(viewFindViewById.getBackground(), this.mBackgroundColor);
                return;
            }
            ColorGradientLinearLayout colorGradientLinearLayout = (ColorGradientLinearLayout) viewFindViewById;
            int i = this.mBackgroundColor;
            if (i != 0) {
                colorGradientLinearLayout.setCustomBackgroundColor(i);
            }
            if (this.mWindow.getAttributes().gravity == 17) {
                colorGradientLinearLayout.setBackgroundRadius(this.mBackgroundCenterRadius);
                colorGradientLinearLayout.setHasShadow(true);
                colorGradientLinearLayout.setCornerStyle(ColorGradientLinearLayout.ALL_CORNER);
                return;
            }
            if (getDeleteDialogOption() != 3 || this.mRecyclerView == null || this.mSubRecyclerView == null) {
                colorGradientLinearLayout.setBackgroundRadius(this.mBackgroundBottomRadius);
            } else {
                colorGradientLinearLayout.setBackgroundRadius(yqk.a(16.0f, this.mContext.getResources()));
            }
            colorGradientLinearLayout.setHasShadow(false);
            colorGradientLinearLayout.setCornerStyle(ColorGradientLinearLayout.TOP_CORNER);
        }
    }

    private void updateForChangeableDialog() {
        if (this.mChangeable && isCenterDialog()) {
            Point screenSize = getScreenSize();
            WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
            View viewFindViewById = this.mWindow.findViewById(R$id.parentPanel);
            if (viewFindViewById == null || screenSize.x >= screenSize.y) {
                return;
            }
            DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_max_height) + viewFindViewById.getPaddingTop() + viewFindViewById.getPaddingBottom();
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_max_height_landscape) + viewFindViewById.getPaddingTop() + viewFindViewById.getPaddingBottom();
            int i = displayMetrics.heightPixels;
            if (displayMetrics.widthPixels >= i) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            attributes.height = Math.min(i, dimensionPixelSize);
            this.mWindow.setAttributes(attributes);
        }
    }

    private void updateLayoutWidth() {
        View viewFindViewById = this.mWindow.findViewById(R$id.parentPanel);
        if (viewFindViewById instanceof NearMaxLinearLayout) {
            int iMin = Math.min(this.mContext.getResources().getDimensionPixelOffset(R$dimen.nx_dialog_layout_max_width), getWindowWidth() - (this.mContext.getResources().getDimensionPixelOffset(R$dimen.nx_dialog_layout_margin_horizontal) * 2));
            fjc.g("TAG", "updateLayoutWidth maxWidth" + iMin);
            ((NearMaxLinearLayout) viewFindViewById).setMaxWidth(iMin);
            viewFindViewById.requestLayout();
        }
    }

    private void updateSelectedListView(ListView listView, ListAdapter listAdapter, boolean z) {
        int iDoubleLineNum;
        if (listView == null || listAdapter == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int count = listAdapter.getCount();
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_dialog_list_item_single_height);
        int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_dialog_list_item_double_height_more);
        int dimensionPixelSize3 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_item_padding_top);
        if (z) {
            if (count > 5 && getDeleteDialogOption() == 5) {
                listView.setFadingEdgeLength(yqk.a(50.0f, this.mContext.getResources()));
                iDoubleLineNum = doubleLineNum(5);
                layoutParams.height = (dimensionPixelSize * 5) + dimensionPixelSize3 + dimensionPixelSize;
            } else if (count <= 6 || getDeleteDialogOption() != 6) {
                iDoubleLineNum = doubleLineNum(count);
                layoutParams.height = (dimensionPixelSize * count) + dimensionPixelSize3;
            } else {
                int iDoubleLineNum2 = doubleLineNum(6);
                layoutParams.height = (dimensionPixelSize * 6) + dimensionPixelSize3 + (dimensionPixelSize / 2) + yqk.a(6.0f, this.mContext.getResources());
                iDoubleLineNum = iDoubleLineNum2;
            }
            layoutParams.height += dimensionPixelSize2 * iDoubleLineNum;
        } else if (count > 3) {
            int i = (getScreenSize().y / dimensionPixelSize) - 4;
            if (getDeleteDialogOption() == 6) {
                layoutParams.height = (dimensionPixelSize * i) + dimensionPixelSize3;
            } else {
                layoutParams.height = (i * dimensionPixelSize) + dimensionPixelSize3 + (dimensionPixelSize / 2);
            }
        } else {
            layoutParams.height = -2;
        }
        listView.setLayoutParams(layoutParams);
    }

    private void updateSpaceHeight() {
        int i;
        boolean zIsCenterDialog = isCenterDialog();
        boolean zIsNavigationBarShow = isNavigationBarShow();
        ViewGroup viewGroup = (ViewGroup) this.mWindow.findViewById(R$id.parentPanel);
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(R$id.NXalert_dialog_bottom_space);
            if (!zIsCenterDialog && !zIsNavigationBarShow && (i = this.mBackgroundColor) != 0 && viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(i);
            }
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.height = getSpaceHeight(zIsCenterDialog, zIsNavigationBarShow);
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
        updateWindowFlag(zIsCenterDialog, zIsNavigationBarShow);
    }

    private void updateWindowAttributes() {
        Point screenSize = getScreenSize();
        boolean z = screenSize.x < screenSize.y;
        this.mContext.getResources().getDisplayMetrics();
        int windowWidth = getWindowWidth();
        WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
        attributes.width = Math.min(Math.min(screenSize.x, screenSize.y), windowWidth);
        if (isCenterDialog()) {
            attributes.windowAnimations = R$style.NXAnimation_ColorSupport_Dialog_Alpha;
            if (z || (this instanceof ImageAlertController)) {
                attributes.height = -2;
            } else {
                attributes.height = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_central_max_height);
            }
            this.mWindow.setGravity(17);
        } else {
            attributes.windowAnimations = R$style.NXColorDialogAnimation;
            attributes.height = -2;
            this.mWindow.setGravity(80);
        }
        this.mWindow.setAttributes(attributes);
    }

    private void updateWindowFlag(boolean z, boolean z2) {
        if (z) {
            this.mWindow.clearFlags(512);
            this.mWindow.clearFlags(Integer.MIN_VALUE);
            this.mWindow.clearFlags(1024);
        } else if (z2) {
            this.mWindow.setNavigationBarColor(-1);
            this.mWindow.clearFlags(134217728);
            this.mWindow.addFlags(512);
            this.mWindow.addFlags(Integer.MIN_VALUE);
            this.mWindow.addFlags(1024);
            if (!gjc.c()) {
                this.mWindow.getDecorView().setSystemUiVisibility(16);
            }
            if (gjc.c()) {
                this.mWindow.getDecorView().setSystemUiVisibility(1552);
            }
        }
    }

    public void boldAllButtonText() {
        Button button = this.mButtonPositive;
        if (button != null) {
            z63.b(button, true);
        }
        Button button2 = this.mButtonNegative;
        if (button2 != null) {
            z63.b(button2, true);
        }
        Button button3 = this.mButtonNeutral;
        if (button3 != null) {
            z63.b(button3, true);
        }
    }

    public Button getButton(int i) {
        if (i == -3) {
            return this.mButtonNeutral;
        }
        if (i == -2) {
            return this.mButtonNegative;
        }
        if (i != -1) {
            return null;
        }
        return this.mButtonPositive;
    }

    public int getDeleteDialogOption() {
        return this.mDeleteDialogOption;
    }

    public int getDialogType() {
        return this.mDialogType;
    }

    public EditText getEditText() {
        return (EditText) this.mWindow.findViewById(R$id.et_input_box1);
    }

    public int getIconAttributeResId(int i) {
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView getListView() {
        return this.mListView;
    }

    public void installContent() {
        this.mDialog.supportRequestWindowFeature(1);
        this.mDialog.setContentView(selectContentView());
        updateWindowAttributes();
        updateForChangeableDialog();
        setupView();
    }

    public boolean isLayoutRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mScrollView;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mScrollView;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public int selectContentView() {
        return this.mAlertDialogLayout;
    }

    public void setBtnNegativeTextColor(int i) {
        this.mBtnNegativeTextColor = i;
    }

    public void setBtnNeutralTextColor(int i) {
        this.mBtnNeutralTextColor = i;
    }

    public void setBtnPositiveTextColor(int i) {
        this.mBtnPositiveTextColor = i;
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.mHandler.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.mButtonNeutralText = charSequence;
            this.mButtonNeutralMessage = message;
        } else if (i == -2) {
            this.mButtonNegativeText = charSequence;
            this.mButtonNegativeMessage = message;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.mButtonPositiveText = charSequence;
            this.mButtonPositiveMessage = message;
        }
    }

    public void setButtonIsBold(int i, int i2, int i3) {
        Button button;
        Button button2;
        Button button3;
        clearButtonBoldStyle();
        if (i == -1 && (button3 = this.mButtonPositive) != null) {
            z63.b(button3, true);
        }
        if (i2 == -2 && (button2 = this.mButtonNegative) != null) {
            z63.b(button2, true);
        }
        if (i3 != -3 || (button = this.mButtonNeutral) == null) {
            return;
        }
        z63.b(button, true);
    }

    public void setButtonPanelFromHtV(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mWindow.findViewById(R$id.buttonPanel).getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_divider_margin_top);
        LinearLayout linearLayout = (LinearLayout) this.mButtonPositive.getParent();
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setVerticalButtonsStyle(linearLayout, i);
        setVerticalButtonsBackground(i);
        View viewFindViewById = this.mWindow.findViewById(R$id.iv_button_content_divider);
        View viewFindViewById2 = this.mWindow.findViewById(R$id.iv_security_button_content_divider);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(0);
        } else if (viewFindViewById != null) {
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.NXM8);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
            if (this.mView != null) {
                layoutParams2.topMargin = dimensionPixelSize2;
                viewFindViewById.setVisibility(0);
            } else {
                layoutParams2.topMargin = 0;
                viewFindViewById.setVisibility(4);
            }
        }
        if (linearLayout.getChildCount() > 0) {
            linearLayout.getChildAt(linearLayout.getChildCount() - 1).setPadding(0, 0, 0, dimensionPixelSize);
        }
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mButtonPanelLayoutHint = i;
    }

    public void setButtonStyle(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        button.setMinHeight(this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_dialog_button_height));
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_message_padding_left);
        int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_button_padding_top);
        button.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        button.setLayoutParams(layoutParams);
        changeButtonTextSize(this.mContext, button);
    }

    public void setCancelOnTouchOutside(boolean z) {
        this.isCancelOnTouchOutside = z;
        setupContentLayoutListener();
    }

    public void setCustomBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public void setCustomTitle(View view) {
        this.mCustomTitleView = view;
    }

    public void setDeleteDialogOption(int i) {
        this.mDeleteDialogOption = i;
    }

    public void setDialogDismissIfClick(boolean z) {
        isDismiss = z;
    }

    public void setDialogType(int i) {
        this.mDialogType = i;
    }

    public void setIcon(int i) {
        this.mIcon = null;
        this.mIconId = i;
        ImageView imageView = this.mIconView;
        if (imageView != null) {
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setImgContent(int i) {
        this.mImgResourceId = i;
    }

    public void setMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
        TextView textView = this.mMessageView;
        if (textView != null) {
            textView.setText(charSequence);
            if (getDeleteDialogOption() != 0) {
                changeTextSize(this.mContext, this.mMessageView, R$dimen.nx_font_size_12);
            } else if (gjc.c()) {
                changeTextSize(this.mContext, this.mMessageView, R$dimen.NXTD06);
            } else {
                changeTextSize(this.mContext, this.mMessageView, R$dimen.NXTD07);
            }
        }
    }

    public void setMessageMaxLines(int i) {
        this.mMessageMaxLines = i;
    }

    public void setMultiChoiceItemLayout(int i) {
        this.mMultiChoiceItemLayout = i;
    }

    public void setPosition(int i) {
        this.mPosition = i;
    }

    public void setSingleChoiceItemLayout(int i) {
        this.mSingleChoiceItemLayout = i;
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setTitleMaxline(int i) {
        this.titleMaxline = i;
    }

    public void setVerticalButtonsBackground(int i) {
        int i2 = BIT_BUTTON_POSITIVE;
        int i3 = BIT_BUTTON_NEGATIVE;
        if (i == (i2 | i3)) {
            this.mButtonPositive.setBackgroundDrawable(this.mColorDialogVerticalMiddle);
            this.mButtonNegative.setBackgroundDrawable(this.mColorDialogVerticalBottom);
            return;
        }
        int i4 = BIT_BUTTON_NEUTRAL;
        if (i == (i2 | i4)) {
            this.mButtonPositive.setBackgroundDrawable(this.mColorDialogVerticalMiddle);
            this.mButtonNeutral.setBackgroundDrawable(this.mColorDialogVerticalBottom);
        } else if (i == (i3 | i4)) {
            this.mButtonNegative.setBackgroundDrawable(this.mColorDialogVerticalBottom);
            this.mButtonNeutral.setBackgroundDrawable(this.mColorDialogVerticalMiddle);
        } else if (i == (i2 | i3 | i4)) {
            this.mButtonPositive.setBackgroundDrawable(this.mColorDialogVerticalMiddle);
            this.mButtonNegative.setBackgroundDrawable(this.mColorDialogVerticalMiddle.getConstantState().newDrawable());
            this.mButtonNeutral.setBackgroundDrawable(this.mColorDialogVerticalBottom);
        }
    }

    public void setVerticalButtonsStyle(LinearLayout linearLayout, int i) {
        int i2 = BIT_BUTTON_POSITIVE;
        int i3 = BIT_BUTTON_NEGATIVE;
        if (i == (i2 | i3)) {
            setButtonStyle(this.mButtonPositive);
            setButtonStyle(this.mButtonNegative);
            linearLayout.removeAllViews();
            linearLayout.addView(this.mButtonPositive);
            linearLayout.addView(this.mButtonNegative);
            return;
        }
        int i4 = BIT_BUTTON_NEUTRAL;
        if (i == (i2 | i4)) {
            setButtonStyle(this.mButtonPositive);
            setButtonStyle(this.mButtonNeutral);
            linearLayout.removeAllViews();
            linearLayout.addView(this.mButtonPositive);
            linearLayout.addView(this.mButtonNeutral);
            return;
        }
        if (i == (i3 | i4)) {
            setButtonStyle(this.mButtonNegative);
            setButtonStyle(this.mButtonNeutral);
            linearLayout.removeAllViews();
            linearLayout.addView(this.mButtonNegative);
            linearLayout.addView(this.mButtonNeutral);
            return;
        }
        if (i == (i2 | i3 | i4)) {
            setButtonStyle(this.mButtonNegative);
            setButtonStyle(this.mButtonNeutral);
            setButtonStyle(this.mButtonPositive);
            linearLayout.removeAllViews();
            linearLayout.addView(this.mButtonPositive);
            linearLayout.addView(this.mButtonNegative);
            linearLayout.addView(this.mButtonNeutral);
        }
    }

    public void setView(int i) {
        this.mView = null;
        this.mViewLayoutResId = i;
        this.mViewSpacingSpecified = false;
    }

    public void setWindowGravity(int i) {
        this.mWindowGravity = i;
    }

    public void setupContentLayoutListener() {
        Window window;
        if (this.mDialog == null || (window = this.mWindow) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) window.findViewById(R$id.topPanel);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.6
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        }
        ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(R.id.content);
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(!this.isCancelOnTouchOutside ? null : new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.AlertController.7
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    AppCompatDialog appCompatDialog = AlertController.this.mDialog;
                    if (appCompatDialog != null) {
                        appCompatDialog.dismiss();
                    }
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        }
    }

    public static final class ButtonHandler extends Handler {
        private static final int MSG_ADD_BOTTOM_SPACE = 2;
        private static final int MSG_REMOVE_BOTTOM_SPACE = 3;
        private WeakReference<DialogInterface> mDialog;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<DialogInterface> weakReference;
            int i = message.what;
            if (i != -3 && i != -2 && i != -1) {
                if (i == 100 && (weakReference = this.mDialog) != null) {
                    weakReference.get().dismiss();
                    return;
                }
                return;
            }
            try {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.mDialog.get(), message.what);
                if (AlertController.isDismiss) {
                    this.mDialog.get().dismiss();
                }
            } catch (Exception unused) {
                fjc.e(AlertController.TAG, "AlertController ButtonHandler Error");
            }
        }

        public ButtonHandler(DialogInterface dialogInterface, Looper looper) {
            super(looper);
            this.mDialog = new WeakReference<>(dialogInterface);
        }
    }

    public void setView(View view) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        this.mIconId = 0;
        ImageView imageView = this.mIconView;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setView(View view, View view2) {
        if (!gjc.c()) {
            this.mView = view;
        } else {
            this.mView = view2;
        }
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }

    public void setView(int i, int i2) {
        if (!gjc.c()) {
            this.mViewLayoutResId = i;
        } else {
            this.mViewLayoutResId = i2;
        }
        this.mView = null;
        this.mViewSpacingSpecified = false;
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = i;
        this.mViewSpacingTop = i2;
        this.mViewSpacingRight = i3;
        this.mViewSpacingBottom = i4;
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window, int i) {
        this(context, appCompatDialog, window);
        setDeleteDialogOption(i);
        this.mAlertDialogLayout = R$layout.nx_alert_dialog_bottom_layout;
        int deleteDialogOption = getDeleteDialogOption();
        if (deleteDialogOption == 3) {
            this.mAlertDialogLayout = R$layout.nx_color_support_delete_alert_dialog_three_theme1;
        } else {
            if (deleteDialogOption != 4) {
                return;
            }
            this.mAlertDialogLayout = R$layout.nx_delete_alert_dialog_four;
        }
    }
}
