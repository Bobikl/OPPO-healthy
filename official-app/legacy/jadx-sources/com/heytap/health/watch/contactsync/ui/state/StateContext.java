package com.heytap.health.watch.contactsync.ui.state;

import com.heytap.health.watch.contactsync.ui.bean.ContactItemBean;
import com.heytap.health.watch.contactsync.ui.model.ContactViewModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class StateContext implements Serializable {
    private AState mCurrState;
    private final EditState mDoneState;
    private final NormalState mNormalState;

    public StateContext() {
        NormalState normalState = new NormalState(this);
        this.mNormalState = normalState;
        this.mDoneState = new EditState(this);
        this.mCurrState = normalState;
    }

    public void changeState(AState aState) {
        this.mCurrState = aState;
    }

    public void complete() {
        this.mCurrState = this.mNormalState;
    }

    public void doAction(List<ContactItemBean> list, ContactViewModel contactViewModel) {
        this.mCurrState.doAction(list, contactViewModel);
    }

    public AState getCurrState() {
        return this.mCurrState;
    }

    public EditState getDoneState() {
        return this.mDoneState;
    }

    public NormalState getNormalState() {
        return this.mNormalState;
    }
}
