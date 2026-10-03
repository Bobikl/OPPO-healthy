package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.uiutil.AnimLevel;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.fh2;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.qne;
import com.oplus.aiunit.vision.uoe;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.preference.R$attr;
import com.support.preference.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMenuPreference extends COUIPreference {
    public final AdapterView.OnItemClickListener Q;
    public CharSequence[] R;
    public CharSequence[] S;
    public int[] T;
    public String U;
    public String V;
    public boolean W;
    public ArrayList<qne> X;
    public fh2 Y;
    public boolean Z;
    public uoe.c a0;
    public ColorStateList b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public AnimLevel f0;
    public int g0;
    public boolean h0;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @SensorsDataInstrumented
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
            if (COUIMenuPreference.this.R != null && i < COUIMenuPreference.this.R.length && i >= 0) {
                COUIMenuPreference cOUIMenuPreference = COUIMenuPreference.this;
                if (cOUIMenuPreference.callChangeListener(cOUIMenuPreference.R[i].toString())) {
                    COUIMenuPreference cOUIMenuPreference2 = COUIMenuPreference.this;
                    cOUIMenuPreference2.setValue(cOUIMenuPreference2.R[i].toString());
                }
            } else if (COUIMenuPreference.this.R == null) {
                bj2.c("COUIMenuPreference", "OnItemClick, mEntryValues is null");
            } else {
                bj2.c("COUIMenuPreference", "OnItemClick, position is error:" + i + ",length:" + COUIMenuPreference.this.R.length);
            }
            COUIMenuPreference.this.Y.c();
            SensorsDataAutoTrackHelper.trackListView(adapterView, view, i);
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ PreferenceViewHolder i;

        public b(PreferenceViewHolder preferenceViewHolder) {
            this.i = preferenceViewHolder;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.i.itemView.removeOnAttachStateChangeListener(this);
            if (COUIMenuPreference.this.Y == null || !COUIMenuPreference.this.Y.d().isShowing()) {
                return;
            }
            COUIMenuPreference.this.Y.d().dismiss();
        }
    }

    public COUIMenuPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public int findIndexOfValue(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.R) == null) {
            return 0;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (!TextUtils.isEmpty(this.R[length]) && this.R[length].equals(str)) {
                return length;
            }
        }
        return 0;
    }

    @Override // androidx.preference.Preference
    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        String value = getValue();
        CharSequence summary = super.getSummary();
        String str = this.V;
        if (str == null) {
            return summary;
        }
        Object[] objArr = new Object[1];
        if (value == null) {
            value = "";
        }
        objArr[0] = value;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, summary)) {
            return summary;
        }
        Log.w("COUIMenuPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    public String getValue() {
        return this.U;
    }

    public void n(boolean z) {
        this.Z = z;
        fh2 fh2Var = this.Y;
        if (fh2Var != null) {
            fh2Var.h(z);
        }
    }

    public void o(boolean z) {
        this.h0 = z;
        fh2 fh2Var = this.Y;
        if (fh2Var != null) {
            fh2Var.d().g0(z);
        }
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        if (this.Y == null) {
            this.Y = new fh2(getContext(), preferenceViewHolder.itemView);
        }
        o(this.h0);
        this.Y.d().t0(this.e0, this.f0);
        this.Y.d().setInputMethodMode(this.g0);
        ColorStateList colorStateList = this.b0;
        if (colorStateList != null) {
            this.Y.f(preferenceViewHolder.itemView, this.X, colorStateList.getDefaultColor());
        } else {
            this.Y.e(preferenceViewHolder.itemView, this.X);
        }
        this.Y.g(this.c0);
        this.Y.h(this.Z);
        uoe.c cVar = this.a0;
        if (cVar != null) {
            this.Y.setOnPreciseClickListener(cVar);
        }
        this.Y.setOnItemClickListener(this.Q);
        this.Y.i(this.d0);
        preferenceViewHolder.itemView.addOnAttachStateChangeListener(new b(preferenceViewHolder));
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.W) {
            return;
        }
        setValue(savedState.mValue);
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.mValue = getValue();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        setValue(getPersistedString((String) obj));
    }

    @Override // androidx.preference.Preference
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        n(z);
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        this.S = charSequenceArr;
        this.W = false;
        if (charSequenceArr == null || charSequenceArr.length <= 0) {
            return;
        }
        this.X.clear();
        qne.a aVar = new qne.a();
        for (int i = 0; i < charSequenceArr.length; i++) {
            qne.a aVarI = aVar.y().I((String) charSequenceArr[i]);
            int[] iArr = this.T;
            aVarI.A(iArr != null ? iArr[i] : -1);
            this.X.add(aVar.x());
        }
    }

    public void setEntryValues(CharSequence[] charSequenceArr) {
        this.R = charSequenceArr;
        this.W = false;
        if (this.S != null || charSequenceArr == null || charSequenceArr.length <= 0) {
            return;
        }
        this.X.clear();
        qne.a aVar = new qne.a();
        for (int i = 0; i < charSequenceArr.length; i++) {
            qne.a aVarI = aVar.y().I((String) charSequenceArr[i]);
            int[] iArr = this.T;
            aVarI.A(iArr != null ? iArr[i] : -1);
            this.X.add(aVar.x());
        }
    }

    @Override // com.coui.appcompat.preference.COUIPreference
    public void setOnPreciseClickListener(uoe.c cVar) {
        this.a0 = cVar;
    }

    @Override // androidx.preference.Preference
    public void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null && this.V != null) {
            this.V = null;
        } else {
            if (charSequence == null || charSequence.equals(this.V)) {
                return;
            }
            this.V = charSequence.toString();
        }
    }

    public void setValue(String str) {
        if ((!TextUtils.equals(this.U, str)) || !this.W) {
            this.U = str;
            this.W = true;
            if (this.X.size() > 0 && !TextUtils.isEmpty(str)) {
                for (int i = 0; i < this.X.size(); i++) {
                    qne qneVar = this.X.get(i);
                    String strS = qneVar.s();
                    CharSequence[] charSequenceArr = this.S;
                    if (TextUtils.equals(strS, charSequenceArr != null ? charSequenceArr[findIndexOfValue(str)] : str)) {
                        qneVar.z(true);
                    } else {
                        qneVar.z(false);
                    }
                }
            }
            persistString(str);
            notifyChanged();
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String mValue;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mValue = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mValue);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public COUIMenuPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Q = new a();
        this.X = new ArrayList<>();
        this.Z = true;
        this.c0 = true;
        this.d0 = -1;
        this.e0 = false;
        this.f0 = ifk.ANIM_LEVEL_SUPPORT_BLUR_MIN;
        this.h0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIMenuPreference, i, 0);
        int i3 = R$styleable.COUIMenuPreference_android_entryValues;
        this.R = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, i3, i3);
        int i4 = R$styleable.COUIMenuPreference_android_entries;
        this.S = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, i4, i4);
        this.d0 = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIMenuPreference_maxShowItemCount, -1);
        this.g0 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIMenuPreference_popInputMethod, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIMenuPreference_groupIds, 0);
        if (resourceId != 0) {
            this.T = context.getResources().getIntArray(resourceId);
        }
        this.U = typedArrayObtainStyledAttributes.getString(R$styleable.COUIMenuPreference_android_value);
        typedArrayObtainStyledAttributes.recycle();
        setEntryValues(this.R);
        setEntries(this.S);
        setValue(this.U);
    }

    public COUIMenuPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiMenuPreferenceStyle);
    }

    public COUIMenuPreference(Context context) {
        this(context, null);
    }
}
