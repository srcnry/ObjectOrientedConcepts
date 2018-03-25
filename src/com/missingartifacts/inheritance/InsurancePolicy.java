package com.missingartifacts.inheritance;

public class InsurancePolicy {

    private long clientId;
    private long issueNum;

    public InsurancePolicy(long clientId, long issueNum) {
        this.clientId = clientId;
        this.issueNum = issueNum;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(long issueNum) {
        this.issueNum = issueNum;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "clientId=" + clientId +
                ", issueNum=" + issueNum +
                '}';
    }
}
