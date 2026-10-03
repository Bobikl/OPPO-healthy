package com.heytap.log.config;

import com.heytap.log.dto.TraceConfigDto;

/* JADX INFO: loaded from: classes19.dex */
public class TraceConfigBuilder {
    private int console;
    private int level;
    private int maxLogSize;

    public TraceConfigDto build() {
        TraceConfigDto traceConfigDto = new TraceConfigDto();
        traceConfigDto.setLevel(this.level);
        traceConfigDto.setConsole(this.console);
        return traceConfigDto;
    }

    public int getConsole() {
        return this.console;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMaxLogSize() {
        return this.maxLogSize;
    }

    public TraceConfigBuilder setConsole(int i) {
        this.console = i;
        return this;
    }

    public TraceConfigBuilder setLevel(int i) {
        this.level = i;
        return this;
    }

    public TraceConfigBuilder setMaxLogSize(int i) {
        this.maxLogSize = i;
        return this;
    }
}
