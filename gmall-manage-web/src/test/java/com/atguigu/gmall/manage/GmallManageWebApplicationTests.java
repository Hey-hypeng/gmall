package com.atguigu.gmall.manage;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManageWebApplicationTests {

    @Test
    public void contextLoads() throws IOException, MyException {
        // 配置fdfs的全局信息
        String file = GmallManageWebApplication.class.getClassLoader().getResource("tracker.conf").getFile();
        ClientGlobal.init(file);

        // 获得tracker
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer connection = trackerClient.getConnection();

        // 通过tracker获得storage
        StorageClient storageClient = new StorageClient(connection, null);

        // 通过storage上传文件
        String[] pngs = storageClient.upload_file("C:/Users/hypen/Desktop/test.png", "png", null);
        String url = "http://192.168.233.138";
        for (String png : pngs) {
            url = url + "/" + png;
        }
        System.out.println(url);
    }
}
