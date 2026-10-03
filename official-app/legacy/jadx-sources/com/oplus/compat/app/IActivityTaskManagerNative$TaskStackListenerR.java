package com.oplus.compat.app;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.IBinder;
import com.oplus.aiunit.vision.az9;

/* JADX INFO: loaded from: classes4.dex */
class IActivityTaskManagerNative$TaskStackListenerR extends ITaskStackListenerR.Stub {
    private final az9 mListenerNative;

    public IActivityTaskManagerNative$TaskStackListenerR(az9 az9Var) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityDismissingDockedStack() {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityForcedResizable(String str, int i, int i2) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityLaunchOnSecondaryDisplayFailed(ActivityManager.RunningTaskInfo runningTaskInfo, int i) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityLaunchOnSecondaryDisplayRerouted(ActivityManager.RunningTaskInfo runningTaskInfo, int i) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityPinned(String str, int i, int i2, int i3) {
        throw null;
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityRequestedOrientationChanged(int i, int i2) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityRestartAttempt(ActivityManager.RunningTaskInfo runningTaskInfo, boolean z, boolean z2, boolean z3) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityRotation(int i) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onActivityUnpinned() {
        throw null;
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onBackPressedOnTaskRoot(ActivityManager.RunningTaskInfo runningTaskInfo) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onRecentTaskListFrozenChanged(boolean z) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onRecentTaskListUpdated() {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onSingleTaskDisplayDrawn(int i) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onSingleTaskDisplayEmpty(int i) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onSizeCompatModeActivityChanged(int i, IBinder iBinder) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskCreated(int i, ComponentName componentName) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskDescriptionChanged(ActivityManager.RunningTaskInfo runningTaskInfo) {
        throw null;
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskDisplayChanged(int i, int i2) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskFocusChanged(int i, boolean z) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskMovedToFront(ActivityManager.RunningTaskInfo runningTaskInfo) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskProfileLocked(int i, int i2) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskRemovalStarted(ActivityManager.RunningTaskInfo runningTaskInfo) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskRemoved(int i) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskRequestedOrientationChanged(int i, int i2) {
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskSnapshotChanged(int i, TaskSnapshotNative taskSnapshotNative) {
        throw null;
    }

    @Override // com.oplus.compat.app.ITaskStackListenerR
    public void onTaskStackChanged() {
    }
}
