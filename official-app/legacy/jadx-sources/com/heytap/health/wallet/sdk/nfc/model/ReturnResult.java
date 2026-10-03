package com.heytap.health.wallet.sdk.nfc.model;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ReturnResult {
    public int resultCode;
    public String resultMsg;

    @Keep
    public static class CardInfo {
        public int balance;
        public String cardNo;
        public boolean isDefault;
        public String logicCardNo;
        public String registerId;
        public List<TransRecord> transRecords;
        public String validateDate;

        public int getBalance() {
            return this.balance;
        }

        public String getCardNo() {
            return this.cardNo;
        }

        public String getLogicCardNo() {
            return this.logicCardNo;
        }

        public String getRegisterId() {
            return this.registerId;
        }

        public List<TransRecord> getTransRecords() {
            return this.transRecords;
        }

        public String getValidateDate() {
            return this.validateDate;
        }

        public void setBalance(int i) {
            this.balance = i;
        }

        public void setCardNo(String str) {
            this.cardNo = str;
        }

        public void setLogicCardNo(String str) {
            this.logicCardNo = str;
        }

        public void setRegisterId(String str) {
            this.registerId = str;
        }

        public void setTransRecords(List<TransRecord> list) {
            this.transRecords = list;
        }

        public void setValidateDate(String str) {
            this.validateDate = str;
        }
    }

    @Keep
    public static class CplcInfo {
        public String cplc;
        public String seid;
        public long walletVersionCode;
    }

    @Keep
    public static class InnerData {
        public String errorCode;
        public String errorMsg;

        public String getErrorCode() {
            return this.errorCode;
        }

        public String getErrorMsg() {
            return this.errorMsg;
        }

        public void setErrorCode(String str) {
            this.errorCode = str;
        }

        public void setErrorMsg(String str) {
            this.errorMsg = str;
        }
    }

    @Keep
    public static class ReurnDataResult<T> extends ReturnResult {
        public T data;

        public T getData() {
            return this.data;
        }

        public void setData(T t) {
            this.data = t;
        }
    }

    @Keep
    public static class TaskProgress {
        public String taskName;
        public int taskType;

        public TaskProgress() {
        }

        public String getTaskName() {
            return this.taskName;
        }

        public int getTaskType() {
            return this.taskType;
        }

        public void setTaskName(String str) {
            this.taskName = str;
        }

        public void setTaskType(int i) {
            this.taskType = i;
        }

        public TaskProgress(int i, String str) {
            this.taskType = i;
            this.taskName = str;
        }
    }

    @Keep
    public static class TransRecord {
        public int transAmount;
        public String transDate;
        public int transType;

        public int getTransAmount() {
            return this.transAmount;
        }

        public String getTransDate() {
            return this.transDate;
        }

        public int getTransType() {
            return this.transType;
        }

        public void setTransAmount(int i) {
            this.transAmount = i;
        }

        public void setTransDate(String str) {
            this.transDate = str;
        }

        public void setTransType(int i) {
            this.transType = i;
        }
    }

    public ReturnResult() {
        this.resultCode = 0;
    }

    public boolean checkSuc() {
        return this.resultCode == 0;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setResultMsg(String str) {
        this.resultMsg = str;
    }

    public ReturnResult(int i) {
        this.resultCode = i;
    }
}
