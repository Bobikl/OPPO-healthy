package com.oplus.aiunit.vision;

import android.util.SparseArray;
import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.Content;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class z92 extends Content {
    public SparseArray<v92> a = new SparseArray<>(15);
    public boolean b = false;

    public z92() {
        setCommands(new ArrayList());
    }

    public v92 a(int i) {
        return this.a.get(i);
    }

    public void b(int i, String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            c(i + i2, strArr[i2], str);
        }
    }

    public void c(int i, String str, String str2) {
        if (str != null) {
            v92 v92Var = new v92();
            v92Var.setCommand(str);
            v92Var.a = i;
            v92Var.setChecker(str2);
            putCommand(v92Var);
        }
    }

    public void d(String str, String str2) {
        c(0, str, str2);
    }

    @Override // com.heytap.health.wallet.bean.Content
    public boolean isValid() {
        return this.b && super.isValid();
    }

    @Override // com.heytap.health.wallet.bean.Content
    public void putCommand(Command command) {
        v92 v92Var;
        int i;
        List<Command> commands = getCommands();
        if (commands == null || command == null) {
            return;
        }
        command.setIndex(String.valueOf(commands.size()));
        commands.add(command);
        if (!(command instanceof v92) || (i = (v92Var = (v92) command).a) <= 0) {
            return;
        }
        this.a.put(i, v92Var);
    }
}
