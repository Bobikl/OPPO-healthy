package com.heytap.nearx.uikit.widget.calendar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class NearCalendarDayPagerAdapter extends PagerAdapter {
    private static final int MONTHS_IN_YEAR = 12;
    private ColorStateList mCalendarTextColor;
    private final int mCalendarViewId;
    private int mCount;
    private ColorStateList mDayHighlightColor;
    private int mDayOfWeekTextAppearance;
    private int mDaySelectorColor;
    private int mDayTextAppearance;
    private int mFirstDayOfWeek;
    private final LayoutInflater mInflater;
    private final int mLayoutResId;
    private int mMonthTextAppearance;
    private OnDaySelectedListener mOnDaySelectedListener;
    private final Calendar mMinDate = Calendar.getInstance();
    private final Calendar mMaxDate = Calendar.getInstance();
    private final SparseArray<ViewHolder> mItems = new SparseArray<>();
    private Calendar mSelectedDay = null;
    private ArrayList<NearDateMonthView> mCurrentViewList = new ArrayList<>();
    private final NearDateMonthView.OnDayClickListener mOnDayClickListener = new NearDateMonthView.OnDayClickListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarDayPagerAdapter.1
        @Override // com.heytap.nearx.uikit.widget.calendar.NearDateMonthView.OnDayClickListener
        public void onDayClick(NearDateMonthView nearDateMonthView, Calendar calendar) {
            if (calendar != null) {
                NearCalendarDayPagerAdapter.this.setSelectedDay(calendar);
                if (NearCalendarDayPagerAdapter.this.mOnDaySelectedListener != null) {
                    NearCalendarDayPagerAdapter.this.mOnDaySelectedListener.onDaySelected(NearCalendarDayPagerAdapter.this, calendar);
                }
            }
        }
    };

    public interface OnDaySelectedListener {
        void onDaySelected(NearCalendarDayPagerAdapter nearCalendarDayPagerAdapter, Calendar calendar);
    }

    public static class ViewHolder {
        public final NearDateMonthView calendar;
        public final View container;
        public final int position;

        public ViewHolder(int i, View view, NearDateMonthView nearDateMonthView) {
            this.position = i;
            this.container = view;
            this.calendar = nearDateMonthView;
        }
    }

    public NearCalendarDayPagerAdapter(@NonNull Context context, @LayoutRes int i, @IdRes int i2) {
        this.mInflater = LayoutInflater.from(context);
        this.mLayoutResId = i;
        this.mCalendarViewId = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorControlHighlight});
        this.mDayHighlightColor = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getMonthForPosition(int i) {
        return (i + this.mMinDate.get(2)) % 12;
    }

    private int getPositionForDay(Calendar calendar) {
        if (calendar == null) {
            return -1;
        }
        return ((calendar.get(1) - this.mMinDate.get(1)) * 12) + (calendar.get(2) - this.mMinDate.get(2));
    }

    private int getYearForPosition(int i) {
        return ((i + this.mMinDate.get(2)) / 12) + this.mMinDate.get(1);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(((ViewHolder) obj).container);
        this.mItems.remove(i);
    }

    public boolean getBoundsForDate(Calendar calendar, Rect rect) {
        ViewHolder viewHolder = this.mItems.get(getPositionForDay(calendar), null);
        if (viewHolder == null) {
            return false;
        }
        return viewHolder.calendar.getBoundsForDay(calendar.get(5), rect);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.mCount;
    }

    public ArrayList<NearDateMonthView> getCurrentView() {
        return this.mCurrentViewList;
    }

    public int getDayOfWeekTextAppearance() {
        return this.mDayOfWeekTextAppearance;
    }

    public int getDayTextAppearance() {
        return this.mDayTextAppearance;
    }

    public int getFirstDayOfWeek() {
        return this.mFirstDayOfWeek;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return ((ViewHolder) obj).position;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        NearDateMonthView nearDateMonthView = this.mItems.get(i).calendar;
        if (nearDateMonthView != null) {
            return nearDateMonthView.getMonthYearLabel();
        }
        return null;
    }

    public NearDateMonthView getView(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((ViewHolder) obj).calendar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        boolean z = false;
        View viewInflate = this.mInflater.inflate(this.mLayoutResId, viewGroup, false);
        NearDateMonthView nearDateMonthView = (NearDateMonthView) viewInflate.findViewById(this.mCalendarViewId);
        nearDateMonthView.setOnDayClickListener(this.mOnDayClickListener);
        nearDateMonthView.setMonthTextAppearance(this.mMonthTextAppearance);
        nearDateMonthView.setDayOfWeekTextAppearance(this.mDayOfWeekTextAppearance);
        nearDateMonthView.setDayTextAppearance(this.mDayTextAppearance);
        int i2 = this.mDaySelectorColor;
        if (i2 != 0) {
            nearDateMonthView.setDaySelectorColor(i2);
        }
        ColorStateList colorStateList = this.mDayHighlightColor;
        if (colorStateList != null) {
            nearDateMonthView.setDayHighlightColor(colorStateList);
        }
        ColorStateList colorStateList2 = this.mCalendarTextColor;
        if (colorStateList2 != null) {
            nearDateMonthView.setMonthTextColor(colorStateList2);
            nearDateMonthView.setDayOfWeekTextColor(this.mCalendarTextColor);
            nearDateMonthView.setDayTextColor(this.mCalendarTextColor);
        }
        int monthForPosition = getMonthForPosition(i);
        int yearForPosition = getYearForPosition(i);
        Calendar calendar = this.mSelectedDay;
        int i3 = (calendar == null || calendar.get(2) != monthForPosition) ? -1 : this.mSelectedDay.get(5);
        int i4 = (this.mMinDate.get(2) == monthForPosition && this.mMinDate.get(1) == yearForPosition) ? this.mMinDate.get(5) : 1;
        int i5 = (this.mMaxDate.get(2) == monthForPosition && this.mMaxDate.get(1) == yearForPosition) ? this.mMaxDate.get(5) : 31;
        int i6 = this.mFirstDayOfWeek;
        Calendar calendar2 = this.mSelectedDay;
        if (calendar2 != null && yearForPosition == calendar2.get(1)) {
            z = true;
        }
        nearDateMonthView.setMonthParams(i3, monthForPosition, yearForPosition, i6, i4, i5, z);
        ViewHolder viewHolder = new ViewHolder(i, viewInflate, nearDateMonthView);
        this.mItems.put(i, viewHolder);
        viewGroup.addView(viewInflate);
        return viewHolder;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((ViewHolder) obj).container;
    }

    public void setCalendarTextColor(ColorStateList colorStateList) {
        this.mCalendarTextColor = colorStateList;
        notifyDataSetChanged();
    }

    public void setDayOfWeekTextAppearance(int i) {
        this.mDayOfWeekTextAppearance = i;
        notifyDataSetChanged();
    }

    public void setDaySelectorColor(int i) {
        this.mDaySelectorColor = i;
        notifyDataSetChanged();
    }

    public void setDayTextAppearance(int i) {
        this.mDayTextAppearance = i;
        notifyDataSetChanged();
    }

    public void setFirstDayOfWeek(int i) {
        this.mFirstDayOfWeek = i;
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItems.valueAt(i2).calendar.setFirstDayOfWeek(i);
        }
    }

    public void setMonthTextAppearance(int i) {
        this.mMonthTextAppearance = i;
        notifyDataSetChanged();
    }

    public void setOnDaySelectedListener(OnDaySelectedListener onDaySelectedListener) {
        this.mOnDaySelectedListener = onDaySelectedListener;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        this.mCurrentViewList.clear();
        int i2 = i - 1;
        if (this.mItems.get(i2) != null && this.mItems.get(i2).calendar != null) {
            this.mCurrentViewList.add(this.mItems.get(i2).calendar);
        }
        this.mCurrentViewList.add(this.mItems.get(i).calendar);
        int i3 = i + 1;
        if (this.mItems.get(i3) == null || this.mItems.get(i3).calendar == null) {
            return;
        }
        this.mCurrentViewList.add(this.mItems.get(i3).calendar);
    }

    public void setRange(@NonNull Calendar calendar, @NonNull Calendar calendar2) {
        this.mMinDate.setTimeInMillis(calendar.getTimeInMillis());
        this.mMaxDate.setTimeInMillis(calendar2.getTimeInMillis());
        this.mCount = (this.mMaxDate.get(2) - this.mMinDate.get(2)) + ((this.mMaxDate.get(1) - this.mMinDate.get(1)) * 12) + 1;
        notifyDataSetChanged();
    }

    public void setSelectedDay(Calendar calendar) {
        ViewHolder viewHolder;
        int positionForDay = getPositionForDay(this.mSelectedDay);
        int positionForDay2 = getPositionForDay(calendar);
        if (positionForDay >= 1) {
            for (int i = positionForDay - 1; i <= positionForDay + 1; i++) {
                ViewHolder viewHolder2 = this.mItems.get(i, null);
                if (viewHolder2 != null) {
                    viewHolder2.calendar.setSelectedDay(-1, calendar.get(2), calendar.get(1));
                }
            }
        }
        if (positionForDay2 >= 0 && (viewHolder = this.mItems.get(positionForDay2, null)) != null) {
            viewHolder.calendar.setSelectedDay(calendar.get(5), calendar.get(2), calendar.get(1));
            viewHolder.calendar.setOldDay(this.mSelectedDay.get(5), this.mSelectedDay.get(2));
        }
        this.mSelectedDay = calendar;
    }

    public NearDateMonthView getView(int i) {
        if (i > this.mItems.size()) {
            return null;
        }
        return this.mItems.valueAt(i).calendar;
    }
}
