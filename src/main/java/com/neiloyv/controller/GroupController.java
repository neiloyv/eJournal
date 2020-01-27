//package com.neiloyv.controller;
//
//
//import com.neiloyv.model.Group;
//import com.neiloyv.service.GroupService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class GroupController {
//
//    private GroupService groupService;
//
//    @Autowired
//    @Qualifier(value = "groupService")
//    public void setGroupService(GroupService groupService) {
//        this.groupService = groupService;
//    }
//
//    @RequestMapping(value = "/groups", method = RequestMethod.GET)
//    public String listGroups(Model model){
//        model.addAttribute("group", new Group());
//        model.addAttribute("listGroups", this.groupService.listGroups());
//
//        return "groups";
//    }
//
//    @RequestMapping(value = "/groups/addGroup", method = RequestMethod.POST)
//    public String addGroup(@ModelAttribute("group") Group group) {
//        if(group.getId() == 0){
//            this.groupService.addGroup(group);
//        } else {
//            this.groupService.updateGroup(group);
//        }
//
//        return "redirect:/groups";
//    }
//
//    @RequestMapping("/removeGroup/{id}")
//    public String removeGroup(@PathVariable("id") int id) {
//        this.groupService.remoteGroup(id);
//        return "redirect:/groups";
//    }
//
//    @RequestMapping("/editGroup/{id}")
//    public String editGroup(@PathVariable("id") int id, Model model) {
//        model.addAttribute("group", this.groupService.getGroupId(id));
//        model.addAttribute("listGroups", this.groupService.listGroups());
//        return "groups";
//    }
//
//    @RequestMapping("/dataGroup/{id}")
//    public String groupData(@PathVariable("id") int id, Model model) {
//        System.out.println("group data method: ");
//        model.addAttribute("group", this.groupService.getGroupId(id));
//        return "dataGroup";
//    }
//
//
//}
