package ca.ubc.ctlt.blackboardb2util;

import java.util.List;

import blackboard.data.course.CourseMembership;
import blackboard.data.gradebook.Score;

public interface GradeAdapter<T> {
	public Score gradeToBbScore(T grade, List<CourseMembership> memberships);
}
