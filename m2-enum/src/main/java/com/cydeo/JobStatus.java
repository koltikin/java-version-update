package com.cydeo;

public enum JobStatus {
    WAIT("wait"),START("start"),INPROGRESS("in progress"),DONE("done");

    private String value;

    JobStatus(String value) {
        this.value = value;
    }

    JobStatus() {
    }

    public String getValue() {
        return value;
    }
}
