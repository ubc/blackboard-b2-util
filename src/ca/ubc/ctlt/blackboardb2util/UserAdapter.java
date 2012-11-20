package ca.ubc.ctlt.blackboardb2util;

import blackboard.data.course.CourseMembership;
import blackboard.data.user.User;

public interface UserAdapter<T> {
	public T bbUserToUser(User bbUser);
	public T bbUserToUser(CourseMembership membership);
	public User userToBbUser(T user);
}
