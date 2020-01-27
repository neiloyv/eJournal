//package com.neiloyv.dao;
//
//import com.neiloyv.model.Group;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class GroupDaoImpl implements GroupDao {
//    private static final Logger logger = LoggerFactory.getLogger(GroupDaoImpl.class);
//
//    private SessionFactory sessionFactory;
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public void addGroup(Group group) {
//        // Создаем сессию, которая просит нашу фабрику сесий дать нам текущую сессию
//        Session session = sessionFactory.getCurrentSession();
//
//        // Наша сессия сохраняет объект который мы ей передали
//        session.persist(group);
//
//        // Добавляем информацию для логгирования
//        logger.info("Group successfully save in DB. Group detalis: " + group);
//    }
//
//    @Override
//    public void updateGroup(Group group) {
//        Session session = sessionFactory.getCurrentSession();
//        session.update(group);
//        logger.info("Group successfully update in DB. Group detalis: " + group);
//    }
//
//    @Override
//    public void remoteGroup(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Group group = (Group) session.load(Group.class, new Integer(id));
//
//        if(group != null) {
//            session.delete(group);
//        }
//        logger.info("Group successfully delete from DB. Group detalis: " + group);
//    }
//
//    @Override
//    public Group getGroupId(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Group group = (Group) session.load(Group.class, new Integer(id));
//        logger.info("Group successfully loaded from DB. Group detalis: " + group);
//        return group;
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Group> listGroups() {
//        Session session = sessionFactory.getCurrentSession();
//        List<Group> listGroups = session.createQuery("from Group").list();
//
//        for (Group group : listGroups) {
//            logger.info("Group list: " + group);
//        }
//        return listGroups;
//    }
//}
