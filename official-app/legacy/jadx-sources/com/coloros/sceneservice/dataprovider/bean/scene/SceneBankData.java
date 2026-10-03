package com.coloros.sceneservice.dataprovider.bean.scene;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.coloros.sceneservice.d.a;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class SceneBankData extends SceneData {
    public static final Parcelable.Creator CREATOR = new a();
    public static final String KEY_ACCOUNT = "Account";
    public static final String KEY_ACCOUNT_BALANCE = "AccountBalance";
    public static final String KEY_ARREARS_MONEY = "ArrearsMoney";
    public static final String KEY_AVAILABLE_STAGE_AMOUNT = "AvailableStageAmount";
    public static final String KEY_BANK_CARD_TYPE = "BankCardType";
    public static final String KEY_BILL_MONEY = "BillMoney";
    public static final String KEY_BILL_TIME = "BillTime";
    public static final String KEY_CAN_STAGE_NUM = "CanStageNum";
    public static final String KEY_CURRENT_BILL_OVERDRAFT = "CurrentBillOverdraft";
    public static final String KEY_CURRENT_NUM = "CurrentNum";
    public static final String KEY_DEAD_LINE = "DeadLine";
    public static final String KEY_DEAL_MONEY = "DealMoney";
    public static final String KEY_DEAL_TIME = "DealTime";
    public static final String KEY_DEAL_TYPE = "DealType";
    public static final String KEY_DUE_DAY = "DueDay";
    public static final String KEY_EACH_PRINCIPLE = "EachPrinciple";
    public static final String KEY_EACH_REPAY = "EachRepay";
    public static final String KEY_FIRST_COUNTER_FEE = "FirstCounterFee";
    public static final String KEY_FIRST_PRINCIPLE = "FirstPrinciple";
    public static final String KEY_FIRST_STAGE_REPAY = "FirstStageRepay";
    public static final String KEY_INTEREST_MONEY = "InterestMoney";
    public static final String KEY_LATE_TIME = "LateTime";
    public static final String KEY_LOAN_MONEY = "LoanMoney";
    public static final String KEY_MIN_REPAY = "MinRepay";
    public static final String KEY_MONTH = "Month";
    public static final String KEY_NEED_SAVE_UP = "NeedSaveUp";
    public static final String KEY_NO_BILL = "NoBill";
    public static final String KEY_OVERDUE_AMOUNT = "OverdueAmount";
    public static final String KEY_RATE = "Rate";
    public static final String KEY_REMAIN_MIN_REPAY = "RemainMinRepay";
    public static final String KEY_REMAIN_REPAY = "RemainRepay";
    public static final String KEY_SMS_BODY = "SmsBody";
    public static final String KEY_STAGE_AMOUNT = "StageAmount";
    public static final String KEY_STAGE_COUNTER_FEE = "StageCounterFee";
    public static final String KEY_STAGE_NUM = "StageNum";
    public static final String KEY_STAGE_TIME = "StageTime";
    public static final String KEY_TITLE = "Title";
    public static final String KEY_TOTAL_COUNTER_FEE = "TotalCounterFee";
    public static final String KEY_TOTAL_COUNTER_RATE = "TotalCounterRate";
    public static final String TAG = "SceneBankData";

    public SceneBankData() {
        setType(64);
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public String getDefaultMatchKey() {
        return null;
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public boolean isValid() {
        return (TextUtils.isEmpty(this.mContent.getString(KEY_BILL_MONEY)) && TextUtils.isEmpty(this.mContent.getString(KEY_ARREARS_MONEY)) && TextUtils.isEmpty(this.mContent.getString(KEY_DEAL_MONEY)) && TextUtils.isEmpty(this.mContent.getString(KEY_LOAN_MONEY))) ? false : true;
    }

    public void setAccount(String str) {
        this.mContent.putString(KEY_ACCOUNT, str);
    }

    public void setAccountBalance(String str) {
        this.mContent.putString(KEY_ACCOUNT_BALANCE, str);
    }

    public void setArrearsMoney(String str) {
        this.mContent.putString(KEY_ARREARS_MONEY, str);
    }

    public void setAvailableStageAmount(String str) {
        this.mContent.putString(KEY_AVAILABLE_STAGE_AMOUNT, str);
    }

    public void setBankCardType(String str) {
        this.mContent.putString(KEY_BANK_CARD_TYPE, str);
    }

    public void setBillMoney(String str) {
        this.mContent.putString(KEY_BILL_MONEY, str);
    }

    public void setBillTime(String str) {
        this.mContent.putString(KEY_BILL_TIME, str);
    }

    public void setCanStageNum(String str) {
        this.mContent.putString(KEY_CAN_STAGE_NUM, str);
    }

    public void setCurrentBillOverdraft(String str) {
        this.mContent.putString(KEY_CURRENT_BILL_OVERDRAFT, str);
    }

    public void setCurrentNum(String str) {
        this.mContent.putString(KEY_CURRENT_NUM, str);
    }

    public void setDeadLine(String str) {
        this.mContent.putString(KEY_DEAD_LINE, str);
    }

    public void setDealMoney(String str) {
        this.mContent.putString(KEY_DEAL_MONEY, str);
    }

    public void setDealTime(String str) {
        this.mContent.putString(KEY_DEAL_TIME, str);
    }

    public void setDealType(String str) {
        this.mContent.putString(KEY_DEAL_TYPE, str);
    }

    public void setDueDay(String str) {
        this.mContent.putString(KEY_DUE_DAY, str);
    }

    public void setEachPrinciple(String str) {
        this.mContent.putString(KEY_EACH_PRINCIPLE, str);
    }

    public void setEachRepay(String str) {
        this.mContent.putString(KEY_EACH_REPAY, str);
    }

    public void setFirstCounterFee(String str) {
        this.mContent.putString(KEY_FIRST_COUNTER_FEE, str);
    }

    public void setFirstPrinciple(String str) {
        this.mContent.putString(KEY_FIRST_PRINCIPLE, str);
    }

    public void setFirstStageRepay(String str) {
        this.mContent.putString(KEY_FIRST_STAGE_REPAY, str);
    }

    public void setInterestMoney(String str) {
        this.mContent.putString(KEY_INTEREST_MONEY, str);
    }

    public void setLateTime(String str) {
        this.mContent.putString(KEY_LATE_TIME, str);
    }

    public void setLoanMoney(String str) {
        this.mContent.putString(KEY_LOAN_MONEY, str);
    }

    public void setMinRepay(String str) {
        this.mContent.putString(KEY_MIN_REPAY, str);
    }

    public void setMonth(String str) {
        this.mContent.putString(KEY_MONTH, str);
    }

    public void setNeedSaveUp(String str) {
        this.mContent.putString(KEY_NEED_SAVE_UP, str);
    }

    public void setNoBill(String str) {
        this.mContent.putString(KEY_NO_BILL, str);
    }

    public void setOverdueAmount(String str) {
        this.mContent.putString(KEY_OVERDUE_AMOUNT, str);
    }

    public void setRate(String str) {
        this.mContent.putString(KEY_RATE, str);
    }

    public void setRemainMinRepay(String str) {
        this.mContent.putString(KEY_REMAIN_MIN_REPAY, str);
    }

    public void setRemainRepay(String str) {
        this.mContent.putString(KEY_REMAIN_REPAY, str);
    }

    public void setSmsBody(String str) {
        this.mContent.putString(KEY_SMS_BODY, str);
    }

    public void setStageAmount(String str) {
        this.mContent.putString(KEY_STAGE_AMOUNT, str);
    }

    public void setStageCounterFee(String str) {
        this.mContent.putString(KEY_STAGE_COUNTER_FEE, str);
    }

    public void setStageNum(String str) {
        this.mContent.putString(KEY_STAGE_NUM, str);
    }

    public void setStageTime(String str) {
        this.mContent.putString(KEY_STAGE_TIME, str);
    }

    public void setTitle(String str) {
        this.mContent.putString(KEY_TITLE, String.valueOf(str));
    }

    public void setTotalCounterFee(String str) {
        this.mContent.putString(KEY_TOTAL_COUNTER_FEE, str);
    }

    public void setTotalCounterRate(String str) {
        this.mContent.putString(KEY_TOTAL_COUNTER_RATE, str);
    }

    public SceneBankData(Parcel parcel) {
        super(parcel);
    }
}
