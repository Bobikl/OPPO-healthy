package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Command {
    private String checker;
    private String command;
    private String index;
    private String result;

    public Command() {
    }

    public String getChecker() {
        return this.checker;
    }

    public String getCommand() {
        return this.command;
    }

    public String getIndex() {
        return this.index;
    }

    public String getResult() {
        return this.result;
    }

    public void setChecker(String str) {
        this.checker = str;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public String toString() {
        return "Command{, command='" + this.command + "', index='" + this.index + "', result='" + this.result + "', checker='" + this.checker + "'}";
    }

    public Command(String str) {
        this(str, null);
    }

    public Command(String str, String str2) {
        this.command = str;
        this.checker = str2;
    }
}
