package com.platform.usercenter.bizuws.executor.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class DialogParam implements Parcelable {
    public static final Parcelable.Creator<DialogParam> CREATOR = new Parcelable.Creator<DialogParam>() { // from class: com.platform.usercenter.bizuws.executor.dialog.DialogParam.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DialogParam createFromParcel(Parcel parcel) {
            return new DialogParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DialogParam[] newArray(int i) {
            return new DialogParam[i];
        }
    };
    private String message;
    private String negativeBtnText;
    private String neutralBtnText;
    private String positiveBtnText;
    private String title;
    private boolean isBackCancel = true;
    private boolean isOutsideCancel = true;
    private boolean isDragCancel = true;
    private boolean isShowDragView = true;

    public DialogParam() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    public String getNeutralBtnText() {
        return this.neutralBtnText;
    }

    public String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isBackCancel() {
        return this.isBackCancel;
    }

    public boolean isDragCancel() {
        return this.isDragCancel;
    }

    public boolean isOutsideCancel() {
        return this.isOutsideCancel;
    }

    public boolean isShowDragView() {
        return this.isShowDragView;
    }

    public void setBackCancel(boolean z) {
        this.isBackCancel = z;
    }

    public void setDragCancel(boolean z) {
        this.isDragCancel = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setNegativeBtnText(String str) {
        this.negativeBtnText = str;
    }

    public void setNeutralBtnText(String str) {
        this.neutralBtnText = str;
    }

    public void setOutsideCancel(boolean z) {
        this.isOutsideCancel = z;
    }

    public void setPositiveBtnText(String str) {
        this.positiveBtnText = str;
    }

    public void setShowDragView(boolean z) {
        this.isShowDragView = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public DialogParam(Parcel parcel) {
    }
}
