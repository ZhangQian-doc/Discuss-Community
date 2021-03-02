package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "d:/Download/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.gamersky.com d:/firstmaven/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
