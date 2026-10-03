package com.oplus.aiunit.vision;

import com.oplus.aiunit.core.FrameUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class uy7 {
    private static final String TAG = "FrameSlot";
    private final d0 mAIContext;
    private final List<FrameUnit> mFrameUnitList = new CopyOnWriteArrayList();

    public uy7(d0 d0Var) {
        this.mAIContext = d0Var;
    }

    public int addFrameUnit(FrameUnit frameUnit) {
        if (this.mFrameUnitList.add(frameUnit)) {
            return this.mFrameUnitList.size() - 1;
        }
        return -1;
    }

    public void cleanAutoFrameUnit() {
        if (this.mAIContext == null) {
            i0.c(TAG, "ai context is null when clean existing frame unit");
            return;
        }
        for (FrameUnit frameUnit : this.mFrameUnitList) {
            if (frameUnit != null && frameUnit.isAutoClean()) {
                this.mAIContext.freeFrameUnit(frameUnit);
            }
        }
    }

    public void cleanExistFrameUnit() {
        if (this.mAIContext == null) {
            i0.c(TAG, "ai context is null when clean existing frame unit");
            return;
        }
        Iterator<FrameUnit> it = this.mFrameUnitList.iterator();
        while (it.hasNext()) {
            this.mAIContext.freeFrameUnit(it.next());
        }
        this.mFrameUnitList.clear();
    }

    public List<FrameUnit> findFragmentChildList(FrameUnit frameUnit) {
        if (frameUnit == null) {
            i0.a(TAG, "find fragment parent unit failed. unit is null.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FrameUnit frameUnit2 : this.mFrameUnitList) {
            if (frameUnit2.isFragment() && frameUnit2.getUUID() != null && frameUnit2.getUUID().equals(frameUnit.getUUID())) {
                arrayList.add(frameUnit2);
            }
        }
        return arrayList;
    }

    public FrameUnit findFragmentParent(FrameUnit frameUnit) {
        if (frameUnit == null) {
            i0.a(TAG, "find fragment parent unit failed. unit is null.");
            return null;
        }
        for (FrameUnit frameUnit2 : this.mFrameUnitList) {
            if (frameUnit2.isFragmentParent() && frameUnit2.getUUID() != null && frameUnit2.getUUID().equals(frameUnit.getUUID())) {
                return frameUnit2;
            }
        }
        return null;
    }

    public FrameUnit findFrameUnitByTag(String str) {
        for (FrameUnit frameUnit : this.mFrameUnitList) {
            if (Objects.equals(frameUnit.getTag(), str)) {
                return frameUnit;
            }
        }
        return null;
    }

    public d0 getAIContext() {
        return this.mAIContext;
    }

    public int getFrameListSize() {
        return this.mFrameUnitList.size();
    }

    public FrameUnit getFrameUnit(int i) {
        if (this.mFrameUnitList.size() <= i) {
            return null;
        }
        return this.mFrameUnitList.get(i);
    }

    public void removeFrameUnit(String str) {
        if (str == null) {
            return;
        }
        FrameUnit frameUnit = null;
        for (FrameUnit frameUnit2 : this.mFrameUnitList) {
            if (str.equals(frameUnit2.getTag())) {
                frameUnit = frameUnit2;
            }
        }
        if (frameUnit != null) {
            d0 d0Var = this.mAIContext;
            if (d0Var != null) {
                d0Var.freeFrameUnit(frameUnit);
            }
            this.mFrameUnitList.remove(frameUnit);
        }
    }
}
