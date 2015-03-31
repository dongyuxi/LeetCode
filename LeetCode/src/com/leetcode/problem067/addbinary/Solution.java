package com.leetcode.problem067.addbinary;

/**
 * Given two binary strings, return their sum (also a binary string).
 * 
 * For example, a = "11" b = "1" Return "100".
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public String addBinary(String a, String b) {
        if (null == a && null == b) {
            return "";
        }
        if (null == a) {
            return b;
        }
        if (null == b) {
            return a;
        }

        int indexa = a.length() - 1;
        int indexb = b.length() - 1;
        boolean add = false;
        StringBuilder sb = new StringBuilder();
        while (indexa >= 0 || indexb >= 0) {
            int sum = 0;
            if (indexa >= 0) {
                sum += a.charAt(indexa) - '0';
            }
            if (indexb >= 0) {
                sum += b.charAt(indexb) - '0';
            }
            if (add) {
                sum += 1;
            }
            add = (sum / 2 > 0) ? true : false;
            sb.append(sum % 2);
            indexa--;
            indexb--;
        }
        if (add) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}