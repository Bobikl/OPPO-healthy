package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Content {
    private List<Command> commands;
    private Boolean succeed;

    public List<Command> getCommands() {
        return this.commands;
    }

    public Boolean getSucceed() {
        return this.succeed;
    }

    public boolean isEmpty() {
        List<Command> list = this.commands;
        return list == null || list.size() <= 0;
    }

    public boolean isValid() {
        List<Command> list = this.commands;
        return list != null && list.size() > 0;
    }

    public void putCommand(Command command) {
        if (this.commands == null) {
            this.commands = new ArrayList();
        }
        this.commands.add(command);
    }

    public void setCommands(List<Command> list) {
        this.commands = list;
    }

    public void setSucceed(Boolean bool) {
        this.succeed = bool;
    }

    public String toString() {
        return "Content{commands=" + this.commands + ", succeed=" + this.succeed + '}';
    }
}
