package org.example;

public class MembershipLevel implements Comparable<MembershipLevel> { // to make a priority list, i had to call up the logic which is implements Comparable<>
    private Integer orderId;
    private String memberName;
    private String memberStatus;
    private double amount;
    private int requestDate;

    public MembershipLevel(Integer orderId, String memberName, String memberStatus, double amount, int requestDate) {
        this.orderId = orderId;
        this.memberName = memberName;
        this.memberStatus = memberStatus;
        this.amount = amount;
        this.requestDate = requestDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public int getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(int requestDate) {
        this.requestDate = requestDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MembershipLevel{" +
                "orderId=" + orderId +
                ", memberName='" + memberName + '\'' +
                ", memberStatus='" + memberStatus + '\'' +
                ", amount=" + amount +
                ", requestDate=" + requestDate +
                '}';
    }

    @Override
    public int compareTo(MembershipLevel o) {
//        return o.requestDate > this.requestDate ? 1 : -1;
        if (o.requestDate > this.requestDate) {
            return 1;
        } else {
            return -1;
        }

    }

}
