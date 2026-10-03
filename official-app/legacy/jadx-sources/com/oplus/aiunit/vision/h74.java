package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.network.script.params.ScriptRltVo;
import com.heytap.health.wallet.network.script.rsp.CommandObject;
import com.heytap.health.wallet.network.script.rsp.ScriptVo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class h74 {
    public static ScriptRltVo a(Content content) {
        if (content == null) {
            return null;
        }
        ScriptRltVo scriptRltVo = new ScriptRltVo(content.getSucceed().booleanValue());
        ArrayList arrayList = new ArrayList();
        for (Command command : content.getCommands()) {
            CommandObject commandObject = new CommandObject(String.valueOf(command.getIndex()), command.getCommand(), command.getChecker(), command.getResult());
            t6b.a("buildCommandResultForNewReq add CommandObject = " + commandObject);
            arrayList.add(commandObject);
        }
        scriptRltVo.setResults(arrayList);
        return scriptRltVo;
    }

    public static Content b(ScriptVo scriptVo) {
        Content content = new Content();
        if (scriptVo != null) {
            List<CommandObject> commands = scriptVo.getCommands();
            if (!drk.e(commands)) {
                ArrayList arrayList = new ArrayList();
                for (CommandObject commandObject : commands) {
                    Command command = new Command();
                    command.setCommand(commandObject.getCommand());
                    command.setIndex(commandObject.getIndex());
                    command.setChecker(commandObject.getChecker());
                    arrayList.add(command);
                }
                content.setCommands(arrayList);
            }
        }
        return content;
    }

    public static Content c(ScriptVo scriptVo) {
        Content content = new Content();
        if (scriptVo != null) {
            ArrayList arrayList = new ArrayList();
            List<CommandObject> commands = scriptVo.getCommands();
            if (commands != null) {
                for (CommandObject commandObject : commands) {
                    Command command = new Command();
                    command.setIndex(commandObject.getIndex());
                    command.setChecker(commandObject.getChecker());
                    command.setCommand(commandObject.getCommand());
                    arrayList.add(command);
                }
            }
            content.setCommands(arrayList);
        }
        return content;
    }
}
