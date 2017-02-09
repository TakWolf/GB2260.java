package com.takwolf.gb2260;

public final class Division {

    private final GB2260 gb2260;
    private final String code;
    private final String name;

    protected Division(GB2260 gb2260, String code, String name) {
        this.gb2260 = gb2260;
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Revision getRevision() {
        return gb2260.getRevision();
    }

}