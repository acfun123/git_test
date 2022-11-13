package com.ncc.gitTest.controller;

import com.ncc.gitTest.util.DownLoadUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @author niecong
 * @date 2022/8/1 16:33
 */
@Controller

public class FileDownLoadController {

    @Value("${srcFilePath}")
    private String srcFilePath;

    @PostMapping("/download")
    public void download(HttpServletResponse response){
        try {

            String fileName = "cn_sql_server_2014_enterprise_edition_with_service_pack_1_x64_dvd_6669544.iso";
            response.setHeader("Content-Disposition", "attachment;filename=" + new String("logNameReq".getBytes()));
            response.setContentType("application/octet-stream");

            DownLoadUtil.downloadFile(new File(srcFilePath+fileName), response);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
