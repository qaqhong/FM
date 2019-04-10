package com.mh.fm.controller;
import com.mh.fm.po.Pptknowledge;
import com.mh.fm.po.Pptpc;
import com.mh.fm.po.Pptphone;
import com.mh.fm.po.User;
import com.mh.fm.service.PPTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ppt")
public class PPTController {
    @Autowired
    private PPTService pptService;
    @RequestMapping(value = "/select", method = {RequestMethod.POST, RequestMethod.GET})
    public String PPTSelect(Model model, HttpServletRequest request){
        List<Pptpc> listpc = pptService.selectPptpc();
        List<Pptphone> listphone = pptService.selectPptphone();
        List<Pptknowledge> listknowledge = pptService.selectPptknowledge();
        model.addAttribute("listpc", listpc);
        model.addAttribute("listphone", listphone);
        model.addAttribute("listknowledge", listknowledge);

        return "pptinfo/pptinfo_list";
    }

    @RequestMapping(value = "/insertPC", method = {RequestMethod.GET})
    public String PCInsert() throws Exception {
        return "pptinfo/pptpcinfo_add";
    }

    @RequestMapping(value = "/insertPCSubmit", method = {RequestMethod.POST})
    public String PCInsertSubmit(Pptpc pptpc, MultipartFile ppt_file, Model model, HttpServletRequest request) throws Exception {
        if(ppt_file.getSize()>10485760){
            model.addAttribute("info", "对不起，您上传的文件大小超过了大小的限制");
            return "pptinfo/pptpcinfo_add";
        }

        if (ppt_file != null && ppt_file.getSize() > 0 && ppt_file.getOriginalFilename().length() > 3) {
            String path = request.getSession().getServletContext().getRealPath("upload/PPTPC");

            String pptname = ppt_file.getOriginalFilename();
            String newname = UUID.randomUUID().toString() + pptname.substring(pptname.lastIndexOf("."));
            File userFile = new File(path);
            if (!userFile.exists()) userFile.mkdirs();
            ppt_file.transferTo(new File(path, newname));
            pptpc.setPptpcname(pptname);
            pptpc.setPptpcaddress(path);
            pptpc.setPptpcuuidname(newname);
        }
        Date date = new Date();
        pptpc.setPptpcuploadtime(date);
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("userLogin");
        if(pptpc != null){
            pptpc.setUserid(user.getUserid());
        }

        boolean mark = pptService.insertPptpc(pptpc);
        String url = "ppt/select";
        model.addAttribute("url", url);
        model.addAttribute("mark", mark);


        return "show_info";
    }


    @RequestMapping(value = "/insertPhone", method = {RequestMethod.GET})
    public String PhoneInsert() throws Exception {
        return "pptinfo/pptphoneinfo_add";
    }

    @RequestMapping(value = "/insertPhoneSubmit", method = {RequestMethod.POST})
    public String PhoneInsertSubmit(Pptphone pptphone, MultipartFile phone_file, Model model, HttpServletRequest request) throws Exception {
        if(phone_file.getSize()>10485760){
            model.addAttribute("info", "对不起，您上传的文件大小超过了大小的限制");
            return "pptinfo/pptphoneinfo_add";
        }

        if (phone_file != null && phone_file.getSize() > 0 && phone_file.getOriginalFilename().length() > 3) {
            String path = request.getSession().getServletContext().getRealPath("upload/PPTPhone");

            String pptname = phone_file.getOriginalFilename();
            String newname = UUID.randomUUID().toString() + pptname.substring(pptname.lastIndexOf("."));
            File File = new File(path);
            if (!File.exists()) File.mkdirs();
            phone_file.transferTo(new File(path, newname));
            pptphone.setPptphonename(pptname);
            pptphone.setPptphoneaddress(path);
            pptphone.setPptphoneuuidname(newname);
        }
        Date date = new Date();
        pptphone.setPptphoneuploadtime(date);
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("userLogin");
        /*if(pptphone != null){
            pptphone.setUserid(user.getUserid());
        }*/

        boolean mark = pptService.insertPptphone(pptphone);
        String url = "ppt/select";
        model.addAttribute("url", url);
        model.addAttribute("mark", mark);


        return "show_info";
    }

/*    @RequestMapping(value = "/insertKnowledge", method = {RequestMethod.GET})
    public String KnowledgeInsert() throws Exception {
        return "pptinfo/pptknowledgeinfo_add";
    }

    @RequestMapping(value = "/insertKnowledgeSubmit", method = {RequestMethod.POST})
    public String KnowledgeInsertSubmit(Pptknowledge pptknowledge, MultipartFile knowledge_file, Model model, HttpServletRequest request) throws Exception {
        if(knowledge_file.getSize()>10485760){
            model.addAttribute("info", "对不起，您上传的文件大小超过了大小的限制");
            return "pptinfo/pptknowledgeinfo_add";
        }

        if (knowledge_file != null && knowledge_file.getSize() > 0 && knowledge_file.getOriginalFilename().length() > 3) {
            String path = request.getSession().getServletContext().getRealPath("upload/PPTKnowledge");

            String pptname = knowledge_file.getOriginalFilename();
            String newname = UUID.randomUUID().toString() + pptname.substring(pptname.lastIndexOf("."));
            File File = new File(path);
            if (!File.exists()) File.mkdirs();
            knowledge_file.transferTo(new File(path, newname));
            pptknowledge.setPptknowledgename(pptname);
            pptknowledge.setPptknowledgeaddress(path);

        }
        Date date = new Date();
        *//*pptknowledge.setPptphoneuploadtime(date);*//*
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("userLogin");
        *//*if(pptphone != null){
            pptphone.setUserid(user.getUserid());
        }*//*

        boolean mark = pptService.insertPptknowledge(pptknowledge);
        String url = "ppt/select";
        model.addAttribute("url", url);
        model.addAttribute("mark", mark);


        return "show_info";
    }*/

    @RequestMapping(value = "/deletePC", method = {RequestMethod.GET})
    public String PCDelete(Model model,Pptpc pptpc, HttpServletRequest request) throws Exception {
        Pptpc findPPT = pptService.getPptpcId(pptpc.getPptpcid());
        boolean mark = pptService.deletePptpc(findPPT);
        if (mark) {
            if (findPPT.getPptpcuuidname() != null && findPPT.getPptpcuuidname().trim().length() > 3) {
                String path = findPPT.getPptpcaddress();
                File deleteFile = new File(path, findPPT.getPptpcuuidname());
                if (deleteFile.exists()) deleteFile.delete();
            }
            model.addAttribute("info", "用户信息删除成功");
        } else model.addAttribute("info", "用户信息删除失败");
        String url = "ppt/select";
        model.addAttribute("url", url);
        model.addAttribute("mark", mark);

        return "show_info";
    }

    @RequestMapping(value = "/deletePhone", method = {RequestMethod.GET})
    public String PhoneDelete(Model model,Pptphone pptphone, HttpServletRequest request) throws Exception {
        Pptphone findPPT = pptService.getPptphoneId(pptphone.getPptphoneid());
        boolean mark = pptService.deletePptphone(findPPT);
        if (mark) {
            if (findPPT.getPptphoneuuidname() != null && findPPT.getPptphoneuuidname().trim().length() > 3) {
                String path = findPPT.getPptphoneaddress();
                File deleteFile = new File(path, findPPT.getPptphoneuuidname());
                if (deleteFile.exists()) deleteFile.delete();
            }
            model.addAttribute("info", "用户信息删除成功");
        } else model.addAttribute("info", "用户信息删除失败");
        String url = "ppt/select";
        model.addAttribute("url", url);
        model.addAttribute("mark", mark);

        return "show_info";
    }




}
