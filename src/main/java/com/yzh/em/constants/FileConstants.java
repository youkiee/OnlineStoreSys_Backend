package com.yzh.em.constants;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * 文件相关常量
 *
 */
public class FileConstants {

    /**
     * 上次文件存储位置
     */
    public static final String FileFolderPath = System.getProperty("user.dir") + "/file/";
//    public static final String FileFolderPath;

//    static {
//        try {
//            FileFolderPath = new ClassPathResource("file").getFile().getPath() + "/";
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    /**
     * 上传头像存储位置
     */
    public static final String AvatarFolderPath = System.getProperty("user.dir") + "/avatar/";
//    public static final String AvatarFolderPath;

//    static {
//        try {
//            AvatarFolderPath = new ClassPathResource("avatar").getFile().getPath() + "/";
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    static {
        System.out.println(FileFolderPath);
        System.out.println(AvatarFolderPath);
    }


}

  