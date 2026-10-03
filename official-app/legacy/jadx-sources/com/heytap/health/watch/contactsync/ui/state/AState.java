package com.heytap.health.watch.contactsync.ui.state;

import com.heytap.health.watch.contactsync.ui.bean.ContactItemBean;
import com.heytap.health.watch.contactsync.ui.model.ContactViewModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AState implements Serializable {
    protected StateContext mStateContext;

    public AState(StateContext stateContext) {
        this.mStateContext = stateContext;
    }

    public void changeState(AState aState) {
        this.mStateContext.changeState(aState);
    }

    public abstract void doAction(List<ContactItemBean> list, ContactViewModel contactViewModel);

    public boolean isEdit() {
        return this instanceof EditState;
    }

    public boolean isNormal() {
        return this instanceof NormalState;
    }
}
