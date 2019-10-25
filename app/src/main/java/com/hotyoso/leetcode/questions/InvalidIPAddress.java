package com.hotyoso.leetcode.questions;

/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * <p>
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 */
public class InvalidIPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("//.", "[.]");
    }

    public String defangIPaddr2(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                stringBuilder.append("[.]");
            } else {
                stringBuilder.append(c);
            }

        }
        return stringBuilder.toString();
    }
}
