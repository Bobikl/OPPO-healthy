package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceViewHolder;
import androidx.preference.R;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.oplus.aiunit.vision.fj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.pk2;
import com.oplus.aiunit.vision.rm2;
import com.support.appcompat.R$attr;
import com.support.preference.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$layout;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPreferenceCategory extends PreferenceCategory {
    public static final int MARGIN_TYPE_LARGE = 0;
    public static final int MARGIN_TYPE_SMALL = 1;
    public static final int MARGIN_TYPE_ZERO = 2;
    public static final int TITLE_MARGIN_START_TYPE_LARGE = 1;
    public static final int TITLE_MARGIN_START_TYPE_SMALL = 0;
    public static final int TITLE_TYPE_LARGE = 2;
    public static final int TITLE_TYPE_MEDIUM = 1;
    public static final int TITLE_TYPE_SMALL = 0;
    public TextView A;
    public boolean B;
    public String C;
    public String D;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1925j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f1926l;
    public View.OnClickListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View.OnClickListener f1927n;
    public String o;
    public int p;
    public int q;
    public String r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public ArrayMap<Integer, Integer> y;
    public fj2 z;

    public COUIPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = 1;
        this.w = 0;
        this.x = 0;
        this.A = null;
        this.B = false;
        this.i = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPreferenceCategory, 0, 0);
        this.o = typedArrayObtainStyledAttributes.getString(R$styleable.COUIPreferenceCategory_text_in_right);
        this.p = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIPreferenceCategory_icon_in_right, 0);
        this.q = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIPreferenceCategory_icon_with_title, 0);
        this.r = typedArrayObtainStyledAttributes.getString(R$styleable.COUIPreferenceCategory_text_in_reddot);
        this.s = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIPreferenceCategory_title_margin_start_type, this.s);
        this.w = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIPreferenceCategory_title_type, this.w);
        this.x = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIPreferenceCategory_top_margin_type, this.x);
        this.C = typedArrayObtainStyledAttributes.getString(R$styleable.COUIPreferenceCategory_icon_with_title_content_description);
        this.D = typedArrayObtainStyledAttributes.getString(R$styleable.COUIPreferenceCategory_icon_in_right_content_description);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, 0, 0);
        this.f1925j = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes2, R.styleable.Preference_widgetLayout, R.styleable.Preference_android_widgetLayout, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.v = context.getResources().getDimensionPixelSize(R$dimen.support_preference_category_layout_title_margin_start_large);
        this.t = context.getResources().getDimensionPixelSize(R$dimen.support_preference_category_layout_title_margin_start_small);
        this.u = context.getResources().getDimensionPixelSize(R$dimen.support_preference_category_layout_title_margin_end_large);
        ArrayMap<Integer, Integer> arrayMap = new ArrayMap<>();
        this.y = arrayMap;
        arrayMap.put(Integer.valueOf(R$layout.coui_preference_category_widget_layout_checkbox), 0);
        this.y.put(Integer.valueOf(R$layout.coui_preference_category_widget_layout_loading), 0);
        this.y.put(Integer.valueOf(R$layout.coui_preference_category_widget_layout_singleicon), Integer.valueOf(context.getResources().getDimensionPixelSize(R$dimen.coui_preference_category_Loading_marginend)));
        this.y.put(Integer.valueOf(R$layout.coui_preference_category_widget_layout_textbutton), Integer.valueOf(context.getResources().getDimensionPixelSize(R$dimen.coui_preference_category_textbutton_marginend)));
        this.y.put(Integer.valueOf(R$layout.coui_preference_category_widget_layout_textwithicon), 0);
        d();
    }

    public final void d() {
        if (this.z == null) {
            fj2 fj2Var = new fj2(getContext());
            this.z = fj2Var;
            fj2Var.u(getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_widget_layout_single_icon_radius));
        }
    }

    public View e() {
        return this.k;
    }

    public final void g(PreferenceViewHolder preferenceViewHolder) {
        TextView textView;
        TextView textView2;
        int i;
        int i2;
        View viewFindViewById = preferenceViewHolder.findViewById(android.R.id.widget_frame);
        if (this.f1925j != 0) {
            if (!(viewFindViewById instanceof LinearLayout)) {
                return;
            }
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            if (linearLayout != null && linearLayout.getChildCount() > 0) {
                linearLayout.removeAllViews();
            }
            View viewInflate = LayoutInflater.from(this.i).inflate(this.f1925j, (ViewGroup) linearLayout, false);
            this.k = viewInflate;
            if (viewInflate == null) {
                Log.e("COUIPreferenceCategory", "inflate mWidgetLayoutRes failed");
                return;
            }
            this.B = false;
            if (viewInflate.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
                if (this.s == 0) {
                    if (marginLayoutParams.getMarginEnd() != this.y.get(Integer.valueOf(this.f1925j)).intValue()) {
                        marginLayoutParams.setMarginEnd(this.y.get(Integer.valueOf(this.f1925j)).intValue());
                        this.k.setLayoutParams(marginLayoutParams);
                    }
                } else if (marginLayoutParams.getMarginEnd() != this.y.get(Integer.valueOf(this.f1925j)).intValue() + this.u) {
                    marginLayoutParams.setMarginEnd(this.y.get(Integer.valueOf(this.f1925j)).intValue() + this.u);
                    this.k.setLayoutParams(marginLayoutParams);
                }
            }
            if (!(this.k.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(marginLayoutParams2.width, marginLayoutParams2.height);
            layoutParams.gravity = 16;
            layoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            layoutParams.topMargin = marginLayoutParams2.topMargin;
            layoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
            layoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
            linearLayout.addView(this.k, layoutParams);
            linearLayout.setVisibility(0);
            if (this.f1926l != null) {
                if (this.f1925j == R$layout.coui_preference_category_widget_layout_singleicon) {
                    d();
                    linearLayout.getChildAt(0).setBackground(this.z);
                } else {
                    rm2.a(this.k, false);
                }
                this.k.setOnClickListener(this.f1926l);
            } else {
                View.OnClickListener onClickListener = this.m;
                if (onClickListener != null) {
                    preferenceViewHolder.itemView.setOnClickListener(onClickListener);
                    pk2.b(preferenceViewHolder.itemView, 0, false);
                }
            }
            int i3 = this.f1925j;
            if (i3 == R$layout.coui_preference_category_widget_layout_textwithicon) {
                textView2 = (TextView) linearLayout.findViewById(R$id.text_in_composition);
                if (textView2 != null && !TextUtils.isEmpty(this.o)) {
                    textView2.setText(this.o);
                    textView2.setVisibility(0);
                }
                if (this.f1926l == null || i()) {
                    textView2.setTextColor(lh2.b(getContext(), R$attr.couiColorSecondNeutral, 0));
                } else {
                    textView2.setTextColor(lh2.b(getContext(), R$attr.couiColorPrimaryNeutral, 0));
                }
                ImageView imageView = (ImageView) linearLayout.findViewById(R$id.icon_in_composition);
                if (imageView != null && (i2 = this.p) != 0) {
                    imageView.setImageResource(i2);
                    imageView.setVisibility(0);
                }
            } else if (i3 == R$layout.coui_preference_category_widget_layout_textbutton) {
                textView2 = (TextView) linearLayout.findViewById(R$id.text_button);
                if (textView2 != null && !TextUtils.isEmpty(this.o)) {
                    textView2.setText(this.o);
                    textView2.setVisibility(0);
                    rm2.b(textView2);
                }
            } else {
                if (i3 == R$layout.coui_preference_category_widget_layout_singleicon) {
                    ImageView imageView2 = (ImageView) linearLayout.findViewById(R$id.singleIcon);
                    if (imageView2 != null && (i = this.p) != 0) {
                        imageView2.setImageResource(i);
                        imageView2.setVisibility(0);
                        if (!TextUtils.isEmpty(this.D)) {
                            imageView2.setContentDescription(this.D);
                        }
                    }
                } else if (i3 == R$layout.coui_preference_category_widget_layout_loading) {
                    textView2 = (TextView) this.k.findViewById(R$id.text_in_loading);
                }
                textView2 = null;
            }
            if (textView2 != null) {
                if (this.w == 0) {
                    textView2.setTextSize(2, 12.0f);
                } else {
                    textView2.setTextSize(2, 14.0f);
                    linearLayout.getChildAt(0).setMinimumHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_widget_layout_min_height_when_title_isnot_small));
                }
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        if (this.B && (textView = this.A) != null && (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
            marginLayoutParams3.setMarginEnd(marginLayoutParams3.getMarginStart());
            this.A.setLayoutParams(marginLayoutParams3);
        }
    }

    public final void h(PreferenceViewHolder preferenceViewHolder) {
        ImageView imageView;
        boolean z;
        this.B = true;
        View viewFindViewById = preferenceViewHolder.findViewById(android.R.id.title);
        if (viewFindViewById instanceof TextView) {
            this.A = (TextView) viewFindViewById;
        }
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.icon_with_title);
        if (viewFindViewById2 instanceof ImageView) {
            imageView = (ImageView) viewFindViewById2;
            View.OnClickListener onClickListener = this.f1927n;
            if (onClickListener != null) {
                imageView.setOnClickListener(onClickListener);
                d();
                imageView.setBackground(this.z);
            }
            if (!TextUtils.isEmpty(this.C)) {
                imageView.setContentDescription(this.C);
            }
        } else {
            imageView = null;
        }
        View viewFindViewById3 = preferenceViewHolder.findViewById(R$id.reddot_with_title);
        COUIHintRedDot cOUIHintRedDot = viewFindViewById3 instanceof COUIHintRedDot ? (COUIHintRedDot) viewFindViewById3 : null;
        if (imageView == null) {
            z = false;
        } else {
            int i = this.q;
            if (i != 0) {
                imageView.setImageResource(i);
                imageView.setVisibility(0);
                this.B = false;
                if (viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
                    if (this.w == 2) {
                        marginLayoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(R$dimen.coui_category_title_margin_end_with_icon_large));
                    } else {
                        marginLayoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(R$dimen.coui_category_title_margin_end_with_icon_small));
                    }
                    viewFindViewById.setLayoutParams(marginLayoutParams);
                }
                z = true;
            } else {
                imageView.setVisibility(8);
                z = false;
            }
        }
        if (cOUIHintRedDot != null) {
            if (TextUtils.isEmpty(this.r) || z) {
                cOUIHintRedDot.setVisibility(8);
            } else {
                cOUIHintRedDot.setPointMode(2);
                cOUIHintRedDot.setPointText(this.r);
                cOUIHintRedDot.setVisibility(0);
                this.B = false;
                if ((viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
                    marginLayoutParams2.setMarginEnd(getContext().getResources().getDimensionPixelSize(R$dimen.coui_category_title_pading_end_with_reddot_default));
                    viewFindViewById.setLayoutParams(marginLayoutParams2);
                }
            }
        }
        TextView textView = this.A;
        if (textView != null && textView.getVisibility() == 0) {
            int i2 = this.w;
            if (i2 == 0) {
                this.A.setTextSize(2, 12.0f);
                this.A.setMinHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_category_text_height));
                if (z) {
                    this.A.setTextColor(lh2.a(getContext(), R$attr.couiColorPrimaryNeutral));
                } else {
                    this.A.setTextColor(lh2.a(getContext(), R$attr.couiColorSecondNeutral));
                }
            } else if (i2 == 2) {
                this.A.setTextSize(2, 16.0f);
                this.A.setMinHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_category_text_height_large));
                this.A.setTextColor(lh2.a(getContext(), R$attr.couiColorPrimaryNeutral));
            } else {
                this.A.setTextSize(2, 14.0f);
                this.A.setMinHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_category_text_height_medium));
                this.A.setTextColor(lh2.a(getContext(), R$attr.couiColorPrimaryNeutral));
            }
            if (this.A.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
                if (this.s == 0) {
                    int marginStart = marginLayoutParams3.getMarginStart();
                    int i3 = this.t;
                    if (marginStart != i3) {
                        marginLayoutParams3.setMarginStart(i3);
                    }
                } else {
                    this.A.setLayoutParams(marginLayoutParams3);
                    int marginStart2 = marginLayoutParams3.getMarginStart();
                    int i4 = this.v;
                    if (marginStart2 != i4) {
                        marginLayoutParams3.setMarginStart(i4);
                    }
                }
                this.A.setLayoutParams(marginLayoutParams3);
                View view = preferenceViewHolder.itemView;
                view.setPadding(view.getPaddingStart(), 0, preferenceViewHolder.itemView.getPaddingEnd(), 0);
                int i5 = this.w;
                if (i5 == 0) {
                    Resources resources = getContext().getResources();
                    int i6 = R$dimen.support_preference_category_layout_title_margin_end_new;
                    marginLayoutParams3.topMargin = resources.getDimensionPixelSize(i6);
                    marginLayoutParams3.bottomMargin = getContext().getResources().getDimensionPixelSize(i6);
                } else if (i5 == 2) {
                    marginLayoutParams3.topMargin = getContext().getResources().getDimensionPixelSize(R$dimen.coui_common_category_text_padding_top_Large_style);
                    marginLayoutParams3.bottomMargin = getContext().getResources().getDimensionPixelSize(R$dimen.coui_common_category_text_padding_bottom_large_style);
                } else {
                    marginLayoutParams3.topMargin = getContext().getResources().getDimensionPixelSize(R$dimen.coui_common_category_text_padding_top_medium_style);
                    marginLayoutParams3.bottomMargin = getContext().getResources().getDimensionPixelSize(R$dimen.coui_common_category_text_padding_bottom_medium_style);
                }
                this.A.setLayoutParams(marginLayoutParams3);
            }
        }
        if (preferenceViewHolder.itemView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) preferenceViewHolder.itemView.getLayoutParams();
            int i7 = this.x;
            if (i7 == 0) {
                marginLayoutParams4.topMargin = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_category_margintop_large);
            } else if (i7 == 1) {
                marginLayoutParams4.topMargin = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_category_margintop_small);
            } else if (i7 == 2) {
                marginLayoutParams4.topMargin = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_category_margintop_zero);
            }
        }
    }

    public boolean i() {
        return false;
    }

    public void l(String str) {
        if (TextUtils.equals(str, this.o)) {
            return;
        }
        this.o = str;
        notifyChanged();
    }

    public void m(int i) {
        this.f1925j = i;
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        h(preferenceViewHolder);
        g(preferenceViewHolder);
    }

    public void setItemViewLayoutClickListener(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public void setTitleIconClickListener(View.OnClickListener onClickListener) {
        this.f1927n = onClickListener;
    }

    public void setWidgetLayoutClickListener(View.OnClickListener onClickListener) {
        this.f1926l = onClickListener;
    }
}
