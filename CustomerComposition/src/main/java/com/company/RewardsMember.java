package com.company;

public class RewardsMember {

    private boolean membership;

    private String membershipId;

    public RewardsMember(boolean membership, String membershipId) {
        this.membership = membership;
        this.membershipId = membershipId;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }
}
