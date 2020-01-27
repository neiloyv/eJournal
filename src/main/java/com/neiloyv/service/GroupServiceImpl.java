//package com.neiloyv.service;
//
//import com.neiloyv.dao.GroupDao;
//import com.neiloyv.model.Group;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//public class GroupServiceImpl implements GroupService {
//
//    private GroupDao groupDao;
//
//    public void setGroupDao(GroupDao groupDao) {
//        this.groupDao = groupDao;
//    }
//
//    @Override
//    @Transactional
//    public void addGroup(Group group) {
//        this.groupDao.addGroup(group);
//    }
//
//    @Override
//    @Transactional
//    public void updateGroup(Group group) {
//        this.groupDao.updateGroup(group);
//    }
//
//    @Override
//    @Transactional
//    public void remoteGroup(int id) {
//        this.groupDao.remoteGroup(id);
//    }
//
//    @Override
//    @Transactional
//    public Group getGroupId(int id) {
//        return this.groupDao.getGroupId(id);
//    }
//
//    @Override
//    @Transactional
//    public List<Group> listGroups() {
//        List<Group> groups = this.groupDao.listGroups();
//        int currentPp = 1;
//
//        for (Group group : groups) {
//            group.setPp(currentPp++);
//        }
//
//        return groups;
//    }
//}
