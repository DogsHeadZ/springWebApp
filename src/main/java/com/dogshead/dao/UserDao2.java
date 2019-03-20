package com.dogshead.dao;

import java.sql.SQLException;

import java.util.Collection;

import java.util.List;

 

import org.hibernate.HibernateException;

import org.hibernate.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dogshead.domain.User2;

 

/*

 * �־ò�

 */
@Transactional
@Service
public class UserDao2 {

	//HibernateTemplateģ��

	private HibernateTemplate ht;

	//ע�뷽��
	@Autowired
	public void setHt(HibernateTemplate ht) {

		this.ht = ht;

	}

	//�����û�

	public void add(User2 user) throws Exception{

		ht.save(user);

	}

	//����ID��ѯ�û�
/*
	public User findById(Integer id) throws Exception{

		return (User) ht.get(User.class,id);

	}

	//�޸��û�

	public void update(User user) throws Exception{

		ht.update(user);

	}

	//ɾ���û�

	public void delete(User user) throws Exception{

		ht.delete(user);

	}

	//��ѯ��"��"��β���û�

	public List<User> findAll(String hql,Object[] params) throws Exception{

		return (List<User>) ht.find(hql,params);

	}

	//����ɾ��

	public void deleteAll(Collection<User> users) throws Exception{

		ht.deleteAll(users);

	}

	//��ҳ��ѯ�û�
/*
	public List<User> findAllFy(final Integer start,final Integer size) throws Exception{

		return (List<User>) ht.execute(new HibernateCallback(){

			public Object doInHibernate(Session session)throws HibernateException, SQLException {

				String hql = "from User";

				Query query = session.createQuery(hql);

				query.setFirstResult(start);

				query.setMaxResults(size);

				return query.list();

			}

		});

	}

	//��ȡ�û�����

	public Integer getTotalUser() throws Exception{

		return (Integer) ht.execute(new HibernateCallback(){

			public Object doInHibernate(Session session)throws HibernateException, SQLException {

				String hql = "select count(u) from User u";

				Query query = session.createQuery(hql);

				Long temp = (Long) query.uniqueResult();

				return temp.intValue();

			}

		});

	}
*/
}