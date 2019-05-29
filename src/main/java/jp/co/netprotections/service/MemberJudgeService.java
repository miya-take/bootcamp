package jp.co.netprotections.service;

/*
 * こちらでinferfaceを定義する
 * --implに定義する
 */
abstract public interface MemberJudgeService {
	abstract public boolean JudgeEachAbility(int abilityScore);
	abstract public boolean JudgeTotalAbility(int eventPlanning, int cogitation, int coodination, int programmingAbility, int infrastructureKnowledge);



}
