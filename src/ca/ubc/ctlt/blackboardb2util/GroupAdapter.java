package ca.ubc.ctlt.blackboardb2util;

import blackboard.data.course.Group;

public interface GroupAdapter<T> {
	public T bbGroupToGroup(Group bbGroup);
	public Group groupToBbGroup(T group);
}
