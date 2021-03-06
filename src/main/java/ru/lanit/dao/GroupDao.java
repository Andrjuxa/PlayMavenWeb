package ru.lanit.dao;


import ru.lanit.models.Group;
import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;

import java.util.List;

/**
 * @author Белов А.В.
 */
public interface GroupDao {
	
	List<Group> getAllGroups(SortParam<String> sortParam);
	List<Group> getAllGroups();

	void createGroup(Group newGruop) throws DaoException;
	void updateGroup(Group newGroup) throws DaoException;
	void deleteGroup(Integer id) throws DaoException;
}