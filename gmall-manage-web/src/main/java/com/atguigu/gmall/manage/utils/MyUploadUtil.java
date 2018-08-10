package com.atguigu.gmall.manage.utils;

import com.atguigu.gmall.manage.GmallManageWebApplication;
import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @deprecated 图片上传工具类
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.manage.utils
 * @className MyUploadUtil
 * @Date 2018/8/9 - 14:21
 */
public class MyUploadUtil {

    public static String uploadImage(MultipartFile file){
        // 配置fdfs的全局信息
        String path = GmallManageWebApplication.class.getClassLoader().getResource("tracker.conf").getFile();
        try {
            ClientGlobal.init(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }

        // 获得tracker
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer connection = null;
        try {
            connection = trackerClient.getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 通过tracker获得storage
        StorageClient storageClient = new StorageClient(connection, null);

        // 通过storage上传文件
        String[] pngs = new String[0];
        try {
            // 通过最后一个“.”获取文件的扩展名
            String originalFilename = file.getOriginalFilename();
            int i = originalFilename.lastIndexOf(".");
            String substring = originalFilename.substring(i+1);
            pngs = storageClient.upload_file(file.getBytes(), substring, null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
        String url = "http://192.168.233.138";
        for (String png : pngs) {
            url = url + "/" + png;
        }
        return url;
    }
}
