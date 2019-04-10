package com.mh.fm.controller;


import com.mh.fm.po.User;
import com.mh.fm.service.DocuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/docu")
public class DocuController {
    @Autowired
    private DocuService docuService;
    @RequestMapping(value = "/select", method = {RequestMethod.POST, RequestMethod.GET})
    public String DocuSelect(User user, Model model, HttpServletRequest request){

        return "docuinfo/docuinfo_list";
    }

}
