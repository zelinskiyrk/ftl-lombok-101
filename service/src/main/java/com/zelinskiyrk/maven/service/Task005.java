package com.zelinskiyrk.maven.service;

import lombok.Cleanup;

import java.io.*;

public class Task005 {
    public static class CleanupExample {
        public static void run () throws IOException {
            @Cleanup InputStream in = new FileInputStream("FileIn.txt");
            @Cleanup OutputStream out = new FileOutputStream("FileOut.txt");
            byte[] b = new byte[10000];
            while (true) {
                int r = in.read(b);
                if (r == -1) break;
                out.write(b, 0, r);
            }
        }
    }
}
