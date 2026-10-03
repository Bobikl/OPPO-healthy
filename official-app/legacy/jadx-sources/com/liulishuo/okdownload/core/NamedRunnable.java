package com.liulishuo.okdownload.core;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NamedRunnable implements Runnable {
    protected final String name;

    public NamedRunnable(String str) {
        this.name = str;
    }

    public abstract void execute() throws InterruptedException;

    public abstract void finished();

    public abstract void interrupted(InterruptedException interruptedException);

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.name);
        try {
            try {
                execute();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                interrupted(e2);
            }
        } finally {
            Thread.currentThread().setName(name);
            finished();
        }
    }
}
