package com.hy.crm.controller;


import com.hy.crm.pojo.Documentary;
import com.hy.crm.service.IDocumentaryService;
import com.hy.crm.service.impl.DocumentaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 跟单表（跟单不能修改） 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
@RequestMapping("/documentary")
public class DocumentaryController {
    @Autowired
    private IDocumentaryService iDocumentaryService;

    @RequestMapping("/adddoc.do")
    public void adddocumentary(Documentary documentary){
        System.out.println(documentary.toString());
        iDocumentaryService.save(documentary);
    }

}
