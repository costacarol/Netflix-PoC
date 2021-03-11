package com.example.feignpoc;

import com.netflix.appinfo.DataCenterInfo;

public class DefaultDataCenterInfo implements DataCenterInfo {
    private final Name name;

    private DefaultDataCenterInfo(Name name) {
        this.name = name;
    }

    @Override
    public Name getName() {
        return name;
    }

    public static DataCenterInfo myOwn() {
        return new DefaultDataCenterInfo(Name.MyOwn);
    }
}

