package com.leetcode.problem278.firstbadversion;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<Boolean> versions = new ArrayList<Boolean>();

    protected boolean isBadVersion(int n) {
        return versions.get(n - 1);
    }

    public List<Boolean> getVersions() {
        return versions;
    }

    public void setVersions(List<Boolean> versions) {
        this.versions = versions;
    }
}
